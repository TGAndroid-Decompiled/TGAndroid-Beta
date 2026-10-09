package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.jl0;
public final class v4 implements jl0 {
    public final f6 f1824a;

    public v4(f6 f6Var) {
        this.f1824a = f6Var;
    }

    @Override
    public final void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        f6 f6Var = this.f1824a;
        if (!z10) {
            f6Var.n0(new t4(this, view, n0Var, z10, z11));
        } else {
            org.telegram.ui.Components.g5.Z(f6Var.C2, 1, f6Var.B1, new u4(this, z10, n0Var, view));
        }
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final boolean q() {
        return this.f1824a.N0();
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        f6 f6Var = this.f1824a;
        Paint paint = f6Var.f989n2;
        com.google.firebase.messaging.n nVar = f6Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        nVar.z(f12, f13, f6Var.getMeasuredWidth() + f12, f6Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.f7954a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) nVar.f7954a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void s() {
        ((bc) this.f1824a.Q1).b(false);
    }

    @Override
    public final boolean v() {
        return false;
    }
}
