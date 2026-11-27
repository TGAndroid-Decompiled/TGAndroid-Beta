package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class t3b extends CharacterStyle implements UpdateAppearance {
    public final int a;
    public final vnb b;

    public t3b(int i, vnb vnbVar) {
        this.a = i;
        this.b = vnbVar;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(aob.v0(this.a, this.b));
        textPaint.setUnderlineText(true);
    }
}
