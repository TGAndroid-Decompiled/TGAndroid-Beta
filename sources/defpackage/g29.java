package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
public final class g29 extends w44 {
    public boolean A0;
    public float B0;
    public xka s0;
    public d8b t0;
    public d8b u0;
    public d29 v0;
    public d29 w0;
    public k39 x0;
    public ln y0;
    public ln z0;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        xka xkaVar = this.s0;
        int padding = getPadding();
        float e = this.z0.e(false, 1.0f);
        if (e == 1.0f) {
            this.u0 = null;
        }
        canvas.save();
        float f = this.B0;
        canvas.scale(f, f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        d8b d8bVar = this.u0;
        if (d8bVar != null) {
            d8bVar.e = (int) ((1.0f - e) * 255.0f);
            d8bVar.setBounds(padding, padding, ((int) xkaVar.a) - padding, ((int) xkaVar.b) - padding);
            this.u0.draw(canvas);
        }
        d8b d8bVar2 = this.t0;
        d8bVar2.e = (int) (e * 255.0f);
        d8bVar2.setBounds(padding, padding, ((int) xkaVar.a) - padding, ((int) xkaVar.b) - padding);
        this.t0.draw(canvas);
        Rect rect = gm.Q;
        float width = (this.t0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.t0.getBounds().centerX() - width), (int) (this.t0.getBounds().centerY() - width), (int) (this.t0.getBounds().centerX() + width), (int) (this.t0.getBounds().centerY() + width));
        float e2 = this.y0.e(false, 1.0f);
        this.v0.c(rect);
        this.w0.c(rect);
        d29 d29Var = this.v0;
        if (this.t0.a == 1) {
            i = -1;
        } else {
            i = -16777216;
        }
        d29Var.d(i);
        if (e2 == 1.0f) {
            this.v0.a(canvas);
        } else {
            canvas.save();
            float f2 = 1.0f - e2;
            canvas.scale(f2, f2, rect.centerX(), rect.top);
            d29 d29Var2 = this.w0;
            d29Var2.h = f2;
            d29Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e2, e2, rect.centerX(), rect.bottom);
            d29 d29Var3 = this.v0;
            d29Var3.h = e2;
            d29Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public k39 getCurrentReaction() {
        return this.x0;
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
        return (int) ((this.s0.b - gm.L(84.0f)) / 2.0f);
    }

    @Override
    public o49 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f = scale / 2.0f;
        float f2 = scale * scaleX;
        return new o49((getPositionX() - f) * scaleX, (getPositionY() - f) * scaleX, f2, f2);
    }

    @Override
    public final void k() {
        xka xkaVar = this.s0;
        setX(getPositionX() - (xkaVar.a / 2.0f));
        setY(getPositionY() - (xkaVar.b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v0.b(true);
        this.w0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.b(false);
        this.w0.b(false);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        xka xkaVar = this.s0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) xkaVar.a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) xkaVar.b, 1073741824));
    }

    public final void q(boolean z) {
        d8b d8bVar = this.t0;
        if (!z) {
            d8bVar.a();
        } else {
            this.u0 = d8bVar;
            d8b d8bVar2 = new d8b(this);
            this.t0 = d8bVar2;
            if (this.u0.a != 1) {
                d8bVar2.a();
            }
            this.t0.b(this.A0, false);
            this.t0.c(getScaleX());
            this.z0.e(true, 0.0f);
        }
        invalidate();
    }

    public final void r(boolean z) {
        boolean z2 = !this.A0;
        this.A0 = z2;
        if (!z) {
            this.t0.b(z2, z);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new pl(this, zArr, (byte) 23));
        ofFloat.addListener(new ic8(this, zArr, (byte) 5));
        ofFloat.setInterpolator(d53.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(k39 k39Var, boolean z) {
        if (Objects.equals(this.x0, k39Var)) {
            return;
        }
        if (!z) {
            this.x0 = k39Var;
            this.v0.e(k39Var);
            invalidate();
            return;
        }
        this.x0 = k39Var;
        this.w0.e(k39Var);
        d29 d29Var = this.v0;
        this.v0 = this.w0;
        this.w0 = d29Var;
        this.y0.e(true, 0.0f);
        invalidate();
    }

    @Override
    public void setScaleX(float f) {
        if (getScaleX() != f) {
            super.setScaleX(f);
            this.t0.c(f);
            invalidate();
        }
    }
}
