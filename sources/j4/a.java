package j4;

import a8.ma;
import a8.p0;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c4.d;
import c4.l;
import c4.m;
import g2.b;
import h2.j;
import h2.l0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import i5.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
public final class a implements m {
    public final x f17219a = new x();
    public final boolean f17220b;
    public final int f17221c;
    public final int d;
    public final String f17222e;
    public final float f17223f;
    public final int h;

    public a(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f17221c = bArr[24];
            this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f17222e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i7 = bArr[25] * 20;
            this.h = i7;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f17220b = z10;
            if (z10) {
                this.f17223f = l0.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.0f, 0.95f);
                return;
            } else {
                this.f17223f = 0.85f;
                return;
            }
        }
        this.f17221c = 0;
        this.d = -1;
        this.f17222e = "sans-serif";
        this.f17220b = false;
        this.f17223f = 0.85f;
        this.h = -1;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i7, int i10, int i11, int i12, int i13) {
        if (i7 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i7, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        if (i7 != i10) {
            int i14 = i13 | 33;
            boolean z12 = true;
            if ((i7 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i7 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            }
            if ((i7 & 4) == 0) {
                z12 = false;
            }
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (!z12 && !z10 && !z11) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
            }
        }
    }

    @Override
    public final d q(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override
    public final void v(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        boolean z10;
        String y10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        x xVar = this.f17219a;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        int i13 = 1;
        int i14 = 0;
        int i15 = 2;
        if (xVar.a() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        int H = xVar.H();
        if (H == 0) {
            y10 = "";
        } else {
            int i16 = xVar.f13829b;
            Charset J = xVar.J();
            int i17 = H - (xVar.f13829b - i16);
            if (J == null) {
                J = StandardCharsets.UTF_8;
            }
            y10 = xVar.y(i17, J);
        }
        if (y10.isEmpty()) {
            g0 g0Var = i0.f13998b;
            jVar.accept(new c4.a(-9223372036854775807L, -9223372036854775807L, t1.f14066e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y10);
        b(spannableStringBuilder, this.f17221c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f17222e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f10 = this.f17223f;
        while (xVar.a() >= 8) {
            int i18 = xVar.f13829b;
            int m10 = xVar.m();
            int m11 = xVar.m();
            if (m11 == 1937013100) {
                if (xVar.a() >= i15) {
                    z12 = i13;
                } else {
                    z12 = i14;
                }
                ma.f(z12);
                int H2 = xVar.H();
                int i19 = i14;
                while (i19 < H2) {
                    if (xVar.a() >= 12) {
                        z13 = i13;
                    } else {
                        z13 = i14;
                    }
                    ma.f(z13);
                    int H3 = xVar.H();
                    int H4 = xVar.H();
                    xVar.O(i15);
                    int i20 = i19;
                    int A = xVar.A();
                    xVar.O(i13);
                    int m12 = xVar.m();
                    if (H4 > spannableStringBuilder.length()) {
                        StringBuilder m13 = c.m(H4, "Truncating styl end (", ") to cueText.length() (");
                        m13.append(spannableStringBuilder.length());
                        m13.append(").");
                        h2.a.l("Tx3gParser", m13.toString());
                        H4 = spannableStringBuilder.length();
                    }
                    if (H3 >= H4) {
                        h2.a.l("Tx3gParser", "Ignoring styl with start (" + H3 + ") >= end (" + H4 + ").");
                        i12 = i20;
                    } else {
                        i12 = i20;
                        int i21 = H4;
                        b(spannableStringBuilder, A, this.f17221c, H3, i21, 0);
                        a(spannableStringBuilder, m12, this.d, H3, i21, 0);
                    }
                    i19 = i12 + 1;
                    i13 = 1;
                    i14 = 0;
                    i15 = 2;
                }
                i11 = i15;
            } else if (m11 == 1952608120 && this.f17220b) {
                i11 = 2;
                if (xVar.a() >= 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ma.f(z11);
                f10 = l0.h(xVar.H() / this.h, 0.0f, 0.95f);
            } else {
                i11 = 2;
            }
            xVar.N(i18 + m10);
            i15 = i11;
            i13 = 1;
            i14 = 0;
        }
        jVar.accept(new c4.a(-9223372036854775807L, -9223372036854775807L, i0.u(new b(spannableStringBuilder, null, null, null, f10, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }

    @Override
    public final int y() {
        return 2;
    }

    @Override
    public final void reset() {
    }
}
