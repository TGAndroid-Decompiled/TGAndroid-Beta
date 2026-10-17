package ad;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.net.ssl.SSLException;
public final class f {
    public final e f508a;
    public final OutputStream f509b;
    public final BufferedInputStream f510c;
    public int d;
    public int e;
    public String f511f;
    public int f512g;
    public HashMap h;
    public HashMap f513i;
    public c f514j;
    public final String f515k;
    public String f516l;
    public final m f517m;

    public f(m mVar, e eVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        String str;
        this.f517m = mVar;
        this.f508a = eVar;
        this.f510c = new BufferedInputStream(inputStream, 8192);
        this.f509b = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            str = inetAddress.getHostAddress().toString();
        } else {
            str = "127.0.0.1";
        }
        this.f515k = str;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f513i = new HashMap();
    }

    public static void b(String str, Map map) {
        String trim;
        String str2;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    trim = m.b(nextToken.substring(0, indexOf)).trim();
                    str2 = m.b(nextToken.substring(indexOf + 1));
                } else {
                    trim = m.b(nextToken).trim();
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
    }

    public static int d(int i10, byte[] bArr) {
        int i11;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i10) {
                return 0;
            }
            byte b10 = bArr[i12];
            if (b10 == 13 && bArr[i13] == 10 && (i11 = i12 + 3) < i10 && bArr[i12 + 2] == 13 && bArr[i11] == 10) {
                return i12 + 4;
            }
            if (b10 == 10 && bArr[i13] == 10) {
                return i12 + 2;
            }
            i12 = i13;
        }
    }

    public final void a(BufferedReader bufferedReader, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        String b10;
        try {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(readLine);
            if (stringTokenizer.hasMoreTokens()) {
                hashMap.put("method", stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    int indexOf = nextToken.indexOf(63);
                    if (indexOf >= 0) {
                        b(nextToken.substring(indexOf + 1), hashMap2);
                        b10 = m.b(nextToken.substring(0, indexOf));
                    } else {
                        b10 = m.b(nextToken);
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        this.f516l = stringTokenizer.nextToken();
                    } else {
                        this.f516l = "HTTP/1.1";
                        m.d.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                    }
                    String readLine2 = bufferedReader.readLine();
                    while (readLine2 != null && !readLine2.trim().isEmpty()) {
                        int indexOf2 = readLine2.indexOf(58);
                        if (indexOf2 >= 0) {
                            hashMap3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                        }
                        readLine2 = bufferedReader.readLine();
                    }
                    hashMap.put("uri", b10);
                    return;
                }
                throw new k("BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            throw new k("BAD REQUEST: Syntax error. Usage: GET /example/file.html");
        } catch (IOException e) {
            throw new k("SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
        }
    }

    public final void c() {
        boolean z10;
        i iVar = i.INTERNAL_ERROR;
        m mVar = this.f517m;
        e eVar = this.f508a;
        BufferedInputStream bufferedInputStream = this.f510c;
        OutputStream outputStream = this.f509b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z11 = false;
                        this.d = 0;
                        this.e = 0;
                        bufferedInputStream.mark(8192);
                        try {
                            int read = bufferedInputStream.read(bArr, 0, 8192);
                            if (read == -1) {
                                m.d(bufferedInputStream);
                                m.d(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (read > 0) {
                                int i10 = this.e + read;
                                this.e = i10;
                                int d = d(i10, bArr);
                                this.d = d;
                                if (d > 0) {
                                    break;
                                }
                                int i11 = this.e;
                                read = bufferedInputStream.read(bArr, i11, 8192 - i11);
                            }
                            if (this.d < this.e) {
                                bufferedInputStream.reset();
                                bufferedInputStream.skip(this.d);
                            }
                            this.h = new HashMap();
                            HashMap hashMap = this.f513i;
                            if (hashMap == null) {
                                this.f513i = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.e)));
                            HashMap hashMap2 = new HashMap();
                            a(bufferedReader, hashMap2, this.h, this.f513i);
                            String str = this.f515k;
                            if (str != null) {
                                this.f513i.put("remote-addr", str);
                                this.f513i.put("http-client-ip", str);
                            }
                            int c10 = a1.g.c((String) hashMap2.get("method"));
                            this.f512g = c10;
                            if (c10 != 0) {
                                this.f511f = (String) hashMap2.get("uri");
                                this.f514j = new c(this.f513i);
                                String str2 = (String) this.f513i.get("connection");
                                if ("HTTP/1.1".equals(this.f516l) && (str2 == null || !str2.matches("(?i).*close.*"))) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                j e = mVar.e(this);
                                String str3 = (String) this.f513i.get("accept-encoding");
                                this.f514j.h();
                                e.i(this.f512g);
                                if (m.g(e) && str3 != null && str3.contains("gzip")) {
                                    z11 = true;
                                }
                                e.g(z11);
                                e.h(z10);
                                e.d(outputStream);
                                if (z10 && !e.b()) {
                                    m.d(e);
                                    eVar.b();
                                    return;
                                }
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            throw new k("BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap2.get("method")) + " unhandled.");
                        } catch (SSLException e7) {
                            throw e7;
                        } catch (IOException unused) {
                            m.d(bufferedInputStream);
                            m.d(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (k e10) {
                        m.c(e10.a(), "text/plain", e10.getMessage()).d(outputStream);
                        m.d(outputStream);
                        m.d(null);
                        eVar.b();
                    }
                } catch (SSLException e11) {
                    m.c(iVar, "text/plain", "SSL PROTOCOL FAILURE: " + e11.getMessage()).d(outputStream);
                    m.d(outputStream);
                    m.d(null);
                    eVar.b();
                } catch (IOException e12) {
                    m.c(iVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e12.getMessage()).d(outputStream);
                    m.d(outputStream);
                    m.d(null);
                    eVar.b();
                }
            } catch (SocketException e13) {
                throw e13;
            } catch (SocketTimeoutException e14) {
                throw e14;
            }
        } catch (Throwable th2) {
            m.d(null);
            eVar.b();
            throw th2;
        }
    }
}
