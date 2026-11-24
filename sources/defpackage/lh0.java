package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public abstract class lh0 extends FrameLayout implements rt7 {
    public final ylb a;
    public final r59 b;
    public final u46 c;

    public lh0(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        r59 r59Var = new r59(context, ylbVar);
        this.b = r59Var;
        r59Var.setNestedScrollingEnabled(true);
        r59Var.setAdapter(a());
        u46 u46Var = new u46(1, false);
        this.c = u46Var;
        r59Var.setLayoutManager(u46Var);
        r59Var.setClipToPadding(false);
        addView(r59Var, qoe.c(-1.0f, -1));
    }

    public y59 a() {
        return new ny0(this, (byte) 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint U0 = cmb.U0("paintDivider", this.a);
        if (U0 == null) {
            U0 = cmb.j0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, U0);
    }

    @Override
    public void setOffset(float f) {
        if (Math.abs(f / getMeasuredWidth()) == 1.0f) {
            r59 r59Var = this.b;
            if (r59Var.K(0) == null || r59Var.K(0).a.getTop() != r59Var.getPaddingTop()) {
                r59Var.w0(0);
            }
        }
    }

    public void setTopOffset(int i) {
        this.b.setPadding(0, i, 0, 0);
    }
}
