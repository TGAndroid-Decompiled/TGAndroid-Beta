package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class rw extends cja implements wx0 {
    public final Paint m0;
    public final Paint n0;
    public final Paint o0;
    public final Paint p0;
    public final lm q0;
    public boolean r0;
    public final Path s0;
    public final RectF t0;
    public final RectF u0;
    public final Path v0;
    public boolean w0;
    public final sw x0;

    public rw(sw swVar, Context context) {
        super(context, null);
        this.x0 = swVar;
        this.m0 = new Paint(1);
        this.n0 = new Paint(1);
        this.o0 = new Paint(1);
        this.p0 = new Paint(1);
        new Paint(1);
        this.q0 = new lm(this, 0L, 420L, s33.h);
        this.s0 = new Path();
        this.t0 = new RectF();
        this.u0 = new RectF();
        this.v0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        float f;
        boolean z4;
        int i2;
        boolean z5;
        sw swVar = this.x0;
        o oVar = swVar.L;
        if (this.r0) {
            return;
        }
        float min = Math.min(swVar.x, 1.0f - swVar.y);
        Paint paint = this.m0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - swVar.J) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int x = swVar.x() - gl.L(20.0f);
        if (x < a.getCurrentActionBarHeight() + gl.m && min > 0.95f) {
            z = true;
        } else {
            z = false;
        }
        if (swVar.G != z) {
            swVar.G = z;
            swVar.s();
        }
        float d = this.q0.d(z);
        boolean z6 = swVar.H;
        int i3 = (d > 0.999f ? 1 : (d == 0.999f ? 0 : -1));
        if (i3 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z6 != z2) {
            if (i3 >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            swVar.H = z5;
            swVar.r();
        }
        int U1 = gl.U1(Utilities.l(d), x, 0);
        float max = Math.max(1.0f - swVar.x, swVar.y) * swVar.w();
        canvas.save();
        canvas.translate(getWidth() * swVar.J, max);
        float f2 = U1;
        int height = getHeight();
        RectF rectF = this.t0;
        rectF.set(0.0f, f2, getWidth(), gl.L(16.0f) + height);
        float f3 = 1.0f - d;
        float L = gl.L(24.0f) * f3;
        int i4 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        if (i4 < 0) {
            Paint paint2 = this.n0;
            paint2.setColor(0);
            i = 0;
            z3 = z;
            f = 0.0f;
            paint2.setShadowLayer(gl.L(18.0f), 0.0f, -gl.L(3.0f), bkb.p1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, L, L, paint2);
        } else {
            z3 = z;
            i = 0;
            f = 0.0f;
        }
        if (L <= f) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.s0;
            path.rewind();
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = oVar.v0[1].getBackgroundColor();
        Paint paint3 = this.o0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(oVar.v0[i].getBackgroundColor());
        RectF rectF2 = gl.P;
        rectF2.set(rectF);
        rectF2.left = oVar.v0[i].getX();
        canvas.drawRect(rectF2, paint3);
        wt wtVar = oVar.i0;
        if (z3 && gl.L(20.0f) + x <= gl.m + oVar.K0) {
            z4 = true;
        } else {
            z4 = i;
        }
        wtVar.t0 = z4;
        if (d > 0.0f) {
            canvas.save();
            float U12 = gl.U1(d, gl.L(20.0f) + x + 1, i);
            canvas.translate(0.0f, U12);
            oVar.i0.a(canvas, de9.w(20.0f, x, 1) - U12, d, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!gl.m0 && (!oVar.v0[0].e() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i4 < 0) {
            if (gl.B(swVar.v()) < 0.721f) {
                i2 = -1;
            } else {
                i2 = -16777216;
            }
            int f4 = bm2.f(d, bkb.p1(0.15f, i2), -16777216);
            Paint paint4 = this.p0;
            paint4.setColor(f4);
            paint4.setAlpha((int) (paint4.getAlpha() * f3));
            float width = getWidth() / 2.0f;
            float L2 = ((gl.L(20.0f) / 2.0f) + f2) - (gl.L(8.0f) * d);
            float U13 = gl.U1(d, gl.L(32.0f), gl.L(48.0f)) / 2.0f;
            rectF.set(width - U13, L2 - gl.L(2.0f), width + U13, L2 + gl.L(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int x;
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            sw swVar = this.x0;
            if (swVar.G) {
                x = 0;
            } else {
                x = swVar.x();
            }
            if (y < x) {
                swVar.a(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public RectF getRect() {
        int x;
        sw swVar = this.x0;
        if (swVar.G) {
            x = 0;
        } else {
            x = swVar.x() - gl.L(20.0f);
        }
        float max = Math.max(1.0f - swVar.x, swVar.y) * swVar.w();
        RectF rectF = this.u0;
        rectF.set(0.0f, max + x, getWidth(), getHeight());
        return rectF;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.x0.A();
    }

    @Override
    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean z;
        boolean onNestedPreFling = super.onNestedPreFling(view, f, f2);
        sw swVar = this.x0;
        o oVar = swVar.L;
        if (!oVar.Q0.w()) {
            m mVar = oVar.v0[0];
            if (mVar.b()) {
                z = !mVar.b.canScrollVertically(-1);
            } else {
                z = false;
            }
            if (z && f2 < -1000.0f) {
                swVar.a(true);
            } else {
                swVar.m(false, null);
            }
        }
        if (f != 0.0f || f2 != 0.0f) {
            fib fibVar = oVar.Q0;
            gl.r(fibVar.f0);
            fibVar.z = false;
        }
        this.w0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        boolean z;
        boolean z2;
        sw swVar = this.x0;
        o oVar = swVar.L;
        if (!swVar.I) {
            if (i2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            swVar.I = z2;
        }
        m mVar = oVar.v0[0];
        if (mVar.b()) {
            z = !mVar.b.canScrollVertically(-1);
        } else {
            z = false;
        }
        if (z && !oVar.Q0.w()) {
            iArr[1] = Math.min((int) (swVar.w() * swVar.y), i2);
            swVar.y = Utilities.i(swVar.y - (i2 / swVar.w()), 1.0f, 0.0f);
            swVar.A();
            swVar.r();
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        fib fibVar = oVar.Q0;
        gl.r(fibVar.f0);
        fibVar.z = false;
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        this.w0 = false;
        if (i != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        sw swVar = this.x0;
        swVar.I = false;
        if (!this.w0 && !swVar.L.Q0.w()) {
            if (swVar.y > 0.25f) {
                swVar.a(true);
            } else {
                swVar.m(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override
    public void setDrawingFromOverlay(boolean z) {
        if (this.r0 != z) {
            this.r0 = z;
            invalidate();
        }
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
        rectF2.set(getRect());
        gl.X1(rectF2, rectF, f, rectF2);
        sw swVar = this.x0;
        o oVar = swVar.L;
        float min = Math.min(swVar.x, 1.0f - swVar.y);
        float f3 = 1.0f - f;
        Paint paint = this.m0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - swVar.J) * min * f3 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float U1 = gl.U1(f, gl.L(16.0f), gl.L(18.0f));
        int i = 0;
        int w0 = bkb.w0(null, bkb.c6, false);
        Paint paint2 = this.o0;
        paint2.setColor(w0);
        Path path = this.v0;
        path.rewind();
        path.addRoundRect(rectF2, U1, U1, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (swVar.G) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                oVar.i0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float R1 = gl.R1(1.0f, 0.99f, f);
            float f4 = R1 - 1.0f;
            if (Math.abs(f4) > 0.01f) {
                canvas.scale(R1, R1, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f4) > 0.01f) {
                float f5 = 1.0f / R1;
                canvas.scale(f5, f5, rectF2.centerX(), rectF2.centerY());
            }
            float f6 = (-swVar.x()) + rectF2.top;
            if (swVar.G) {
                i = oVar.i0.getMeasuredHeight();
            }
            canvas.translate(0.0f, (i * f3) + f6);
            childAt.draw(canvas);
            canvas.restore();
        }
        return U1;
    }
}
