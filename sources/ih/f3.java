package ih;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.tj0;
public final class f3 implements tj0 {
    public final i4 f11412a;

    public f3(i4 i4Var) {
        this.f11412a = i4Var;
    }

    @Override
    public final void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        i4 i4Var = this.f11412a;
        if (!z10) {
            i4Var.n0(new bg.d(this, view, r0Var, z10, z11));
        } else {
            org.telegram.ui.Components.y4.a0(i4Var.f11609y2, 1, i4Var.f11604x1, new e3(this, z10, r0Var, view));
        }
    }

    @Override
    public final boolean n() {
        return true;
    }

    @Override
    public final boolean p() {
        return this.f11412a.N0();
    }

    @Override
    public final void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
        i4 i4Var = this.f11412a;
        Paint paint = i4Var.f11558j2;
        com.google.firebase.messaging.m mVar = i4Var.L1;
        float f13 = -f11;
        float f14 = -f12;
        mVar.w(f13, f14, i4Var.getMeasuredWidth() + f13, i4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) mVar.f4160a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) mVar.f4160a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void t() {
        ((d9) this.f11412a.M1).b(false);
    }

    @Override
    public final boolean u() {
        return false;
    }
}
