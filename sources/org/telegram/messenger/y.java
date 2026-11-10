package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class y extends ClickableSpan {
    public final int f26569a;
    public final int f26570b;
    public final org.telegram.ui.ActionBar.h6 f26571c;
    public final Runnable d;

    public y(int i7, int i10, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable) {
        this.f26569a = i7;
        this.f26570b = i10;
        this.f26571c = h6Var;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z9;
        super.updateDrawState(textPaint);
        int i7 = this.f26569a;
        if (i7 == 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        textPaint.setUnderlineText(z9);
        int i10 = this.f26570b;
        if (i10 >= 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, this.f26571c));
        }
        if (i7 == 2) {
            textPaint.setTypeface(g0.o());
        }
    }
}
