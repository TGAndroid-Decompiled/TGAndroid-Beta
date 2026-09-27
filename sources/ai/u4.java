package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.rk0;
public final class u4 implements rk0 {
    public final e6 f1578a;

    public u4(e6 e6Var) {
        this.f1578a = e6Var;
    }

    @Override
    public final void i(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        e6 e6Var = this.f1578a;
        if (!z10) {
            e6Var.n0(new s4(this, view, p0Var, z10, z11));
        } else {
            org.telegram.ui.Components.e5.a0(e6Var.C2, 1, e6Var.B1, new t4(this, z10, p0Var, view));
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return this.f1578a.N0();
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        e6 e6Var = this.f1578a;
        Paint paint = e6Var.f813n2;
        com.google.firebase.messaging.n nVar = e6Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        nVar.z(f12, f13, e6Var.getMeasuredWidth() + f12, e6Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.f7320a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) nVar.f7320a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void p() {
        ((ac) this.f1578a.Q1).b(false);
    }

    @Override
    public final boolean t() {
        return false;
    }
}
