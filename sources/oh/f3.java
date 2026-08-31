package oh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.qk0;
public final class f3 implements qk0 {
    public final f4 f17051a;

    public f3(f4 f4Var) {
        this.f17051a = f4Var;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final boolean h() {
        return this.f17051a.N0();
    }

    @Override
    public final void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
        f4 f4Var = this.f17051a;
        Paint paint = f4Var.f17082k2;
        a9.a aVar = f4Var.M1;
        float f13 = -f11;
        float f14 = -f12;
        aVar.x(f13, f14, f4Var.getMeasuredWidth() + f13, f4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) aVar.f155a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) aVar.f155a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void m() {
        ((z8) this.f17051a.N1).b(false);
    }

    @Override
    public final void o(View view, ng.q0 q0Var, boolean z4, boolean z10) {
        f4 f4Var = this.f17051a;
        if (!z4) {
            f4Var.n0(new dg.t0(this, view, q0Var, z4, z10));
        } else {
            org.telegram.ui.Components.z4.a0(f4Var.f17133z2, 1, f4Var.f17128y1, new e3(this, z4, q0Var, view));
        }
    }

    @Override
    public final boolean t() {
        return false;
    }
}
