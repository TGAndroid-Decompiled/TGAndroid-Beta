package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class fqc extends View {
    public final mqc a;

    public fqc(mqc mqcVar, Context context) {
        super(context);
        this.a = mqcVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float pow;
        float f;
        Canvas canvas2;
        float f2;
        float f3;
        mqc mqcVar = this.a;
        if (mqcVar.Z0 > 0.0f) {
            boolean z = mqcVar.Y0;
            float f4 = mqcVar.V0;
            if (z) {
                pow = mlb.B(f4, 2.0f, 3.0f, f4 * f4);
            } else {
                pow = 1.0f - ((float) Math.pow(1.0f - f4, 4.0d));
            }
            boolean z2 = mqcVar.Y0;
            if (!z2 && pow < 1.0f) {
                f = mqcVar.Z0 * 1.2f * pow;
            } else {
                f = -1.0f;
            }
            float f5 = f;
            lqc lqcVar = mqcVar.T0;
            if (lqcVar != null && pow < 1.0f) {
                if (z2) {
                    f3 = 1.0f - pow;
                } else {
                    f3 = 1.0f;
                }
                canvas2 = canvas;
                mqcVar.s(canvas2, lqcVar, f3, f5, true);
            } else {
                canvas2 = canvas;
            }
            lqc lqcVar2 = mqcVar.U0;
            if (lqcVar2 != null) {
                if (mqcVar.Y0) {
                    f2 = pow;
                } else {
                    f2 = 1.0f;
                }
                mqcVar.s(canvas2, lqcVar2, f2, f5, false);
            }
        }
    }
}
