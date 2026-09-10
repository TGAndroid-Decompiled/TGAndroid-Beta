package hc;

import dc.h;
public abstract class c {
    public static final char[] f9279a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(b4.d dVar, StringBuilder sb2, int i10, boolean z10) {
        while (i10 > 1) {
            if (dVar.d() >= 11) {
                int e = dVar.e(11);
                sb2.append(f(e / 45));
                sb2.append(f(e % 45));
                i10 -= 2;
            } else {
                throw cc.c.a();
            }
        }
        if (i10 == 1) {
            if (dVar.d() >= 6) {
                sb2.append(f(dVar.e(6)));
            } else {
                throw cc.c.a();
            }
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    public static void b(b4.d r24, java.lang.StringBuilder r25, int r26, dc.c r27, java.util.ArrayList r28) {
        throw new UnsupportedOperationException("Method not decompiled: hc.c.b(b4.d, java.lang.StringBuilder, int, dc.c, java.util.ArrayList):void");
    }

    public static void c(b4.d dVar, StringBuilder sb2, int i10) {
        int i11;
        if (h.f6414c != null) {
            if (i10 * 13 <= dVar.d()) {
                byte[] bArr = new byte[i10 * 2];
                int i12 = 0;
                while (i10 > 0) {
                    int e = dVar.e(13);
                    int i13 = (e % 96) | ((e / 96) << 8);
                    if (i13 < 2560) {
                        i11 = 41377;
                    } else {
                        i11 = 42657;
                    }
                    int i14 = i13 + i11;
                    bArr[i12] = (byte) ((i14 >> 8) & 255);
                    bArr[i12 + 1] = (byte) (i14 & 255);
                    i12 += 2;
                    i10--;
                }
                sb2.append(new String(bArr, h.f6414c));
                return;
            }
            throw cc.c.a();
        }
        throw cc.c.a();
    }

    public static void d(b4.d dVar, StringBuilder sb2, int i10) {
        int i11;
        if (h.f6413b != null) {
            if (i10 * 13 <= dVar.d()) {
                byte[] bArr = new byte[i10 * 2];
                int i12 = 0;
                while (i10 > 0) {
                    int e = dVar.e(13);
                    int i13 = (e % 192) | ((e / 192) << 8);
                    if (i13 < 7936) {
                        i11 = 33088;
                    } else {
                        i11 = 49472;
                    }
                    int i14 = i13 + i11;
                    bArr[i12] = (byte) (i14 >> 8);
                    bArr[i12 + 1] = (byte) i14;
                    i12 += 2;
                    i10--;
                }
                sb2.append(new String(bArr, h.f6413b));
                return;
            }
            throw cc.c.a();
        }
        throw cc.c.a();
    }

    public static void e(b4.d dVar, StringBuilder sb2, int i10) {
        while (i10 >= 3) {
            if (dVar.d() >= 10) {
                int e = dVar.e(10);
                if (e < 1000) {
                    sb2.append(f(e / 100));
                    sb2.append(f((e / 10) % 10));
                    sb2.append(f(e % 10));
                    i10 -= 3;
                } else {
                    throw cc.c.a();
                }
            } else {
                throw cc.c.a();
            }
        }
        if (i10 == 2) {
            if (dVar.d() >= 7) {
                int e7 = dVar.e(7);
                if (e7 < 100) {
                    sb2.append(f(e7 / 10));
                    sb2.append(f(e7 % 10));
                    return;
                }
                throw cc.c.a();
            }
            throw cc.c.a();
        } else if (i10 == 1) {
            if (dVar.d() >= 4) {
                int e10 = dVar.e(4);
                if (e10 < 10) {
                    sb2.append(f(e10));
                    return;
                }
                throw cc.c.a();
            }
            throw cc.c.a();
        }
    }

    public static char f(int i10) {
        char[] cArr = f9279a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw cc.c.a();
    }
}
