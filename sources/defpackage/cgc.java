package defpackage;

import android.app.Activity;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class cgc extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final hgc e;

    public cgc(hgc hgcVar, Activity activity) {
        super(activity);
        this.e = hgcVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgc.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hgc hgcVar = this.e;
        sfc sfcVar = hgcVar.T0;
        if (motionEvent.getActionMasked() == 1) {
            hgcVar.E.b(false, false);
            hgcVar.w.a();
            gl.r(sfcVar);
            if (hgcVar.p0 == 3) {
                gl.d3(sfcVar, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        aic aicVar;
        cg2 cg2Var;
        hgc hgcVar = this.e;
        sfc sfcVar = hgcVar.T0;
        if (motionEvent.getActionMasked() == 1) {
            hgcVar.E.b(false, false);
            hgcVar.w.a();
            gl.r(sfcVar);
            if (hgcVar.p0 == 3) {
                gl.d3(sfcVar, 10000L);
            }
        }
        if (!hgcVar.h1 && !hgcVar.a1 && !hgcVar.g1 && motionEvent.getActionMasked() != 0) {
            hgcVar.e();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            hgcVar.h1 = false;
            hgcVar.a1 = false;
            hgcVar.g1 = false;
        }
        if (hgcVar.m0) {
            aicVar = hgcVar.d0;
        } else {
            aicVar = hgcVar.e0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && hgcVar.a1) {
                int i = -1;
                int i2 = -1;
                for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                    if (hgcVar.d1 == motionEvent.getPointerId(i3)) {
                        i = i3;
                    }
                    if (hgcVar.e1 == motionEvent.getPointerId(i3)) {
                        i2 = i3;
                    }
                }
                if (i != -1 && i2 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i))) / hgcVar.X0;
                    hgcVar.f1 = hypot;
                    if (hypot > 1.005f && !hgcVar.g1) {
                        hgcVar.X0 = (float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i));
                        float x = (motionEvent.getX(i2) + motionEvent.getX(i)) / 2.0f;
                        hgcVar.b1 = x;
                        hgcVar.V0 = x;
                        float y = (motionEvent.getY(i2) + motionEvent.getY(i)) / 2.0f;
                        hgcVar.c1 = y;
                        hgcVar.W0 = y;
                        hgcVar.f1 = 1.0f;
                        hgcVar.Y0 = 0.0f;
                        hgcVar.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        hgcVar.g1 = true;
                        hgcVar.a1 = true;
                    }
                    float x2 = motionEvent.getX(i);
                    float y2 = motionEvent.getY(i);
                    float x3 = hgcVar.V0 - ((motionEvent.getX(i2) + x2) / 2.0f);
                    float y3 = hgcVar.W0 - ((motionEvent.getY(i2) + y2) / 2.0f);
                    float f = hgcVar.f1;
                    hgcVar.Y0 = (-x3) / f;
                    hgcVar.Z0 = (-y3) / f;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    hgcVar.e();
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((hgcVar.d1 == motionEvent.getPointerId(0) && hgcVar.e1 == motionEvent.getPointerId(1)) || (hgcVar.d1 == motionEvent.getPointerId(1) && hgcVar.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                hgcVar.e();
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = gl.P;
                rectF.set(aicVar.getX(), aicVar.getY(), aicVar.getX() + aicVar.getMeasuredWidth(), aicVar.getY() + aicVar.getMeasuredHeight());
                rectF.inset(((aicVar.getMeasuredHeight() * aicVar.U) - aicVar.getMeasuredHeight()) / 2.0f, ((aicVar.getMeasuredWidth() * aicVar.U) - aicVar.getMeasuredWidth()) / 2.0f);
                boolean z = h75.u5;
                float f2 = rectF.top;
                if (!z) {
                    rectF.top = Math.max(f2, a.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, aicVar.getMeasuredHeight() - gl.L(90.0f));
                } else {
                    rectF.top = Math.max(f2, a.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, aicVar.getMeasuredWidth() - gl.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                hgcVar.h1 = contains;
                if (!contains) {
                    hgcVar.e();
                }
            }
            if (hgcVar.h1 && !hgcVar.a1 && motionEvent.getPointerCount() == 2) {
                hgcVar.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x4 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                hgcVar.b1 = x4;
                hgcVar.V0 = x4;
                float y4 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                hgcVar.c1 = y4;
                hgcVar.W0 = y4;
                hgcVar.f1 = 1.0f;
                hgcVar.d1 = motionEvent.getPointerId(0);
                hgcVar.e1 = motionEvent.getPointerId(1);
                hgcVar.a1 = true;
            }
        }
        hgcVar.s.invalidate();
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
                float f4 = hgcVar.t0;
                if (f3 < f4 * f4 && currentTimeMillis - this.d < 300 && currentTimeMillis - hgcVar.K0 > 300) {
                    hgcVar.K0 = System.currentTimeMillis();
                    if (hgcVar.C0) {
                        hgcVar.c(false);
                    } else if (hgcVar.z0) {
                        hgcVar.r(!hgcVar.x0);
                        hgcVar.q0 = hgcVar.p0;
                        if (!hgcVar.x0 && (cg2Var = hgcVar.N0) != null && cg2Var.W) {
                            cg2Var.f(true);
                        }
                        hgcVar.y();
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
        if (!hgcVar.h1 && !this.c) {
            return false;
        }
        return true;
    }
}
