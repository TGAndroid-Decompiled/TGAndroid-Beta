package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class psc extends View {
    public final wsc a;

    public psc(wsc wscVar, Context context) {
        super(context);
        this.a = wscVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float pow;
        float f;
        Canvas canvas2;
        float f2;
        float f3;
        wsc wscVar = this.a;
        if (wscVar.Z0 > 0.0f) {
            boolean z = wscVar.Y0;
            float f4 = wscVar.V0;
            if (z) {
                pow = xnb.B(f4, 2.0f, 3.0f, f4 * f4);
            } else {
                pow = 1.0f - ((float) Math.pow(1.0f - f4, 4.0d));
            }
            boolean z2 = wscVar.Y0;
            if (!z2 && pow < 1.0f) {
                f = wscVar.Z0 * 1.2f * pow;
            } else {
                f = -1.0f;
            }
            float f5 = f;
            vsc vscVar = wscVar.T0;
            if (vscVar != null && pow < 1.0f) {
                if (z2) {
                    f3 = 1.0f - pow;
                } else {
                    f3 = 1.0f;
                }
                canvas2 = canvas;
                wscVar.s(canvas2, vscVar, f3, f5, true);
            } else {
                canvas2 = canvas;
            }
            vsc vscVar2 = wscVar.U0;
            if (vscVar2 != null) {
                if (wscVar.Y0) {
                    f2 = pow;
                } else {
                    f2 = 1.0f;
                }
                wscVar.s(canvas2, vscVar2, f2, f5, false);
            }
        }
    }
}
