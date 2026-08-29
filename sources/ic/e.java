package ic;

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
    public final d f8837a;
    public final OutputStream f8838b;
    public final BufferedInputStream f8839c;
    public int d;
    public int f8840e;
    public String f8841f;
    public int f8842g;
    public HashMap h;
    public HashMap f8843i;
    public c f8844j;
    public final String f8845k;
    public String f8846l;
    public final l f8847m;

    public e(l lVar, d dVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        String str;
        this.f8847m = lVar;
        this.f8837a = dVar;
        this.f8839c = new BufferedInputStream(inputStream, 8192);
        this.f8838b = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            str = inetAddress.getHostAddress().toString();
        } else {
            str = "127.0.0.1";
        }
        this.f8845k = str;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f8843i = new HashMap();
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
                        this.f8846l = stringTokenizer.nextToken();
                    } else {
                        this.f8846l = "HTTP/1.1";
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
        } catch (IOException e10) {
            throw new j("SERVER INTERNAL ERROR: IOException: " + e10.getMessage(), e10);
        }
    }

    public final void c() {
        boolean z10;
        h hVar = h.INTERNAL_ERROR;
        l lVar = this.f8847m;
        d dVar = this.f8837a;
        BufferedInputStream bufferedInputStream = this.f8839c;
        OutputStream outputStream = this.f8838b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z11 = false;
                        this.d = 0;
                        this.f8840e = 0;
                        bufferedInputStream.mark(8192);
                        try {
                            int read = bufferedInputStream.read(bArr, 0, 8192);
                            if (read == -1) {
                                l.d(bufferedInputStream);
                                l.d(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (read > 0) {
                                int i10 = this.f8840e + read;
                                this.f8840e = i10;
                                int d = d(i10, bArr);
                                this.d = d;
                                if (d > 0) {
                                    break;
                                }
                                int i11 = this.f8840e;
                                read = bufferedInputStream.read(bArr, i11, 8192 - i11);
                            }
                            if (this.d < this.f8840e) {
                                bufferedInputStream.reset();
                                bufferedInputStream.skip(this.d);
                            }
                            this.h = new HashMap();
                            HashMap hashMap = this.f8843i;
                            if (hashMap == null) {
                                this.f8843i = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f8840e)));
                            HashMap hashMap2 = new HashMap();
                            a(bufferedReader, hashMap2, this.h, this.f8843i);
                            String str = this.f8845k;
                            if (str != null) {
                                this.f8843i.put("remote-addr", str);
                                this.f8843i.put("http-client-ip", str);
                            }
                            int a2 = com.google.android.recaptcha.internal.a.a((String) hashMap2.get("method"));
                            this.f8842g = a2;
                            if (a2 != 0) {
                                this.f8841f = (String) hashMap2.get("uri");
                                this.f8844j = new c(this.f8843i);
                                String str2 = (String) this.f8843i.get("connection");
                                if ("HTTP/1.1".equals(this.f8846l) && (str2 == null || !str2.matches("(?i).*close.*"))) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i e10 = lVar.e(this);
                                String str3 = (String) this.f8843i.get("accept-encoding");
                                this.f8844j.i();
                                e10.i(this.f8842g);
                                if (l.g(e10) && str3 != null && str3.contains("gzip")) {
                                    z11 = true;
                                }
                                e10.g(z11);
                                e10.h(z10);
                                e10.d(outputStream);
                                if (z10 && !e10.b()) {
                                    l.d(e10);
                                    dVar.a();
                                    return;
                                }
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            throw new j("BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap2.get("method")) + " unhandled.");
                        } catch (SSLException e11) {
                            throw e11;
                        } catch (IOException unused) {
                            l.d(bufferedInputStream);
                            l.d(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (j e12) {
                        l.c(e12.a(), "text/plain", e12.getMessage()).d(outputStream);
                        l.d(outputStream);
                        l.d(null);
                        dVar.a();
                    }
                } catch (SSLException e13) {
                    l.c(hVar, "text/plain", "SSL PROTOCOL FAILURE: " + e13.getMessage()).d(outputStream);
                    l.d(outputStream);
                    l.d(null);
                    dVar.a();
                } catch (IOException e14) {
                    l.c(hVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e14.getMessage()).d(outputStream);
                    l.d(outputStream);
                    l.d(null);
                    dVar.a();
                }
            } catch (SocketException e15) {
                throw e15;
            } catch (SocketTimeoutException e16) {
                throw e16;
            }
        } catch (Throwable th2) {
            l.d(null);
            dVar.a();
            throw th2;
        }
    }
}
