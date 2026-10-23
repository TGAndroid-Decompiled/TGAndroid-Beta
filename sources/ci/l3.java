package ci;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fl0;
public final class l3 implements fl0 {
    public final p4 f5513a;

    public l3(p4 p4Var) {
        this.f5513a = p4Var;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean l() {
        return this.f5513a.M0();
    }

    @Override
    public final void m(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        p4 p4Var = this.f5513a;
        if (!z10) {
            p4Var.m0(new ai.x9(this, view, i1Var, z10, z11));
        } else {
            org.telegram.ui.Components.f5.a0(p4Var.C2, 1, p4Var.B1, new k3(this, z10, i1Var, view));
        }
    }

    @Override
    public final void s(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        p4 p4Var = this.f5513a;
        Paint paint = p4Var.f5691n2;
        com.google.firebase.messaging.l lVar = p4Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        lVar.w(f12, f13, p4Var.getMeasuredWidth() + f12, p4Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) lVar.f7657a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) lVar.f7657a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void u() {
        ((q9) this.f5513a.Q1).b(false);
    }

    @Override
    public final boolean w() {
        return false;
    }
}
