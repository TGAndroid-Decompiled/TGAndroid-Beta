package dc;

import zb.h;
public abstract class a {
    public static final char[] f8762a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(d4.d dVar, StringBuilder sb2, int i3, boolean z10) {
        while (i3 > 1) {
            if (dVar.d() >= 11) {
                int f10 = dVar.f(11);
                sb2.append(f(f10 / 45));
                sb2.append(f(f10 % 45));
                i3 -= 2;
            } else {
                throw yb.c.a();
            }
        }
        if (i3 == 1) {
            if (dVar.d() >= 6) {
                sb2.append(f(dVar.f(6)));
            } else {
                throw yb.c.a();
            }
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i10 = length + 1;
                        if (sb2.charAt(i10) == '%') {
                            sb2.deleteCharAt(i10);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    public static void b(d4.d r24, java.lang.StringBuilder r25, int r26, zb.c r27, java.util.ArrayList r28) {
        throw new UnsupportedOperationException("Method not decompiled: dc.a.b(d4.d, java.lang.StringBuilder, int, zb.c, java.util.ArrayList):void");
    }

    public static void c(d4.d dVar, StringBuilder sb2, int i3) {
        int i10;
        if (h.f60373c != null) {
            if (i3 * 13 <= dVar.d()) {
                byte[] bArr = new byte[i3 * 2];
                int i11 = 0;
                while (i3 > 0) {
                    int f10 = dVar.f(13);
                    int i12 = (f10 % 96) | ((f10 / 96) << 8);
                    if (i12 < 2560) {
                        i10 = 41377;
                    } else {
                        i10 = 42657;
                    }
                    int i13 = i12 + i10;
                    bArr[i11] = (byte) ((i13 >> 8) & 255);
                    bArr[i11 + 1] = (byte) (i13 & 255);
                    i11 += 2;
                    i3--;
                }
                sb2.append(new String(bArr, h.f60373c));
                return;
            }
            throw yb.c.a();
        }
        throw yb.c.a();
    }

    public static void d(d4.d dVar, StringBuilder sb2, int i3) {
        int i10;
        if (h.f60372b != null) {
            if (i3 * 13 <= dVar.d()) {
                byte[] bArr = new byte[i3 * 2];
                int i11 = 0;
                while (i3 > 0) {
                    int f10 = dVar.f(13);
                    int i12 = (f10 % 192) | ((f10 / 192) << 8);
                    if (i12 < 7936) {
                        i10 = 33088;
                    } else {
                        i10 = 49472;
                    }
                    int i13 = i12 + i10;
                    bArr[i11] = (byte) (i13 >> 8);
                    bArr[i11 + 1] = (byte) i13;
                    i11 += 2;
                    i3--;
                }
                sb2.append(new String(bArr, h.f60372b));
                return;
            }
            throw yb.c.a();
        }
        throw yb.c.a();
    }

    public static void e(d4.d dVar, StringBuilder sb2, int i3) {
        while (i3 >= 3) {
            if (dVar.d() >= 10) {
                int f10 = dVar.f(10);
                if (f10 < 1000) {
                    sb2.append(f(f10 / 100));
                    sb2.append(f((f10 / 10) % 10));
                    sb2.append(f(f10 % 10));
                    i3 -= 3;
                } else {
                    throw yb.c.a();
                }
            } else {
                throw yb.c.a();
            }
        }
        if (i3 == 2) {
            if (dVar.d() >= 7) {
                int f11 = dVar.f(7);
                if (f11 < 100) {
                    sb2.append(f(f11 / 10));
                    sb2.append(f(f11 % 10));
                    return;
                }
                throw yb.c.a();
            }
            throw yb.c.a();
        } else if (i3 == 1) {
            if (dVar.d() >= 4) {
                int f12 = dVar.f(4);
                if (f12 < 10) {
                    sb2.append(f(f12));
                    return;
                }
                throw yb.c.a();
            }
            throw yb.c.a();
        }
    }

    public static char f(int i3) {
        char[] cArr = f8762a;
        if (i3 < cArr.length) {
            return cArr[i3];
        }
        throw yb.c.a();
    }
}
