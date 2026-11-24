package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public abstract class kg0 extends FrameLayout implements qr7 {
    public final wjb a;
    public final o39 b;
    public final t26 c;

    public kg0(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        o39 o39Var = new o39(context, wjbVar);
        this.b = o39Var;
        o39Var.setNestedScrollingEnabled(true);
        o39Var.setAdapter(a());
        t26 t26Var = new t26(1, false);
        this.c = t26Var;
        o39Var.setLayoutManager(t26Var);
        o39Var.setClipToPadding(false);
        addView(o39Var, nme.c(-1.0f, -1));
    }

    public w39 a() {
        return new gx0(this, (byte) 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint U0 = bkb.U0("paintDivider", this.a);
        if (U0 == null) {
            U0 = bkb.j0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, U0);
    }

    @Override
    public void setOffset(float f) {
        if (Math.abs(f / getMeasuredWidth()) == 1.0f) {
            o39 o39Var = this.b;
            if (o39Var.K(0) == null || o39Var.K(0).a.getTop() != o39Var.getPaddingTop()) {
                o39Var.w0(0);
            }
        }
    }

    public void setTopOffset(int i) {
        this.b.setPadding(0, i, 0, 0);
    }
}
