package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class xk extends ClickableSpan {
    public final int a;
    public final int b;
    public final wjb c;
    public final Runnable d;

    public xk(int i, int i2, wjb wjbVar, Runnable runnable) {
        this.a = i;
        this.b = i2;
        this.c = wjbVar;
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
        boolean z;
        super.updateDrawState(textPaint);
        int i = this.a;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setUnderlineText(z);
        int i2 = this.b;
        if (i2 >= 0) {
            textPaint.setColor(bkb.v0(i2, this.c));
        }
        if (i == 2) {
            textPaint.setTypeface(gl.o());
        }
    }
}
