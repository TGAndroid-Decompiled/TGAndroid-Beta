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
public final class sw extends wma implements ey0 {
    public final Paint g0;
    public final Paint h0;
    public final Paint i0;
    public final Paint j0;
    public final mm k0;
    public boolean l0;
    public final Path m0;
    public final RectF n0;
    public final RectF o0;
    public final Path p0;
    public boolean q0;
    public final tw r0;

    public sw(tw twVar, Context context) {
        super(context, null);
        this.r0 = twVar;
        this.g0 = new Paint(1);
        this.h0 = new Paint(1);
        this.i0 = new Paint(1);
        this.j0 = new Paint(1);
        new Paint(1);
        this.k0 = new mm(this, 0L, 420L, k43.h);
        this.m0 = new Path();
        this.n0 = new RectF();
        this.o0 = new RectF();
        this.p0 = new Path();
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
        tw twVar = this.r0;
        o oVar = twVar.L;
        if (this.l0) {
            return;
        }
        float min = Math.min(twVar.x, 1.0f - twVar.y);
        Paint paint = this.g0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - twVar.J) * 96.0f * min));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int x = twVar.x() - hl.L(20.0f);
        if (x < a.getCurrentActionBarHeight() + hl.m && min > 0.95f) {
            z = true;
        } else {
            z = false;
        }
        if (twVar.G != z) {
            twVar.G = z;
            twVar.t();
        }
        float d = this.k0.d(z);
        boolean z6 = twVar.H;
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
            twVar.H = z5;
            twVar.r();
        }
        int U1 = hl.U1(Utilities.l(d), x, 0);
        float max = Math.max(1.0f - twVar.x, twVar.y) * twVar.w();
        canvas.save();
        canvas.translate(getWidth() * twVar.J, max);
        float f2 = U1;
        int height = getHeight();
        RectF rectF = this.n0;
        rectF.set(0.0f, f2, getWidth(), hl.L(16.0f) + height);
        float f3 = 1.0f - d;
        float L = hl.L(24.0f) * f3;
        int i4 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        if (i4 < 0) {
            Paint paint2 = this.h0;
            paint2.setColor(0);
            i = 0;
            z3 = z;
            f = 0.0f;
            paint2.setShadowLayer(hl.L(18.0f), 0.0f, -hl.L(3.0f), aob.p1(min * 0.26f, -16777216));
            canvas.drawRoundRect(rectF, L, L, paint2);
        } else {
            z3 = z;
            i = 0;
            f = 0.0f;
        }
        if (L <= f) {
            canvas.clipRect(rectF);
        } else {
            Path path = this.m0;
            path.rewind();
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            canvas.clipPath(path);
        }
        int backgroundColor = oVar.v0[1].getBackgroundColor();
        Paint paint3 = this.i0;
        paint3.setColor(backgroundColor);
        canvas.drawRect(rectF, paint3);
        paint3.setColor(oVar.v0[i].getBackgroundColor());
        RectF rectF2 = hl.P;
        rectF2.set(rectF);
        rectF2.left = oVar.v0[i].getX();
        canvas.drawRect(rectF2, paint3);
        xt xtVar = oVar.i0;
        if (z3 && hl.L(20.0f) + x <= hl.m + oVar.K0) {
            z4 = true;
        } else {
            z4 = i;
        }
        xtVar.t0 = z4;
        if (d > 0.0f) {
            canvas.save();
            float U12 = hl.U1(d, hl.L(20.0f) + x + 1, i);
            canvas.translate(0.0f, U12);
            oVar.i0.a(canvas, uh9.w(20.0f, x, 1) - U12, d, true);
            canvas.restore();
        }
        canvas.translate(0.0f, -max);
        if (!hl.m0 && (!oVar.v0[0].e() || canvas.isHardwareAccelerated())) {
            super.dispatchDraw(canvas);
        }
        canvas.translate(0.0f, max);
        if (i4 < 0) {
            if (hl.B(twVar.v()) < 0.721f) {
                i2 = -1;
            } else {
                i2 = -16777216;
            }
            int f4 = vm2.f(d, aob.p1(0.15f, i2), -16777216);
            Paint paint4 = this.j0;
            paint4.setColor(f4);
            paint4.setAlpha((int) (paint4.getAlpha() * f3));
            float width = getWidth() / 2.0f;
            float L2 = ((hl.L(20.0f) / 2.0f) + f2) - (hl.L(8.0f) * d);
            float U13 = hl.U1(d, hl.L(32.0f), hl.L(48.0f)) / 2.0f;
            rectF.set(width - U13, L2 - hl.L(2.0f), width + U13, L2 + hl.L(2.0f));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint4);
        }
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int x;
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            tw twVar = this.r0;
            if (twVar.G) {
                x = 0;
            } else {
                x = twVar.x();
            }
            if (y < x) {
                twVar.a(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public RectF getRect() {
        int x;
        tw twVar = this.r0;
        if (twVar.G) {
            x = 0;
        } else {
            x = twVar.x() - hl.L(20.0f);
        }
        float max = Math.max(1.0f - twVar.x, twVar.y) * twVar.w();
        RectF rectF = this.o0;
        rectF.set(0.0f, max + x, getWidth(), getHeight());
        return rectF;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.r0.A();
    }

    @Override
    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean z;
        boolean onNestedPreFling = super.onNestedPreFling(view, f, f2);
        tw twVar = this.r0;
        o oVar = twVar.L;
        if (!oVar.Q0.w()) {
            m mVar = oVar.v0[0];
            if (mVar.b()) {
                z = !mVar.b.canScrollVertically(-1);
            } else {
                z = false;
            }
            if (z && f2 < -1000.0f) {
                twVar.a(true);
            } else {
                twVar.m(false, null);
            }
        }
        if (f != 0.0f || f2 != 0.0f) {
            amb ambVar = oVar.Q0;
            hl.r(ambVar.f0);
            ambVar.z = false;
        }
        this.q0 = true;
        return onNestedPreFling;
    }

    @Override
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        boolean z;
        boolean z2;
        tw twVar = this.r0;
        o oVar = twVar.L;
        if (!twVar.I) {
            if (i2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            twVar.I = z2;
        }
        m mVar = oVar.v0[0];
        if (mVar.b()) {
            z = !mVar.b.canScrollVertically(-1);
        } else {
            z = false;
        }
        if (z && !oVar.Q0.w()) {
            iArr[1] = Math.min((int) (twVar.w() * twVar.y), i2);
            twVar.y = Utilities.i(twVar.y - (i2 / twVar.w()), 1.0f, 0.0f);
            twVar.A();
            twVar.r();
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        amb ambVar = oVar.Q0;
        hl.r(ambVar.f0);
        ambVar.z = false;
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        this.q0 = false;
        if (i != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        tw twVar = this.r0;
        twVar.I = false;
        if (!this.q0 && !twVar.L.Q0.w()) {
            if (twVar.y > 0.25f) {
                twVar.a(true);
            } else {
                twVar.m(false, null);
            }
        }
        super.onStopNestedScroll(view);
    }

    @Override
    public void setDrawingFromOverlay(boolean z) {
        if (this.l0 != z) {
            this.l0 = z;
            invalidate();
        }
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
        rectF2.set(getRect());
        hl.X1(rectF2, rectF, f, rectF2);
        tw twVar = this.r0;
        o oVar = twVar.L;
        float min = Math.min(twVar.x, 1.0f - twVar.y);
        float f3 = 1.0f - f;
        Paint paint = this.g0;
        paint.setColor(-16777216);
        paint.setAlpha((int) ((1.0f - twVar.J) * min * f3 * 96.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float U1 = hl.U1(f, hl.L(16.0f), hl.L(18.0f));
        int i = 0;
        int w0 = aob.w0(null, aob.d6, false);
        Paint paint2 = this.i0;
        paint2.setColor(w0);
        Path path = this.p0;
        path.rewind();
        path.addRoundRect(rectF2, U1, U1, Path.Direction.CW);
        canvas.drawPath(path, paint2);
        if (getChildCount() == 1) {
            if (twVar.G) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(0.0f, rectF2.top);
                oVar.i0.draw(canvas);
                canvas.restore();
            }
            View childAt = getChildAt(0);
            canvas.save();
            float R1 = hl.R1(1.0f, 0.99f, f);
            float f4 = R1 - 1.0f;
            if (Math.abs(f4) > 0.01f) {
                canvas.scale(R1, R1, rectF2.centerX(), rectF2.centerY());
            }
            canvas.clipPath(path);
            if (Math.abs(f4) > 0.01f) {
                float f5 = 1.0f / R1;
                canvas.scale(f5, f5, rectF2.centerX(), rectF2.centerY());
            }
            float f6 = (-twVar.x()) + rectF2.top;
            if (twVar.G) {
                i = oVar.i0.getMeasuredHeight();
            }
            canvas.translate(0.0f, (i * f3) + f6);
            childAt.draw(canvas);
            canvas.restore();
        }
        return U1;
    }
}
