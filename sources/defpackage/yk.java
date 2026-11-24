package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class yk extends CharacterStyle {
    public final byte a;
    public final Object b;

    public yk(ey8 ey8Var) {
        this.a = (byte) 1;
        this.b = ey8Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                textPaint.setTypeface(gl.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(bkb.v0(bkb.m6, (wjb) obj));
                textPaint.setAlpha(alpha);
                return;
            case 1:
                textPaint.setColor(bkb.v(bkb.p1(0.55f, textPaint.getColor()), bkb.p1(0.4f, ((ey8) obj).J)));
                return;
            case 2:
                textPaint.setColor(bkb.v(bkb.p1(0.55f, textPaint.getColor()), bkb.p1(0.4f, bkb.v0(bkb.Ei, ((wi9) obj).a))));
                return;
            case 3:
                textPaint.setColor(((nkc) obj).t0);
                return;
            default:
                float[] fArr = ((smc) obj).b0;
                int i = -9577217;
                if (fArr != null) {
                    i = bm2.f(fArr[8], znc.p(-9577217, 0, fArr), znc.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i);
                return;
        }
    }

    public yk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
