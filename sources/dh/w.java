package dh;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class w extends ViewOutlineProvider {
    public final Rect f9161a = new Rect();
    public final RectF f9162b = new RectF();
    public final RectF f9163c = new RectF();
    public final a0 d;

    public w(a0 a0Var) {
        this.d = a0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        a0 a0Var = this.d;
        float T1 = org.telegram.messenger.g0.T1(a0Var.f8934e, org.telegram.messenger.g0.L(8.0f), a0Var.f8938j);
        RectF rectF = this.f9162b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = a0Var.f8935f;
        float f10 = a0Var.f8938j;
        RectF rectF3 = this.f9163c;
        org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF3);
        Rect rect = this.f9161a;
        rectF3.round(rect);
        outline.setRoundRect(rect, T1);
    }
}
