package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class y extends ClickableSpan {
    public final int f27999a;
    public final int f28000b;
    public final org.telegram.ui.ActionBar.h6 f28001c;
    public final Runnable d;

    public y(int i7, int i10, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable) {
        this.f27999a = i7;
        this.f28000b = i10;
        this.f28001c = h6Var;
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
        int i7 = this.f27999a;
        if (i7 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
        int i10 = this.f28000b;
        if (i10 >= 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, this.f28001c));
        }
        if (i7 == 2) {
            textPaint.setTypeface(g0.o());
        }
    }
}
