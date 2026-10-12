package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ml0;
public final class v4 implements ml0 {
    public final f6 f1822a;

    public v4(f6 f6Var) {
        this.f1822a = f6Var;
    }

    @Override
    public final void h(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        f6 f6Var = this.f1822a;
        if (!z10) {
            f6Var.n0(new t4(this, view, n0Var, z10, z11));
        } else {
            org.telegram.ui.Components.g5.Z(f6Var.C2, 1, f6Var.B1, new u4(this, z10, n0Var, view));
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return this.f1822a.N0();
    }

    @Override
    public final void o(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        f6 f6Var = this.f1822a;
        Paint paint = f6Var.f987n2;
        com.google.firebase.messaging.n nVar = f6Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        nVar.z(f12, f13, f6Var.getMeasuredWidth() + f12, f6Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.f7950a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) nVar.f7950a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void p() {
        ((bc) this.f1822a.Q1).b(false);
    }

    @Override
    public final boolean q() {
        return false;
    }
}
