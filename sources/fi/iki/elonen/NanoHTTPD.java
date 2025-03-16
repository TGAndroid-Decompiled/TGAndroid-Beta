package fi.iki.elonen;

import androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLException;

public abstract class NanoHTTPD {
    protected AsyncRunner asyncRunner;
    private final String hostname;
    private final int myPort;
    private volatile ServerSocket myServerSocket;
    private Thread myThread;
    private ServerSocketFactory serverSocketFactory;
    private TempFileManagerFactory tempFileManagerFactory;
    private static final Pattern CONTENT_DISPOSITION_PATTERN = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
    private static final Pattern CONTENT_TYPE_PATTERN = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
    private static final Pattern CONTENT_DISPOSITION_ATTRIBUTE_PATTERN = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
    private static final Logger LOG = Logger.getLogger(NanoHTTPD.class.getName());

    public interface AsyncRunner {
        void closeAll();

        void closed(ClientHandler clientHandler);

        void exec(ClientHandler clientHandler);
    }

    public class ClientHandler implements Runnable {
        private final Socket acceptSocket;
        private final InputStream inputStream;

        public ClientHandler(InputStream inputStream, Socket socket) {
            this.inputStream = inputStream;
            this.acceptSocket = socket;
        }

        public void close() {
            NanoHTTPD.safeClose(this.inputStream);
            NanoHTTPD.safeClose(this.acceptSocket);
        }

