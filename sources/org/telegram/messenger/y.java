package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class y extends ClickableSpan {
    public final int f28176a;
    public final int f28177b;
    public final org.telegram.ui.ActionBar.i6 f28178c;
    public final Runnable d;

    public y(int i7, int i10, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable) {
        this.f28176a = i7;
        this.f28177b = i10;
        this.f28178c = i6Var;
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
        int i7 = this.f28176a;
        if (i7 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
        int i10 = this.f28177b;
        if (i10 >= 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, this.f28178c));
        }
        if (i7 == 2) {
            textPaint.setTypeface(g0.o());
        }
    }
}
