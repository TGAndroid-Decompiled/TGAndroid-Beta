package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a0 extends ClickableSpan {
    public final boolean f22898a;
    public final int f22899b;
    public final org.telegram.ui.ActionBar.i6 f22900c;
    public final Runnable d;

    public a0(boolean z10, int i7, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable) {
        this.f22898a = z10;
        this.f22899b = i7;
        this.f22900c = i6Var;
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
        if (this.f22898a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(this.f22899b, this.f22900c));
    }
}
