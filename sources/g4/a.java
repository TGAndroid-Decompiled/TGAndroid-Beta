package g4;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import e2.d;
import e2.d0;
import e2.h;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import hg.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import z3.b;
import z3.e;
import z3.m;
import z3.n;
public final class a implements n {
    public final v f9412a = new v();
    public final boolean f9413b;
    public final int f9414c;
    public final int d;
    public final String e;
    public final float f9415f;
    public final int h;

    public a(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f9414c = bArr[24];
            this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i10 = bArr[25] * 20;
            this.h = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f9413b = z10;
            if (z10) {
                this.f9415f = d0.g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
                return;
            } else {
                this.f9415f = 0.85f;
                return;
            }
        }
        this.f9414c = 0;
        this.d = -1;
        this.e = "sans-serif";
        this.f9413b = false;
        this.f9415f = 0.85f;
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
    public final int A() {
        return 2;
    }

    @Override
    public final void B(byte[] bArr, int i10, int i11, m mVar, h hVar) {
        boolean z10;
        String v;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        v vVar = this.f9412a;
        vVar.H(i10 + i11, bArr);
        vVar.J(i10);
        int i13 = 1;
        int i14 = 2;
        if (vVar.a() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.b(z10);
        int D = vVar.D();
        if (D == 0) {
            v = "";
        } else {
            int i15 = vVar.f7932b;
            Charset F = vVar.F();
            int i16 = D - (vVar.f7932b - i15);
            if (F == null) {
                F = StandardCharsets.UTF_8;
            }
            v = vVar.v(i16, F);
        }
        if (v.isEmpty()) {
            g0 g0Var = i0.f8081b;
            hVar.accept(new b(-9223372036854775807L, -9223372036854775807L, a1.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(v);
        b(spannableStringBuilder, this.f9414c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f7 = this.f9415f;
        while (vVar.a() >= 8) {
            int i17 = vVar.f7932b;
            int j3 = vVar.j();
            int j10 = vVar.j();
            if (j10 == 1937013100) {
                if (vVar.a() >= i14) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                d.b(z12);
                int D2 = vVar.D();
                int i18 = 0;
                while (i18 < D2) {
                    if (vVar.a() >= 12) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    d.b(z13);
                    int D3 = vVar.D();
                    int D4 = vVar.D();
                    vVar.K(i14);
                    int i19 = i18;
                    int x10 = vVar.x();
                    vVar.K(i13);
                    int j11 = vVar.j();
                    if (D4 > spannableStringBuilder.length()) {
                        StringBuilder l4 = c.l(D4, "Truncating styl end (", ") to cueText.length() (");
                        l4.append(spannableStringBuilder.length());
                        l4.append(").");
                        e2.a.n("Tx3gParser", l4.toString());
                        D4 = spannableStringBuilder.length();
                    }
                    if (D3 >= D4) {
                        e2.a.n("Tx3gParser", "Ignoring styl with start (" + D3 + ") >= end (" + D4 + ").");
                        i12 = i19;
                    } else {
                        i12 = i19;
                        int i20 = D4;
                        b(spannableStringBuilder, x10, this.f9414c, D3, i20, 0);
                        a(spannableStringBuilder, j11, this.d, D3, i20, 0);
                    }
                    i18 = i12 + 1;
                    i13 = 1;
                    i14 = 2;
                }
            } else if (j10 == 1952608120 && this.f9413b) {
                if (vVar.a() >= 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d.b(z11);
                f7 = d0.g(vVar.D() / this.h, 0.0f, 0.95f);
                vVar.J(i17 + j3);
                i13 = 1;
                i14 = 2;
            }
            vVar.J(i17 + j3);
            i13 = 1;
            i14 = 2;
        }
        hVar.accept(new b(-9223372036854775807L, -9223372036854775807L, i0.z(new d2.b(spannableStringBuilder, null, null, null, f7, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }

    @Override
    public final e r(int i10, int i11, byte[] bArr) {
        return w.c.a(this, bArr, i11);
    }

    @Override
    public final void reset() {
    }
}
