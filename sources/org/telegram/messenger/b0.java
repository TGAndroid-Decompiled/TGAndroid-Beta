package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class b0 extends ClickableSpan {
    public final int f14699a;
    public final Runnable f14700b;

    public b0(int i10, Runnable runnable) {
        this.f14699a = i10;
        this.f14700b = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable = this.f14700b;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f14699a);
    }
}
