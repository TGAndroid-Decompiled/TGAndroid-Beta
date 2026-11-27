package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;
import java.util.stream.IntStream;
public final class x9c implements Spannable {
    public boolean a = false;
    public Spannable b;

    public x9c(CharSequence charSequence) {
        this.b = new SpannableString(charSequence);
    }

    public final void a() {
        rg7 rg7Var;
        Spannable spannable = this.b;
        if (!this.a) {
            if (Build.VERSION.SDK_INT < 28) {
                rg7Var = new rg7((byte) 28);
            } else {
                rg7Var = new rg7((byte) 28);
            }
            if (rg7Var.c(spannable)) {
                this.b = new SpannableString(spannable);
            }
        }
        this.a = true;
    }

    @Override
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override
    public final IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override
    public final java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override
    public final int getSpanEnd(Object obj) {
        return this.b.getSpanEnd(obj);
    }

    @Override
    public final int getSpanFlags(Object obj) {
        return this.b.getSpanFlags(obj);
    }

    @Override
    public final int getSpanStart(Object obj) {
        return this.b.getSpanStart(obj);
    }

    @Override
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.b.getSpans(i, i2, cls);
    }

    @Override
    public final int length() {
        return this.b.length();
    }

    @Override
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.b.nextSpanTransition(i, i2, cls);
    }

    @Override
    public final void removeSpan(Object obj) {
        a();
        this.b.removeSpan(obj);
    }

    @Override
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.b.setSpan(obj, i, i2, i3);
    }

    @Override
    public final CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    @Override
    public final String toString() {
        return this.b.toString();
    }

    @Override
    public final j$.util.stream.IntStream chars() {
        return lh0.b(this.b);
    }

    @Override
    public final j$.util.stream.IntStream codePoints() {
        return lh0.c(this.b);
    }

    public x9c(Spannable spannable) {
        this.b = spannable;
    }
}
