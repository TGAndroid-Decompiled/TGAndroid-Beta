package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class ylc extends CharacterStyle implements UpdateAppearance {
    public int a;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
    }
}
