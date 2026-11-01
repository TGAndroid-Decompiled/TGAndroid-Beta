package ac;
public abstract class c {
    public static final char[] f367a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(b4.d dVar, StringBuilder sb2, int i10, boolean z10) {
        while (i10 > 1) {
            if (dVar.d() >= 11) {
                int f7 = dVar.f(11);
                sb2.append(f(f7 / 45));
                sb2.append(f(f7 % 45));
                i10 -= 2;
            } else {
                throw vb.c.a();
            }
        }
        if (i10 == 1) {
            if (dVar.d() >= 6) {
                sb2.append(f(dVar.f(6)));
            } else {
                throw vb.c.a();
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

    public static void b(b4.d r24, java.lang.StringBuilder r25, int r26, wb.c r27, java.util.ArrayList r28) {
        throw new UnsupportedOperationException("Method not decompiled: ac.c.b(b4.d, java.lang.StringBuilder, int, wb.c, java.util.ArrayList):void");
    }

    public static void c(b4.d dVar, StringBuilder sb2, int i10) {
        int i11;
        if (wb.h.f52813c != null) {
            if (i10 * 13 <= dVar.d()) {
                byte[] bArr = new byte[i10 * 2];
                int i12 = 0;
                while (i10 > 0) {
                    int f7 = dVar.f(13);
                    int i13 = (f7 % 96) | ((f7 / 96) << 8);
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
                sb2.append(new String(bArr, wb.h.f52813c));
                return;
            }
            throw vb.c.a();
        }
        throw vb.c.a();
    }

    public static void d(b4.d dVar, StringBuilder sb2, int i10) {
        int i11;
        if (wb.h.f52812b != null) {
            if (i10 * 13 <= dVar.d()) {
                byte[] bArr = new byte[i10 * 2];
                int i12 = 0;
                while (i10 > 0) {
                    int f7 = dVar.f(13);
                    int i13 = (f7 % 192) | ((f7 / 192) << 8);
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
                sb2.append(new String(bArr, wb.h.f52812b));
                return;
            }
            throw vb.c.a();
        }
        throw vb.c.a();
    }

    public static void e(b4.d dVar, StringBuilder sb2, int i10) {
        while (i10 >= 3) {
            if (dVar.d() >= 10) {
                int f7 = dVar.f(10);
                if (f7 < 1000) {
                    sb2.append(f(f7 / 100));
                    sb2.append(f((f7 / 10) % 10));
                    sb2.append(f(f7 % 10));
                    i10 -= 3;
                } else {
                    throw vb.c.a();
                }
            } else {
                throw vb.c.a();
            }
        }
        if (i10 == 2) {
            if (dVar.d() >= 7) {
                int f10 = dVar.f(7);
                if (f10 < 100) {
                    sb2.append(f(f10 / 10));
                    sb2.append(f(f10 % 10));
                    return;
                }
                throw vb.c.a();
            }
            throw vb.c.a();
        } else if (i10 == 1) {
            if (dVar.d() >= 4) {
                int f11 = dVar.f(4);
                if (f11 < 10) {
                    sb2.append(f(f11));
                    return;
                }
                throw vb.c.a();
            }
            throw vb.c.a();
        }
    }

    public static char f(int i10) {
        char[] cArr = f367a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw vb.c.a();
    }
}
