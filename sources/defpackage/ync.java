package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class ync extends nv4 {
    public boolean A0;
    public ValueAnimator B0;
    public TL_wallet.nftItem x0;
    public koc y0;
    public float z0;

    @Override
    public final void b(zr5 zr5Var, Canvas canvas, float f, float f2, float f3) {
        if (this.z0 == 1.0f) {
            super.b(zr5Var, canvas, f, f2, f3);
            return;
        }
        canvas.save();
        float f4 = this.z0;
        canvas.scale(f4, f4, f / 2.0f, f2 / 2.0f);
        super.b(zr5Var, canvas, f, f2, f3);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.z0 == 1.0f) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float f = this.z0;
        canvas.scale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        koc kocVar;
        float f;
        float l;
        float f2;
        int i;
        float f3;
        float f4;
        boolean drawChild = super.drawChild(canvas, view, j);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (kocVar = this.y0) != null) {
            RectF rectF = kocVar.I;
            Paint paint = kocVar.y;
            joc jocVar = kocVar.l1;
            if (this == kocVar.m1 && jocVar != null && jocVar.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float l2 = Utilities.l(kocVar.q1.a);
                float[] D = kocVar.D(kocVar.o1 % 2.0f);
                float f5 = D[0] * l2;
                float f6 = D[1] * l2;
                float f7 = D[2] * l2;
                int left = frameLayout.getLeft();
                be0 be0Var = this.E;
                float left2 = be0Var.getLeft() + left + (be0Var.getWidth() / 2.0f);
                float height = (be0Var.getHeight() / 2.0f) + be0Var.getTop() + frameLayout.getTop();
                float B = yjb.B(f7, 0.025f, (0.07f * f6) + 1.0f, (be0Var.getWidth() * 288) / 268.0f);
                if (f6 > 0.01f && jocVar.w != null) {
                    float f8 = ((176.0f * B) / 128.0f) / 2.0f;
                    float L = (gl.L(2.0f) * f6) + height;
                    f = 0.01f;
                    rectF.set(left2 - f8, L - f8, left2 + f8, L + f8);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f6));
                    canvas.drawBitmap(jocVar.w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                } else {
                    f = 0.01f;
                }
                if (jocVar.u == null) {
                    l = 0.0f;
                } else {
                    l = Utilities.l(1.4f * f6);
                }
                float L2 = height - (gl.L(5.0f) * f6);
                float f9 = f6 * (-5.0f);
                if (l < 0.99f) {
                    paint.setAlpha(255);
                    f3 = L2;
                    f4 = f9;
                    f2 = B;
                    i = 255;
                    kocVar.r(canvas, jocVar.v, left2, f3, f2, f5, 1.0f, f4, 0.24f, 0.97f);
                } else {
                    f2 = B;
                    i = 255;
                    f3 = L2;
                    f4 = f9;
                }
                if (l > f) {
                    paint.setAlpha((int) (l * 255.0f));
                    kocVar.r(canvas, jocVar.u, left2, f3, f2, f5, 1.0f, f4, 0.24f, 0.97f);
                }
                paint.setAlpha(i);
            }
        }
        return drawChild;
    }

    @Override
    public final void drawableStateChanged() {
        OvershootInterpolator overshootInterpolator;
        float f;
        long j;
        super.drawableStateChanged();
        if (isPressed() == this.A0) {
            return;
        }
        boolean isPressed = isPressed();
        this.A0 = isPressed;
        if (isPressed) {
            f = 0.96f;
            j = 80;
            overshootInterpolator = null;
        } else {
            overshootInterpolator = new OvershootInterpolator(1.5f);
            f = 1.0f;
            j = 350;
        }
        m(f, j, overshootInterpolator);
    }

    public final void m(float f, long j, OvershootInterpolator overshootInterpolator) {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z0, f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new uwb(this, (byte) 13));
        if (overshootInterpolator != null) {
            this.B0.setInterpolator(overshootInterpolator);
        }
        this.B0.setDuration(j);
        this.B0.start();
    }

    public final void n(float f) {
        this.z0 = f;
        invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void o() {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.z0 == 1.0f) {
            return;
        }
        setScaleX(getScaleX() * this.z0);
        setScaleY(getScaleY() * this.z0);
        n(1.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        koc kocVar = this.y0;
        if (kocVar != null) {
            kocVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        koc kocVar = this.y0;
        if (kocVar != null) {
            kocVar.h.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        xk2.W = getMeasuredHeight();
    }
}
