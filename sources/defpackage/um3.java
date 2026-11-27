package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.d;
public final class um3 implements cn3, yv4 {
    public final byte a;
    public final bn3 b;

    public um3(bn3 bn3Var, byte b) {
        this.a = b;
        this.b = bn3Var;
    }

    @Override
    public final void a(Canvas canvas) {
        byte b = this.a;
        bn3 bn3Var = this.b;
        switch (b) {
            case 3:
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                d dVar = bn3Var.f;
                dVar.a.b2.getLocationInWindow(iArr);
                bn3Var.w.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
                dVar.a(canvas);
                canvas.restore();
                return;
            default:
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                d dVar2 = bn3Var.f;
                dVar2.a.b2.getLocationInWindow(iArr3);
                bn3Var.w.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr3[0] - iArr4[0], iArr3[1] - iArr4[1]);
                dVar2.a(canvas);
                canvas.restore();
                return;
        }
    }

    public final int b(float f, float f2) {
        bn3 bn3Var = this.b;
        RectF rectF = bn3Var.y;
        if (bn3Var.p(rectF)) {
            return bn3Var.x.a(f, f2, rectF);
        }
        return 0;
    }
}
