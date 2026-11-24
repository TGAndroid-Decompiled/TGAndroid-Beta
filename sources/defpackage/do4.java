package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public class do4 extends CharacterStyle implements UpdateAppearance {
    public int a;
    public int b;
    public float c;
    public final ylb d;

    public do4(int i, ylb ylbVar) {
        this.c = 1.0f;
        this.b = i;
        this.d = ylbVar;
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        this.a = cmb.p1(this.c, cmb.v0(this.b, this.d));
        int color = textPaint.getColor();
        int i = this.a;
        if (color != i) {
            textPaint.setColor(i);
        }
    }

    public do4(int i) {
        this(i, null);
    }
}
