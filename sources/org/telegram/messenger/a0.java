package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a0 extends ClickableSpan {
    public final boolean f21408a;
    public final int f21409b;
    public final org.telegram.ui.ActionBar.e6 f21410c;
    public final Runnable d;

    public a0(boolean z10, int i3, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        this.f21408a = z10;
        this.f21409b = i3;
        this.f21410c = e6Var;
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
        if (this.f21408a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(this.f21409b, this.f21410c));
    }
}
