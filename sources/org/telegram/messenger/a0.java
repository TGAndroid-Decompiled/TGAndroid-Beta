package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a0 extends ClickableSpan {
    public final int f14540a;
    public final int f14541b;
    public final org.telegram.ui.ActionBar.p6 f14542c;
    public final Runnable d;

    public a0(int i10, int i11, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable) {
        this.f14540a = i10;
        this.f14541b = i11;
        this.f14542c = p6Var;
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
        int i10 = this.f14540a;
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
        int i11 = this.f14541b;
        if (i11 >= 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, this.f14542c));
        }
        if (i10 == 2) {
            textPaint.setTypeface(i0.o());
        }
    }
}
