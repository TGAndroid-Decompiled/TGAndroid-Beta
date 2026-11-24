package defpackage;

import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class pn3 extends CharacterStyle implements UpdateAppearance {
    public final byte a;
    public final Object b;

    public pn3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        float A;
        float A2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                qn3 qn3Var = (qn3) obj;
                LinearGradient linearGradient = qn3Var.k;
                if (linearGradient != null && qn3Var.m > 0.0f) {
                    textPaint.setShader(linearGradient);
                    textPaint.setColor(-1);
                    return;
                }
                return;
            case 1:
                wic wicVar = (wic) obj;
                float f = ((float) (yic.y3 - wicVar.c)) / 360.0f;
                if (f <= 0.0f) {
                    A = wicVar.d;
                } else if (f >= 1.0f) {
                    A = 1.0f;
                } else {
                    float f2 = wicVar.d;
                    A = tb4.A(1.0f, (float) Math.pow(1.0f - f, 3.0d), 1.0f - f2, f2);
                }
                float max = Math.max(0.0f, Math.min(1.0f, ((((float) (yic.y3 - wicVar.c)) / 1500.0f) - 0.2f) / 0.8f));
                float B = yjb.B(max, 2.0f, 3.0f, max * max);
                int alpha = textPaint.getAlpha();
                textPaint.setColor(bm2.f(B, yic.z3, yic.A3));
                textPaint.setAlpha((int) (alpha * A));
                float f3 = yic.B3;
                if (f3 > 0.0f && B < 1.0f) {
                    textPaint.setShadowLayer(f3, 0.0f, 0.0f, bkb.p1((1.0f - B) * 0.55f * A, yic.z3));
                    return;
                }
                return;
            default:
                ijc ijcVar = (ijc) obj;
                float f4 = ((float) (jjc.b2 - ijcVar.c)) / 360.0f;
                if (f4 <= 0.0f) {
                    A2 = ijcVar.d;
                } else if (f4 >= 1.0f) {
                    A2 = 1.0f;
                } else {
                    float f5 = ijcVar.d;
                    A2 = tb4.A(1.0f, (float) Math.pow(1.0f - f4, 3.0d), 1.0f - f5, f5);
                }
                float b2 = jjc.b(((((float) (jjc.b2 - ijcVar.c)) / 1900.0f) - 0.2f) / 0.8f);
                float B2 = yjb.B(b2, 2.0f, 3.0f, b2 * b2);
                int alpha2 = textPaint.getAlpha();
                textPaint.setColor(bm2.f(B2, jjc.X1, jjc.Y1));
                textPaint.setAlpha((int) (alpha2 * A2));
                if (B2 < 1.0f) {
                    textPaint.setShadowLayer(jjc.Z1, 0.0f, 0.0f, bkb.p1((1.0f - B2) * 0.55f * A2, jjc.X1));
                    return;
                }
                return;
        }
    }
}
