package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c0 extends ClickableSpan {
    public final boolean f14864a;
    public final int f14865b;
    public final org.telegram.ui.ActionBar.p6 f14866c;
    public final Runnable d;

    public c0(boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable) {
        this.f14864a = z10;
        this.f14865b = i10;
        this.f14866c = p6Var;
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
        if (this.f14864a) {
            textPaint.setTypeface(i0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(this.f14865b, this.f14866c));
    }
}
