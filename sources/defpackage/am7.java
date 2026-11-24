package defpackage;
public abstract class am7 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', '+', '-', '.', '/', ':'};

    public static void a(rk0 rk0Var, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (rk0Var.d() >= 11) {
                int f = rk0Var.f(11);
                sb.append(f(f / 45));
                sb.append(f(f % 45));
                i -= 2;
            } else {
                throw ho4.a();
            }
        }
        if (i == 1) {
            if (rk0Var.d() >= 6) {
                sb.append(f(rk0Var.f(6)));
            } else {
                throw ho4.a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    public static void b(defpackage.rk0 r24, java.lang.StringBuilder r25, int r26, defpackage.il1 r27, java.util.ArrayList r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am7.b(rk0, java.lang.StringBuilder, int, il1, java.util.ArrayList):void");
    }

    public static void c(rk0 rk0Var, StringBuilder sb, int i) {
        int i2;
        if (fbb.c != null) {
            if (i * 13 <= rk0Var.d()) {
                byte[] bArr = new byte[i << 1];
                int i3 = 0;
                while (i > 0) {
                    int f = rk0Var.f(13);
                    int i4 = ((f / 96) << 8) | (f % 96);
                    if (i4 < 2560) {
                        i2 = 41377;
                    } else {
                        i2 = 42657;
                    }
                    int i5 = i4 + i2;
                    bArr[i3] = (byte) ((i5 >> 8) & 255);
                    bArr[i3 + 1] = (byte) (i5 & 255);
                    i3 += 2;
                    i--;
                }
                sb.append(new String(bArr, fbb.c));
                return;
            }
            throw ho4.a();
        }
        throw ho4.a();
    }

    public static void d(rk0 rk0Var, StringBuilder sb, int i) {
        int i2;
        if (fbb.b != null) {
            if (i * 13 <= rk0Var.d()) {
                byte[] bArr = new byte[i << 1];
                int i3 = 0;
                while (i > 0) {
                    int f = rk0Var.f(13);
                    int i4 = ((f / 192) << 8) | (f % 192);
                    if (i4 < 7936) {
                        i2 = 33088;
                    } else {
                        i2 = 49472;
                    }
                    int i5 = i4 + i2;
                    bArr[i3] = (byte) (i5 >> 8);
                    bArr[i3 + 1] = (byte) i5;
                    i3 += 2;
                    i--;
                }
                sb.append(new String(bArr, fbb.b));
                return;
            }
            throw ho4.a();
        }
        throw ho4.a();
    }

    public static void e(rk0 rk0Var, StringBuilder sb, int i) {
        while (i >= 3) {
            if (rk0Var.d() >= 10) {
                int f = rk0Var.f(10);
                if (f < 1000) {
                    sb.append(f(f / 100));
                    sb.append(f((f / 10) % 10));
                    sb.append(f(f % 10));
                    i -= 3;
                } else {
                    throw ho4.a();
                }
            } else {
                throw ho4.a();
            }
        }
        if (i == 2) {
            if (rk0Var.d() >= 7) {
                int f2 = rk0Var.f(7);
                if (f2 < 100) {
                    sb.append(f(f2 / 10));
                    sb.append(f(f2 % 10));
                    return;
                }
                throw ho4.a();
            }
            throw ho4.a();
        } else if (i == 1) {
            if (rk0Var.d() >= 4) {
                int f3 = rk0Var.f(4);
                if (f3 < 10) {
                    sb.append(f(f3));
                    return;
                }
                throw ho4.a();
            }
            throw ho4.a();
        }
    }

    public static char f(int i) {
        if (i < 45) {
            return a[i];
        }
        throw ho4.a();
    }
}
