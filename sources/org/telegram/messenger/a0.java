package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a0 extends ClickableSpan {
    public final boolean f22803a;
    public final int f22804b;
    public final org.telegram.ui.ActionBar.i6 f22805c;
    public final Runnable d;

    public a0(boolean z10, int i7, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable) {
        this.f22803a = z10;
        this.f22804b = i7;
        this.f22805c = i6Var;
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
        if (this.f22803a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(this.f22804b, this.f22805c));
    }
}
