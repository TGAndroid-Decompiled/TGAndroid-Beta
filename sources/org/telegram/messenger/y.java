package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class y extends ClickableSpan {
    public final int f26500a;
    public final int f26501b;
    public final org.telegram.ui.ActionBar.e6 f26502c;
    public final Runnable d;

    public y(int i3, int i10, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        this.f26500a = i3;
        this.f26501b = i10;
        this.f26502c = e6Var;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        super.updateDrawState(textPaint);
        int i3 = this.f26500a;
        if (i3 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
        int i10 = this.f26501b;
        if (i10 >= 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, this.f26502c));
        }
        if (i3 == 2) {
            textPaint.setTypeface(g0.o());
        }
    }
}
