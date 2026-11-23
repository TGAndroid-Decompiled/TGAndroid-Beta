package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.rf;
public final class v implements l0, bi.a1 {
    public final int f1548a;
    public final k0 f1549b;

    public v(k0 k0Var, int i7) {
        this.f1548a = i7;
        this.f1549b = k0Var;
    }

    @Override
    public void a(Canvas canvas) {
        switch (this.f1548a) {
            case 1:
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                k0 k0Var = this.f1549b;
                rf rfVar = k0Var.f1322f;
                rfVar.f39132a.f32557c2.getLocationInWindow(iArr);
                k0Var.f1342w.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
                rfVar.a(canvas);
                canvas.restore();
                return;
            default:
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                k0 k0Var2 = this.f1549b;
                rf rfVar2 = k0Var2.f1322f;
                rfVar2.f39132a.f32557c2.getLocationInWindow(iArr3);
                k0Var2.f1342w.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr3[0] - iArr4[0], iArr3[1] - iArr4[1]);
                rfVar2.a(canvas);
                canvas.restore();
                return;
        }
    }

    public int b(float f10, float f11) {
        k0 k0Var = this.f1549b;
        RectF rectF = k0Var.f1346y;
        if (k0Var.m(rectF)) {
            return k0Var.f1344x.a(f10, f11, rectF);
        }
        return 0;
    }
}
