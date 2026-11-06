package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class y extends ClickableSpan {
    public final int f26550a;
    public final int f26551b;
    public final org.telegram.ui.ActionBar.f6 f26552c;
    public final Runnable d;

    public y(int i7, int i10, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable) {
        this.f26550a = i7;
        this.f26551b = i10;
        this.f26552c = f6Var;
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
        boolean z9;
        super.updateDrawState(textPaint);
        int i7 = this.f26550a;
        if (i7 == 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        textPaint.setUnderlineText(z9);
        int i10 = this.f26551b;
        if (i10 >= 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, this.f26552c));
        }
        if (i7 == 2) {
            textPaint.setTypeface(g0.o());
        }
    }
}
