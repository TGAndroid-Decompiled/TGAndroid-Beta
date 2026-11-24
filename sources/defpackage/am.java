package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class am extends ClickableSpan {
    public final boolean a;
    public final int b;
    public final ylb c;
    public final Runnable d;

    public am(boolean z, int i, ylb ylbVar, Runnable runnable) {
        this.a = z;
        this.b = i;
        this.c = ylbVar;
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
            textPaint.setTypeface(gm.o());
        }
        textPaint.setColor(cmb.v0(this.b, this.c));
    }
}
