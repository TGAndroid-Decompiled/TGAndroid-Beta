package kc;

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
public final class e {
    public final d f10291a;
    public final OutputStream f10292b;
    public final BufferedInputStream f10293c;
    public int d;
    public int e;
    public String f10294f;
    public int f10295g;
    public HashMap h;
    public HashMap f10296i;
    public c f10297j;
    public final String f10298k;
    public String f10299l;
    public final l f10300m;

    public e(l lVar, d dVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        String str;
        this.f10300m = lVar;
        this.f10291a = dVar;
        this.f10293c = new BufferedInputStream(inputStream, 8192);
        this.f10292b = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            str = inetAddress.getHostAddress().toString();
        } else {
            str = "127.0.0.1";
        }
        this.f10298k = str;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f10296i = new HashMap();
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
                    trim = l.b(nextToken.substring(0, indexOf)).trim();
                    str2 = l.b(nextToken.substring(indexOf + 1));
                } else {
                    trim = l.b(nextToken).trim();
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
                        b10 = l.b(nextToken.substring(0, indexOf));
                    } else {
                        b10 = l.b(nextToken);
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        this.f10299l = stringTokenizer.nextToken();
                    } else {
                        this.f10299l = "HTTP/1.1";
                        l.d.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
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
                throw new j("BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            throw new j("BAD REQUEST: Syntax error. Usage: GET /example/file.html");
        } catch (IOException e) {
            throw new j("SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
        }
    }

    public final void c() {
        boolean z4;
        h hVar = h.INTERNAL_ERROR;
        l lVar = this.f10300m;
        d dVar = this.f10291a;
        BufferedInputStream bufferedInputStream = this.f10293c;
        OutputStream outputStream = this.f10292b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z10 = false;
                        this.d = 0;
                        this.e = 0;
                        bufferedInputStream.mark(8192);
                        try {
                            int read = bufferedInputStream.read(bArr, 0, 8192);
                            if (read == -1) {
                                l.d(bufferedInputStream);
                                l.d(outputStream);
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
                            HashMap hashMap = this.f10296i;
                            if (hashMap == null) {
                                this.f10296i = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.e)));
                            HashMap hashMap2 = new HashMap();
                            a(bufferedReader, hashMap2, this.h, this.f10296i);
                            String str = this.f10298k;
                            if (str != null) {
                                this.f10296i.put("remote-addr", str);
                                this.f10296i.put("http-client-ip", str);
                            }
                            int a2 = e2.c.a((String) hashMap2.get("method"));
                            this.f10295g = a2;
                            if (a2 != 0) {
                                this.f10294f = (String) hashMap2.get("uri");
                                this.f10297j = new c(this.f10296i);
                                String str2 = (String) this.f10296i.get("connection");
                                if ("HTTP/1.1".equals(this.f10299l) && (str2 == null || !str2.matches("(?i).*close.*"))) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                i e = lVar.e(this);
                                String str3 = (String) this.f10296i.get("accept-encoding");
                                this.f10297j.i();
                                e.i(this.f10295g);
                                if (l.g(e) && str3 != null && str3.contains("gzip")) {
                                    z10 = true;
                                }
                                e.g(z10);
                                e.h(z4);
                                e.d(outputStream);
                                if (z4 && !e.b()) {
                                    l.d(e);
                                    dVar.a();
                                    return;
                                }
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            throw new j("BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap2.get("method")) + " unhandled.");
                        } catch (SSLException e6) {
                            throw e6;
                        } catch (IOException unused) {
                            l.d(bufferedInputStream);
                            l.d(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (j e10) {
                        l.c(e10.a(), "text/plain", e10.getMessage()).d(outputStream);
                        l.d(outputStream);
                        l.d(null);
                        dVar.a();
                    }
                } catch (SSLException e11) {
                    l.c(hVar, "text/plain", "SSL PROTOCOL FAILURE: " + e11.getMessage()).d(outputStream);
                    l.d(outputStream);
                    l.d(null);
                    dVar.a();
                } catch (IOException e12) {
                    l.c(hVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e12.getMessage()).d(outputStream);
                    l.d(outputStream);
                    l.d(null);
                    dVar.a();
                }
            } catch (SocketException e13) {
                throw e13;
            } catch (SocketTimeoutException e14) {
                throw e14;
            }
        } catch (Throwable th2) {
            l.d(null);
            dVar.a();
            throw th2;
        }
    }
}
