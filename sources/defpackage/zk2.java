package defpackage;

import android.text.SpannableStringBuilder;
public final class zk2 extends yk2 {
    public SpannableStringBuilder c;

    @Override
    public final int getSpanEnd(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.a && (spannableStringBuilder = this.c) != null) {
            return spannableStringBuilder.getSpanEnd(obj);
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public final int getSpanFlags(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.a && (spannableStringBuilder = this.c) != null) {
            return spannableStringBuilder.getSpanFlags(obj);
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public final int getSpanStart(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.a && (spannableStringBuilder = this.c) != null) {
            return spannableStringBuilder.getSpanStart(obj);
        }
        return super.getSpanStart(obj);
    }

    @Override
    public final Object[] getSpans(int i, int i2, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.a && (spannableStringBuilder = this.c) != null) {
            return spannableStringBuilder.getSpans(i, i2, cls);
        }
        return super.getSpans(i, i2, cls);
    }

    @Override
    public final int nextSpanTransition(int i, int i2, Class cls) {
        SpannableStringBuilder spannableStringBuilder;
        if (!this.a && (spannableStringBuilder = this.c) != null) {
            return spannableStringBuilder.nextSpanTransition(i, i2, cls);
        }
        return super.nextSpanTransition(i, i2, cls);
    }
}
