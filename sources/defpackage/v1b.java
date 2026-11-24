package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class v1b extends CharacterStyle implements UpdateAppearance {
    public final int a;
    public final ylb b;

    public v1b(int i, ylb ylbVar) {
        this.a = i;
        this.b = ylbVar;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(cmb.v0(this.a, this.b));
        textPaint.setUnderlineText(true);
    }
}
