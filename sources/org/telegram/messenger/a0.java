package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a0 extends ClickableSpan {
    public final boolean f22437a;
    public final int f22438b;
    public final org.telegram.ui.ActionBar.e6 f22439c;
    public final Runnable d;

    public a0(boolean z10, int i7, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        this.f22437a = z10;
        this.f22438b = i7;
        this.f22439c = e6Var;
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
        if (this.f22437a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(this.f22438b, this.f22439c));
    }
}
