package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.rf;
public final class w implements m0, bi.a1 {
    public final int f1560a;
    public final l0 f1561b;

    public w(l0 l0Var, int i7) {
        this.f1560a = i7;
        this.f1561b = l0Var;
    }

    @Override
    public void a(Canvas canvas) {
        switch (this.f1560a) {
            case 1:
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                l0 l0Var = this.f1561b;
                rf rfVar = l0Var.f1337f;
                rfVar.f39289a.f32655c2.getLocationInWindow(iArr);
                l0Var.f1357w.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
                rfVar.a(canvas);
                canvas.restore();
                return;
            default:
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                l0 l0Var2 = this.f1561b;
                rf rfVar2 = l0Var2.f1337f;
                rfVar2.f39289a.f32655c2.getLocationInWindow(iArr3);
                l0Var2.f1357w.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr3[0] - iArr4[0], iArr3[1] - iArr4[1]);
                rfVar2.a(canvas);
                canvas.restore();
                return;
        }
    }

    public int b(float f10, float f11) {
        l0 l0Var = this.f1561b;
        RectF rectF = l0Var.f1361y;
        if (l0Var.k(rectF)) {
            return l0Var.f1359x.a(f10, f11, rectF);
        }
        return 0;
    }
}
