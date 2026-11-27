package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class nw9 extends View {
    public mw9 a;
    public final mm b;
    public final jl0 c;
    public w49 d;
    public boolean e;
    public final Path f;
    public final RectF h;
    public final RectF n;
    public boolean r;
    public final ow9 s;

    public nw9(ow9 ow9Var, Context context) {
        super(context);
        this.s = ow9Var;
        this.b = new mm(this, 0L, 260L, k43.h);
        this.f = new Path();
        this.h = new RectF();
        this.n = new RectF();
        iye.a(this);
        ll0 ll0Var = ow9Var.w;
        if (ll0Var != null) {
            jl0 c = ll0Var.c(this, null, false);
            c.p(ow9Var.x);
            c.u(hl.L(5.0f));
            c.s = false;
            hl0 hl0Var = c.h0;
            if (hl0Var != null) {
                hl0Var.g(false);
            }
            ik8.r(c, hl.L(6.0f), 4.0f);
            this.c = c;
        }
    }

    public final void a(boolean z, boolean z2) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        mw9 mw9Var = this.a;
        if (mw9Var != null) {
            mw9Var.o = z;
            mm mmVar = this.b;
            if (z2) {
                mw9Var.h = mw9Var.M;
                mw9Var.f = mw9Var.N;
                mw9Var.g = mw9Var.O;
                mmVar.e(true, 0.0f);
            } else {
                mmVar.e(true, 1.0f);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.r) {
            mw9 mw9Var = this.a;
            if (mw9Var != null) {
                mw9Var.a();
            }
            this.r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r) {
            mw9 mw9Var = this.a;
            if (mw9Var != null) {
                mw9Var.b();
            }
            this.r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        ow9 ow9Var = this.s;
        Paint paint = ow9Var.y;
        int width = (getWidth() - this.a.z) / 2;
        int height = getHeight();
        mw9 mw9Var = this.a;
        int i2 = mw9Var.A;
        int i3 = (height - i2) / 2;
        jl0 jl0Var = this.c;
        if (jl0Var != null) {
            Rect rect = hl.Q;
            rect.set(width, i3, mw9Var.z + width, i2 + i3);
            RectF rectF = this.n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f;
            if (!equals) {
                rectF2.set(rectF);
                x49.h(rectF2, rectF, path);
            }
            rect.inset(-hl.L(4.0f), -hl.L(4.0f));
            rect.right = hl.L(1.0f) + rect.right;
            jl0Var.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            jl0Var.draw(canvas);
            vnb vnbVar = ow9Var.c;
            if (vnbVar == null ? aob.I.o() : vnbVar.a()) {
                i = 687865855;
            } else {
                i = -1;
            }
            paint.setColor(i);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.a.d(canvas, width, i3, this.b.e(false, 1.0f), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        int L2 = hl.L(8.67f);
        mw9 mw9Var = this.a;
        if (mw9Var != null) {
            L = mw9Var.z;
        } else {
            L = hl.L(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L2 + L, 1073741824), i2);
    }
}
