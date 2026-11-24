package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class bm extends CharacterStyle {
    public final boolean a;
    public final int b;
    public final ylb c;

    public bm(boolean z, int i, ylb ylbVar) {
        this.a = z;
        this.b = i;
        this.c = ylbVar;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.a) {
            textPaint.setTypeface(gm.o());
        }
        textPaint.setColor(cmb.v0(this.b, this.c));
    }
}
