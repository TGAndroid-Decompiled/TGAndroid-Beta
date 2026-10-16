package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fl0;
public final class j4 implements fl0 {
    public final q5 f3206a;

    public j4(q5 q5Var) {
        this.f3206a = q5Var;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean m() {
        return this.f3206a.N0();
    }

    @Override
    public final void n(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        q5 q5Var = this.f3206a;
        if (!z10) {
            q5Var.n0(new h4(this, view, i1Var, z10, z11));
        } else {
            org.telegram.ui.Components.g5.Z(q5Var.C2, 1, q5Var.B1, new i4(this, z10, i1Var, view));
        }
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        q5 q5Var = this.f3206a;
        Paint paint = q5Var.f3550n2;
        com.google.firebase.messaging.m mVar = q5Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        mVar.z(f12, f13, q5Var.getMeasuredWidth() + f12, q5Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) mVar.f6194a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) mVar.f6194a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void y() {
        ((jb) this.f3206a.Q1).b(false);
    }

    @Override
    public final boolean z() {
        return false;
    }
}
