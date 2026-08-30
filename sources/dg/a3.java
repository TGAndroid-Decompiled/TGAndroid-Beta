package dg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import nh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.z5;
public final class a3 extends j {
    public jv0 f4363n0;
    public o8 f4364o0;
    public o8 f4365p0;
    public mg.h0 f4366q0;
    public mg.h0 f4367r0;
    public mg.q0 f4368s0;
    public z5 f4369t0;
    public z5 f4370u0;
    public boolean f4371v0;
    public float f4372w0;

    @Override
    public final i a() {
        z2 z2Var = new z2(this, getContext(), 0);
        z2Var.f4878r = new RectF();
        return z2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        jv0 jv0Var = this.f4363n0;
        int padding = getPadding();
        float d = this.f4370u0.d(1.0f, false);
        if (d == 1.0f) {
            this.f4365p0 = null;
        }
        canvas.save();
        float f10 = this.f4372w0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        o8 o8Var = this.f4365p0;
        if (o8Var != null) {
            o8Var.e = (int) ((1.0f - d) * 255.0f);
            o8Var.setBounds(padding, padding, ((int) jv0Var.f26052a) - padding, ((int) jv0Var.f26053b) - padding);
            this.f4365p0.draw(canvas);
        }
        o8 o8Var2 = this.f4364o0;
        o8Var2.e = (int) (d * 255.0f);
        o8Var2.setBounds(padding, padding, ((int) jv0Var.f26052a) - padding, ((int) jv0Var.f26053b) - padding);
        this.f4364o0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f4364o0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f4364o0.getBounds().centerX() - width), (int) (this.f4364o0.getBounds().centerY() - width), (int) (this.f4364o0.getBounds().centerX() + width), (int) (this.f4364o0.getBounds().centerY() + width));
        float d10 = this.f4369t0.d(1.0f, false);
        this.f4366q0.c(rect);
        this.f4367r0.c(rect);
        mg.h0 h0Var = this.f4366q0;
        if (this.f4364o0.f15713a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        h0Var.d(i10);
        if (d10 == 1.0f) {
            this.f4366q0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - d10;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            mg.h0 h0Var2 = this.f4367r0;
            h0Var2.h = f11;
            h0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            mg.h0 h0Var3 = this.f4366q0;
            h0Var3.h = d10;
            h0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public mg.q0 getCurrentReaction() {
        return this.f4368s0;
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
        return (int) ((this.f4363n0.f26053b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public sk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new sk0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override
    public final void k() {
        jv0 jv0Var = this.f4363n0;
        setX(getPositionX() - (jv0Var.f26052a / 2.0f));
        setY(getPositionY() - (jv0Var.f26053b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4366q0.b(true);
        this.f4367r0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4366q0.b(false);
        this.f4367r0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        jv0 jv0Var = this.f4363n0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) jv0Var.f26052a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) jv0Var.f26053b, 1073741824));
    }

    public final void q(boolean z4) {
        if (!z4) {
            this.f4364o0.a();
        } else {
            this.f4365p0 = this.f4364o0;
            o8 o8Var = new o8(this);
            this.f4364o0 = o8Var;
            if (this.f4365p0.f15713a != 1) {
                o8Var.a();
            }
            this.f4364o0.b(this.f4371v0, false);
            this.f4364o0.c(getScaleX());
            this.f4370u0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z4) {
        boolean z10 = !this.f4371v0;
        this.f4371v0 = z10;
        if (!z4) {
            this.f4364o0.b(z10, z4);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ag.a(1, this, zArr));
        ofFloat.addListener(new y2(0, this, zArr));
        ofFloat.setInterpolator(nr.f27347g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(mg.q0 q0Var, boolean z4) {
        if (Objects.equals(this.f4368s0, q0Var)) {
            return;
        }
        if (!z4) {
            this.f4368s0 = q0Var;
            this.f4366q0.e(q0Var);
            invalidate();
            return;
        }
        this.f4368s0 = q0Var;
        this.f4367r0.e(q0Var);
        mg.h0 h0Var = this.f4366q0;
        this.f4366q0 = this.f4367r0;
        this.f4367r0 = h0Var;
        this.f4369t0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.f4364o0.c(f10);
            invalidate();
        }
    }
}
