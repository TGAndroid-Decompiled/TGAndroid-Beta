package ci;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.bl0;
public final class l3 implements bl0 {
    public final p4 f5509a;

    public l3(p4 p4Var) {
        this.f5509a = p4Var;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return this.f5509a.N0();
    }

    @Override
    public final void l(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        p4 p4Var = this.f5509a;
        if (!z10) {
            p4Var.n0(new ai.x9(this, view, i1Var, z10, z11));
        } else {
            org.telegram.ui.Components.f5.Z(p4Var.C2, 1, p4Var.B1, new k3(this, z10, i1Var, view));
        }
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        p4 p4Var = this.f5509a;
        Paint paint = p4Var.f5687n2;
        com.google.firebase.messaging.l lVar = p4Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        lVar.E(f12, f13, p4Var.getMeasuredWidth() + f12, p4Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) lVar.f7646a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) lVar.f7646a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void q() {
        ((q9) this.f5509a.Q1).b(false);
    }

    @Override
    public final boolean s() {
        return false;
    }
}
