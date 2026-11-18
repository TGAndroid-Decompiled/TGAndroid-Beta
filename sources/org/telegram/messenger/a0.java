package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a0 extends ClickableSpan {
    public final boolean f22800a;
    public final int f22801b;
    public final org.telegram.ui.ActionBar.i6 f22802c;
    public final Runnable d;

    public a0(boolean z10, int i7, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable) {
        this.f22800a = z10;
        this.f22801b = i7;
        this.f22802c = i6Var;
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
        if (this.f22800a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(this.f22801b, this.f22802c));
    }
}
