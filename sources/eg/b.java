package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.sl0;
public abstract class b extends FrameLayout implements x0 {
    public final f6 f5218a;
    public final sl0 f5219b;
    public final f2.i0 f5220c;

    public b(Context context, f6 f6Var) {
        super(context);
        this.f5218a = f6Var;
        sl0 sl0Var = new sl0(context, f6Var);
        this.f5219b = sl0Var;
        sl0Var.setNestedScrollingEnabled(true);
        sl0Var.setAdapter(a());
        f2.i0 i0Var = new f2.i0(1, false);
        this.f5220c = i0Var;
        sl0Var.setLayoutManager(i0Var);
        sl0Var.setClipToPadding(false);
        addView(sl0Var, b6.c(-1.0f, -1));
    }

    public abstract f2.o0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = j6.T0("paintDivider", this.f5218a);
        if (T0 == null) {
            T0 = j6.f20025k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            sl0 sl0Var = this.f5219b;
            if (sl0Var.K(0) == null || sl0Var.K(0).f5785a.getTop() != sl0Var.getPaddingTop()) {
                sl0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f5219b.setPadding(0, i10, 0, 0);
    }
}
