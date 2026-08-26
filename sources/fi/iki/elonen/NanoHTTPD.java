package fi.iki.elonen;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.dynamite.zzf;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public abstract class NanoHTTPD {
    public static final Logger LOG;
    public ProfileActivity.AnonymousClass33 asyncRunner;
    public volatile ServerSocket myServerSocket;
    public Thread myThread;
    public zzf tempFileManagerFactory;

    public final class ClientHandler implements Runnable {
        public final Socket acceptSocket;
        public final InputStream inputStream;

        public ClientHandler(InputStream inputStream, Socket socket) {
            this.inputStream = inputStream;
            this.acceptSocket = socket;
        }

        @Override
        public final void run() throws Throwable {
            InputStream inputStream = this.inputStream;
            NanoHTTPD nanoHTTPD = NanoHTTPD.this;
            Socket socket = this.acceptSocket;
            OutputStream outputStream = null;
            try {
                try {
                    OutputStream outputStream2 = socket.getOutputStream();
                    try {
                        zzf zzfVar = nanoHTTPD.tempFileManagerFactory;
                        HTTPSession hTTPSession = NanoHTTPD.this.new HTTPSession(new ChatActivity.AnonymousClass1(14), this.inputStream, outputStream2, socket.getInetAddress());
                        while (!socket.isClosed()) {
                            hTTPSession.execute();
                        }
                        NanoHTTPD.safeClose(outputStream2);
                        NanoHTTPD.safeClose(inputStream);
                        NanoHTTPD.safeClose(socket);
                        ((List) nanoHTTPD.asyncRunner.this$0).remove(this);
                    } catch (Exception e) {
                        e = e;
                        outputStream = outputStream2;
                        if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                            NanoHTTPD.LOG.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                        }
                        NanoHTTPD.safeClose(outputStream);
                        NanoHTTPD.safeClose(inputStream);
                        NanoHTTPD.safeClose(socket);
                        ((List) nanoHTTPD.asyncRunner.this$0).remove(this);
                    } catch (Throwable th) {
                        th = th;
                        outputStream = outputStream2;
                        NanoHTTPD.safeClose(outputStream);
                        NanoHTTPD.safeClose(inputStream);
                        NanoHTTPD.safeClose(socket);
                        ((List) nanoHTTPD.asyncRunner.this$0).remove(this);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    public final class ContentType {
        public final String contentType;
        public final String contentTypeHeader;
        public final String encoding;
        public static final Pattern MIME_PATTERN = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
        public static final Pattern CHARSET_PATTERN = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
        public static final Pattern BOUNDARY_PATTERN = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

        public ContentType(String str) {
            this.contentTypeHeader = str;
            if (str != null) {
                Matcher matcher = MIME_PATTERN.matcher(str);
                this.contentType = matcher.find() ? matcher.group(1) : "";
                Matcher matcher2 = CHARSET_PATTERN.matcher(str);
                this.encoding = matcher2.find() ? matcher2.group(2) : null;
            } else {
                this.contentType = "";
                this.encoding = "UTF-8";
            }
            if ("multipart/form-data".equalsIgnoreCase(this.contentType)) {
                Matcher matcher3 = BOUNDARY_PATTERN.matcher(str);
                if (matcher3.find()) {
                    matcher3.group(2);
                }
            }
        }
    }

    public final class CookieHandler implements Iterable {
        public final HashMap cookies = new HashMap();
        public final ArrayList queue = new ArrayList();

        public CookieHandler(HashMap map) {
            String str = (String) map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(";")) {
                    String[] strArrSplit = str2.trim().split("=");
                    if (strArrSplit.length == 2) {
                        this.cookies.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            }
        }

        @Override
        public final Iterator iterator() {
            return this.cookies.keySet().iterator();
        }

        public final void unloadQueue() {
            Iterator it = this.queue.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final class HTTPSession {
        public CookieHandler cookies;
        public HashMap headers;
        public final BufferedInputStream inputStream;
        public int method;
        public final OutputStream outputStream;
        public HashMap parms;
        public String protocolVersion;
        public final String remoteIp;
        public int rlen;
        public int splitbyte;
        public final ChatActivity.AnonymousClass1 tempFileManager;
        public String uri;

        public HTTPSession(ChatActivity.AnonymousClass1 anonymousClass1, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.tempFileManager = anonymousClass1;
            this.inputStream = new BufferedInputStream(inputStream, 8192);
            this.outputStream = outputStream;
            this.remoteIp = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
            if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
                inetAddress.getHostName().getClass();
            }
            this.headers = new HashMap();
        }

        public static void decodeParms(String str, HashMap map) {
            String strTrim;
            String strDecodePercent;
            if (str == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(61);
                if (iIndexOf >= 0) {
                    strTrim = NanoHTTPD.decodePercent(strNextToken.substring(0, iIndexOf)).trim();
                    strDecodePercent = NanoHTTPD.decodePercent(strNextToken.substring(iIndexOf + 1));
                } else {
                    strTrim = NanoHTTPD.decodePercent(strNextToken).trim();
                    strDecodePercent = "";
                }
                List arrayList = (List) map.get(strTrim);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(strTrim, arrayList);
                }
                arrayList.add(strDecodePercent);
            }
        }

        public static int findHeaderEnd(int i, byte[] bArr) {
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

        public final void decodeHeader(BufferedReader bufferedReader, HashMap map, HashMap map2, HashMap map3) throws ResponseException {
            String strDecodePercent;
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new ResponseException("BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
                map.put("method", stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new ResponseException("BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(63);
                if (iIndexOf >= 0) {
                    decodeParms(strNextToken.substring(iIndexOf + 1), map2);
                    strDecodePercent = NanoHTTPD.decodePercent(strNextToken.substring(0, iIndexOf));
                } else {
                    strDecodePercent = NanoHTTPD.decodePercent(strNextToken);
                }
                if (stringTokenizer.hasMoreTokens()) {
                    this.protocolVersion = stringTokenizer.nextToken();
                } else {
                    this.protocolVersion = "HTTP/1.1";
                    NanoHTTPD.LOG.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                }
                String line2 = bufferedReader.readLine();
                while (line2 != null && !line2.trim().isEmpty()) {
                    int iIndexOf2 = line2.indexOf(58);
                    if (iIndexOf2 >= 0) {
                        map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                    }
                    line2 = bufferedReader.readLine();
                }
                map.put("uri", strDecodePercent);
            } catch (IOException e) {
                throw new ResponseException("SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
            }
        }

        public final void execute() {
            Response.Status status = Response.Status.INTERNAL_ERROR;
            NanoHTTPD nanoHTTPD = NanoHTTPD.this;
            ChatActivity.AnonymousClass1 anonymousClass1 = this.tempFileManager;
            OutputStream outputStream = this.outputStream;
            try {
                try {
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            boolean z = false;
                            this.splitbyte = 0;
                            this.rlen = 0;
                            BufferedInputStream bufferedInputStream = this.inputStream;
                            bufferedInputStream.mark(8192);
                            try {
                                int i = bufferedInputStream.read(bArr, 0, 8192);
                                if (i == -1) {
                                    NanoHTTPD.safeClose(bufferedInputStream);
                                    NanoHTTPD.safeClose(outputStream);
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                                while (i > 0) {
                                    int i2 = this.rlen + i;
                                    this.rlen = i2;
                                    int iFindHeaderEnd = findHeaderEnd(i2, bArr);
                                    this.splitbyte = iFindHeaderEnd;
                                    if (iFindHeaderEnd > 0) {
                                        break;
                                    }
                                    int i3 = this.rlen;
                                    i = bufferedInputStream.read(bArr, i3, 8192 - i3);
                                }
                                if (this.splitbyte < this.rlen) {
                                    bufferedInputStream.reset();
                                    bufferedInputStream.skip(this.splitbyte);
                                }
                                this.parms = new HashMap();
                                HashMap map = this.headers;
                                if (map == null) {
                                    this.headers = new HashMap();
                                } else {
                                    map.clear();
                                }
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.rlen)));
                                HashMap map2 = new HashMap();
                                decodeHeader(bufferedReader, map2, this.parms, this.headers);
                                String str = this.remoteIp;
                                if (str != null) {
                                    this.headers.put("remote-addr", str);
                                    this.headers.put("http-client-ip", str);
                                }
                                int i_lookup = ArticleViewer.IBlock.CC._lookup((String) map2.get("method"));
                                this.method = i_lookup;
                                if (i_lookup == 0) {
                                    throw new ResponseException("BAD REQUEST: Syntax error. HTTP verb " + ((String) map2.get("method")) + " unhandled.");
                                }
                                this.uri = (String) map2.get("uri");
                                this.cookies = new CookieHandler(this.headers);
                                String str2 = (String) this.headers.get("connection");
                                boolean z2 = "HTTP/1.1".equals(this.protocolVersion) && (str2 == null || !str2.matches("(?i).*close.*"));
                                Response responseServe = nanoHTTPD.serve(this);
                                String str3 = (String) this.headers.get("accept-encoding");
                                this.cookies.unloadQueue();
                                responseServe.setRequestMethod(this.method);
                                if (NanoHTTPD.useGzipWhenAccepted(responseServe) && str3 != null && str3.contains("gzip")) {
                                    z = true;
                                }
                                responseServe.setGzipEncoding(z);
                                responseServe.setKeepAlive(z2);
                                responseServe.send(outputStream);
                                if (!z2 || responseServe.isCloseConnection()) {
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                                NanoHTTPD.safeClose(responseServe);
                                anonymousClass1.clear();
                            } catch (SSLException e) {
                                throw e;
                            } catch (IOException unused) {
                                NanoHTTPD.safeClose(bufferedInputStream);
                                NanoHTTPD.safeClose(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                        } catch (ResponseException e2) {
                            NanoHTTPD.newFixedLengthResponse(e2.getStatus(), "text/plain", e2.getMessage()).send(outputStream);
                            NanoHTTPD.safeClose(outputStream);
                            NanoHTTPD.safeClose(null);
                            anonymousClass1.clear();
                        }
                    } catch (SSLException e3) {
                        NanoHTTPD.newFixedLengthResponse(status, "text/plain", "SSL PROTOCOL FAILURE: " + e3.getMessage()).send(outputStream);
                        NanoHTTPD.safeClose(outputStream);
                        NanoHTTPD.safeClose(null);
                        anonymousClass1.clear();
                    } catch (IOException e4) {
                        NanoHTTPD.newFixedLengthResponse(status, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e4.getMessage()).send(outputStream);
                        NanoHTTPD.safeClose(outputStream);
                        NanoHTTPD.safeClose(null);
                        anonymousClass1.clear();
                    }
                } catch (SocketException e5) {
                    throw e5;
                } catch (SocketTimeoutException e6) {
                    throw e6;
                }
            } catch (Throwable th) {
                NanoHTTPD.safeClose(null);
                anonymousClass1.clear();
                throw th;
            }
        }
    }

    public final class Response implements Closeable, AutoCloseable {
        public boolean chunkedTransfer;
        public final long contentLength;
        public final InputStream data;
        public boolean encodeAsGzip;
        public boolean keepAlive;
        public final String mimeType;
        public int requestMethod;
        public final Status status;
        public final AnonymousClass1 header = new AnonymousClass1(this, 0);
        public final HashMap lowerCaseHeader = new HashMap();

        public final class AnonymousClass1 extends HashMap {
            public final int $r8$classId;
            public final Object this$0;

            public AnonymousClass1(Object obj, int i) {
                this.$r8$classId = i;
                this.this$0 = obj;
            }

            @Override
            public Object get(Object obj) {
                switch (this.$r8$classId) {
                    case 1:
                        RLottieDrawable rLottieDrawable = (RLottieDrawable) super.get(obj);
                        if (rLottieDrawable != null) {
                            return rLottieDrawable;
                        }
                        ChatActivityEnterViewAnimatedIconView.TransitState transitState = (ChatActivityEnterViewAnimatedIconView.TransitState) obj;
                        int i = transitState.resource;
                        String strValueOf = String.valueOf(i);
                        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = (ChatActivityEnterViewAnimatedIconView) this.this$0;
                        RLottieDrawable rLottieDrawable2 = new RLottieDrawable(i, strValueOf, AndroidUtilities.dp(chatActivityEnterViewAnimatedIconView.sizeDp), AndroidUtilities.dp(chatActivityEnterViewAnimatedIconView.sizeDp), true, null);
                        put(transitState, rLottieDrawable2);
                        return rLottieDrawable2;
                    default:
                        return super.get(obj);
                }
            }

            @Override
            public Object put(Object obj, Object obj2) {
                switch (this.$r8$classId) {
                    case 0:
                        String str = (String) obj;
                        String str2 = (String) obj2;
                        ((Response) this.this$0).lowerCaseHeader.put(str == null ? str : str.toLowerCase(), str2);
                        return (String) super.put(str, str2);
                    default:
                        return super.put(obj, obj2);
                }
            }
        }

        public enum Status {
            TOO_MANY_REQUESTS(101, "Switching Protocols"),
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
            TOO_MANY_REQUESTS(401, "Unauthorized"),
            EXPECTATION_FAILED(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            EXPECTATION_FAILED(405, "Method Not Allowed"),
            TOO_MANY_REQUESTS(406, "Not Acceptable"),
            EXPECTATION_FAILED(408, "Request Timeout"),
            TOO_MANY_REQUESTS(409, "Conflict"),
            EXPECTATION_FAILED(410, "Gone"),
            TOO_MANY_REQUESTS(411, "Length Required"),
            EXPECTATION_FAILED(412, "Precondition Failed"),
            TOO_MANY_REQUESTS(413, "Payload Too Large"),
            EXPECTATION_FAILED(415, "Unsupported Media Type"),
            TOO_MANY_REQUESTS(416, "Requested Range Not Satisfiable"),
            EXPECTATION_FAILED(417, "Expectation Failed"),
            TOO_MANY_REQUESTS(429, "Too Many Requests"),
            INTERNAL_ERROR(500, "Internal Server Error"),
            NOT_IMPLEMENTED(501, "Not Implemented"),
            SERVICE_UNAVAILABLE(503, "Service Unavailable"),
            UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");

            public final String description;
            public final int requestStatus;

            Status(int i, String str) {
                this.requestStatus = i;
                this.description = str;
            }
        }

        public Response(Status status, String str, InputStream inputStream, long j) {
            this.status = status;
            this.mimeType = str;
            this.data = inputStream;
            this.contentLength = j;
            this.chunkedTransfer = j < 0;
            this.keepAlive = true;
        }

        public static void printHeader(PrintWriter printWriter, String str, String str2) {
            printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
        }

        public final void addHeader(String str, String str2) {
            this.header.put(str, str2);
        }

        @Override
        public final void close() throws IOException {
            InputStream inputStream = this.data;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        public final String getHeader(String str) {
            return (String) this.lowerCaseHeader.get(str.toLowerCase());
        }

        public final boolean isCloseConnection() {
            return "close".equals(getHeader("connection"));
        }

        public final void send(OutputStream outputStream) {
            String str = this.mimeType;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            Status status = this.status;
            try {
                if (status == null) {
                    throw new Error("sendResponse(): Status can't be null.");
                }
                String str2 = new ContentType(str).encoding;
                if (str2 == null) {
                    str2 = "US-ASCII";
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str2)), false);
                printWriter.append("HTTP/1.1 ").append("" + status.requestStatus + " " + status.description).append(" \r\n");
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
                    this.chunkedTransfer = true;
                }
                InputStream inputStream = this.data;
                long jSendContentLengthHeaderIfNotAlreadyPresent = inputStream != null ? this.contentLength : 0L;
                if (this.requestMethod != 5 && this.chunkedTransfer) {
                    printHeader(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.encodeAsGzip) {
                    jSendContentLengthHeaderIfNotAlreadyPresent = sendContentLengthHeaderIfNotAlreadyPresent(printWriter, jSendContentLengthHeaderIfNotAlreadyPresent);
                }
                printWriter.append("\r\n");
                printWriter.flush();
                if (this.requestMethod != 5 && this.chunkedTransfer) {
                    ChunkedOutputStream chunkedOutputStream = new ChunkedOutputStream(outputStream);
                    if (this.encodeAsGzip) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(chunkedOutputStream);
                        sendBody(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        sendBody(chunkedOutputStream, -1L);
                    }
                    chunkedOutputStream.finish();
                } else if (this.encodeAsGzip) {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                    sendBody(gZIPOutputStream2, -1L);
                    gZIPOutputStream2.finish();
                } else {
                    sendBody(outputStream, jSendContentLengthHeaderIfNotAlreadyPresent);
                }
                outputStream.flush();
                NanoHTTPD.safeClose(inputStream);
            } catch (IOException e) {
                NanoHTTPD.LOG.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
            }
        }

        public final void sendBody(OutputStream outputStream, long j) throws IOException {
            byte[] bArr = new byte[(int) 16384];
            boolean z = j == -1;
            while (true) {
                if (j <= 0 && !z) {
                    return;
                }
                int i = this.data.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
                if (i <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, i);
                if (!z) {
                    j -= (long) i;
                }
            }
        }

        public final long sendContentLengthHeaderIfNotAlreadyPresent(PrintWriter printWriter, long j) {
            String header = getHeader("content-length");
            if (header != null) {
                try {
                    j = Long.parseLong(header);
                } catch (NumberFormatException unused) {
                    NanoHTTPD.LOG.severe("content-length was no number ".concat(header));
                }
            }
            printWriter.print("Content-Length: " + j + "\r\n");
            return j;
        }

        public final void setGzipEncoding(boolean z) {
            this.encodeAsGzip = z;
        }

        public final void setKeepAlive(boolean z) {
            this.keepAlive = z;
        }

        public final void setRequestMethod(int i) {
            this.requestMethod = i;
        }

        public final class ChunkedOutputStream extends FilterOutputStream {
            public final void finish() throws IOException {
                ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
            }

            @Override
            public final void write(int i) throws IOException {
                write(new byte[]{(byte) i}, 0, 1);
            }

            @Override
            public final void write(byte[] bArr) throws IOException {
                write(bArr, 0, bArr.length);
            }

            @Override
            public final void write(byte[] bArr, int i, int i2) throws IOException {
                if (i2 == 0) {
                    return;
                }
                ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i2)).getBytes());
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                ((FilterOutputStream) this).out.write("\r\n".getBytes());
            }
        }
    }

    public final class ServerRunnable implements Runnable {
        public final int $r8$classId;
        public Object bindException;
        public boolean hasBinded;
        public final Object this$0;

        public ServerRunnable(Object obj, Object obj2, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.bindException = obj2;
            this.hasBinded = z;
        }

        @Override
        public final void run() {
            switch (this.$r8$classId) {
                case 0:
                    try {
                        ServerSocket serverSocket = ((NanoHTTPD) this.this$0).myServerSocket;
                        ((NanoHTTPD) this.this$0).getClass();
                        ((NanoHTTPD) this.this$0).getClass();
                        serverSocket.bind(new InetSocketAddress(61578));
                        this.hasBinded = true;
                        do {
                            try {
                                Socket socketAccept = ((NanoHTTPD) this.this$0).myServerSocket.accept();
                                socketAccept.setSoTimeout(5000);
                                InputStream inputStream = socketAccept.getInputStream();
                                NanoHTTPD nanoHTTPD = (NanoHTTPD) this.this$0;
                                nanoHTTPD.asyncRunner.exec(nanoHTTPD.new ClientHandler(inputStream, socketAccept));
                            } catch (IOException e) {
                                NanoHTTPD.LOG.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                            }
                        } while (!((NanoHTTPD) this.this$0).myServerSocket.isClosed());
                    } catch (IOException e2) {
                        this.bindException = e2;
                        return;
                    }
                    break;
                case 1:
                    ActionBarLayout actionBarLayout = (ActionBarLayout) this.this$0;
                    if (actionBarLayout.delayedOpenAnimationRunnable == this) {
                        actionBarLayout.delayedOpenAnimationRunnable = null;
                        ((BaseFragment) this.bindException).onTransitionAnimationStart(true, false);
                        actionBarLayout.startLayoutAnimation(true, true, this.hasBinded);
                        break;
                    }
                    break;
                default:
                    ArrayList arrayList = (ArrayList) this.bindException;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        ChatListItemAnimator chatListItemAnimator = (ChatListItemAnimator) this.this$0;
                        if (i >= size) {
                            arrayList.clear();
                            chatListItemAnimator.mMovesList.remove(arrayList);
                        } else {
                            Object obj = arrayList.get(i);
                            i++;
                            DefaultItemAnimator.MoveInfo moveInfo = (DefaultItemAnimator.MoveInfo) obj;
                            chatListItemAnimator.animateMoveImpl(moveInfo.holder, moveInfo, this.hasBinded);
                        }
                        break;
                    }
                    break;
            }
        }

        public ServerRunnable(NanoHTTPD nanoHTTPD) {
            this.$r8$classId = 0;
            this.this$0 = nanoHTTPD;
            this.hasBinded = false;
        }
    }

    static {
        Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
        Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
        Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
        LOG = Logger.getLogger(NanoHTTPD.class.getName());
    }

    public static String decodePercent(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            LOG.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    public static Response newFixedLengthResponse(Response.Status status, String str, String str2) {
        byte[] bytes;
        ContentType contentType = new ContentType(str);
        if (str2 == null) {
            return new Response(status, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        String str3 = "US-ASCII";
        String str4 = contentType.encoding;
        try {
            if (!Charset.forName(str4 == null ? "US-ASCII" : str4).newEncoder().canEncode(str2) && str4 == null) {
                contentType = new ContentType(str + "; charset=UTF-8");
            }
            String str5 = contentType.encoding;
            if (str5 != null) {
                str3 = str5;
            }
            bytes = str2.getBytes(str3);
        } catch (UnsupportedEncodingException e) {
            LOG.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bytes = new byte[0];
        }
        return new Response(status, contentType.contentTypeHeader, new ByteArrayInputStream(bytes), bytes.length);
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

    public static boolean useGzipWhenAccepted(Response response) {
        String str = response.mimeType;
        if (str != null) {
            return str.toLowerCase().contains("text/") || response.mimeType.toLowerCase().contains("/json");
        }
        return false;
    }

    public abstract Response serve(HTTPSession hTTPSession);

    public final void start() throws IOException {
        this.myServerSocket = new ServerSocket();
        this.myServerSocket.setReuseAddress(true);
        ServerRunnable serverRunnable = new ServerRunnable(this);
        Thread thread = new Thread(serverRunnable);
        this.myThread = thread;
        thread.setDaemon(true);
        this.myThread.setName("NanoHttpd Main Listener");
        this.myThread.start();
        while (!serverRunnable.hasBinded && ((IOException) serverRunnable.bindException) == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        IOException iOException = (IOException) serverRunnable.bindException;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final class ResponseException extends Exception {
        public final Response.Status status;

        public ResponseException(String str) {
            super(str);
            Response.Status status = Response.Status.BAD_REQUEST;
            this.status = status;
        }

        public final Response.Status getStatus() {
            return this.status;
        }

        public ResponseException(String str, IOException iOException) {
            super(str, iOException);
            Response.Status status = Response.Status.INTERNAL_ERROR;
            this.status = status;
        }
    }
}
