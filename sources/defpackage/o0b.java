package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
public abstract class o0b {
    public static final Layout.Alignment[] a = Layout.Alignment.values();

    public static Layout.Alignment a() {
        Layout.Alignment[] alignmentArr = a;
        if (alignmentArr.length >= 5) {
            return alignmentArr[4];
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static StaticLayout b(CharSequence charSequence, TextPaint textPaint, int i, float f, int i2, int i3) {
        return c(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, f, TextUtils.TruncateAt.END, i2, i3, true);
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, TextUtils.TruncateAt truncateAt, int i2, int i3, boolean z) {
        boolean z2;
        int offsetForHorizontal;
        TextUtils.TruncateAt truncateAt2;
        SpannableStringBuilder spannableStringBuilder = charSequence;
        if (i3 == 1) {
            try {
                int indexOf = TextUtils.indexOf(spannableStringBuilder, "\n") - 1;
                if (indexOf > 0) {
                    spannableStringBuilder = SpannableStringBuilder.valueOf(spannableStringBuilder.subSequence(0, indexOf)).append((CharSequence) "…");
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, textPaint, i2, TextUtils.TruncateAt.END);
                return new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, i, alignment, 1.0f, f, false);
            } catch (Exception e) {
                e = e;
                z2 = true;
            }
        } else {
            try {
                StaticLayout build = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f, 1.0f).setIncludePad(false).setEllipsize(null).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(1).setHyphenationFrequency(0).build();
                int i4 = 0;
                while (true) {
                    if (i4 >= build.getLineCount()) {
                        break;
                    } else if (build.getLineRight(i4) > i) {
                        build = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f, 1.0f).setIncludePad(false).setEllipsize(null).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(0).setHyphenationFrequency(0).build();
                        break;
                    } else {
                        i4++;
                    }
                }
                if (build.getLineCount() <= i3) {
                    return build;
                }
                int i5 = i3 - 1;
                float lineLeft = build.getLineLeft(i5);
                float lineWidth = build.getLineWidth(i5);
                if (lineLeft != 0.0f) {
                    offsetForHorizontal = build.getOffsetForHorizontal(i5, lineLeft);
                } else {
                    offsetForHorizontal = build.getOffsetForHorizontal(i5, lineWidth);
                }
                if (lineWidth < i2 - hl.L(10.0f)) {
                    offsetForHorizontal += 3;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
                spannableStringBuilder2.append((CharSequence) "…");
                StaticLayout.Builder includePad = StaticLayout.Builder.obtain(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f, 1.0f).setIncludePad(false);
                if (((hm[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), hm.class)).length > 0) {
                    truncateAt2 = null;
                } else {
                    truncateAt2 = truncateAt;
                }
                return includePad.setEllipsize(truncateAt2).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(z ? 1 : 0).setHyphenationFrequency(0).build();
            } catch (Exception e2) {
                e = e2;
                z2 = true;
            }
        }
        cc4.g(e, z2);
        return null;
    }

    public static StaticLayout d(CharSequence charSequence, TextPaint textPaint, boolean z, int i, int i2) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i).setMaxLines(i2).setBreakStrategy(1).setHyphenationFrequency(0).build();
    }
}
