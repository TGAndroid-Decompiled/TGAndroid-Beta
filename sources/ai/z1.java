package ai;

import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import org.telegram.ui.ActionBar.m6;
public final class z1 extends CharacterStyle implements UpdateAppearance {
    public final int f1608a;
    public final Object f1609b;

    public z1(Object obj, int i7) {
        this.f1608a = i7;
        this.f1609b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        float z10;
        float z11;
        switch (this.f1608a) {
            case 0:
                a2 a2Var = (a2) this.f1609b;
                LinearGradient linearGradient = a2Var.f1127k;
                if (linearGradient != null && a2Var.f1129m > 0.0f) {
                    textPaint.setShader(linearGradient);
                    textPaint.setColor(-1);
                    return;
                }
                return;
            case 1:
                long j3 = ji.e.f17825y3;
                ji.c cVar = (ji.c) this.f1609b;
                float f10 = ((float) (j3 - cVar.f17803c)) / 360.0f;
                if (f10 <= 0.0f) {
                    z10 = cVar.d;
                } else if (f10 >= 1.0f) {
                    z10 = 1.0f;
                } else {
                    float f11 = cVar.d;
                    z10 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.pow(1.0f - f10, 3.0d), 1.0f - f11, f11);
                }
                float max = Math.max(0.0f, Math.min(1.0f, ((((float) (ji.e.f17825y3 - cVar.f17803c)) / 1500.0f) - 0.2f) / 0.8f));
                float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
                int alpha = textPaint.getAlpha();
                textPaint.setColor(i0.a.f(C, ji.e.f17826z3, ji.e.A3));
                textPaint.setAlpha((int) (alpha * z10));
                float f12 = ji.e.B3;
                if (f12 > 0.0f && C < 1.0f) {
                    textPaint.setShadowLayer(f12, 0.0f, 0.0f, m6.r1((1.0f - C) * 0.55f * z10, ji.e.f17826z3));
                    return;
                }
                return;
            default:
                long j10 = ji.q.f17985b2;
                ji.p pVar = (ji.p) this.f1609b;
                float f13 = ((float) (j10 - pVar.f17983c)) / 360.0f;
                if (f13 <= 0.0f) {
                    z11 = pVar.d;
                } else if (f13 >= 1.0f) {
                    z11 = 1.0f;
                } else {
                    float f14 = pVar.d;
                    z11 = com.google.android.gms.internal.vision.e2.z(1.0f, (float) Math.pow(1.0f - f13, 3.0d), 1.0f - f14, f14);
                }
                float b10 = ji.q.b(((((float) (ji.q.f17985b2 - pVar.f17983c)) / 1900.0f) - 0.2f) / 0.8f);
                float C2 = com.google.android.gms.internal.vision.e2.C(b10, 2.0f, 3.0f, b10 * b10);
                int alpha2 = textPaint.getAlpha();
                textPaint.setColor(i0.a.f(C2, ji.q.X1, ji.q.Y1));
                textPaint.setAlpha((int) (alpha2 * z11));
                if (C2 < 1.0f) {
                    textPaint.setShadowLayer(ji.q.Z1, 0.0f, 0.0f, m6.r1((1.0f - C2) * 0.55f * z11, ji.q.X1));
                    return;
                }
                return;
        }
    }
}
