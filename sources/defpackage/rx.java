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
public final class rx extends ela implements dz0 {
    public final Paint m0;
    public final Paint n0;
    public final Paint o0;
    public final Paint p0;
    public final ln q0;
    public boolean r0;
    public final Path s0;
    public final RectF t0;
    public final RectF u0;
    public final Path v0;
    public boolean w0;
    public final sx x0;

    public rx(sx sxVar, Context context) {
        super(context, null);
        this.x0 = sxVar;
        this.m0 = new Paint(1);
        this.n0 = new Paint(1);
        this.o0 = new Paint(1);
        this.p0 = new Paint(1);
        new Paint(1);
        this.q0 = new ln(this, 0L, 420L, d53.h);
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
        sx sxVar = this.x0;
        o oVar = sxVar.L;
        if (this.r0) {
            return;
        }
        float min = Math.min(sxVar.x, 1.0f - sxVar.y);
        Paint paint = this.m0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - sxVar.J) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int x = sxVar.x() - gm.L(20.0f);
        if (x < a.getCurrentActionBarHeight() + gm.m && min > 0.95f) {
            z = true;
        } else {
            z = false;
        }
        if (sxVar.G != z) {
            sxVar.G = z;
            sxVar.u();
        }
        float d = this.q0.d(z);
        boolean z6 = sxVar.H;
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
            sxVar.H = z5;
            sxVar.r();
        }
        int U1 = gm.U1(Utilities.l(d), x, 0);
        float max = Math.max(1.0f - sxVar.x, sxVar.y) * sxVar.w();
        canvas.save();
        canvas.translate(getWidth() * sxVar.J, max);
        float f2 = U1;
        int height = getHeight();
        RectF rectF = this.t0;
        rectF.set(0.0f, f2, getWidth(), gm.L(16.0f) + height);
        float f3 = 1.0f - d;
        float L = gm.L(24.0f) * f3;
        int i4 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        if (i4 < 0) {
            Paint paint2 = this.n0;
            paint2.setColor(0);
            i = 0;
            z3 = z;
            f = 0.0f;
            paint2.setShadowLayer(gm.L(18.0f), 0.0f, -gm.L(3.0f), cmb.p1(min * 0.26f, -16777216));
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
        RectF rectF2 = gm.P;
        rectF2.set(rectF);
        rectF2.left = oVar.v0[i].getX();
        canvas.drawRect(rectF2, paint3);
        wu wuVar = oVar.i0;
        if (z3 && gm.L(20.0f) + x <= gm.m + oVar.K0) {
            z4 = true;
        } else {
            z4 = i;
        }
        wuVar.t0 = z4;
        if (d > 0.0f) {
            canvas.save();
            float U12 = gm.U1(d, gm.L(20.0f) + x + 1, i);
            canvas.translate(0.0f, U12);
            oVar.i0.a(canvas, hg9.v(20.0f, x, 1) - U12, d, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!gm.m0 && (!oVar.v0[0].e() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i4 < 0) {
            if (gm.B(sxVar.v()) < 0.721f) {
                i2 = -1;
            } else {
                i2 = -16777216;
            }
            int f4 = on2.f(d, cmb.p1(0.15f, i2), -16777216);
            Paint paint4 = this.p0;
            paint4.setColor(f4);
            paint4.setAlpha((int) (paint4.getAlpha() * f3));
            float width = getWidth() / 2.0f;
            float L2 = ((gm.L(20.0f) / 2.0f) + f2) - (gm.L(8.0f) * d);
            float U13 = gm.U1(d, gm.L(32.0f), gm.L(48.0f)) / 2.0f;
            rectF.set(width - U13, L2 - gm.L(2.0f), width + U13, L2 + gm.L(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int x;
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            sx sxVar = this.x0;
            if (sxVar.G) {
                x = 0;
            } else {
                x = sxVar.x();
            }
            if (y < x) {
                sxVar.a(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public RectF getRect() {
        int x;
        sx sxVar = this.x0;
        if (sxVar.G) {
            x = 0;
        } else {
            x = sxVar.x() - gm.L(20.0f);
        }
        float max = Math.max(1.0f - sxVar.x, sxVar.y) * sxVar.w();
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
        sx sxVar = this.x0;
        o oVar = sxVar.L;
        if (!oVar.Q0.w()) {
            m mVar = oVar.v0[0];
            if (mVar.b()) {
                z = !mVar.b.canScrollVertically(-1);
            } else {
                z = false;
            }
            if (z && f2 < -1000.0f) {
                sxVar.a(true);
            } else {
                sxVar.m(false, null);
            }
        }
        if (f != 0.0f || f2 != 0.0f) {
            gkb gkbVar = oVar.Q0;
            gm.r(gkbVar.f0);
            gkbVar.z = false;
        }
        this.w0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        boolean z;
        boolean z2;
        sx sxVar = this.x0;
        o oVar = sxVar.L;
        if (!sxVar.I) {
            if (i2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            sxVar.I = z2;
        }
        m mVar = oVar.v0[0];
        if (mVar.b()) {
            z = !mVar.b.canScrollVertically(-1);
        } else {
            z = false;
        }
        if (z && !oVar.Q0.w()) {
            iArr[1] = Math.min((int) (sxVar.w() * sxVar.y), i2);
            sxVar.y = Utilities.i(sxVar.y - (i2 / sxVar.w()), 1.0f, 0.0f);
            sxVar.A();
            sxVar.r();
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        gkb gkbVar = oVar.Q0;
        gm.r(gkbVar.f0);
        gkbVar.z = false;
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
        sx sxVar = this.x0;
        sxVar.I = false;
        if (!this.w0 && !sxVar.L.Q0.w()) {
            if (sxVar.y > 0.25f) {
                sxVar.a(true);
            } else {
                sxVar.m(false, null);
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
        gm.X1(rectF2, rectF, f, rectF2);
        sx sxVar = this.x0;
        o oVar = sxVar.L;
        float min = Math.min(sxVar.x, 1.0f - sxVar.y);
        float f3 = 1.0f - f;
        Paint paint = this.m0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - sxVar.J) * min * f3 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float U1 = gm.U1(f, gm.L(16.0f), gm.L(18.0f));
        int i = 0;
        int w0 = cmb.w0(null, cmb.c6, false);
        Paint paint2 = this.o0;
        paint2.setColor(w0);
        Path path = this.v0;
        path.rewind();
        path.addRoundRect(rectF2, U1, U1, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (sxVar.G) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                oVar.i0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float R1 = gm.R1(1.0f, 0.99f, f);
            float f4 = R1 - 1.0f;
            if (Math.abs(f4) > 0.01f) {
                canvas.scale(R1, R1, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f4) > 0.01f) {
                float f5 = 1.0f / R1;
                canvas.scale(f5, f5, rectF2.centerX(), rectF2.centerY());
            }
            float f6 = (-sxVar.x()) + rectF2.top;
            if (sxVar.G) {
                i = oVar.i0.getMeasuredHeight();
            }
            canvas.translate(0.0f, (i * f3) + f6);
            childAt.draw(canvas);
            canvas.restore();
        }
        return U1;
    }
}
