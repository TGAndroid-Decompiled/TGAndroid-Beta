package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c0 extends ClickableSpan {
    public final boolean f15044a;
    public final int f15045b;
    public final org.telegram.ui.ActionBar.p6 f15046c;
    public final Runnable d;

    public c0(boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable) {
        this.f15044a = z10;
        this.f15045b = i10;
        this.f15046c = p6Var;
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
        if (this.f15044a) {
            textPaint.setTypeface(i0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(this.f15045b, this.f15046c));
    }
}
