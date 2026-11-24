package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class al extends ClickableSpan {
    public final boolean a;
    public final int b;
    public final wjb c;
    public final Runnable d;

    public al(boolean z, int i, wjb wjbVar, Runnable runnable) {
        this.a = z;
        this.b = i;
        this.c = wjbVar;
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
        if (this.a) {
            textPaint.setTypeface(gl.o());
        }
        textPaint.setColor(bkb.v0(this.b, this.c));
    }
}
