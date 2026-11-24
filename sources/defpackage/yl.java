package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class yl extends CharacterStyle {
    public final byte a;
    public final Object b;

    public yl(f09 f09Var) {
        this.a = (byte) 1;
        this.b = f09Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                textPaint.setTypeface(gm.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(cmb.v0(cmb.m6, (ylb) obj));
                textPaint.setAlpha(alpha);
                return;
            case 1:
                textPaint.setColor(cmb.v(cmb.p1(0.55f, textPaint.getColor()), cmb.p1(0.4f, ((f09) obj).J)));
                return;
            case 2:
                textPaint.setColor(cmb.v(cmb.p1(0.55f, textPaint.getColor()), cmb.p1(0.4f, cmb.v0(cmb.Ei, ((xk9) obj).a))));
                return;
            case 3:
                textPaint.setColor(((mmc) obj).t0);
                return;
            default:
                float[] fArr = ((soc) obj).b0;
                int i = -9577217;
                if (fArr != null) {
                    i = on2.f(fArr[8], bqc.p(-9577217, 0, fArr), bqc.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i);
                return;
        }
    }

    public yl(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
