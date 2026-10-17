package ci;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.bl0;
public final class m3 implements bl0 {
    public final q4 f5609a;

    public m3(q4 q4Var) {
        this.f5609a = q4Var;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return this.f5609a.N0();
    }

    @Override
    public final void l(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        q4 q4Var = this.f5609a;
        if (!z10) {
            q4Var.n0(new ai.y3(this, view, i1Var, z10, z11));
        } else {
            org.telegram.ui.Components.f5.Z(q4Var.C2, 1, q4Var.B1, new l3(this, z10, i1Var, view));
        }
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        q4 q4Var = this.f5609a;
        Paint paint = q4Var.f5806n2;
        com.google.firebase.messaging.l lVar = q4Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        lVar.E(f12, f13, q4Var.getMeasuredWidth() + f12, q4Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) lVar.f7647a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) lVar.f7647a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void q() {
        ((r9) this.f5609a.Q1).b(false);
    }

    @Override
    public final boolean s() {
        return false;
    }
}
