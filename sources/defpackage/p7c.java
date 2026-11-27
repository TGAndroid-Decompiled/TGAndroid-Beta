package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
public final class p7c implements reb {
    public final ey7 a = new ey7();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int h;

    public p7c(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.c = bArr[24];
            this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.h = i;
            boolean z = (bArr[0] & 32) != 0;
            this.b = z;
            if (z) {
                this.f = gcc.h((((bArr[10] & 255) << 8) | (bArr[11] & 255)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.f = 0.85f;
                return;
            }
        }
        this.c = 0;
        this.d = -1;
        this.e = "sans-serif";
        this.b = false;
        this.f = 0.85f;
        this.h = -1;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i & 255) << 24) | (i >>> 8)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        if (i != i2) {
            int i6 = i5 | 33;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else if (!z && !z2) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    @Override
    public final heb j(int i, int i2, byte[] bArr) {
        return uh9.c(this, bArr, i2);
    }

    @Override
    public final void l(byte[] bArr, int i, int i2, qeb qebVar, ot2 ot2Var) {
        boolean z;
        String y;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        ey7 ey7Var = this.a;
        ey7Var.L(i + i2, bArr);
        ey7Var.N(i);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        if (ey7Var.a() >= 2) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        int H = ey7Var.H();
        if (H == 0) {
            y = "";
        } else {
            int i8 = ey7Var.b;
            Charset J = ey7Var.J();
            int i9 = H - (ey7Var.b - i8);
            if (J == null) {
                J = StandardCharsets.UTF_8;
            }
            y = ey7Var.y(i9, J);
        }
        if (y.isEmpty()) {
            no5 no5Var = po5.b;
            ot2Var.accept(new p43(-9223372036854775807L, -9223372036854775807L, j99.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y);
        b(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.f;
        while (ey7Var.a() >= 8) {
            int i10 = ey7Var.b;
            int m = ey7Var.m();
            int m2 = ey7Var.m();
            if (m2 == 1937013100) {
                if (ey7Var.a() >= i7) {
                    z3 = i5;
                } else {
                    z3 = i6;
                }
                yve.f(z3);
                int H2 = ey7Var.H();
                int i11 = i6;
                while (i11 < H2) {
                    if (ey7Var.a() >= 12) {
                        z4 = i5;
                    } else {
                        z4 = i6;
                    }
                    yve.f(z4);
                    int H3 = ey7Var.H();
                    int H4 = ey7Var.H();
                    ey7Var.O(i7);
                    int i12 = i11;
                    int A = ey7Var.A();
                    ey7Var.O(i5);
                    int m3 = ey7Var.m();
                    if (H4 > spannableStringBuilder.length()) {
                        StringBuilder m4 = uh9.m(H4, "Truncating styl end (", ") to cueText.length() (");
                        m4.append(spannableStringBuilder.length());
                        m4.append(").");
                        efd.f("Tx3gParser", m4.toString());
                        H4 = spannableStringBuilder.length();
                    }
                    if (H3 >= H4) {
                        efd.f("Tx3gParser", "Ignoring styl with start (" + H3 + ") >= end (" + H4 + ").");
                        i4 = i12;
                    } else {
                        i4 = i12;
                        int i13 = H4;
                        b(spannableStringBuilder, A, this.c, H3, i13, 0);
                        a(spannableStringBuilder, m3, this.d, H3, i13, 0);
                    }
                    i11 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i3 = i7;
            } else if (m2 == 1952608120 && this.b) {
                i3 = 2;
                if (ey7Var.a() >= 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                yve.f(z2);
                f = gcc.h(ey7Var.H() / this.h, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            ey7Var.N(i10 + m);
            i7 = i3;
            i5 = 1;
            i6 = 0;
        }
        ot2Var.accept(new p43(-9223372036854775807L, -9223372036854775807L, po5.u(new m43(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }

    @Override
    public final int s() {
        return 2;
    }

    @Override
    public final void reset() {
    }
}
