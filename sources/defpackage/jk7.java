package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
public final class jk7 {
    public final jk4 a;
    public final OutputStream b;
    public final BufferedInputStream c;
    public int d;
    public int e;
    public String f;
    public int g;
    public HashMap h;
    public final HashMap i;
    public ik7 j;
    public final String k;
    public String l;
    public final nk7 m;

    public jk7(nk7 nk7Var, jk4 jk4Var, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        String str;
        this.m = nk7Var;
        this.a = jk4Var;
        this.c = new BufferedInputStream(inputStream, 8192);
        this.b = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            str = inetAddress.getHostAddress().toString();
        } else {
            str = "127.0.0.1";
        }
        this.k = str;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.i = new HashMap();
    }

    public static void b(String str, HashMap hashMap) {
        String trim;
        String str2;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(61);
            if (indexOf >= 0) {
                trim = nk7.a(nextToken.substring(0, indexOf)).trim();
                str2 = nk7.a(nextToken.substring(indexOf + 1));
            } else {
                trim = nk7.a(nextToken).trim();
                str2 = "";
            }
            List list = (List) hashMap.get(trim);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(trim, list);
            }
            list.add(str2);
        }
    }

    public static int d(int i, byte[] bArr) {
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

    public final void a(BufferedReader bufferedReader, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        String a;
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
                        a = nk7.a(nextToken.substring(0, indexOf));
                    } else {
                        a = nk7.a(nextToken);
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        this.l = stringTokenizer.nextToken();
                    } else {
                        this.l = "HTTP/1.1";
                        nk7.d.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                    }
                    String readLine2 = bufferedReader.readLine();
                    while (readLine2 != null && !readLine2.trim().isEmpty()) {
                        int indexOf2 = readLine2.indexOf(58);
                        if (indexOf2 >= 0) {
                            hashMap3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                        }
                        readLine2 = bufferedReader.readLine();
                    }
                    hashMap.put("uri", a);
                    return;
                }
                throw new mk7("BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            throw new mk7("BAD REQUEST: Syntax error. Usage: GET /example/file.html");
        } catch (IOException e) {
            String message = e.getMessage();
            throw new mk7("SERVER INTERNAL ERROR: IOException: " + message, e);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk7.c():void");
    }
}
