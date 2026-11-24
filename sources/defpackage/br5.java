package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class br5 extends v7c {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public vk9 s;
    public final jr5 w;

    public br5(jr5 jr5Var, Context context) {
        super(jr5Var, context);
        this.w = jr5Var;
        this.n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        jr5 jr5Var = this.w;
        jr5Var.P1.setTranslationY(gl.L(64.0f) + gl.L(6.0f) + (jr5Var.x1 - jr5Var.t0));
        float f = jr5Var.i2 + jr5Var.o2;
        zya zyaVar = jr5Var.t1;
        if (zyaVar.getVisibility() != 0) {
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
        zyaVar.setTranslationY(jr5Var.x1 + this.f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        jr5 jr5Var = this.w;
        if (view == jr5Var.P1) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - gl.L(4.0f), getMeasuredWidth(), view.getY() + jr5Var.e2 + 1.0f);
            canvas.drawColor(bm2.o(bkb.w0(null, bkb.c6, false), (int) (jr5Var.b2 * 255.0f)));
            int o = bm2.o(bkb.w0(null, bkb.c7, false), (int) (jr5Var.b2 * 255.0f));
            Paint paint = this.n;
            paint.setColor(o);
            canvas.drawRect(0.0f, view.getY() + jr5Var.e2, getMeasuredWidth(), view.getY() + jr5Var.e2 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vk9 vk9Var = this.s;
        if (vk9Var != null) {
            ((bac) vk9Var.b).b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.w.n2 && this.s == null) {
            this.s = new vk9(view);
        }
    }
}
