package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.rl0;
public abstract class b extends FrameLayout implements x0 {
    public final f6 f5207a;
    public final rl0 f5208b;
    public final f2.i0 f5209c;

    public b(Context context, f6 f6Var) {
        super(context);
        this.f5207a = f6Var;
        rl0 rl0Var = new rl0(context, f6Var);
        this.f5208b = rl0Var;
        rl0Var.setNestedScrollingEnabled(true);
        rl0Var.setAdapter(a());
        f2.i0 i0Var = new f2.i0(1, false);
        this.f5209c = i0Var;
        rl0Var.setLayoutManager(i0Var);
        rl0Var.setClipToPadding(false);
        addView(rl0Var, b6.c(-1.0f, -1));
    }

    public abstract f2.o0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = j6.T0("paintDivider", this.f5207a);
        if (T0 == null) {
            T0 = j6.f20000k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            rl0 rl0Var = this.f5208b;
            if (rl0Var.K(0) == null || rl0Var.K(0).f5774a.getTop() != rl0Var.getPaddingTop()) {
                rl0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f5208b.setPadding(0, i10, 0, 0);
    }
}
