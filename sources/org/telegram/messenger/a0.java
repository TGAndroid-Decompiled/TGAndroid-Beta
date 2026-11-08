package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a0 extends ClickableSpan {
    public final boolean f21357a;
    public final int f21358b;
    public final org.telegram.ui.ActionBar.f6 f21359c;
    public final Runnable d;

    public a0(boolean z9, int i7, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable) {
        this.f21357a = z9;
        this.f21358b = i7;
        this.f21359c = f6Var;
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
        if (this.f21357a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(this.f21358b, this.f21359c));
    }
}
