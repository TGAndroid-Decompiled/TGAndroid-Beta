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
    public final d f11057a;
    public final OutputStream f11058b;
    public final BufferedInputStream f11059c;
    public int d;
    public int f11060e;
    public String f11061f;
    public int f11062g;
    public HashMap h;
    public HashMap f11063i;
    public c f11064j;
    public final String f11065k;
    public String f11066l;
    public final l f11067m;

    public e(l lVar, d dVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        String str;
        this.f11067m = lVar;
        this.f11057a = dVar;
        this.f11059c = new BufferedInputStream(inputStream, 8192);
        this.f11058b = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            str = inetAddress.getHostAddress().toString();
        } else {
            str = "127.0.0.1";
        }
        this.f11065k = str;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f11063i = new HashMap();
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
                        this.f11066l = stringTokenizer.nextToken();
                    } else {
                        this.f11066l = "HTTP/1.1";
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
        } catch (IOException e6) {
            throw new j("SERVER INTERNAL ERROR: IOException: " + e6.getMessage(), e6);
        }
    }

    public final void c() {
        boolean z4;
        h hVar = h.INTERNAL_ERROR;
        l lVar = this.f11067m;
        d dVar = this.f11057a;
        BufferedInputStream bufferedInputStream = this.f11059c;
        OutputStream outputStream = this.f11058b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z10 = false;
                        this.d = 0;
                        this.f11060e = 0;
                        bufferedInputStream.mark(8192);
                        try {
                            int read = bufferedInputStream.read(bArr, 0, 8192);
                            if (read == -1) {
                                l.d(bufferedInputStream);
                                l.d(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (read > 0) {
                                int i10 = this.f11060e + read;
                                this.f11060e = i10;
                                int d = d(i10, bArr);
                                this.d = d;
                                if (d > 0) {
                                    break;
                                }
                                int i11 = this.f11060e;
                                read = bufferedInputStream.read(bArr, i11, 8192 - i11);
                            }
                            if (this.d < this.f11060e) {
                                bufferedInputStream.reset();
                                bufferedInputStream.skip(this.d);
                            }
                            this.h = new HashMap();
                            HashMap hashMap = this.f11063i;
                            if (hashMap == null) {
                                this.f11063i = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f11060e)));
                            HashMap hashMap2 = new HashMap();
                            a(bufferedReader, hashMap2, this.h, this.f11063i);
                            String str = this.f11065k;
                            if (str != null) {
                                this.f11063i.put("remote-addr", str);
                                this.f11063i.put("http-client-ip", str);
                            }
                            int a2 = e2.c.a((String) hashMap2.get("method"));
                            this.f11062g = a2;
                            if (a2 != 0) {
                                this.f11061f = (String) hashMap2.get("uri");
                                this.f11064j = new c(this.f11063i);
                                String str2 = (String) this.f11063i.get("connection");
                                if ("HTTP/1.1".equals(this.f11066l) && (str2 == null || !str2.matches("(?i).*close.*"))) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                i e6 = lVar.e(this);
                                String str3 = (String) this.f11063i.get("accept-encoding");
                                this.f11064j.i();
                                e6.i(this.f11062g);
                                if (l.g(e6) && str3 != null && str3.contains("gzip")) {
                                    z10 = true;
                                }
                                e6.g(z10);
                                e6.h(z4);
                                e6.d(outputStream);
                                if (z4 && !e6.b()) {
                                    l.d(e6);
                                    dVar.a();
                                    return;
                                }
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            throw new j("BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap2.get("method")) + " unhandled.");
                        } catch (SSLException e10) {
                            throw e10;
                        } catch (IOException unused) {
                            l.d(bufferedInputStream);
                            l.d(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (j e11) {
                        l.c(e11.a(), "text/plain", e11.getMessage()).d(outputStream);
                        l.d(outputStream);
                        l.d(null);
                        dVar.a();
                    }
                } catch (SSLException e12) {
                    l.c(hVar, "text/plain", "SSL PROTOCOL FAILURE: " + e12.getMessage()).d(outputStream);
                    l.d(outputStream);
                    l.d(null);
                    dVar.a();
                } catch (IOException e13) {
                    l.c(hVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e13.getMessage()).d(outputStream);
                    l.d(outputStream);
                    l.d(null);
                    dVar.a();
                }
            } catch (SocketException e14) {
                throw e14;
            } catch (SocketTimeoutException e15) {
                throw e15;
            }
        } catch (Throwable th2) {
            l.d(null);
            dVar.a();
            throw th2;
        }
    }
}
