package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.ae;
public final class a0 implements o0, bi.w0 {
    public final int f1114a;
    public final n0 f1115b;

    public a0(n0 n0Var, int i7) {
        this.f1114a = i7;
        this.f1115b = n0Var;
    }

    @Override
    public void a(Canvas canvas) {
        switch (this.f1114a) {
            case 1:
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                n0 n0Var = this.f1115b;
                ae aeVar = n0Var.f1373f;
                aeVar.f32970b.U1.getLocationInWindow(iArr);
                n0Var.f1393w.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
                aeVar.a(canvas);
                canvas.restore();
                return;
            default:
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                n0 n0Var2 = this.f1115b;
                ae aeVar2 = n0Var2.f1373f;
                aeVar2.f32970b.U1.getLocationInWindow(iArr3);
                n0Var2.f1393w.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr3[0] - iArr4[0], iArr3[1] - iArr4[1]);
                aeVar2.a(canvas);
                canvas.restore();
                return;
        }
    }

    public int b(float f10, float f11) {
        n0 n0Var = this.f1115b;
        RectF rectF = n0Var.f1397y;
        if (n0Var.j(rectF)) {
            return n0Var.f1395x.a(f10, f11, rectF);
        }
        return 0;
    }
}
