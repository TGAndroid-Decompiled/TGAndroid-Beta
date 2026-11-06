package ch;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class x extends ViewOutlineProvider {
    public final Rect f6408a = new Rect();
    public final RectF f6409b = new RectF();
    public final RectF f6410c = new RectF();
    public final b0 d;

    public x(b0 b0Var) {
        this.d = b0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        b0 b0Var = this.d;
        float T1 = org.telegram.messenger.g0.T1(b0Var.f6186e, org.telegram.messenger.g0.L(8.0f), b0Var.f6190j);
        RectF rectF = this.f6409b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = b0Var.f6187f;
        float f10 = b0Var.f6190j;
        RectF rectF3 = this.f6410c;
        org.telegram.messenger.g0.Z1(rectF2, rectF, f10, rectF3);
        Rect rect = this.f6408a;
        rectF3.round(rect);
        outline.setRoundRect(rect, T1);
    }
}
