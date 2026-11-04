package oi;

import android.text.SpannableStringBuilder;
public final class f extends e {
    public SpannableStringBuilder f21138b;

    @Override
    public final int getSpanEnd(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f21137a && (spannableStringBuilder = this.f21138b) != null) {
            return spannableStringBuilder.getSpanEnd(obj);
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public final int getSpanFlags(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f21137a && (spannableStringBuilder = this.f21138b) != null) {
            return spannableStringBuilder.getSpanFlags(obj);
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public final int getSpanStart(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f21137a && (spannableStringBuilder = this.f21138b) != null) {
            return spannableStringBuilder.getSpanStart(obj);
        }
        return super.getSpanStart(obj);
    }

    @Override
    public final Object[] getSpans(int i3, int i10, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f21137a && (spannableStringBuilder = this.f21138b) != null) {
            return spannableStringBuilder.getSpans(i3, i10, cls);
        }
        return super.getSpans(i3, i10, cls);
    }

    @Override
    public final int nextSpanTransition(int i3, int i10, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f21137a && (spannableStringBuilder = this.f21138b) != null) {
            return spannableStringBuilder.nextSpanTransition(i3, i10, cls);
        }
        return super.nextSpanTransition(i3, i10, cls);
    }
}
