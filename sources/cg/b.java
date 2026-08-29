package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
public abstract class b extends FrameLayout implements y0 {
    public final c6 f3069a;
    public final jl0 f3070b;
    public final f2.j0 f3071c;

    public b(Context context, c6 c6Var) {
        super(context);
        this.f3069a = c6Var;
        jl0 jl0Var = new jl0(context, c6Var);
        this.f3070b = jl0Var;
        jl0Var.setNestedScrollingEnabled(true);
        jl0Var.setAdapter(a());
        f2.j0 j0Var = new f2.j0(1, false);
        this.f3071c = j0Var;
        jl0Var.setLayoutManager(j0Var);
        jl0Var.setClipToPadding(false);
        addView(jl0Var, f6.c(-1.0f, -1));
    }

    public abstract f2.p0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = g6.T0("paintDivider", this.f3069a);
        if (T0 == null) {
            T0 = g6.f23183k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f9) {
        if (Math.abs(f9 / getMeasuredWidth()) == 1.0f) {
            jl0 jl0Var = this.f3070b;
            if (jl0Var.K(0) == null || jl0Var.K(0).f6432a.getTop() != jl0Var.getPaddingTop()) {
                jl0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f3070b.setPadding(0, i10, 0, 0);
    }
}
