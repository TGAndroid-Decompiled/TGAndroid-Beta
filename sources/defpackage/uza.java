package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class uza extends CharacterStyle implements UpdateAppearance {
    public final int a;
    public final wjb b;

    public uza(int i, wjb wjbVar) {
        this.a = i;
        this.b = wjbVar;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(bkb.v0(this.a, this.b));
        textPaint.setUnderlineText(true);
    }
}
