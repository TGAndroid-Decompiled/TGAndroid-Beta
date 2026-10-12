package g4;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import e2.j;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import i2.d;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import v7.u6;
import z3.b;
import z3.e;
import z3.m;
import z3.n;
public final class a implements n {
    public final x f9919a = new x();
    public final boolean f9920b;
    public final int f9921c;
    public final int d;
    public final String e;
    public final float f9922f;
    public final int h;

    public a(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f9921c = bArr[24];
            this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i10 = bArr[25] * 20;
            this.h = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f9920b = z10;
            if (z10) {
                this.f9922f = m0.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
                return;
            } else {
                this.f9922f = 0.85f;
                return;
            }
        }
        this.f9921c = 0;
        this.d = -1;
        this.e = "sans-serif";
        this.f9920b = false;
        this.f9922f = 0.85f;
        this.h = -1;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        boolean z10;
        boolean z11;
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z12 = true;
            if ((i10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z12 = false;
            }
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z12 && !z10 && !z11) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    @Override
    public final int h0() {
        return 2;
    }

    @Override
    public final void u0(byte[] bArr, int i10, int i11, m mVar, j jVar) {
        boolean z10;
        String y3;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        x xVar = this.f9919a;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        int i14 = 1;
        int i15 = 0;
        int i16 = 2;
        if (xVar.a() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        int H = xVar.H();
        if (H == 0) {
            y3 = "";
        } else {
            int i17 = xVar.f8412b;
            Charset J = xVar.J();
            int i18 = H - (xVar.f8412b - i17);
            if (J == null) {
                J = StandardCharsets.UTF_8;
            }
            y3 = xVar.y(i18, J);
        }
        if (y3.isEmpty()) {
            l0 l0Var = n0.f8592b;
            jVar.accept(new b(-9223372036854775807L, -9223372036854775807L, x1.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y3);
        b(spannableStringBuilder, this.f9921c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f7 = this.f9922f;
        while (xVar.a() >= 8) {
            int i19 = xVar.f8412b;
            int m10 = xVar.m();
            int m11 = xVar.m();
            if (m11 == 1937013100) {
                if (xVar.a() >= i16) {
                    z12 = i14;
                } else {
                    z12 = i15;
                }
                u6.g(z12);
                int H2 = xVar.H();
                int i20 = i15;
                while (i20 < H2) {
                    if (xVar.a() >= 12) {
                        z13 = i14;
                    } else {
                        z13 = i15;
                    }
                    u6.g(z13);
                    int H3 = xVar.H();
                    int H4 = xVar.H();
                    xVar.O(i16);
                    int i21 = i20;
                    int A = xVar.A();
                    xVar.O(i14);
                    int m12 = xVar.m();
                    if (H4 > spannableStringBuilder.length()) {
                        StringBuilder k10 = d.k(H4, "Truncating styl end (", ") to cueText.length() (");
                        k10.append(spannableStringBuilder.length());
                        k10.append(").");
                        e2.a.l("Tx3gParser", k10.toString());
                        H4 = spannableStringBuilder.length();
                    }
                    if (H3 >= H4) {
                        e2.a.l("Tx3gParser", "Ignoring styl with start (" + H3 + ") >= end (" + H4 + ").");
                        i13 = i21;
                    } else {
                        i13 = i21;
                        int i22 = H4;
                        b(spannableStringBuilder, A, this.f9921c, H3, i22, 0);
                        a(spannableStringBuilder, m12, this.d, H3, i22, 0);
                    }
                    i20 = i13 + 1;
                    i14 = 1;
                    i15 = 0;
                    i16 = 2;
                }
                i12 = i16;
            } else if (m11 == 1952608120 && this.f9920b) {
                i12 = 2;
                if (xVar.a() >= 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u6.g(z11);
                f7 = m0.h(xVar.H() / this.h, 0.0f, 0.95f);
            } else {
                i12 = 2;
            }
            xVar.N(i19 + m10);
            i16 = i12;
            i14 = 1;
            i15 = 0;
        }
        jVar.accept(new b(-9223372036854775807L, -9223372036854775807L, n0.y(new d2.b(spannableStringBuilder, null, null, null, f7, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }

    @Override
    public final e w(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }

    @Override
    public final void reset() {
    }
}
