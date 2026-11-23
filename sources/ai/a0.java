package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.sf;
public final class a0 implements q0, bi.a1 {
    public final int f1113a;
    public final p0 f1114b;

    public a0(p0 p0Var, int i7) {
        this.f1113a = i7;
        this.f1114b = p0Var;
    }

    @Override
    public void a(Canvas canvas) {
        switch (this.f1113a) {
            case 1:
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                p0 p0Var = this.f1114b;
                sf sfVar = p0Var.f1392f;
                sfVar.f39572a.f32591c2.getLocationInWindow(iArr);
                p0Var.f1412w.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
                sfVar.a(canvas);
                canvas.restore();
                return;
            default:
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                p0 p0Var2 = this.f1114b;
                sf sfVar2 = p0Var2.f1392f;
                sfVar2.f39572a.f32591c2.getLocationInWindow(iArr3);
                p0Var2.f1412w.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr3[0] - iArr4[0], iArr3[1] - iArr4[1]);
                sfVar2.a(canvas);
                canvas.restore();
                return;
        }
    }

    public int b(float f10, float f11) {
        p0 p0Var = this.f1114b;
        RectF rectF = p0Var.f1416y;
        if (p0Var.m(rectF)) {
            return p0Var.f1414x.a(f10, f11, rectF);
        }
        return 0;
    }
}
