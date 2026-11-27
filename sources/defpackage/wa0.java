package defpackage;

import java.util.Locale;
public final class wa0 {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    public wa0(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.e = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static String a(int i, int i2, int i3, boolean z) {
        String str;
        StringBuilder m = uh9.m(i, "av01.", ".");
        Object[] objArr = {Integer.valueOf(i2)};
        String str2 = gcc.a;
        Locale locale = Locale.US;
        m.append(String.format(locale, "%02d", objArr));
        if (z) {
            str = "H";
        } else {
            str = "M";
        }
        m.append(str);
        m.append(".");
        m.append(String.format(locale, "%02d", Integer.valueOf(i3)));
        return m.toString();
    }

    public static wa0 b(byte[] bArr) {
        int i;
        int f;
        int f2;
        int i2;
        int i3;
        try {
            zd1 zd1Var = new zd1(bArr.length, bArr);
            zd1Var.m();
            int f3 = zd1Var.f(7);
            if (f3 != 1) {
                efd.f("Av1Config", "Unsupported av1C version: " + f3);
                return null;
            }
            int f4 = zd1Var.f(3);
            int f5 = zd1Var.f(5);
            boolean e = zd1Var.e();
            boolean e2 = zd1Var.e();
            boolean e3 = zd1Var.e();
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
            zd1Var.n(13);
            String a = a(f4, f5, i, e);
            if (zd1Var.b() <= 0) {
                return new wa0(i, a);
            }
            zd1Var.m();
            int f6 = zd1Var.f(4);
            if (f6 != 1) {
                efd.e("Av1Config", "Unsupported obu_type: " + f6);
                return new wa0(i, a);
            } else if (zd1Var.e()) {
                efd.e("Av1Config", "Unsupported obu_extension_flag");
                return new wa0(i, a);
            } else {
                boolean e4 = zd1Var.e();
                zd1Var.m();
                if (e4 && zd1Var.f(8) > 127) {
                    efd.e("Av1Config", "Excessive obu_size");
                    return new wa0(i, a);
                }
                int f7 = zd1Var.f(3);
                zd1Var.m();
                if (zd1Var.e()) {
                    efd.e("Av1Config", "Unsupported reduced_still_picture_header");
                    return new wa0(i, a);
                } else if (zd1Var.e()) {
                    efd.e("Av1Config", "Unsupported timing_info_present_flag");
                    return new wa0(i, a);
                } else if (zd1Var.e()) {
                    efd.e("Av1Config", "Unsupported initial_display_delay_present_flag");
                    return new wa0(i, a);
                } else {
                    int f8 = zd1Var.f(5);
                    boolean z = false;
                    for (int i4 = 0; i4 <= f8; i4++) {
                        zd1Var.n(12);
                        if (zd1Var.f(5) > 7) {
                            zd1Var.m();
                        }
                    }
                    int f9 = zd1Var.f(4);
                    int f10 = zd1Var.f(4);
                    zd1Var.n(f9 + 1);
                    zd1Var.n(f10 + 1);
                    if (zd1Var.e()) {
                        zd1Var.n(7);
                    }
                    zd1Var.n(7);
                    boolean e5 = zd1Var.e();
                    if (e5) {
                        zd1Var.n(2);
                    }
                    if (zd1Var.e()) {
                        f = 2;
                    } else {
                        f = zd1Var.f(1);
                    }
                    if (f > 0 && !zd1Var.e()) {
                        zd1Var.n(1);
                    }
                    if (e5) {
                        zd1Var.n(3);
                    }
                    zd1Var.n(3);
                    boolean e6 = zd1Var.e();
                    if (f7 == 2 && e6) {
                        zd1Var.m();
                    }
                    if (f7 != 1 && zd1Var.e()) {
                        z = true;
                    }
                    if (!zd1Var.e()) {
                        return new wa0(i, a);
                    }
                    int f11 = zd1Var.f(8);
                    int f12 = zd1Var.f(8);
                    int f13 = zd1Var.f(8);
                    if (!z && f11 == 1 && f12 == 13 && f13 == 0) {
                        f2 = 1;
                    } else {
                        f2 = zd1Var.f(1);
                    }
                    int f14 = bm2.f(f11);
                    if (f2 == 1) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    return new wa0(i, f14, i2, bm2.g(f12), a);
                }
            }
        } catch (RuntimeException e7) {
            throw hy7.a("Error parsing AV1 config", e7);
        }
    }

    public wa0(int i, String str) {
        this(i, -1, -1, -1, str);
    }
}
