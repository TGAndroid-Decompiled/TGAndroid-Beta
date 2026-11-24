package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class doc extends View {
    public final koc a;

    public doc(koc kocVar, Context context) {
        super(context);
        this.a = kocVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float pow;
        float f;
        Canvas canvas2;
        float f2;
        float f3;
        koc kocVar = this.a;
        if (kocVar.Z0 > 0.0f) {
            boolean z = kocVar.Y0;
            float f4 = kocVar.V0;
            if (z) {
                pow = yjb.B(f4, 2.0f, 3.0f, f4 * f4);
            } else {
                pow = 1.0f - ((float) Math.pow(1.0f - f4, 4.0d));
            }
            boolean z2 = kocVar.Y0;
            if (!z2 && pow < 1.0f) {
                f = kocVar.Z0 * 1.2f * pow;
            } else {
                f = -1.0f;
            }
            float f5 = f;
            joc jocVar = kocVar.T0;
            if (jocVar != null && pow < 1.0f) {
                if (z2) {
                    f3 = 1.0f - pow;
                } else {
                    f3 = 1.0f;
                }
                canvas2 = canvas;
                kocVar.s(canvas2, jocVar, f3, f5, true);
            } else {
                canvas2 = canvas;
            }
            joc jocVar2 = kocVar.U0;
            if (jocVar2 != null) {
                if (kocVar.Y0) {
                    f2 = pow;
                } else {
                    f2 = 1.0f;
                }
                kocVar.s(canvas2, jocVar2, f2, f5, false);
            }
        }
    }
}
