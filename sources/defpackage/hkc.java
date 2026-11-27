package defpackage;

import android.app.Activity;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class hkc extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final mkc e;

    public hkc(mkc mkcVar, Activity activity) {
        super(activity);
        this.e = mkcVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkc.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mkc mkcVar = this.e;
        xjc xjcVar = mkcVar.T0;
        if (motionEvent.getActionMasked() == 1) {
            mkcVar.E.b(false, false);
            mkcVar.w.a();
            hl.r(xjcVar);
            if (mkcVar.p0 == 3) {
                hl.d3(xjcVar, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hmc hmcVar;
        ug2 ug2Var;
        mkc mkcVar = this.e;
        xjc xjcVar = mkcVar.T0;
        if (motionEvent.getActionMasked() == 1) {
            mkcVar.E.b(false, false);
            mkcVar.w.a();
            hl.r(xjcVar);
            if (mkcVar.p0 == 3) {
                hl.d3(xjcVar, 10000L);
            }
        }
        if (!mkcVar.h1 && !mkcVar.a1 && !mkcVar.g1 && motionEvent.getActionMasked() != 0) {
            mkcVar.e();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            mkcVar.h1 = false;
            mkcVar.a1 = false;
            mkcVar.g1 = false;
        }
        if (mkcVar.m0) {
            hmcVar = mkcVar.d0;
        } else {
            hmcVar = mkcVar.e0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && mkcVar.a1) {
                int i = -1;
                int i2 = -1;
                for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                    if (mkcVar.d1 == motionEvent.getPointerId(i3)) {
                        i = i3;
                    }
                    if (mkcVar.e1 == motionEvent.getPointerId(i3)) {
                        i2 = i3;
                    }
                }
                if (i != -1 && i2 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i))) / mkcVar.X0;
                    mkcVar.f1 = hypot;
                    if (hypot > 1.005f && !mkcVar.g1) {
                        mkcVar.X0 = (float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i));
                        float x = (motionEvent.getX(i2) + motionEvent.getX(i)) / 2.0f;
                        mkcVar.b1 = x;
                        mkcVar.V0 = x;
                        float y = (motionEvent.getY(i2) + motionEvent.getY(i)) / 2.0f;
                        mkcVar.c1 = y;
                        mkcVar.W0 = y;
                        mkcVar.f1 = 1.0f;
                        mkcVar.Y0 = 0.0f;
                        mkcVar.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        mkcVar.g1 = true;
                        mkcVar.a1 = true;
                    }
                    float x2 = motionEvent.getX(i);
                    float y2 = motionEvent.getY(i);
                    float x3 = mkcVar.V0 - ((motionEvent.getX(i2) + x2) / 2.0f);
                    float y3 = mkcVar.W0 - ((motionEvent.getY(i2) + y2) / 2.0f);
                    float f = mkcVar.f1;
                    mkcVar.Y0 = (-x3) / f;
                    mkcVar.Z0 = (-y3) / f;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    mkcVar.e();
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((mkcVar.d1 == motionEvent.getPointerId(0) && mkcVar.e1 == motionEvent.getPointerId(1)) || (mkcVar.d1 == motionEvent.getPointerId(1) && mkcVar.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                mkcVar.e();
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = hl.P;
                rectF.set(hmcVar.getX(), hmcVar.getY(), hmcVar.getX() + hmcVar.getMeasuredWidth(), hmcVar.getY() + hmcVar.getMeasuredHeight());
                rectF.inset(((hmcVar.getMeasuredHeight() * hmcVar.U) - hmcVar.getMeasuredHeight()) / 2.0f, ((hmcVar.getMeasuredWidth() * hmcVar.U) - hmcVar.getMeasuredWidth()) / 2.0f);
                boolean z = j95.u5;
                float f2 = rectF.top;
                if (!z) {
                    rectF.top = Math.max(f2, a.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, hmcVar.getMeasuredHeight() - hl.L(90.0f));
                } else {
                    rectF.top = Math.max(f2, a.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, hmcVar.getMeasuredWidth() - hl.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                mkcVar.h1 = contains;
                if (!contains) {
                    mkcVar.e();
                }
            }
            if (mkcVar.h1 && !mkcVar.a1 && motionEvent.getPointerCount() == 2) {
                mkcVar.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x4 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                mkcVar.b1 = x4;
                mkcVar.V0 = x4;
                float y4 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                mkcVar.c1 = y4;
                mkcVar.W0 = y4;
                mkcVar.f1 = 1.0f;
                mkcVar.d1 = motionEvent.getPointerId(0);
                mkcVar.e1 = motionEvent.getPointerId(1);
                mkcVar.a1 = true;
            }
        }
        mkcVar.s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.c = false;
                }
            } else if (this.c) {
                float x5 = motionEvent.getX() - this.a;
                float y5 = motionEvent.getY() - this.b;
                long currentTimeMillis = System.currentTimeMillis();
                float f3 = (y5 * y5) + (x5 * x5);
                float f4 = mkcVar.t0;
                if (f3 < f4 * f4 && currentTimeMillis - this.d < 300 && currentTimeMillis - mkcVar.K0 > 300) {
                    mkcVar.K0 = System.currentTimeMillis();
                    if (mkcVar.C0) {
                        mkcVar.c(false);
                    } else if (mkcVar.z0) {
                        mkcVar.r(!mkcVar.x0);
                        mkcVar.q0 = mkcVar.p0;
                        if (!mkcVar.x0 && (ug2Var = mkcVar.N0) != null && ug2Var.W) {
                            ug2Var.f(true);
                        }
                        mkcVar.y();
                    }
                }
                this.c = false;
            }
        } else {
            this.a = motionEvent.getX();
            this.b = motionEvent.getY();
            this.c = true;
            this.d = System.currentTimeMillis();
        }
        if (!mkcVar.h1 && !this.c) {
            return false;
        }
        return true;
    }
}
