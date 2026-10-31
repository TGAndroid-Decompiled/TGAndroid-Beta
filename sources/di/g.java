package di;

import android.text.SpannableStringBuilder;
public final class g extends f {
    public SpannableStringBuilder f5962b;

    @Override
    public final int getSpanEnd(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f5961a && (spannableStringBuilder = this.f5962b) != null) {
            return spannableStringBuilder.getSpanEnd(obj);
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public final int getSpanFlags(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f5961a && (spannableStringBuilder = this.f5962b) != null) {
            return spannableStringBuilder.getSpanFlags(obj);
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public final int getSpanStart(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f5961a && (spannableStringBuilder = this.f5962b) != null) {
            return spannableStringBuilder.getSpanStart(obj);
        }
        return super.getSpanStart(obj);
    }

    @Override
    public final Object[] getSpans(int i10, int i11, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f5961a && (spannableStringBuilder = this.f5962b) != null) {
            return spannableStringBuilder.getSpans(i10, i11, cls);
        }
        return super.getSpans(i10, i11, cls);
    }

    @Override
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.f5961a && (spannableStringBuilder = this.f5962b) != null) {
            return spannableStringBuilder.nextSpanTransition(i10, i11, cls);
        }
        return super.nextSpanTransition(i10, i11, cls);
    }
}
