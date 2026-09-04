package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ek0;
public final class g4 implements ek0 {
    public final o5 f3021a;

    public g4(o5 o5Var) {
        this.f3021a = o5Var;
    }

    @Override
    public final void B(View view, ah.j1 j1Var, boolean z10, boolean z11) {
        o5 o5Var = this.f3021a;
        if (!z10) {
            o5Var.n0(new e4(this, view, j1Var, z10, z11));
        } else {
            org.telegram.ui.Components.e5.a0(o5Var.C2, 1, o5Var.B1, new f4(this, z10, j1Var, view));
        }
    }

    @Override
    public final void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        o5 o5Var = this.f3021a;
        Paint paint = o5Var.f3443n2;
        com.google.firebase.messaging.n nVar = o5Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        nVar.z(f12, f13, o5Var.getMeasuredWidth() + f12, o5Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.f6374a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) nVar.f6374a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void J() {
        ((gb) this.f3021a.Q1).b(false);
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final boolean n() {
        return true;
    }

    @Override
    public final boolean t() {
        return this.f3021a.N0();
    }
}
