package defpackage;

import java.util.Locale;
public final class ub0 {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    public ub0(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.e = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static String a(int i, int i2, int i3, boolean z) {
        String str;
        StringBuilder l = hg9.l(i, "av01.", ".");
        Object[] objArr = {Integer.valueOf(i2)};
        String str2 = hac.a;
        Locale locale = Locale.US;
        l.append(String.format(locale, "%02d", objArr));
        if (z) {
            str = "H";
        } else {
            str = "M";
        }
        l.append(str);
        l.append(".");
        l.append(String.format(locale, "%02d", Integer.valueOf(i3)));
        return l.toString();
    }

    public static ub0 b(byte[] bArr) {
        int i;
        int f;
        int f2;
        int i2;
        int i3;
        try {
            ye1 ye1Var = new ye1(bArr.length, bArr);
            ye1Var.m();
            int f3 = ye1Var.f(7);
            if (f3 != 1) {
                ncd.f("Av1Config", "Unsupported av1C version: " + f3);
                return null;
            }
            int f4 = ye1Var.f(3);
            int f5 = ye1Var.f(5);
            boolean e = ye1Var.e();
            boolean e2 = ye1Var.e();
            boolean e3 = ye1Var.e();
            if (e2) {
                if (e3) {
                    i3 = 12;
                } else {
                    i3 = 10;
                }
                i = i3;
            } else {
                i = 8;
            }
            ye1Var.n(13);
            String a = a(f4, f5, i, e);
            if (ye1Var.b() <= 0) {
                return new ub0(i, a);
            }
            ye1Var.m();
            int f6 = ye1Var.f(4);
            if (f6 != 1) {
                ncd.e("Av1Config", "Unsupported obu_type: " + f6);
                return new ub0(i, a);
            } else if (ye1Var.e()) {
                ncd.e("Av1Config", "Unsupported obu_extension_flag");
                return new ub0(i, a);
            } else {
                boolean e4 = ye1Var.e();
                ye1Var.m();
                if (e4 && ye1Var.f(8) > 127) {
                    ncd.e("Av1Config", "Excessive obu_size");
                    return new ub0(i, a);
                }
                int f7 = ye1Var.f(3);
                ye1Var.m();
                if (ye1Var.e()) {
                    ncd.e("Av1Config", "Unsupported reduced_still_picture_header");
                    return new ub0(i, a);
                } else if (ye1Var.e()) {
                    ncd.e("Av1Config", "Unsupported timing_info_present_flag");
                    return new ub0(i, a);
                } else if (ye1Var.e()) {
                    ncd.e("Av1Config", "Unsupported initial_display_delay_present_flag");
                    return new ub0(i, a);
                } else {
                    int f8 = ye1Var.f(5);
                    boolean z = false;
                    for (int i4 = 0; i4 <= f8; i4++) {
                        ye1Var.n(12);
                        if (ye1Var.f(5) > 7) {
                            ye1Var.m();
                        }
                    }
                    int f9 = ye1Var.f(4);
                    int f10 = ye1Var.f(4);
                    ye1Var.n(f9 + 1);
                    ye1Var.n(f10 + 1);
                    if (ye1Var.e()) {
                        ye1Var.n(7);
                    }
                    ye1Var.n(7);
                    boolean e5 = ye1Var.e();
                    if (e5) {
                        ye1Var.n(2);
                    }
                    if (ye1Var.e()) {
                        f = 2;
                    } else {
                        f = ye1Var.f(1);
                    }
                    if (f > 0 && !ye1Var.e()) {
                        ye1Var.n(1);
                    }
                    if (e5) {
                        ye1Var.n(3);
                    }
                    ye1Var.n(3);
                    boolean e6 = ye1Var.e();
                    if (f7 == 2 && e6) {
                        ye1Var.m();
                    }
                    if (f7 != 1 && ye1Var.e()) {
                        z = true;
                    }
                    if (!ye1Var.e()) {
                        return new ub0(i, a);
                    }
                    int f11 = ye1Var.f(8);
                    int f12 = ye1Var.f(8);
                    int f13 = ye1Var.f(8);
                    if (!z && f11 == 1 && f12 == 13 && f13 == 0) {
                        f2 = 1;
                    } else {
                        f2 = ye1Var.f(1);
                    }
                    int f14 = tm2.f(f11);
                    if (f2 == 1) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    return new ub0(i, f14, i2, tm2.g(f12), a);
                }
            }
        } catch (RuntimeException e7) {
            throw bx7.a("Error parsing AV1 config", e7);
        }
    }

    public ub0(int i, String str) {
        this(i, -1, -1, -1, str);
    }
}
