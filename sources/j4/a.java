package j4;

import a8.ia;
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
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import jg.g;
public final class a implements m {
    public final x f16492a = new x();
    public final boolean f16493b;
    public final int f16494c;
    public final int d;
    public final String f16495e;
    public final float f16496f;
    public final int h;

    public a(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f16494c = bArr[24];
            this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f16495e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i7 = bArr[25] * 20;
            this.h = i7;
            boolean z9 = (bArr[0] & 32) != 0;
            this.f16493b = z9;
            if (z9) {
                this.f16496f = m0.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.0f, 0.95f);
                return;
            } else {
                this.f16496f = 0.85f;
                return;
            }
        }
        this.f16494c = 0;
        this.d = -1;
        this.f16495e = "sans-serif";
        this.f16493b = false;
        this.f16496f = 0.85f;
        this.h = -1;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i7, int i10, int i11, int i12, int i13) {
        if (i7 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i7, int i10, int i11, int i12, int i13) {
        boolean z9;
        boolean z10;
        if (i7 != i10) {
            int i14 = i13 | 33;
            boolean z11 = true;
            if ((i7 & 1) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i7 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9) {
                if (z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                }
            } else if (z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            }
            if ((i7 & 4) == 0) {
                z11 = false;
            }
            if (z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (!z11 && !z9 && !z10) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
            }
        }
    }

    @Override
    public final int P() {
        return 2;
    }

    @Override
    public final d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override
    public final void z(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        boolean z9;
        String y10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        x xVar = this.f16492a;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        int i13 = 1;
        int i14 = 0;
        int i15 = 2;
        if (xVar.a() >= 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        int H = xVar.H();
        if (H == 0) {
            y10 = "";
        } else {
            int i16 = xVar.f14163b;
            Charset J = xVar.J();
            int i17 = H - (xVar.f14163b - i16);
            if (J == null) {
                J = StandardCharsets.UTF_8;
            }
            y10 = xVar.y(i17, J);
        }
        if (y10.isEmpty()) {
            g0 g0Var = i0.f14329b;
            jVar.accept(new c4.a(-9223372036854775807L, -9223372036854775807L, t1.f14397e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y10);
        b(spannableStringBuilder, this.f16494c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f16495e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f10 = this.f16496f;
        while (xVar.a() >= 8) {
            int i18 = xVar.f14163b;
            int m10 = xVar.m();
            int m11 = xVar.m();
            if (m11 == 1937013100) {
                if (xVar.a() >= i15) {
                    z11 = i13;
                } else {
                    z11 = i14;
                }
                ia.f(z11);
                int H2 = xVar.H();
                int i19 = i14;
                while (i19 < H2) {
                    if (xVar.a() >= 12) {
                        z12 = i13;
                    } else {
                        z12 = i14;
                    }
                    ia.f(z12);
                    int H3 = xVar.H();
                    int H4 = xVar.H();
                    xVar.O(i15);
                    int i20 = i19;
                    int A = xVar.A();
                    xVar.O(i13);
                    int m12 = xVar.m();
                    if (H4 > spannableStringBuilder.length()) {
                        StringBuilder n10 = g.n(H4, "Truncating styl end (", ") to cueText.length() (");
                        n10.append(spannableStringBuilder.length());
                        n10.append(").");
                        h2.a.l("Tx3gParser", n10.toString());
                        H4 = spannableStringBuilder.length();
                    }
                    if (H3 >= H4) {
                        h2.a.l("Tx3gParser", "Ignoring styl with start (" + H3 + ") >= end (" + H4 + ").");
                        i12 = i20;
                    } else {
                        i12 = i20;
                        int i21 = H4;
                        b(spannableStringBuilder, A, this.f16494c, H3, i21, 0);
                        a(spannableStringBuilder, m12, this.d, H3, i21, 0);
                    }
                    i19 = i12 + 1;
                    i13 = 1;
                    i14 = 0;
                    i15 = 2;
                }
                i11 = i15;
            } else if (m11 == 1952608120 && this.f16493b) {
                i11 = 2;
                if (xVar.a() >= 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ia.f(z10);
                f10 = m0.h(xVar.H() / this.h, 0.0f, 0.95f);
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
    public final void reset() {
    }
}
