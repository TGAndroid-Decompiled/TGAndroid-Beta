package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a0 extends ClickableSpan {
    public final boolean f21362a;
    public final int f21363b;
    public final org.telegram.ui.ActionBar.h6 f21364c;
    public final Runnable d;

    public a0(boolean z9, int i7, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable) {
        this.f21362a = z9;
        this.f21363b = i7;
        this.f21364c = h6Var;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        this.d.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        if (this.f21362a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(this.f21363b, this.f21364c));
    }
}
