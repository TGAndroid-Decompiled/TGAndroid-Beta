package jh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.vj0;

public final class e3 implements vj0 {

    public final e4 f13218a;

    public e3(e4 e4Var) {
        this.f13218a = e4Var;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean m() {
        return this.f13218a.N0();
    }

    @Override
    public final void n(View view, ig.q0 q0Var, boolean z10, boolean z11) {
        e4 e4Var = this.f13218a;
        if (z10) {
            org.telegram.ui.Components.y4.a0(e4Var.f13296y2, 1, e4Var.f13291x1, new d3(this, z10, q0Var, view));
        } else {
            e4Var.n0(new cg.c(this, view, q0Var, z10, z11));
        }
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
        e4 e4Var = this.f13218a;
        Paint paint = e4Var.f13245j2;
        com.google.firebase.messaging.m mVar = e4Var.L1;
        float f13 = -f11;
        float f14 = -f12;
        mVar.w(f13, f14, e4Var.getMeasuredWidth() + f13, e4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) mVar.f4602a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, (Paint) mVar.f4602a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override
    public final void s() {
        ((z8) this.f13218a.M1).b(false);
    }

    @Override
    public final boolean t() {
        return false;
    }
}
