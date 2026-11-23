package ch;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class y extends ViewOutlineProvider {
    public final Rect f5525a = new Rect();
    public final RectF f5526b = new RectF();
    public final RectF f5527c = new RectF();
    public final b0 d;

    public y(b0 b0Var) {
        this.d = b0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        b0 b0Var = this.d;
        float T1 = org.telegram.messenger.g0.T1(b0Var.f5292e, org.telegram.messenger.g0.L(8.0f), b0Var.f5296j);
        RectF rectF = this.f5526b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = b0Var.f5293f;
        float f10 = b0Var.f5296j;
        RectF rectF3 = this.f5527c;
        org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF3);
        Rect rect = this.f5525a;
        rectF3.round(rect);
        outline.setRoundRect(rect, T1);
    }
}
