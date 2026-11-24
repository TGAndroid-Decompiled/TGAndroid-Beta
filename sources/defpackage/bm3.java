package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.d;
public final class bm3 implements km3, ut4 {
    public final byte a;
    public final jm3 b;

    public bm3(jm3 jm3Var, byte b) {
        this.a = b;
        this.b = jm3Var;
    }

    public final int a(float f, float f2) {
        jm3 jm3Var = this.b;
        RectF rectF = jm3Var.y;
        if (jm3Var.n(rectF)) {
            return jm3Var.x.a(f, f2, rectF);
        }
        return 0;
    }

    @Override
    public final void b(Canvas canvas) {
        byte b = this.a;
        jm3 jm3Var = this.b;
        switch (b) {
            case 1:
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                d dVar = jm3Var.f;
                dVar.a.c2.getLocationInWindow(iArr);
                jm3Var.w.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
                dVar.a(canvas);
                canvas.restore();
                return;
            default:
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                d dVar2 = jm3Var.f;
                dVar2.a.c2.getLocationInWindow(iArr3);
                jm3Var.w.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr3[0] - iArr4[0], iArr3[1] - iArr4[1]);
                dVar2.a(canvas);
                canvas.restore();
                return;
        }
    }
}
