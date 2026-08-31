package d5;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import h5.d0;
import h5.w;
import java.nio.charset.Charset;
import java.util.List;
import r8.d;
import v4.e;
import v4.f;
public final class a extends e {
    public final w f4285n;
    public final boolean f4286o;
    public final int f4287p;
    public final int f4288q;
    public final String f4289r;
    public final float f4290s;
    public final int f4291t;

    public a(List list) {
        super("Tx3gDecoder");
        this.f4285n = new w();
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f4287p = bArr[24];
            this.f4288q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f4289r = "Serif".equals(new String(bArr, 43, bArr.length - 43, d.f46738c)) ? "serif" : "sans-serif";
            int i10 = bArr[25] * 20;
            this.f4291t = i10;
            boolean z4 = (bArr[0] & 32) != 0;
            this.f4286o = z4;
            if (z4) {
                this.f4290s = d0.g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
                return;
            } else {
                this.f4290s = 0.85f;
                return;
            }
        }
        this.f4287p = 0;
        this.f4288q = -1;
        this.f4289r = "sans-serif";
        this.f4286o = false;
        this.f4290s = 0.85f;
        this.f4291t = -1;
    }

    public static void l(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void m(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        boolean z4;
        boolean z10;
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z11 = true;
            if ((i10 & 1) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4) {
                if (z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z11 = false;
            }
            if (z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z11 && !z4 && !z10) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    @Override
    public final f k(int i10, boolean z4, byte[] bArr) {
        String s6;
        w wVar = this.f4285n;
        wVar.D(i10, bArr);
        int i11 = 2;
        if (wVar.a() >= 2) {
            int z10 = wVar.z();
            if (z10 == 0) {
                s6 = "";
            } else {
                int i12 = wVar.f7309b;
                Charset B = wVar.B();
                int i13 = z10 - (wVar.f7309b - i12);
                if (B == null) {
                    B = d.f46738c;
                }
                s6 = wVar.s(i13, B);
            }
            if (s6.isEmpty()) {
                return b.f4292b;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s6);
            m(spannableStringBuilder, this.f4287p, 0, 0, spannableStringBuilder.length(), 16711680);
            l(spannableStringBuilder, this.f4288q, -1, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            String str = this.f4289r;
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
            }
            float f10 = this.f4290s;
            while (wVar.a() >= 8) {
                int i14 = wVar.f7309b;
                int g10 = wVar.g();
                int g11 = wVar.g();
                if (g11 == 1937013100) {
                    if (wVar.a() >= i11) {
                        int z11 = wVar.z();
                        int i15 = 0;
                        while (i15 < z11) {
                            if (wVar.a() >= 12) {
                                int z12 = wVar.z();
                                int z13 = wVar.z();
                                wVar.G(i11);
                                int u10 = wVar.u();
                                wVar.G(1);
                                int g12 = wVar.g();
                                if (z13 > spannableStringBuilder.length()) {
                                    StringBuilder m9 = l.d.m(z13, "Truncating styl end (", ") to cueText.length() (");
                                    m9.append(spannableStringBuilder.length());
                                    m9.append(").");
                                    h5.a.K("Tx3gDecoder", m9.toString());
                                    z13 = spannableStringBuilder.length();
                                }
                                int i16 = z13;
                                if (z12 >= i16) {
                                    h5.a.K("Tx3gDecoder", "Ignoring styl with start (" + z12 + ") >= end (" + i16 + ").");
                                } else {
                                    m(spannableStringBuilder, u10, this.f4287p, z12, i16, 0);
                                    l(spannableStringBuilder, g12, this.f4288q, z12, i16, 0);
                                }
                                i15++;
                                i11 = 2;
                            } else {
                                throw new Exception("Unexpected subtitle format.");
                            }
                        }
                        continue;
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                } else if (g11 == 1952608120 && this.f4286o) {
                    i11 = 2;
                    if (wVar.a() >= 2) {
                        f10 = d0.g(wVar.z() / this.f4291t, 0.0f, 0.95f);
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                } else {
                    i11 = 2;
                }
                wVar.F(i14 + g10);
            }
            return new b(new v4.b(spannableStringBuilder, null, null, null, f10, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
        }
        throw new Exception("Unexpected subtitle format.");
    }
}
