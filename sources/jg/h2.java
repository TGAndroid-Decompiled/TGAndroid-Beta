package jg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.t5;
import th.u6;
public final class h2 extends j {
    public pu0 f9996q0;
    public u6 f9997r0;
    public u6 f9998s0;
    public sg.f0 f9999t0;
    public sg.f0 f10000u0;
    public sg.o0 f10001v0;
    public t5 f10002w0;
    public t5 f10003x0;
    public boolean f10004y0;
    public float f10005z0;

    @Override
    public final i a() {
        g2 g2Var = new g2(this, getContext(), 0);
        g2Var.f9982r = new RectF();
        return g2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        pu0 pu0Var = this.f9996q0;
        int padding = getPadding();
        float e = this.f10003x0.e(false, 1.0f);
        if (e == 1.0f) {
            this.f9998s0 = null;
        }
        canvas.save();
        float f7 = this.f10005z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        u6 u6Var = this.f9998s0;
        if (u6Var != null) {
            u6Var.e = (int) ((1.0f - e) * 255.0f);
            u6Var.setBounds(padding, padding, ((int) pu0Var.f29435a) - padding, ((int) pu0Var.f29436b) - padding);
            this.f9998s0.draw(canvas);
        }
        u6 u6Var2 = this.f9997r0;
        u6Var2.e = (int) (e * 255.0f);
        u6Var2.setBounds(padding, padding, ((int) pu0Var.f29435a) - padding, ((int) pu0Var.f29436b) - padding);
        this.f9997r0.draw(canvas);
        Rect rect = org.telegram.messenger.i0.Q;
        float width = (this.f9997r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f9997r0.getBounds().centerX() - width), (int) (this.f9997r0.getBounds().centerY() - width), (int) (this.f9997r0.getBounds().centerX() + width), (int) (this.f9997r0.getBounds().centerY() + width));
        float e7 = this.f10002w0.e(false, 1.0f);
        this.f9999t0.c(rect);
        this.f10000u0.c(rect);
        sg.f0 f0Var = this.f9999t0;
        if (this.f9997r0.f49523a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        f0Var.d(i10);
        if (e7 == 1.0f) {
            this.f9999t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - e7;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            sg.f0 f0Var2 = this.f10000u0;
            f0Var2.h = f10;
            f0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e7, e7, rect.centerX(), rect.bottom);
            sg.f0 f0Var3 = this.f9999t0;
            f0Var3.h = e7;
            f0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public sg.o0 getCurrentReaction() {
        return this.f10001v0;
    }

    @Override
    public float getMaxScale() {
        return 1.8f;
    }

    @Override
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.f9996q0.f29436b - org.telegram.messenger.i0.L(84.0f)) / 2.0f);
    }

    @Override
    public oj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new oj0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        pu0 pu0Var = this.f9996q0;
        setX(getPositionX() - (pu0Var.f29435a / 2.0f));
        setY(getPositionY() - (pu0Var.f29436b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9999t0.b(true);
        this.f10000u0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9999t0.b(false);
        this.f10000u0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        pu0 pu0Var = this.f9996q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) pu0Var.f29435a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) pu0Var.f29436b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f9997r0.a();
        } else {
            this.f9998s0 = this.f9997r0;
            u6 u6Var = new u6(this);
            this.f9997r0 = u6Var;
            if (this.f9998s0.f49523a != 1) {
                u6Var.a();
            }
            this.f9997r0.b(this.f10004y0, false);
            this.f9997r0.c(getScaleX());
            this.f10003x0.e(true, 0.0f);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f10004y0;
        this.f10004y0 = z11;
        if (!z10) {
            this.f9997r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ag.p2(7, this, zArr));
        ofFloat.addListener(new bg.f(4, this, zArr));
        ofFloat.setInterpolator(gr.f26496g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(sg.o0 o0Var, boolean z10) {
        if (Objects.equals(this.f10001v0, o0Var)) {
            return;
        }
        if (!z10) {
            this.f10001v0 = o0Var;
            this.f9999t0.e(o0Var);
            invalidate();
            return;
        }
        this.f10001v0 = o0Var;
        this.f10000u0.e(o0Var);
        sg.f0 f0Var = this.f9999t0;
        this.f9999t0 = this.f10000u0;
        this.f10000u0 = f0Var;
        this.f10002w0.e(true, 0.0f);
        invalidate();
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.f9997r0.c(f7);
            invalidate();
        }
    }
}
