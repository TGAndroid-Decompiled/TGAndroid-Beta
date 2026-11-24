package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class u53 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final RectF b = new RectF();
    public final RectF c = new RectF();
    public final x53 d;

    public u53(x53 x53Var) {
        this.d = x53Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        x53 x53Var = this.d;
        float R1 = gm.R1(x53Var.e, gm.L(8.0f), x53Var.j);
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = x53Var.f;
        float f = x53Var.j;
        RectF rectF3 = this.c;
        gm.X1(rectF2, rectF, f, rectF3);
        Rect rect = this.a;
        rectF3.round(rect);
        outline.setRoundRect(rect, R1);
    }
}
