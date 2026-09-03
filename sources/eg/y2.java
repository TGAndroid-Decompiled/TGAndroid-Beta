package eg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import oh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.z5;
public final class y2 extends j {
    public jv0 f5565n0;
    public o8 f5566o0;
    public o8 f5567p0;
    public ng.h0 f5568q0;
    public ng.h0 f5569r0;
    public ng.q0 f5570s0;
    public z5 f5571t0;
    public z5 f5572u0;
    public boolean f5573v0;
    public float f5574w0;

    @Override
    public final i a() {
        x2 x2Var = new x2(this, getContext(), 0);
        x2Var.f5546r = new RectF();
        return x2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        jv0 jv0Var = this.f5565n0;
        int padding = getPadding();
        float d = this.f5572u0.d(1.0f, false);
        if (d == 1.0f) {
            this.f5567p0 = null;
        }
        canvas.save();
        float f10 = this.f5574w0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        o8 o8Var = this.f5567p0;
        if (o8Var != null) {
            o8Var.f17564e = (int) ((1.0f - d) * 255.0f);
            o8Var.setBounds(padding, padding, ((int) jv0Var.f28201a) - padding, ((int) jv0Var.f28202b) - padding);
            this.f5567p0.draw(canvas);
        }
        o8 o8Var2 = this.f5566o0;
        o8Var2.f17564e = (int) (d * 255.0f);
        o8Var2.setBounds(padding, padding, ((int) jv0Var.f28201a) - padding, ((int) jv0Var.f28202b) - padding);
        this.f5566o0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f5566o0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f5566o0.getBounds().centerX() - width), (int) (this.f5566o0.getBounds().centerY() - width), (int) (this.f5566o0.getBounds().centerX() + width), (int) (this.f5566o0.getBounds().centerY() + width));
        float d10 = this.f5571t0.d(1.0f, false);
        this.f5568q0.c(rect);
        this.f5569r0.c(rect);
        ng.h0 h0Var = this.f5568q0;
        if (this.f5566o0.f17561a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        h0Var.d(i10);
        if (d10 == 1.0f) {
            this.f5568q0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - d10;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            ng.h0 h0Var2 = this.f5569r0;
            h0Var2.h = f11;
            h0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            ng.h0 h0Var3 = this.f5568q0;
            h0Var3.h = d10;
            h0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ng.q0 getCurrentReaction() {
        return this.f5570s0;
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
        return (int) ((this.f5565n0.f28202b - AndroidUtilities.dp(84.0f)) / 2.0f);
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
        jv0 jv0Var = this.f5565n0;
        setX(getPositionX() - (jv0Var.f28201a / 2.0f));
        setY(getPositionY() - (jv0Var.f28202b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5568q0.b(true);
        this.f5569r0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5568q0.b(false);
        this.f5569r0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        jv0 jv0Var = this.f5565n0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) jv0Var.f28201a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) jv0Var.f28202b, 1073741824));
    }

    public final void q(boolean z4) {
        if (!z4) {
            this.f5566o0.a();
        } else {
            this.f5567p0 = this.f5566o0;
            o8 o8Var = new o8(this);
            this.f5566o0 = o8Var;
            if (this.f5567p0.f17561a != 1) {
                o8Var.a();
            }
            this.f5566o0.b(this.f5573v0, false);
            this.f5566o0.c(getScaleX());
            this.f5572u0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z4) {
        boolean z10 = !this.f5573v0;
        this.f5573v0 = z10;
        if (!z4) {
            this.f5566o0.b(z10, z4);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new bg.a(1, this, zArr));
        ofFloat.addListener(new w2(0, this, zArr));
        ofFloat.setInterpolator(pr.f30169g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ng.q0 q0Var, boolean z4) {
        if (Objects.equals(this.f5570s0, q0Var)) {
            return;
        }
        if (!z4) {
            this.f5570s0 = q0Var;
            this.f5568q0.e(q0Var);
            invalidate();
            return;
        }
        this.f5570s0 = q0Var;
        this.f5569r0.e(q0Var);
        ng.h0 h0Var = this.f5568q0;
        this.f5568q0 = this.f5569r0;
        this.f5569r0 = h0Var;
        this.f5571t0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.f5566o0.c(f10);
            invalidate();
        }
    }
}
