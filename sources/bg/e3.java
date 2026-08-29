package bg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import lh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jr;
public final class e3 extends k {
    public bv0 m0;
    public o8 f2178n0;
    public o8 f2179o0;
    public kg.h0 f2180p0;
    public kg.h0 f2181q0;
    public kg.q0 f2182r0;
    public d6 f2183s0;
    public d6 f2184t0;
    public boolean f2185u0;
    public float f2186v0;

    @Override
    public final j a() {
        d3 d3Var = new d3(this, getContext(), 0);
        d3Var.f2162r = new RectF();
        return d3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        bv0 bv0Var = this.m0;
        int padding = getPadding();
        float d = this.f2184t0.d(1.0f, false);
        if (d == 1.0f) {
            this.f2179o0 = null;
        }
        canvas.save();
        float f9 = this.f2186v0;
        canvas.scale(f9, f9, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        o8 o8Var = this.f2179o0;
        if (o8Var != null) {
            o8Var.f16030e = (int) ((1.0f - d) * 255.0f);
            o8Var.setBounds(padding, padding, ((int) bv0Var.f27238a) - padding, ((int) bv0Var.f27239b) - padding);
            this.f2179o0.draw(canvas);
        }
        o8 o8Var2 = this.f2178n0;
        o8Var2.f16030e = (int) (d * 255.0f);
        o8Var2.setBounds(padding, padding, ((int) bv0Var.f27238a) - padding, ((int) bv0Var.f27239b) - padding);
        this.f2178n0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.f2178n0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.f2178n0.getBounds().centerX() - width), (int) (this.f2178n0.getBounds().centerY() - width), (int) (this.f2178n0.getBounds().centerX() + width), (int) (this.f2178n0.getBounds().centerY() + width));
        float d10 = this.f2183s0.d(1.0f, false);
        this.f2180p0.c(rect);
        this.f2181q0.c(rect);
        kg.h0 h0Var = this.f2180p0;
        if (this.f2178n0.f16027a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        h0Var.d(i10);
        if (d10 == 1.0f) {
            this.f2180p0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - d10;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            kg.h0 h0Var2 = this.f2181q0;
            h0Var2.h = f10;
            h0Var2.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            kg.h0 h0Var3 = this.f2180p0;
            h0Var3.h = d10;
            h0Var3.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public kg.q0 getCurrentReaction() {
        return this.f2182r0;
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
        return (int) ((this.m0.f27239b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f9 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new hk0((getPositionX() - f9) * scaleX, (getPositionY() - f9) * scaleX, f10, f10);
    }

    @Override
    public final void k() {
        bv0 bv0Var = this.m0;
        setX(getPositionX() - (bv0Var.f27238a / 2.0f));
        setY(getPositionY() - (bv0Var.f27239b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2180p0.b(true);
        this.f2181q0.b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2180p0.b(false);
        this.f2181q0.b(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bv0 bv0Var = this.m0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) bv0Var.f27238a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) bv0Var.f27239b, 1073741824));
    }

    public final void q(boolean z10) {
        if (!z10) {
            this.f2178n0.a();
        } else {
            this.f2179o0 = this.f2178n0;
            o8 o8Var = new o8(this);
            this.f2178n0 = o8Var;
            if (this.f2179o0.f16027a != 1) {
                o8Var.a();
            }
            this.f2178n0.b(this.f2185u0, false);
            this.f2178n0.c(getScaleX());
            this.f2184t0.d(0.0f, true);
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f2185u0;
        this.f2185u0 = z11;
        if (!z10) {
            this.f2178n0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b3(0, this, zArr));
        ofFloat.addListener(new c3(0, this, zArr));
        ofFloat.setInterpolator(jr.f29801g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(kg.q0 q0Var, boolean z10) {
        if (Objects.equals(this.f2182r0, q0Var)) {
            return;
        }
        if (!z10) {
            this.f2182r0 = q0Var;
            this.f2180p0.e(q0Var);
            invalidate();
            return;
        }
        this.f2182r0 = q0Var;
        this.f2181q0.e(q0Var);
        kg.h0 h0Var = this.f2180p0;
        this.f2180p0 = this.f2181q0;
        this.f2181q0 = h0Var;
        this.f2183s0.d(0.0f, true);
        invalidate();
    }

    @Override
    public void setScaleX(float f9) {
        if (getScaleX() != f9) {
            super.setScaleX(f9);
            this.f2178n0.c(f9);
            invalidate();
        }
    }
}
