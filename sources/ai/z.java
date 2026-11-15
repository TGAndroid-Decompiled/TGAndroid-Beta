package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.ae;
public final class z implements n0, bi.w0 {
    public final int f1636a;
    public final m0 f1637b;

    public z(m0 m0Var, int i7) {
        this.f1636a = i7;
        this.f1637b = m0Var;
    }

    @Override
    public void a(Canvas canvas) {
        switch (this.f1636a) {
            case 1:
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                m0 m0Var = this.f1637b;
                ae aeVar = m0Var.f1365f;
                aeVar.f32967b.U1.getLocationInWindow(iArr);
                m0Var.f1385w.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
                aeVar.a(canvas);
                canvas.restore();
                return;
            default:
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                m0 m0Var2 = this.f1637b;
                ae aeVar2 = m0Var2.f1365f;
                aeVar2.f32967b.U1.getLocationInWindow(iArr3);
                m0Var2.f1385w.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr3[0] - iArr4[0], iArr3[1] - iArr4[1]);
                aeVar2.a(canvas);
                canvas.restore();
                return;
        }
    }

    public int b(float f10, float f11) {
        m0 m0Var = this.f1637b;
        RectF rectF = m0Var.f1389y;
        if (m0Var.j(rectF)) {
            return m0Var.f1387x.a(f10, f11, rectF);
        }
        return 0;
    }
}
