package defpackage;

import android.app.Activity;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class dic extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public long d;
    public final iic e;

    public dic(iic iicVar, Activity activity) {
        super(activity);
        this.e = iicVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dic.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        iic iicVar = this.e;
        thc thcVar = iicVar.T0;
        if (motionEvent.getActionMasked() == 1) {
            iicVar.E.b(false, false);
            iicVar.w.a();
            gm.r(thcVar);
            if (iicVar.p0 == 3) {
                gm.d3(thcVar, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        akc akcVar;
        qh2 qh2Var;
        iic iicVar = this.e;
        thc thcVar = iicVar.T0;
        if (motionEvent.getActionMasked() == 1) {
            iicVar.E.b(false, false);
            iicVar.w.a();
            gm.r(thcVar);
            if (iicVar.p0 == 3) {
                gm.d3(thcVar, 10000L);
            }
        }
        if (!iicVar.h1 && !iicVar.a1 && !iicVar.g1 && motionEvent.getActionMasked() != 0) {
            iicVar.e();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            iicVar.h1 = false;
            iicVar.a1 = false;
            iicVar.g1 = false;
        }
        if (iicVar.m0) {
            akcVar = iicVar.d0;
        } else {
            akcVar = iicVar.e0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && iicVar.a1) {
                int i = -1;
                int i2 = -1;
                for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                    if (iicVar.d1 == motionEvent.getPointerId(i3)) {
                        i = i3;
                    }
                    if (iicVar.e1 == motionEvent.getPointerId(i3)) {
                        i2 = i3;
                    }
                }
                if (i != -1 && i2 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i))) / iicVar.X0;
                    iicVar.f1 = hypot;
                    if (hypot > 1.005f && !iicVar.g1) {
                        iicVar.X0 = (float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i));
                        float x = (motionEvent.getX(i2) + motionEvent.getX(i)) / 2.0f;
                        iicVar.b1 = x;
                        iicVar.V0 = x;
                        float y = (motionEvent.getY(i2) + motionEvent.getY(i)) / 2.0f;
                        iicVar.c1 = y;
                        iicVar.W0 = y;
                        iicVar.f1 = 1.0f;
                        iicVar.Y0 = 0.0f;
                        iicVar.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        iicVar.g1 = true;
                        iicVar.a1 = true;
                    }
                    float x2 = motionEvent.getX(i);
                    float y2 = motionEvent.getY(i);
                    float x3 = iicVar.V0 - ((motionEvent.getX(i2) + x2) / 2.0f);
                    float y3 = iicVar.W0 - ((motionEvent.getY(i2) + y2) / 2.0f);
                    float f = iicVar.f1;
                    iicVar.Y0 = (-x3) / f;
                    iicVar.Z0 = (-y3) / f;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    iicVar.e();
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((iicVar.d1 == motionEvent.getPointerId(0) && iicVar.e1 == motionEvent.getPointerId(1)) || (iicVar.d1 == motionEvent.getPointerId(1) && iicVar.e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                iicVar.e();
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = gm.P;
                rectF.set(akcVar.getX(), akcVar.getY(), akcVar.getX() + akcVar.getMeasuredWidth(), akcVar.getY() + akcVar.getMeasuredHeight());
                rectF.inset(((akcVar.getMeasuredHeight() * akcVar.U) - akcVar.getMeasuredHeight()) / 2.0f, ((akcVar.getMeasuredWidth() * akcVar.U) - akcVar.getMeasuredWidth()) / 2.0f);
                boolean z = g95.u5;
                float f2 = rectF.top;
                if (!z) {
                    rectF.top = Math.max(f2, a.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, akcVar.getMeasuredHeight() - gm.L(90.0f));
                } else {
                    rectF.top = Math.max(f2, a.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, akcVar.getMeasuredWidth() - gm.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                iicVar.h1 = contains;
                if (!contains) {
                    iicVar.e();
                }
            }
            if (iicVar.h1 && !iicVar.a1 && motionEvent.getPointerCount() == 2) {
                iicVar.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x4 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                iicVar.b1 = x4;
                iicVar.V0 = x4;
                float y4 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                iicVar.c1 = y4;
                iicVar.W0 = y4;
                iicVar.f1 = 1.0f;
                iicVar.d1 = motionEvent.getPointerId(0);
                iicVar.e1 = motionEvent.getPointerId(1);
                iicVar.a1 = true;
            }
        }
        iicVar.s.invalidate();
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
                float f4 = iicVar.t0;
                if (f3 < f4 * f4 && currentTimeMillis - this.d < 300 && currentTimeMillis - iicVar.K0 > 300) {
                    iicVar.K0 = System.currentTimeMillis();
                    if (iicVar.C0) {
                        iicVar.c(false);
                    } else if (iicVar.z0) {
                        iicVar.r(!iicVar.x0);
                        iicVar.q0 = iicVar.p0;
                        if (!iicVar.x0 && (qh2Var = iicVar.N0) != null && qh2Var.W) {
                            qh2Var.f(true);
                        }
                        iicVar.y();
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
        if (!iicVar.h1 && !this.c) {
            return false;
        }
        return true;
    }
}
