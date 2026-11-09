package gc;

import cc.j;
public abstract class a {
    public static final char[] f13790a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(cc.c cVar, StringBuilder sb2, int i7, boolean z9) {
        while (i7 > 1) {
            if (cVar.d() >= 11) {
                int f10 = cVar.f(11);
                sb2.append(f(f10 / 45));
                sb2.append(f(f10 % 45));
                i7 -= 2;
            } else {
                throw bc.c.a();
            }
        }
        if (i7 == 1) {
            if (cVar.d() >= 6) {
                sb2.append(f(cVar.f(6)));
            } else {
                throw bc.c.a();
            }
        }
        if (z9) {
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

    public static void b(cc.c r24, java.lang.StringBuilder r25, int r26, cc.d r27, java.util.ArrayList r28) {
        throw new UnsupportedOperationException("Method not decompiled: gc.a.b(cc.c, java.lang.StringBuilder, int, cc.d, java.util.ArrayList):void");
    }

    public static void c(cc.c cVar, StringBuilder sb2, int i7) {
        int i10;
        if (j.f6074c != null) {
            if (i7 * 13 <= cVar.d()) {
                byte[] bArr = new byte[i7 * 2];
                int i11 = 0;
                while (i7 > 0) {
                    int f10 = cVar.f(13);
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
                    i7--;
                }
                sb2.append(new String(bArr, j.f6074c));
                return;
            }
            throw bc.c.a();
        }
        throw bc.c.a();
    }

    public static void d(cc.c cVar, StringBuilder sb2, int i7) {
        int i10;
        if (j.f6073b != null) {
            if (i7 * 13 <= cVar.d()) {
                byte[] bArr = new byte[i7 * 2];
                int i11 = 0;
                while (i7 > 0) {
                    int f10 = cVar.f(13);
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
                    i7--;
                }
                sb2.append(new String(bArr, j.f6073b));
                return;
            }
            throw bc.c.a();
        }
        throw bc.c.a();
    }

    public static void e(cc.c cVar, StringBuilder sb2, int i7) {
        while (i7 >= 3) {
            if (cVar.d() >= 10) {
                int f10 = cVar.f(10);
                if (f10 < 1000) {
                    sb2.append(f(f10 / 100));
                    sb2.append(f((f10 / 10) % 10));
                    sb2.append(f(f10 % 10));
                    i7 -= 3;
                } else {
                    throw bc.c.a();
                }
            } else {
                throw bc.c.a();
            }
        }
        if (i7 == 2) {
            if (cVar.d() >= 7) {
                int f11 = cVar.f(7);
                if (f11 < 100) {
                    sb2.append(f(f11 / 10));
                    sb2.append(f(f11 % 10));
                    return;
                }
                throw bc.c.a();
            }
            throw bc.c.a();
        } else if (i7 == 1) {
            if (cVar.d() >= 4) {
                int f12 = cVar.f(4);
                if (f12 < 10) {
                    sb2.append(f(f12));
                    return;
                }
                throw bc.c.a();
            }
            throw bc.c.a();
        }
    }

    public static char f(int i7) {
        char[] cArr = f13790a;
        if (i7 < cArr.length) {
            return cArr[i7];
        }
        throw bc.c.a();
    }
}
