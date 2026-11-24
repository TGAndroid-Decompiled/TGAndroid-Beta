package defpackage;

import java.util.Locale;
public final class ua0 {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    public ua0(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.e = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static String a(int i, int i2, int i3, boolean z) {
        String str;
        StringBuilder m = de9.m(i, "av01.", ".");
        Object[] objArr = {Integer.valueOf(i2)};
        String str2 = g8c.a;
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

    public static ua0 b(byte[] bArr) {
        int i;
        int f;
        int f2;
        int i2;
        int i3;
        try {
            qd1 qd1Var = new qd1(bArr.length, bArr);
            qd1Var.m();
            int f3 = qd1Var.f(7);
            if (f3 != 1) {
                lad.f("Av1Config", "Unsupported av1C version: " + f3);
                return null;
            }
            int f4 = qd1Var.f(3);
            int f5 = qd1Var.f(5);
            boolean e = qd1Var.e();
            boolean e2 = qd1Var.e();
            boolean e3 = qd1Var.e();
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
            qd1Var.n(13);
            String a = a(f4, f5, i, e);
            if (qd1Var.b() <= 0) {
                return new ua0(i, a);
            }
            qd1Var.m();
            int f6 = qd1Var.f(4);
            if (f6 != 1) {
                lad.e("Av1Config", "Unsupported obu_type: " + f6);
                return new ua0(i, a);
            } else if (qd1Var.e()) {
                lad.e("Av1Config", "Unsupported obu_extension_flag");
                return new ua0(i, a);
            } else {
                boolean e4 = qd1Var.e();
                qd1Var.m();
                if (e4 && qd1Var.f(8) > 127) {
                    lad.e("Av1Config", "Excessive obu_size");
                    return new ua0(i, a);
                }
                int f7 = qd1Var.f(3);
                qd1Var.m();
                if (qd1Var.e()) {
                    lad.e("Av1Config", "Unsupported reduced_still_picture_header");
                    return new ua0(i, a);
                } else if (qd1Var.e()) {
                    lad.e("Av1Config", "Unsupported timing_info_present_flag");
                    return new ua0(i, a);
                } else if (qd1Var.e()) {
                    lad.e("Av1Config", "Unsupported initial_display_delay_present_flag");
                    return new ua0(i, a);
                } else {
                    int f8 = qd1Var.f(5);
                    boolean z = false;
                    for (int i4 = 0; i4 <= f8; i4++) {
                        qd1Var.n(12);
                        if (qd1Var.f(5) > 7) {
                            qd1Var.m();
                        }
                    }
                    int f9 = qd1Var.f(4);
                    int f10 = qd1Var.f(4);
                    qd1Var.n(f9 + 1);
                    qd1Var.n(f10 + 1);
                    if (qd1Var.e()) {
                        qd1Var.n(7);
                    }
                    qd1Var.n(7);
                    boolean e5 = qd1Var.e();
                    if (e5) {
                        qd1Var.n(2);
                    }
                    if (qd1Var.e()) {
                        f = 2;
                    } else {
                        f = qd1Var.f(1);
                    }
                    if (f > 0 && !qd1Var.e()) {
                        qd1Var.n(1);
                    }
                    if (e5) {
                        qd1Var.n(3);
                    }
                    qd1Var.n(3);
                    boolean e6 = qd1Var.e();
                    if (f7 == 2 && e6) {
                        qd1Var.m();
                    }
                    if (f7 != 1 && qd1Var.e()) {
                        z = true;
                    }
                    if (!qd1Var.e()) {
                        return new ua0(i, a);
                    }
                    int f11 = qd1Var.f(8);
                    int f12 = qd1Var.f(8);
                    int f13 = qd1Var.f(8);
                    if (!z && f11 == 1 && f12 == 13 && f13 == 0) {
                        f2 = 1;
                    } else {
                        f2 = qd1Var.f(1);
                    }
                    int f14 = hl2.f(f11);
                    if (f2 == 1) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    return new ua0(i, f14, i2, hl2.g(f12), a);
                }
            }
        } catch (RuntimeException e7) {
            throw av7.a("Error parsing AV1 config", e7);
        }
    }

    public ua0(int i, String str) {
        this(i, -1, -1, -1, str);
    }
}
