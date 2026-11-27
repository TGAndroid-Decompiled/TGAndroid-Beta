package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class cl extends CharacterStyle {
    public final boolean a;
    public final int b;
    public final vnb c;

    public cl(boolean z, int i, vnb vnbVar) {
        this.a = z;
        this.b = i;
        this.c = vnbVar;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.a) {
            textPaint.setTypeface(hl.o());
        }
        textPaint.setColor(aob.v0(this.b, this.c));
    }
}
