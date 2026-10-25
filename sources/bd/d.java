package bd;

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
public final class d {
    public final rb.c f3859a;
    public final OutputStream f3860b;
    public final BufferedInputStream f3861c;
    public int d;
    public int e;
    public String f3862f;
    public int f3863g;
    public HashMap h;
    public HashMap f3864i;
    public c f3865j;
    public final String f3866k;
    public String f3867l;
    public final k f3868m;

    public d(k kVar, rb.c cVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        String str;
        this.f3868m = kVar;
        this.f3859a = cVar;
        this.f3861c = new BufferedInputStream(inputStream, 8192);
        this.f3860b = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            str = inetAddress.getHostAddress().toString();
        } else {
            str = "127.0.0.1";
        }
        this.f3866k = str;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f3864i = new HashMap();
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
                    trim = k.b(nextToken.substring(0, indexOf)).trim();
                    str2 = k.b(nextToken.substring(indexOf + 1));
                } else {
                    trim = k.b(nextToken).trim();
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
                        b10 = k.b(nextToken.substring(0, indexOf));
                    } else {
                        b10 = k.b(nextToken);
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        this.f3867l = stringTokenizer.nextToken();
                    } else {
                        this.f3867l = "HTTP/1.1";
                        k.d.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
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
                throw new i("BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            throw new i("BAD REQUEST: Syntax error. Usage: GET /example/file.html");
        } catch (IOException e) {
            throw new i("SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
        }
    }

    public final void c() {
        boolean z10;
        g gVar = g.INTERNAL_ERROR;
        k kVar = this.f3868m;
        rb.c cVar = this.f3859a;
        BufferedInputStream bufferedInputStream = this.f3861c;
        OutputStream outputStream = this.f3860b;
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
                                k.d(bufferedInputStream);
                                k.d(outputStream);
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
                            HashMap hashMap = this.f3864i;
                            if (hashMap == null) {
                                this.f3864i = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.e)));
                            HashMap hashMap2 = new HashMap();
                            a(bufferedReader, hashMap2, this.h, this.f3864i);
                            String str = this.f3866k;
                            if (str != null) {
                                this.f3864i.put("remote-addr", str);
                                this.f3864i.put("http-client-ip", str);
                            }
                            int b10 = a1.g.b((String) hashMap2.get("method"));
                            this.f3863g = b10;
                            if (b10 != 0) {
                                this.f3862f = (String) hashMap2.get("uri");
                                this.f3865j = new c(this.f3864i);
                                String str2 = (String) this.f3864i.get("connection");
                                if ("HTTP/1.1".equals(this.f3867l) && (str2 == null || !str2.matches("(?i).*close.*"))) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                h e = kVar.e(this);
                                String str3 = (String) this.f3864i.get("accept-encoding");
                                this.f3865j.h();
                                e.i(this.f3863g);
                                if (k.g(e) && str3 != null && str3.contains("gzip")) {
                                    z11 = true;
                                }
                                e.g(z11);
                                e.h(z10);
                                e.d(outputStream);
                                if (z10 && !e.b()) {
                                    k.d(e);
                                    cVar.g();
                                    return;
                                }
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            throw new i("BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap2.get("method")) + " unhandled.");
                        } catch (SSLException e10) {
                            throw e10;
                        } catch (IOException unused) {
                            k.d(bufferedInputStream);
                            k.d(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (i e11) {
                        k.c(e11.a(), "text/plain", e11.getMessage()).d(outputStream);
                        k.d(outputStream);
                        k.d(null);
                        cVar.g();
                    }
                } catch (SSLException e12) {
                    k.c(gVar, "text/plain", "SSL PROTOCOL FAILURE: " + e12.getMessage()).d(outputStream);
                    k.d(outputStream);
                    k.d(null);
                    cVar.g();
                } catch (IOException e13) {
                    k.c(gVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e13.getMessage()).d(outputStream);
                    k.d(outputStream);
                    k.d(null);
                    cVar.g();
                }
            } catch (SocketException e14) {
                throw e14;
            } catch (SocketTimeoutException e15) {
                throw e15;
            }
        } catch (Throwable th2) {
            k.d(null);
            cVar.g();
            throw th2;
        }
    }
}
