package hc;

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

    public final d f8873a;

    public final OutputStream f8874b;

    public final BufferedInputStream f8875c;
    public int d;

    public int f8876e;

    public String f8877f;

    public int f8878g;
    public HashMap h;

    public HashMap f8879i;

    public c f8880j;

    public final String f8881k;

    public String f8882l;

    public final l f8883m;

    public e(l lVar, d dVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.f8883m = lVar;
        this.f8873a = dVar;
        this.f8875c = new BufferedInputStream(inputStream, 8192);
        this.f8874b = outputStream;
        this.f8881k = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f8879i = new HashMap();
    }

    public static void b(String str, Map map) {
        String strTrim;
        String strB;
        if (str == null) {
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(61);
            if (iIndexOf >= 0) {
                strTrim = l.b(strNextToken.substring(0, iIndexOf)).trim();
                strB = l.b(strNextToken.substring(iIndexOf + 1));
            } else {
                strTrim = l.b(strNextToken).trim();
                strB = "";
            }
            List arrayList = (List) map.get(strTrim);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(strTrim, arrayList);
            }
            arrayList.add(strB);
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

    public final void a(BufferedReader bufferedReader, HashMap map, HashMap map2, HashMap map3) throws j {
        String strB;
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            if (!stringTokenizer.hasMoreTokens()) {
                throw new j("BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
            map.put("method", stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreTokens()) {
                throw new j("BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(63);
            if (iIndexOf >= 0) {
                b(strNextToken.substring(iIndexOf + 1), map2);
                strB = l.b(strNextToken.substring(0, iIndexOf));
            } else {
                strB = l.b(strNextToken);
            }
            if (stringTokenizer.hasMoreTokens()) {
                this.f8882l = stringTokenizer.nextToken();
            } else {
                this.f8882l = "HTTP/1.1";
                l.d.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
            }
            String line2 = bufferedReader.readLine();
            while (line2 != null && !line2.trim().isEmpty()) {
                int iIndexOf2 = line2.indexOf(58);
                if (iIndexOf2 >= 0) {
                    map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                }
                line2 = bufferedReader.readLine();
            }
            map.put("uri", strB);
        } catch (IOException e9) {
            throw new j("SERVER INTERNAL ERROR: IOException: " + e9.getMessage(), e9);
        }
    }

    public final void c() {
        h hVar = h.INTERNAL_ERROR;
        l lVar = this.f8883m;
        d dVar = this.f8873a;
        BufferedInputStream bufferedInputStream = this.f8875c;
        OutputStream outputStream = this.f8874b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z10 = false;
                        this.d = 0;
                        this.f8876e = 0;
                        bufferedInputStream.mark(8192);
                        try {
                            int i10 = bufferedInputStream.read(bArr, 0, 8192);
                            if (i10 == -1) {
                                l.d(bufferedInputStream);
                                l.d(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (i10 > 0) {
                                int i11 = this.f8876e + i10;
                                this.f8876e = i11;
                                int iD = d(i11, bArr);
                                this.d = iD;
                                if (iD > 0) {
                                    break;
                                }
                                int i12 = this.f8876e;
                                i10 = bufferedInputStream.read(bArr, i12, 8192 - i12);
                            }
                            if (this.d < this.f8876e) {
                                bufferedInputStream.reset();
                                bufferedInputStream.skip(this.d);
                            }
                            this.h = new HashMap();
                            HashMap map = this.f8879i;
                            if (map == null) {
                                this.f8879i = new HashMap();
                            } else {
                                map.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f8876e)));
                            HashMap map2 = new HashMap();
                            a(bufferedReader, map2, this.h, this.f8879i);
                            String str = this.f8881k;
                            if (str != null) {
                                this.f8879i.put("remote-addr", str);
                                this.f8879i.put("http-client-ip", str);
                            }
                            int iA = com.google.android.recaptcha.internal.a.a((String) map2.get("method"));
                            this.f8878g = iA;
                            if (iA == 0) {
                                throw new j("BAD REQUEST: Syntax error. HTTP verb " + ((String) map2.get("method")) + " unhandled.");
                            }
                            this.f8877f = (String) map2.get("uri");
                            this.f8880j = new c(this.f8879i);
                            String str2 = (String) this.f8879i.get("connection");
                            boolean z11 = "HTTP/1.1".equals(this.f8882l) && (str2 == null || !str2.matches("(?i).*close.*"));
                            i iVarE = lVar.e(this);
                            String str3 = (String) this.f8879i.get("accept-encoding");
                            this.f8880j.i();
                            iVarE.i(this.f8878g);
                            if (l.g(iVarE) && str3 != null && str3.contains("gzip")) {
                                z10 = true;
                            }
                            iVarE.g(z10);
                            iVarE.h(z11);
                            iVarE.d(outputStream);
                            if (!z11 || iVarE.b()) {
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            l.d(iVarE);
                            dVar.a();
                        } catch (SSLException e9) {
                            throw e9;
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
        } catch (Throwable th) {
            l.d(null);
            dVar.a();
            throw th;
        }
    }
}
