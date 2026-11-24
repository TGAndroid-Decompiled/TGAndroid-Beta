package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class zl extends ClickableSpan {
    public final int a;
    public final Runnable b;

    public zl(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.a);
    }
}
