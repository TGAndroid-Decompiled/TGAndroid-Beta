package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class zs5 extends w9c {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public wm9 s;
    public final it5 w;

    public zs5(it5 it5Var, Context context) {
        super(it5Var, context);
        this.w = it5Var;
        this.n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        it5 it5Var = this.w;
        it5Var.P1.setTranslationY(gm.L(64.0f) + gm.L(6.0f) + (it5Var.x1 - it5Var.t0));
        float f = it5Var.i2 + it5Var.o2;
        a1b a1bVar = it5Var.t1;
        if (a1bVar.getVisibility() != 0) {
            this.f = f;
            this.h = f;
        } else {
            float f2 = this.h;
            if (f2 != f) {
                this.h = f;
                this.r = (f - this.f) * 0.10666667f;
            } else {
                f = f2;
            }
        }
        float f3 = this.f;
        if (f3 != f) {
            float f4 = this.r;
            float f5 = f3 + f4;
            this.f = f5;
            if (f4 > 0.0f && f5 > f) {
                this.f = f;
            } else if (f4 < 0.0f && f5 < f) {
                this.f = f;
            } else {
                invalidate();
            }
        }
        a1bVar.setTranslationY(it5Var.x1 + this.f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        it5 it5Var = this.w;
        if (view == it5Var.P1) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - gm.L(4.0f), getMeasuredWidth(), view.getY() + it5Var.e2 + 1.0f);
            canvas.drawColor(on2.p(cmb.w0(null, cmb.c6, false), (int) (it5Var.b2 * 255.0f)));
            int p = on2.p(cmb.w0(null, cmb.c7, false), (int) (it5Var.b2 * 255.0f));
            Paint paint = this.n;
            paint.setColor(p);
            canvas.drawRect(0.0f, view.getY() + it5Var.e2, getMeasuredWidth(), view.getY() + it5Var.e2 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wm9 wm9Var = this.s;
        if (wm9Var != null) {
            ((ccc) wm9Var.b).b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.w.n2 && this.s == null) {
            this.s = new wm9(view);
        }
    }
}
