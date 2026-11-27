package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class zk extends CharacterStyle {
    public final byte a;
    public final Object b;

    public zk(r19 r19Var) {
        this.a = (byte) 1;
        this.b = r19Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                textPaint.setTypeface(hl.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(aob.v0(aob.n6, (vnb) obj));
                textPaint.setAlpha(alpha);
                return;
            case 1:
                textPaint.setColor(aob.v(aob.p1(0.55f, textPaint.getColor()), aob.p1(0.4f, ((r19) obj).J)));
                return;
            case 2:
                textPaint.setColor(aob.v(aob.p1(0.55f, textPaint.getColor()), aob.p1(0.4f, aob.v0(aob.Fi, ((km9) obj).a))));
                return;
            case 3:
                textPaint.setColor(((zoc) obj).t0);
                return;
            default:
                float[] fArr = ((frc) obj).b0;
                int i = -9577217;
                if (fArr != null) {
                    i = vm2.f(fArr[8], lsc.p(-9577217, 0, fArr), lsc.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i);
                return;
        }
    }

    public zk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
