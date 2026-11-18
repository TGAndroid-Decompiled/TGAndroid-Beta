package ai;

import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import org.telegram.ui.ActionBar.n6;
public final class g2 extends CharacterStyle implements UpdateAppearance {
    public final int f1209a;
    public final Object f1210b;

    public g2(Object obj, int i7) {
        this.f1209a = i7;
        this.f1210b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        float z10;
        float z11;
        switch (this.f1209a) {
            case 0:
                h2 h2Var = (h2) this.f1210b;
                LinearGradient linearGradient = h2Var.f1230k;
                if (linearGradient != null && h2Var.f1232m > 0.0f) {
                    textPaint.setShader(linearGradient);
                    textPaint.setColor(-1);
                    return;
                }
                return;
            case 1:
                long j3 = ji.e.f17834w3;
                ji.c cVar = (ji.c) this.f1210b;
                float f10 = ((float) (j3 - cVar.f17812c)) / 360.0f;
                if (f10 <= 0.0f) {
                    z10 = cVar.d;
                } else if (f10 >= 1.0f) {
                    z10 = 1.0f;
                } else {
                    float f11 = cVar.d;
                    z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.pow(1.0f - f10, 3.0d), 1.0f - f11, f11);
                }
                float max = Math.max(0.0f, Math.min(1.0f, ((((float) (ji.e.f17834w3 - cVar.f17812c)) / 1500.0f) - 0.2f) / 0.8f));
                float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
                int alpha = textPaint.getAlpha();
                textPaint.setColor(i0.a.f(C, ji.e.f17835x3, ji.e.f17836y3));
                textPaint.setAlpha((int) (alpha * z10));
                float f12 = ji.e.f17837z3;
                if (f12 > 0.0f && C < 1.0f) {
                    textPaint.setShadowLayer(f12, 0.0f, 0.0f, n6.r1((1.0f - C) * 0.55f * z10, ji.e.f17835x3));
                    return;
                }
                return;
            default:
                long j10 = ji.p.f17991b2;
                ji.o oVar = (ji.o) this.f1210b;
                float f13 = ((float) (j10 - oVar.f17989c)) / 360.0f;
                if (f13 <= 0.0f) {
                    z11 = oVar.d;
                } else if (f13 >= 1.0f) {
                    z11 = 1.0f;
                } else {
                    float f14 = oVar.d;
                    z11 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.pow(1.0f - f13, 3.0d), 1.0f - f14, f14);
                }
                float b10 = ji.p.b(((((float) (ji.p.f17991b2 - oVar.f17989c)) / 1900.0f) - 0.2f) / 0.8f);
                float C2 = com.google.android.gms.internal.vision.e2.C(b10, 2.0f, 3.0f, b10 * b10);
                int alpha2 = textPaint.getAlpha();
                textPaint.setColor(i0.a.f(C2, ji.p.X1, ji.p.Y1));
                textPaint.setAlpha((int) (alpha2 * z11));
                if (C2 < 1.0f) {
                    textPaint.setShadowLayer(ji.p.Z1, 0.0f, 0.0f, n6.r1((1.0f - C2) * 0.55f * z11, ji.p.X1));
                    return;
                }
                return;
        }
    }
}
