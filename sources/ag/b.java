package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.zk0;

public abstract class b extends FrameLayout implements l1 {

    public final c6 f291a;

    public final zk0 f292b;

    public final f2.k0 f293c;

    public b(Context context, c6 c6Var) {
        super(context);
        this.f291a = c6Var;
        zk0 zk0Var = new zk0(context, c6Var);
        this.f292b = zk0Var;
        zk0Var.setNestedScrollingEnabled(true);
        zk0Var.setAdapter(a());
        f2.k0 k0Var = new f2.k0(1, false);
        this.f293c = k0Var;
        zk0Var.setLayoutManager(k0Var);
        zk0Var.setClipToPadding(false);
        addView(zk0Var, z5.c(-1.0f, -1));
    }

    public abstract f2.q0 a();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint paintT0 = g6.T0("paintDivider", this.f291a);
        if (paintT0 == null) {
            paintT0 = g6.f23175k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paintT0);
    }

    @Override
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            zk0 zk0Var = this.f292b;
            if (zk0Var.K(0) == null || zk0Var.K(0).f5789a.getTop() != zk0Var.getPaddingTop()) {
                zk0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.f292b.setPadding(0, i10, 0, 0);
    }
}
