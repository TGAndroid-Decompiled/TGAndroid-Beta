package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a0 extends ClickableSpan {
    public final boolean f22795a;
    public final int f22796b;
    public final org.telegram.ui.ActionBar.h6 f22797c;
    public final Runnable d;

    public a0(boolean z10, int i7, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable) {
        this.f22795a = z10;
        this.f22796b = i7;
        this.f22797c = h6Var;
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
        if (this.f22795a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(this.f22796b, this.f22797c));
    }
}
