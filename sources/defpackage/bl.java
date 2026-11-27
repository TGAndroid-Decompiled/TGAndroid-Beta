package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class bl extends ClickableSpan {
    public final boolean a;
    public final int b;
    public final vnb c;
    public final Runnable d;

    public bl(boolean z, int i, vnb vnbVar, Runnable runnable) {
        this.a = z;
        this.b = i;
        this.c = vnbVar;
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
            textPaint.setTypeface(hl.o());
        }
        textPaint.setColor(aob.v0(this.b, this.c));
    }
}
