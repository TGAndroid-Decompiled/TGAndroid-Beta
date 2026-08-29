package b5;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import f5.d0;
import f5.w;
import j7.l1;
import java.nio.charset.Charset;
import java.util.List;
import p8.d;
import t4.e;
import t4.f;
public final class a extends e {
    public final w f1931b;
    public final boolean f1932c;
    public final int d;
    public final int f1933e;
    public final String f1934f;
    public final float f1935g;
    public final int h;

    public a(List list) {
        super("Tx3gDecoder");
        this.f1931b = new w();
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.d = bArr[24];
            this.f1933e = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f1934f = "Serif".equals(new String(bArr, 43, bArr.length - 43, d.f45658c)) ? "serif" : "sans-serif";
            int i10 = bArr[25] * 20;
            this.h = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f1932c = z10;
            if (z10) {
                this.f1935g = d0.g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
                return;
            } else {
                this.f1935g = 0.85f;
                return;
            }
        }
        this.d = 0;
        this.f1933e = -1;
        this.f1934f = "sans-serif";
        this.f1932c = false;
        this.f1935g = 0.85f;
        this.h = -1;
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
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
    public final f c(int i10, boolean z10, byte[] bArr) {
        String p10;
        w wVar = this.f1931b;
        wVar.A(i10, bArr);
        int i11 = 2;
        if (wVar.a() >= 2) {
            int w10 = wVar.w();
            if (w10 == 0) {
                p10 = "";
            } else {
                int i12 = wVar.f6641b;
                Charset y8 = wVar.y();
                int i13 = w10 - (wVar.f6641b - i12);
                if (y8 == null) {
                    y8 = d.f45658c;
                }
                p10 = wVar.p(i13, y8);
            }
            if (p10.isEmpty()) {
                return b.f1936b;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p10);
            e(spannableStringBuilder, this.d, 0, 0, spannableStringBuilder.length(), 16711680);
            d(spannableStringBuilder, this.f1933e, -1, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            String str = this.f1934f;
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
            }
            float f9 = this.f1935g;
            while (wVar.a() >= 8) {
                int i14 = wVar.f6641b;
                int e10 = wVar.e();
                int e11 = wVar.e();
                if (e11 == 1937013100) {
                    if (wVar.a() >= i11) {
                        int w11 = wVar.w();
                        int i15 = 0;
                        while (i15 < w11) {
                            if (wVar.a() >= 12) {
                                int w12 = wVar.w();
                                int w13 = wVar.w();
                                wVar.D(i11);
                                int r6 = wVar.r();
                                wVar.D(1);
                                int e12 = wVar.e();
                                if (w13 > spannableStringBuilder.length()) {
                                    StringBuilder o10 = l1.o(w13, "Truncating styl end (", ") to cueText.length() (");
                                    o10.append(spannableStringBuilder.length());
                                    o10.append(").");
                                    f5.a.K("Tx3gDecoder", o10.toString());
                                    w13 = spannableStringBuilder.length();
                                }
                                int i16 = w13;
                                if (w12 >= i16) {
                                    f5.a.K("Tx3gDecoder", "Ignoring styl with start (" + w12 + ") >= end (" + i16 + ").");
                                } else {
                                    e(spannableStringBuilder, r6, this.d, w12, i16, 0);
                                    d(spannableStringBuilder, e12, this.f1933e, w12, i16, 0);
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
                } else if (e11 == 1952608120 && this.f1932c) {
                    i11 = 2;
                    if (wVar.a() >= 2) {
                        f9 = d0.g(wVar.w() / this.h, 0.0f, 0.95f);
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                } else {
                    i11 = 2;
                }
                wVar.C(i14 + e10);
            }
            return new b(new t4.b(spannableStringBuilder, null, null, null, f9, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
        }
        throw new Exception("Unexpected subtitle format.");
    }
}