        @Override
        public void run() {
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = this.acceptSocket.getOutputStream();
                    HTTPSession hTTPSession = new HTTPSession(NanoHTTPD.this.tempFileManagerFactory.create(), this.inputStream, outputStream, this.acceptSocket.getInetAddress());
                    while (!this.acceptSocket.isClosed()) {
                        hTTPSession.execute();
                    }
                } catch (Exception e) {
                    if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                        NanoHTTPD.LOG.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                    }
                }
            } finally {
                NanoHTTPD.safeClose(outputStream);
                NanoHTTPD.safeClose(this.inputStream);
                NanoHTTPD.safeClose(this.acceptSocket);
                NanoHTTPD.this.asyncRunner.closed(this);
            }
        }
    }

    public static class ContentType {
        private final String boundary;
        private final String contentType;
        private final String contentTypeHeader;
        private final String encoding;
        private static final Pattern MIME_PATTERN = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
        private static final Pattern CHARSET_PATTERN = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
        private static final Pattern BOUNDARY_PATTERN = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

        public ContentType(String str) {
            String str2;
            this.contentTypeHeader = str;
            if (str != null) {
                this.contentType = getDetailFromContentHeader(str, MIME_PATTERN, "", 1);
                str2 = getDetailFromContentHeader(str, CHARSET_PATTERN, null, 2);
            } else {
                this.contentType = "";
                str2 = "UTF-8";
            }
            this.encoding = str2;
            if ("multipart/form-data".equalsIgnoreCase(this.contentType)) {
                this.boundary = getDetailFromContentHeader(str, BOUNDARY_PATTERN, null, 2);
            } else {
                this.boundary = null;
            }
        }

        private String getDetailFromContentHeader(String str, Pattern pattern, String str2, int i) {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(i) : str2;
        }

        public String getContentTypeHeader() {
            return this.contentTypeHeader;
        }

        public String getEncoding() {
            String str = this.encoding;
            return str == null ? "US-ASCII" : str;
        }

        public ContentType tryUTF8() {
            if (this.encoding != null) {
                return this;
            }
            return new ContentType(this.contentTypeHeader + "; charset=UTF-8");
        }
    }

    public class CookieHandler implements Iterable {
        private final HashMap cookies = new HashMap();
        private final ArrayList queue = new ArrayList();

        public CookieHandler(Map map) {
            String str = (String) map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(";")) {
                    String[] split = str2.trim().split("=");
                    if (split.length == 2) {
                        this.cookies.put(split[0], split[1]);
                    }
                }
            }
        }

        @Override
        public Iterator iterator() {
            return this.cookies.keySet().iterator();
        }

        public void unloadQueue(Response response) {
            Iterator it = this.queue.iterator();
            if (it.hasNext()) {
                ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                throw null;
            }
        }
    }

    public static class DefaultAsyncRunner implements AsyncRunner {
        private long requestCount;
        private final List running = Collections.synchronizedList(new ArrayList());

        @Override
        public void closeAll() {
            Iterator it = new ArrayList(this.running).iterator();
            while (it.hasNext()) {
                ((ClientHandler) it.next()).close();
            }
        }

        @Override
        public void closed(ClientHandler clientHandler) {
            this.running.remove(clientHandler);
        }

        @Override
        public void exec(ClientHandler clientHandler) {
            this.requestCount++;
            Thread thread = new Thread(clientHandler);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.requestCount + ")");
            this.running.add(clientHandler);
            thread.start();
        }
    }

    public static class DefaultServerSocketFactory implements ServerSocketFactory {
        @Override
        public ServerSocket create() {
            return new ServerSocket();
        }
    }

    public static class DefaultTempFileManager implements TempFileManager {
        private final List tempFiles;
        private final File tmpdir;

        public DefaultTempFileManager() {
            File file = new File(System.getProperty("java.io.tmpdir"));
            this.tmpdir = file;
            if (!file.exists()) {
                file.mkdirs();
            }
            this.tempFiles = new ArrayList();
        }

        @Override
        public void clear() {
            Iterator it = this.tempFiles.iterator();
            while (it.hasNext()) {
                ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                try {
                    throw null;
                    break;
                } catch (Exception e) {
                    NanoHTTPD.LOG.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            }
            this.tempFiles.clear();
        }
    }

    private class DefaultTempFileManagerFactory implements TempFileManagerFactory {
        private DefaultTempFileManagerFactory() {
        }

        @Override
        public TempFileManager create() {
            return new DefaultTempFileManager();
        }
    }

    protected class HTTPSession implements IHTTPSession {
        private CookieHandler cookies;
        private Map headers;
        private final BufferedInputStream inputStream;
        private Method method;
        private final OutputStream outputStream;
        private Map parms;
        private String protocolVersion;
        private String queryParameterString;
        private String remoteHostname;
        private String remoteIp;
        private int rlen;
        private int splitbyte;
        private final TempFileManager tempFileManager;
        private String uri;

        public HTTPSession(TempFileManager tempFileManager, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.tempFileManager = tempFileManager;
            this.inputStream = new BufferedInputStream(inputStream, 8192);
            this.outputStream = outputStream;
            this.remoteIp = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
            this.remoteHostname = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "localhost" : inetAddress.getHostName().toString();
            this.headers = new HashMap();
        }

        private void decodeHeader(BufferedReader bufferedReader, Map map, Map map2, Map map3) {
            String decodePercent;
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
                map.put("method", stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(63);
                if (indexOf >= 0) {
                    decodeParms(nextToken.substring(indexOf + 1), map2);
                    decodePercent = NanoHTTPD.decodePercent(nextToken.substring(0, indexOf));
                } else {
                    decodePercent = NanoHTTPD.decodePercent(nextToken);
                }
                if (stringTokenizer.hasMoreTokens()) {
                    this.protocolVersion = stringTokenizer.nextToken();
                } else {
                    this.protocolVersion = "HTTP/1.1";
                    NanoHTTPD.LOG.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                }
                while (true) {
                    String readLine2 = bufferedReader.readLine();
                    if (readLine2 == null || readLine2.trim().isEmpty()) {
                        break;
                    }
                    int indexOf2 = readLine2.indexOf(58);
                    if (indexOf2 >= 0) {
                        map3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                    }
                }
                map.put("uri", decodePercent);
            } catch (IOException e) {
                throw new ResponseException(Response.Status.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
            }
        }

        private void decodeParms(String str, Map map) {
            String trim;
            String str2;
            if (str == null) {
                this.queryParameterString = "";
                return;
            }
            this.queryParameterString = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    trim = NanoHTTPD.decodePercent(nextToken.substring(0, indexOf)).trim();
                    str2 = NanoHTTPD.decodePercent(nextToken.substring(indexOf + 1));
                } else {
                    trim = NanoHTTPD.decodePercent(nextToken).trim();
                    str2 = "";
                }
                List list = (List) map.get(trim);
                if (list == null) {
                    list = new ArrayList();
                    map.put(trim, list);
                }
                list.add(str2);
            }
        }

        private int findHeaderEnd(byte[] bArr, int i) {
            int i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i4 >= i) {
                    return 0;
                }
                byte b = bArr[i3];
                if (b == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                    return i3 + 4;
                }
                if (b == 10 && bArr[i4] == 10) {
                    return i3 + 2;
                }
                i3 = i4;
            }
        }

        public void execute() {
            OutputStream outputStream;
            byte[] bArr;
            boolean z;
            Response response = null;
            try {
                try {
                    try {
                        try {
                            try {
                                bArr = new byte[8192];
                                z = false;
                                this.splitbyte = 0;
                                this.rlen = 0;
                                this.inputStream.mark(8192);
                            } catch (ResponseException e) {
                                NanoHTTPD.newFixedLengthResponse(e.getStatus(), "text/plain", e.getMessage()).send(this.outputStream);
                                outputStream = this.outputStream;
                                NanoHTTPD.safeClose(outputStream);
                                NanoHTTPD.safeClose(response);
                                this.tempFileManager.clear();
                            }
                        } catch (IOException e2) {
                            NanoHTTPD.newFixedLengthResponse(Response.Status.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e2.getMessage()).send(this.outputStream);
                            outputStream = this.outputStream;
                            NanoHTTPD.safeClose(outputStream);
                            NanoHTTPD.safeClose(response);
                            this.tempFileManager.clear();
                        }
                    } catch (SocketTimeoutException e3) {
                        throw e3;
                    }
                } catch (SocketException e4) {
                    throw e4;
                } catch (SSLException e5) {
                    NanoHTTPD.newFixedLengthResponse(Response.Status.INTERNAL_ERROR, "text/plain", "SSL PROTOCOL FAILURE: " + e5.getMessage()).send(this.outputStream);
                    outputStream = this.outputStream;
                    NanoHTTPD.safeClose(outputStream);
                    NanoHTTPD.safeClose(response);
                    this.tempFileManager.clear();
                }
                try {
                    int read = this.inputStream.read(bArr, 0, 8192);
                    if (read == -1) {
                        NanoHTTPD.safeClose(this.inputStream);
                        NanoHTTPD.safeClose(this.outputStream);
                        throw new SocketException("NanoHttpd Shutdown");
                    }
                    while (read > 0) {
                        int i = this.rlen + read;
                        this.rlen = i;
                        int findHeaderEnd = findHeaderEnd(bArr, i);
                        this.splitbyte = findHeaderEnd;
                        if (findHeaderEnd > 0) {
                            break;
                        }
                        BufferedInputStream bufferedInputStream = this.inputStream;
                        int i2 = this.rlen;
                        read = bufferedInputStream.read(bArr, i2, 8192 - i2);
                    }
                    if (this.splitbyte < this.rlen) {
                        this.inputStream.reset();
                        this.inputStream.skip(this.splitbyte);
                    }
                    this.parms = new HashMap();
                    Map map = this.headers;
                    if (map == null) {
                        this.headers = new HashMap();
                    } else {
                        map.clear();
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.rlen)));
                    HashMap hashMap = new HashMap();
                    decodeHeader(bufferedReader, hashMap, this.parms, this.headers);
                    String str = this.remoteIp;
                    if (str != null) {
                        this.headers.put("remote-addr", str);
                        this.headers.put("http-client-ip", this.remoteIp);
                    }
                    Method lookup = Method.lookup((String) hashMap.get("method"));
                    this.method = lookup;
                    if (lookup == null) {
                        throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap.get("method")) + " unhandled.");
                    }
                    this.uri = (String) hashMap.get("uri");
                    this.cookies = new CookieHandler(this.headers);
                    String str2 = (String) this.headers.get("connection");
                    boolean z2 = "HTTP/1.1".equals(this.protocolVersion) && (str2 == null || !str2.matches("(?i).*close.*"));
                    response = NanoHTTPD.this.serve(this);
                    if (response == null) {
                        throw new ResponseException(Response.Status.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                    }
                    String str3 = (String) this.headers.get("accept-encoding");
                    this.cookies.unloadQueue(response);
                    response.setRequestMethod(this.method);
                    if (NanoHTTPD.this.useGzipWhenAccepted(response) && str3 != null && str3.contains("gzip")) {
                        z = true;
                    }
                    response.setGzipEncoding(z);
                    response.setKeepAlive(z2);
                    response.send(this.outputStream);
                    if (!z2 || response.isCloseConnection()) {
                        throw new SocketException("NanoHttpd Shutdown");
                    }
                    NanoHTTPD.safeClose(response);
                    this.tempFileManager.clear();
                } catch (SSLException e6) {
                    throw e6;
                } catch (IOException unused) {
                    NanoHTTPD.safeClose(this.inputStream);
                    NanoHTTPD.safeClose(this.outputStream);
                    throw new SocketException("NanoHttpd Shutdown");
                }
            } catch (Throwable th) {
                NanoHTTPD.safeClose(null);
                this.tempFileManager.clear();
                throw th;
            }
        }

        @Override
        public final Map getHeaders() {
            return this.headers;
        }

        @Override
        public final Method getMethod() {
            return this.method;
        }

        @Override
        public final String getUri() {
            return this.uri;
        }
    }

    public interface IHTTPSession {
        Map getHeaders();

        Method getMethod();

        String getUri();
    }

    public enum Method {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS,
        TRACE,
        CONNECT,
        PATCH,
        PROPFIND,
        PROPPATCH,
        MKCOL,
        MOVE,
        COPY,
        LOCK,
        UNLOCK;

        static Method lookup(String str) {
            if (str == null) {
                return null;
            }
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static class Response implements Closeable {
        private boolean chunkedTransfer;
        private long contentLength;
        private InputStream data;
        private boolean encodeAsGzip;
        private boolean keepAlive;
        private String mimeType;
        private Method requestMethod;
        private IStatus status;
        private final Map header = new HashMap() {
            @Override
            public String put(String str, String str2) {
                Response.this.lowerCaseHeader.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put((AnonymousClass1) str, str2);
            }
        };
        private final Map lowerCaseHeader = new HashMap();

        public static class ChunkedOutputStream extends FilterOutputStream {
            public ChunkedOutputStream(OutputStream outputStream) {
                super(outputStream);
            }

            public void finish() {
                ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
            }

            @Override
            public void write(int i) {
                write(new byte[]{(byte) i}, 0, 1);
            }

            @Override
            public void write(byte[] bArr) {
                write(bArr, 0, bArr.length);
            }

            @Override
            public void write(byte[] bArr, int i, int i2) {
                if (i2 == 0) {
                    return;
                }
                ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i2)).getBytes());
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                ((FilterOutputStream) this).out.write("\r\n".getBytes());
            }
        }

        public interface IStatus {
            String getDescription();
        }

        public enum Status implements IStatus {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(202, "Accepted"),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(206, "Partial Content"),
            MULTI_STATUS(207, "Multi-Status"),
            REDIRECT(301, "Moved Permanently"),
            FOUND(302, "Found"),
            REDIRECT_SEE_OTHER(303, "See Other"),
            NOT_MODIFIED(304, "Not Modified"),
            TEMPORARY_REDIRECT(307, "Temporary Redirect"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(401, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
            NOT_ACCEPTABLE(406, "Not Acceptable"),
            REQUEST_TIMEOUT(408, "Request Timeout"),
            CONFLICT(409, "Conflict"),
            GONE(410, "Gone"),
            LENGTH_REQUIRED(411, "Length Required"),
            PRECONDITION_FAILED(412, "Precondition Failed"),
            PAYLOAD_TOO_LARGE(413, "Payload Too Large"),
            UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
            RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
            EXPECTATION_FAILED(417, "Expectation Failed"),
            TOO_MANY_REQUESTS(429, "Too Many Requests"),
            INTERNAL_ERROR(500, "Internal Server Error"),
            NOT_IMPLEMENTED(501, "Not Implemented"),
            SERVICE_UNAVAILABLE(503, "Service Unavailable"),
            UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");

            private final String description;
            private final int requestStatus;

            Status(int i, String str) {
                this.requestStatus = i;
                this.description = str;
            }

            @Override
            public String getDescription() {
                return "" + this.requestStatus + " " + this.description;
            }
        }

        protected Response(IStatus iStatus, String str, InputStream inputStream, long j) {
            this.status = iStatus;
            this.mimeType = str;
            if (inputStream == null) {
                this.data = new ByteArrayInputStream(new byte[0]);
                this.contentLength = 0L;
            } else {
                this.data = inputStream;
                this.contentLength = j;
            }
            this.chunkedTransfer = this.contentLength < 0;
            this.keepAlive = true;
        }

        private void sendBody(OutputStream outputStream, long j) {
            byte[] bArr = new byte[(int) 16384];
            boolean z = j == -1;
            while (true) {
                if (j <= 0 && !z) {
                    return;
                }
                int read = this.data.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
                if (read <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, read);
                if (!z) {
                    j -= read;
                }
            }
        }

        private void sendBodyWithCorrectEncoding(OutputStream outputStream, long j) {
            if (!this.encodeAsGzip) {
                sendBody(outputStream, j);
                return;
            }
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            sendBody(gZIPOutputStream, -1L);
            gZIPOutputStream.finish();
        }

        private void sendBodyWithCorrectTransferAndEncoding(OutputStream outputStream, long j) {
            if (this.requestMethod == Method.HEAD || !this.chunkedTransfer) {
                sendBodyWithCorrectEncoding(outputStream, j);
                return;
            }
            ChunkedOutputStream chunkedOutputStream = new ChunkedOutputStream(outputStream);
            sendBodyWithCorrectEncoding(chunkedOutputStream, -1L);
            chunkedOutputStream.finish();
        }

        public void addHeader(String str, String str2) {
            this.header.put(str, str2);
        }

        @Override
        public void close() {
            InputStream inputStream = this.data;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        public String getHeader(String str) {
            return (String) this.lowerCaseHeader.get(str.toLowerCase());
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public boolean isCloseConnection() {
            return "close".equals(getHeader("connection"));
        }

        protected void printHeader(PrintWriter printWriter, String str, String str2) {
            printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
        }

        protected void send(OutputStream outputStream) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            try {
                if (this.status == null) {
                    throw new Error("sendResponse(): Status can't be null.");
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, new ContentType(this.mimeType).getEncoding())), false);
                printWriter.append("HTTP/1.1 ").append((CharSequence) this.status.getDescription()).append(" \r\n");
                String str = this.mimeType;
                if (str != null) {
                    printHeader(printWriter, "Content-Type", str);
                }
                if (getHeader("date") == null) {
                    printHeader(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry entry : this.header.entrySet()) {
                    printHeader(printWriter, (String) entry.getKey(), (String) entry.getValue());
                }
                if (getHeader("connection") == null) {
                    printHeader(printWriter, "Connection", this.keepAlive ? "keep-alive" : "close");
                }
                if (getHeader("content-length") != null) {
                    this.encodeAsGzip = false;
                }
                if (this.encodeAsGzip) {
                    printHeader(printWriter, "Content-Encoding", "gzip");
                    setChunkedTransfer(true);
                }
                long j = this.data != null ? this.contentLength : 0L;
                if (this.requestMethod != Method.HEAD && this.chunkedTransfer) {
                    printHeader(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.encodeAsGzip) {
                    j = sendContentLengthHeaderIfNotAlreadyPresent(printWriter, j);
                }
                printWriter.append("\r\n");
                printWriter.flush();
                sendBodyWithCorrectTransferAndEncoding(outputStream, j);
                outputStream.flush();
                NanoHTTPD.safeClose(this.data);
            } catch (IOException e) {
                NanoHTTPD.LOG.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
            }
        }

        protected long sendContentLengthHeaderIfNotAlreadyPresent(PrintWriter printWriter, long j) {
            String header = getHeader("content-length");
            if (header != null) {
                try {
                    j = Long.parseLong(header);
                } catch (NumberFormatException unused) {
                    NanoHTTPD.LOG.severe("content-length was no number " + header);
                }
            }
            printWriter.print("Content-Length: " + j + "\r\n");
            return j;
        }

        public void setChunkedTransfer(boolean z) {
            this.chunkedTransfer = z;
        }

        public void setGzipEncoding(boolean z) {
            this.encodeAsGzip = z;
        }

        public void setKeepAlive(boolean z) {
            this.keepAlive = z;
        }

        public void setRequestMethod(Method method) {
            this.requestMethod = method;
        }
    }

    public static final class ResponseException extends Exception {
        private final Response.Status status;

        public ResponseException(Response.Status status, String str) {
            super(str);
            this.status = status;
        }

        public ResponseException(Response.Status status, String str, Exception exc) {
            super(str, exc);
            this.status = status;
        }

        public Response.Status getStatus() {
            return this.status;
        }
    }

    public class ServerRunnable implements Runnable {
        private IOException bindException;
        private boolean hasBinded = false;
        private final int timeout;

        public ServerRunnable(int i) {
            this.timeout = i;
        }

        @Override
        public void run() {
            try {
                NanoHTTPD.this.myServerSocket.bind(NanoHTTPD.this.hostname != null ? new InetSocketAddress(NanoHTTPD.this.hostname, NanoHTTPD.this.myPort) : new InetSocketAddress(NanoHTTPD.this.myPort));
                this.hasBinded = true;
                do {
                    try {
                        Socket accept = NanoHTTPD.this.myServerSocket.accept();
                        int i = this.timeout;
                        if (i > 0) {
                            accept.setSoTimeout(i);
                        }
                        InputStream inputStream = accept.getInputStream();
                        NanoHTTPD nanoHTTPD = NanoHTTPD.this;
                        nanoHTTPD.asyncRunner.exec(nanoHTTPD.createClientHandler(accept, inputStream));
                    } catch (IOException e) {
                        NanoHTTPD.LOG.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                    }
                } while (!NanoHTTPD.this.myServerSocket.isClosed());
            } catch (IOException e2) {
                this.bindException = e2;
            }
        }
    }

    public interface ServerSocketFactory {
        ServerSocket create();
    }

    public interface TempFileManager {
        void clear();
    }

    public interface TempFileManagerFactory {
        TempFileManager create();
    }

    public NanoHTTPD(int i) {
        this(null, i);
    }

    public NanoHTTPD(String str, int i) {
        this.serverSocketFactory = new DefaultServerSocketFactory();
        this.hostname = str;
        this.myPort = i;
        setTempFileManagerFactory(new DefaultTempFileManagerFactory());
        setAsyncRunner(new DefaultAsyncRunner());
    }

    protected static String decodePercent(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            LOG.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    public static Response newFixedLengthResponse(Response.IStatus iStatus, String str, InputStream inputStream, long j) {
        return new Response(iStatus, str, inputStream, j);
    }

    public static Response newFixedLengthResponse(Response.IStatus iStatus, String str, String str2) {
        byte[] bArr;
        ContentType contentType = new ContentType(str);
        if (str2 == null) {
            return newFixedLengthResponse(iStatus, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(contentType.getEncoding()).newEncoder().canEncode(str2)) {
                contentType = contentType.tryUTF8();
            }
            bArr = str2.getBytes(contentType.getEncoding());
        } catch (UnsupportedEncodingException e) {
            LOG.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bArr = new byte[0];
        }
        return newFixedLengthResponse(iStatus, contentType.getContentTypeHeader(), new ByteArrayInputStream(bArr), bArr.length);
    }

    public static final void safeClose(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (!(obj instanceof ServerSocket)) {
                        throw new IllegalArgumentException("Unknown object to close");
                    }
                    ((ServerSocket) obj).close();
                }
            } catch (IOException e) {
                LOG.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    protected ClientHandler createClientHandler(Socket socket, InputStream inputStream) {
        return new ClientHandler(inputStream, socket);
    }

    protected ServerRunnable createServerRunnable(int i) {
        return new ServerRunnable(i);
    }

    public ServerSocketFactory getServerSocketFactory() {
        return this.serverSocketFactory;
    }

    public abstract Response serve(IHTTPSession iHTTPSession);

    public void setAsyncRunner(AsyncRunner asyncRunner) {
        this.asyncRunner = asyncRunner;
    }

    public void setTempFileManagerFactory(TempFileManagerFactory tempFileManagerFactory) {
        this.tempFileManagerFactory = tempFileManagerFactory;
    }

    public void start(int i, boolean z) {
        this.myServerSocket = getServerSocketFactory().create();
        this.myServerSocket.setReuseAddress(true);
        ServerRunnable createServerRunnable = createServerRunnable(i);
        Thread thread = new Thread(createServerRunnable);
        this.myThread = thread;
        thread.setDaemon(z);
        this.myThread.setName("NanoHttpd Main Listener");
        this.myThread.start();
        while (!createServerRunnable.hasBinded && createServerRunnable.bindException == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        if (createServerRunnable.bindException != null) {
            throw createServerRunnable.bindException;
        }
    }

    public void stop() {
        try {
            safeClose(this.myServerSocket);
            this.asyncRunner.closeAll();
            Thread thread = this.myThread;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }

    protected boolean useGzipWhenAccepted(Response response) {
        return response.getMimeType() != null && (response.getMimeType().toLowerCase().contains("text/") || response.getMimeType().toLowerCase().contains("/json"));
    }
}
