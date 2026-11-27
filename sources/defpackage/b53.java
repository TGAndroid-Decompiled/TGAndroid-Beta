package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class b53 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final RectF b = new RectF();
    public final RectF c = new RectF();
    public final e53 d;

    public b53(e53 e53Var) {
        this.d = e53Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        e53 e53Var = this.d;
        float R1 = hl.R1(e53Var.e, hl.L(8.0f), e53Var.j);
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = e53Var.f;
        float f = e53Var.j;
        RectF rectF3 = this.c;
        hl.X1(rectF2, rectF, f, rectF3);
        Rect rect = this.a;
        rectF3.round(rect);
        outline.setRoundRect(rect, R1);
    }
}
