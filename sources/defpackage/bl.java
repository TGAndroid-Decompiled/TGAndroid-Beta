package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class bl extends CharacterStyle {
    public final boolean a;
    public final int b;
    public final wjb c;

    public bl(boolean z, int i, wjb wjbVar) {
        this.a = z;
        this.b = i;
        this.c = wjbVar;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.a) {
            textPaint.setTypeface(gl.o());
        }
        textPaint.setColor(bkb.v0(this.b, this.c));
    }
}
