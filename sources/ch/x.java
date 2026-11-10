package ch;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class x extends ViewOutlineProvider {
    public final Rect f6411a = new Rect();
    public final RectF f6412b = new RectF();
    public final RectF f6413c = new RectF();
    public final b0 d;

    public x(b0 b0Var) {
        this.d = b0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        b0 b0Var = this.d;
        float T1 = org.telegram.messenger.g0.T1(b0Var.f6189e, org.telegram.messenger.g0.L(8.0f), b0Var.f6193j);
        RectF rectF = this.f6412b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = b0Var.f6190f;
        float f10 = b0Var.f6193j;
        RectF rectF3 = this.f6413c;
        org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF3);
        Rect rect = this.f6411a;
        rectF3.round(rect);
        outline.setRoundRect(rect, T1);
    }
}
