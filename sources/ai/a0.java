package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.qf;
public final class a0 implements o0, bi.w0 {
    public final int f1113a;
    public final n0 f1114b;

    public a0(n0 n0Var, int i7) {
        this.f1113a = i7;
        this.f1114b = n0Var;
    }

    @Override
    public void a(Canvas canvas) {
        switch (this.f1113a) {
            case 1:
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                n0 n0Var = this.f1114b;
                qf qfVar = n0Var.f1364f;
                qfVar.f38784a.f32542a2.getLocationInWindow(iArr);
                n0Var.f1384w.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
                qfVar.a(canvas);
                canvas.restore();
                return;
            default:
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                n0 n0Var2 = this.f1114b;
                qf qfVar2 = n0Var2.f1364f;
                qfVar2.f38784a.f32542a2.getLocationInWindow(iArr3);
                n0Var2.f1384w.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr3[0] - iArr4[0], iArr3[1] - iArr4[1]);
                qfVar2.a(canvas);
                canvas.restore();
                return;
        }
    }

    public int b(float f10, float f11) {
        n0 n0Var = this.f1114b;
        RectF rectF = n0Var.f1388y;
        if (n0Var.k(rectF)) {
            return n0Var.f1386x.a(f10, f11, rectF);
        }
        return 0;
    }
}
