package i4;

import a1.g;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import b4.d;
import b4.l;
import b4.m;
import b8.zb;
import f2.b;
import g2.k;
import g2.n0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import k2.p1;
public final class a implements m {
    public final y f14604a = new y();
    public final boolean f14605b;
    public final int f14606c;
    public final int d;
    public final String f14607e;
    public final float f14608f;
    public final int h;

    public a(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f14606c = bArr[24];
            this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f14607e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i3 = bArr[25] * 20;
            this.h = i3;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f14605b = z10;
            if (z10) {
                this.f14608f = n0.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i3, 0.0f, 0.95f);
                return;
            } else {
                this.f14608f = 0.85f;
                return;
            }
        }
        this.f14606c = 0;
        this.d = -1;
        this.f14607e = "sans-serif";
        this.f14605b = false;
        this.f14608f = 0.85f;
        this.h = -1;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i3, int i10, int i11, int i12, int i13) {
        if (i3 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i3 >>> 8) | ((i3 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i3, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        if (i3 != i10) {
            int i14 = i13 | 33;
            boolean z12 = true;
            if ((i3 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i3 & 2) != 0) {
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
            if ((i3 & 4) == 0) {
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
    public final d B(int i3, int i10, byte[] bArr) {
        return g.a(this, bArr, i10);
    }

    @Override
    public final void F(byte[] bArr, int i3, int i10, l lVar, k kVar) {
        boolean z10;
        String y9;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        y yVar = this.f14604a;
        yVar.L(i3 + i10, bArr);
        yVar.N(i3);
        int i13 = 1;
        int i14 = 0;
        int i15 = 2;
        if (yVar.a() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        int H = yVar.H();
        if (H == 0) {
            y9 = "";
        } else {
            int i16 = yVar.f11924b;
            Charset J = yVar.J();
            int i17 = H - (yVar.f11924b - i16);
            if (J == null) {
                J = StandardCharsets.UTF_8;
            }
            y9 = yVar.y(i17, J);
        }
        if (y9.isEmpty()) {
            g0 g0Var = i0.f12083b;
            kVar.accept(new b4.a(-9223372036854775807L, -9223372036854775807L, s1.f12146e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y9);
        b(spannableStringBuilder, this.f14606c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f14607e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f10 = this.f14608f;
        while (yVar.a() >= 8) {
            int i18 = yVar.f11924b;
            int m10 = yVar.m();
            int m11 = yVar.m();
            if (m11 == 1937013100) {
                if (yVar.a() >= i15) {
                    z12 = i13;
                } else {
                    z12 = i14;
                }
                zb.f(z12);
                int H2 = yVar.H();
                int i19 = i14;
                while (i19 < H2) {
                    if (yVar.a() >= 12) {
                        z13 = i13;
                    } else {
                        z13 = i14;
                    }
                    zb.f(z13);
                    int H3 = yVar.H();
                    int H4 = yVar.H();
                    yVar.O(i15);
                    int i20 = i19;
                    int A = yVar.A();
                    yVar.O(i13);
                    int m12 = yVar.m();
                    if (H4 > spannableStringBuilder.length()) {
                        StringBuilder m13 = p1.m(H4, "Truncating styl end (", ") to cueText.length() (");
                        m13.append(spannableStringBuilder.length());
                        m13.append(").");
                        g2.a.l("Tx3gParser", m13.toString());
                        H4 = spannableStringBuilder.length();
                    }
                    if (H3 >= H4) {
                        g2.a.l("Tx3gParser", "Ignoring styl with start (" + H3 + ") >= end (" + H4 + ").");
                        i12 = i20;
                    } else {
                        i12 = i20;
                        int i21 = H4;
                        b(spannableStringBuilder, A, this.f14606c, H3, i21, 0);
                        a(spannableStringBuilder, m12, this.d, H3, i21, 0);
                    }
                    i19 = i12 + 1;
                    i13 = 1;
                    i14 = 0;
                    i15 = 2;
                }
                i11 = i15;
            } else if (m11 == 1952608120 && this.f14605b) {
                i11 = 2;
                if (yVar.a() >= 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zb.f(z11);
                f10 = n0.h(yVar.H() / this.h, 0.0f, 0.95f);
            } else {
                i11 = 2;
            }
            yVar.N(i18 + m10);
            i15 = i11;
            i13 = 1;
            i14 = 0;
        }
        kVar.accept(new b4.a(-9223372036854775807L, -9223372036854775807L, i0.u(new b(spannableStringBuilder, null, null, null, f10, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }

    @Override
    public final int Y() {
        return 2;
    }

    @Override
    public final void reset() {
    }
}
