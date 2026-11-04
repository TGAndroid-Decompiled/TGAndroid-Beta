package ei;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ki0;
public final class h3 implements ki0 {
    public final j4 f10357a;

    public h3(j4 j4Var) {
        this.f10357a = j4Var;
    }

    @Override
    public final void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
        j4 j4Var = this.f10357a;
        Paint paint = j4Var.X1;
        l2.e eVar = j4Var.f10531z1;
        float f13 = -f11;
        float f14 = -f12;
        eVar.m(f13, f14, j4Var.getMeasuredWidth() + f13, j4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) eVar.f17689a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) eVar.f17689a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void J() {
        ((i9) this.f10357a.A1).b(false);
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean v() {
        return this.f10357a.L0();
    }

    @Override
    public final void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        j4 j4Var = this.f10357a;
        if (!z10) {
            j4Var.l0(new ci.u8(this, view, n0Var, z10, z11));
        } else {
            org.telegram.ui.Components.t4.Z(j4Var.f10480m2, 1, j4Var.f10477l1, new g3(this, z10, n0Var, view));
        }
    }
}
