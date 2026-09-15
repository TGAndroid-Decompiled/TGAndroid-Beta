package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ek0;
public final class u4 implements ek0 {
    public final f6 f1568a;

    public u4(f6 f6Var) {
        this.f1568a = f6Var;
    }

    @Override
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        f6 f6Var = this.f1568a;
        if (!z10) {
            f6Var.n0(new s4(this, view, p0Var, z10, z11));
        } else {
            org.telegram.ui.Components.c5.a0(f6Var.C2, 1, f6Var.B1, new t4(this, z10, p0Var, view));
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return this.f1568a.N0();
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        f6 f6Var = this.f1568a;
        Paint paint = f6Var.f832n2;
        com.google.firebase.messaging.n nVar = f6Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        nVar.z(f12, f13, f6Var.getMeasuredWidth() + f12, f6Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.f7331a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) nVar.f7331a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void o() {
        ((ac) this.f1568a.Q1).b(false);
    }

    @Override
    public final boolean q() {
        return false;
    }
}
