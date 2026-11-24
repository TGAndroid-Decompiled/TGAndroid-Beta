package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class j43 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final RectF b = new RectF();
    public final RectF c = new RectF();
    public final m43 d;

    public j43(m43 m43Var) {
        this.d = m43Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        m43 m43Var = this.d;
        float R1 = gl.R1(m43Var.e, gl.L(8.0f), m43Var.j);
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = m43Var.f;
        float f = m43Var.j;
        RectF rectF3 = this.c;
        gl.X1(rectF2, rectF, f, rectF3);
        Rect rect = this.a;
        rectF3.round(rect);
        outline.setRoundRect(rect, R1);
    }
}
