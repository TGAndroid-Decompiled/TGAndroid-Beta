package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.e;
public final class sc6 extends wma implements bl7 {
    public final byte g0 = 0;
    public final l09 h0;
    public boolean i0;
    public final e j0;

    public sc6(uc6 uc6Var, Context context) {
        super(context, null);
        this.j0 = uc6Var;
        this.i0 = true;
        this.h0 = new l09((byte) 3);
    }

    public final void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        qqc qqcVar = ((uqc) this.j0).t0;
        if (qqcVar != null) {
            qqcVar.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public final int a0(q9c q9cVar, int i) {
        int[] iArr = {0};
        qhb qhbVar = new qhb(iArr, (byte) 10);
        this.i0 = true;
        q9cVar.j(qhbVar);
        try {
            q9cVar.scrollBy(0, i);
            ArrayList arrayList = q9cVar.x0;
            if (arrayList != null) {
                arrayList.remove(qhbVar);
            }
            this.i0 = false;
            return iArr[0];
        } catch (Throwable th) {
            ArrayList arrayList2 = q9cVar.x0;
            if (arrayList2 != null) {
                arrayList2.remove(qhbVar);
            }
            this.i0 = false;
            throw th;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qqc qqcVar;
        zqc zqcVar;
        boolean z;
        float f;
        float f2;
        boolean z2;
        vsc vscVar;
        boolean z3;
        int i;
        boolean z4;
        int i2;
        vsc vscVar2;
        float f3;
        Iterator it;
        boolean z5;
        byte b;
        long j;
        boolean z6;
        switch (this.g0) {
            case 1:
                uqc uqcVar = (uqc) this.j0;
                wsc wscVar = uqcVar.k0;
                int i3 = 1;
                if (wscVar != null) {
                    msc mscVar = wscVar.C1;
                    LinkedHashMap linkedHashMap = wscVar.f;
                    msc mscVar2 = wscVar.B1;
                    boolean z7 = false;
                    if (!wscVar.b && ((zqcVar = wscVar.c.E) == null || !zqcVar.a || wscVar.q0 || wscVar.r0)) {
                        if (!wscVar.b1 && !wscVar.t0 && wscVar.A()) {
                            if (wscVar.i1) {
                                wscVar.f0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                wscVar.removeCallbacks(mscVar2);
                                wscVar.removeCallbacks(mscVar);
                                wscVar.h0 = null;
                                wscVar.p0 = false;
                                wscVar.j0 = false;
                                wscVar.o0 = false;
                                wscVar.n0 = false;
                                wscVar.r0 = false;
                                wscVar.q0 = false;
                                wscVar.w0 = motionEvent.getPointerId(0);
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                float[] fArr = {x, y};
                                wscVar.s.mapPoints(fArr);
                                vsc vscVar3 = wscVar.i0;
                                if (vscVar3 == null || vscVar3.H != 2) {
                                    i = 1;
                                } else {
                                    float P = (wscVar.P(vscVar3) * 0.5f) + hl.L(9.0f);
                                    double radians = Math.toRadians(vscVar3.i.a);
                                    int i4 = -1;
                                    while (true) {
                                        i = i3;
                                        if (i4 <= i3) {
                                            float f4 = i4 * P;
                                            double d = radians;
                                            float[] L = wscVar.L((((float) Math.cos(d)) * f4) + vscVar3.e.a + vscVar3.n.a, (f4 * ((float) Math.sin(d))) + vscVar3.f.a + vscVar3.o.a);
                                            if (Utilities.t(x, y, L[0], L[i]) < hl.L(22.0f)) {
                                                z4 = i;
                                                i2 = i;
                                            } else {
                                                i4 += 2;
                                                i3 = i;
                                                radians = d;
                                            }
                                        }
                                    }
                                }
                                z4 = false;
                                i2 = i;
                                wscVar.j0 = z4;
                                if (z4) {
                                    vscVar2 = wscVar.i0;
                                } else {
                                    float f5 = fArr[0];
                                    float f6 = fArr[i2];
                                    Iterator it2 = linkedHashMap.values().iterator();
                                    vsc vscVar4 = null;
                                    while (it2.hasNext()) {
                                        vsc vscVar5 = (vsc) it2.next();
                                        if (vscVar5.H == 2 && Utilities.t(f5, f6, vscVar5.e.a, vscVar5.f.a) < wscVar.P(vscVar5) * 0.44f) {
                                            if (vscVar4 != null) {
                                                f3 = f6;
                                                it = it2;
                                                if (vscVar5.I <= vscVar4.I) {
                                                }
                                            } else {
                                                f3 = f6;
                                                it = it2;
                                            }
                                            vscVar4 = vscVar5;
                                        } else {
                                            f3 = f6;
                                            it = it2;
                                        }
                                        f6 = f3;
                                        it2 = it;
                                    }
                                    vscVar2 = vscVar4;
                                }
                                wscVar.h0 = vscVar2;
                                if (!wscVar.j0 && vscVar2 != wscVar.i0) {
                                    wscVar.i0 = null;
                                    wscVar.f0();
                                }
                                vsc vscVar6 = wscVar.h0;
                                if (vscVar6 != null) {
                                    z5 = i2;
                                } else {
                                    z5 = false;
                                }
                                wscVar.v0 = z5;
                                if (vscVar6 == null) {
                                    Iterator it3 = linkedHashMap.values().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            vsc vscVar7 = (vsc) it3.next();
                                            RectF Z = wscVar.Z(vscVar7);
                                            if (Z != null && Z.contains(x, y)) {
                                                if (wsc.b(vscVar7)) {
                                                    if (Math.abs(x - Z.centerX()) < Z.width() * 0.35f && Math.abs(y - Z.centerY()) < Z.height() * 0.35f) {
                                                        z6 = i2;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    wscVar.s0 = z6;
                                                    wscVar.h0 = vscVar7;
                                                }
                                            }
                                        }
                                    }
                                }
                                vsc vscVar8 = wscVar.h0;
                                if (vscVar8 != null && ((b = vscVar8.H) == 0 || b == 2)) {
                                    wscVar.y0 = x;
                                    wscVar.z0 = y;
                                    SystemClock.uptimeMillis();
                                    vsc vscVar9 = wscVar.h0;
                                    wscVar.L0 = vscVar9.H;
                                    wscVar.H0 = vscVar9.e.b;
                                    wscVar.I0 = vscVar9.f.b;
                                    wscVar.K0 = vscVar9.i.b;
                                    wscVar.J0 = vscVar9.h.b;
                                    VelocityTracker velocityTracker = wscVar.P0;
                                    if (velocityTracker != null) {
                                        velocityTracker.recycle();
                                    }
                                    VelocityTracker obtain = VelocityTracker.obtain();
                                    wscVar.P0 = obtain;
                                    obtain.addMovement(motionEvent);
                                    if (wscVar.j0) {
                                        wscVar.C0 = Float.NaN;
                                        wscVar.F0 = Float.NaN;
                                        wscVar.D0 = 0.0f;
                                        vsc vscVar10 = wscVar.h0;
                                        wscVar.E0 = vscVar10.i.b;
                                        wscVar.M0 = false;
                                        long j2 = wscVar.O0 + 1;
                                        wscVar.O0 = j2;
                                        vscVar10.I = j2;
                                        wscVar.M(vscVar10, x, y);
                                    } else {
                                        if (wscVar.v0) {
                                            j = 450;
                                        } else {
                                            j = 500;
                                        }
                                        wscVar.postDelayed(mscVar2, j);
                                    }
                                    if (wscVar.v0) {
                                        boolean z8 = i2;
                                        wscVar.q0 = z8;
                                        wscVar.getParent().requestDisallowInterceptTouchEvent(z8);
                                        wscVar.f0();
                                        z7 = z8;
                                    } else {
                                        wscVar.r0 = i2;
                                        wscVar.postDelayed(mscVar, 170L);
                                    }
                                } else {
                                    wscVar.h0 = null;
                                }
                                z7 = false;
                            } else {
                                if (wscVar.q0 || wscVar.r0) {
                                    VelocityTracker velocityTracker2 = wscVar.P0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(wscVar.w0);
                                    if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == wscVar.w0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (findPointerIndex < 0) {
                                        if (wscVar.r0) {
                                            wscVar.a();
                                        } else {
                                            wscVar.w(0.0f, 0.0f, true);
                                        }
                                    } else {
                                        float x2 = motionEvent.getX(findPointerIndex);
                                        float y2 = motionEvent.getY(findPointerIndex);
                                        if (wscVar.r0) {
                                            if (actionMasked == 2 && Utilities.t(x2, y2, wscVar.y0, wscVar.z0) > ViewConfiguration.get(wscVar.getContext()).getScaledTouchSlop()) {
                                                if (wscVar.s0 && wscVar.h0.H == 0) {
                                                    wscVar.r0 = false;
                                                    wscVar.q0 = true;
                                                    wscVar.removeCallbacks(mscVar);
                                                    ((sc6) wscVar.d.b).X();
                                                    wscVar.getParent().requestDisallowInterceptTouchEvent(true);
                                                    wscVar.W(wscVar.h0, x2, y2);
                                                    wscVar.q(wscVar.h0, x2, y2);
                                                    wscVar.f0();
                                                } else {
                                                    z3 = false;
                                                    wscVar.a();
                                                }
                                            } else {
                                                z3 = false;
                                                if (actionMasked == 1 || actionMasked == 3 || z) {
                                                    wscVar.a();
                                                }
                                            }
                                            z7 = z3;
                                        } else {
                                            if (actionMasked == 2 && (vscVar = wscVar.h0) != null) {
                                                if (!wscVar.o0 && !wscVar.j0) {
                                                    if (Utilities.t(x2, y2, wscVar.y0, wscVar.z0) > ViewConfiguration.get(wscVar.getContext()).getScaledTouchSlop()) {
                                                        wscVar.removeCallbacks(mscVar2);
                                                        if (!wscVar.n0 && (wscVar.v0 || wscVar.h0.H == 0)) {
                                                            wscVar.W(wscVar.h0, x2, y2);
                                                        }
                                                        if (wscVar.n0) {
                                                            wscVar.q(wscVar.h0, x2, y2);
                                                        }
                                                    }
                                                } else {
                                                    wscVar.M(vscVar, x2, y2);
                                                }
                                                wscVar.f0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z) {
                                                VelocityTracker velocityTracker3 = wscVar.P0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(1000);
                                                    f = wscVar.P0.getXVelocity(wscVar.w0);
                                                    f2 = wscVar.P0.getYVelocity(wscVar.w0);
                                                } else {
                                                    f = 0.0f;
                                                    f2 = 0.0f;
                                                }
                                                if (actionMasked == 3) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                wscVar.w(f, f2, z2);
                                            }
                                        }
                                    }
                                    z7 = true;
                                }
                                z7 = false;
                            }
                        } else {
                            z7 = wscVar.q0;
                        }
                    }
                    if (z7) {
                        return true;
                    }
                }
                qqc qqcVar2 = uqcVar.t0;
                if (qqcVar2 != null) {
                    qqcVar2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (qqcVar = uqcVar.t0) != null) {
                    olc olcVar = qqcVar.i;
                    wa waVar = qqcVar.c;
                    if (waVar != null) {
                        waVar.removeCallbacks(olcVar);
                        qqcVar.c.post(olcVar);
                    }
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final int getNestedScrollAxes() {
        switch (this.g0) {
            case 1:
                return this.h0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void k(int i, View view) {
        byte b = this.g0;
        l09 l09Var = this.h0;
        switch (b) {
            case 0:
                l09Var.b = 0;
                return;
            default:
                if (i == 1) {
                    l09Var.c = 0;
                } else {
                    l09Var.b = 0;
                }
                qqc qqcVar = ((uqc) this.j0).t0;
                if (qqcVar != null) {
                    olc olcVar = qqcVar.i;
                    wa waVar = qqcVar.c;
                    if (waVar != null) {
                        waVar.removeCallbacks(olcVar);
                        qqcVar.c.post(olcVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        nc6 nc6Var;
        q9c q0;
        byte b = this.g0;
        e eVar = this.j0;
        switch (b) {
            case 0:
                uc6 uc6Var = (uc6) eVar;
                try {
                    if (view == uc6Var.R && (nc6Var = uc6Var.R0) != null && nc6Var.isAttachedToWindow()) {
                        d79 currentListView = uc6Var.R0.getCurrentListView();
                        int top = uc6Var.R0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i4;
                            currentListView.scrollBy(0, i4);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    cc4.g(th, true);
                    hl.c3(new z96(this, (byte) 3));
                    return;
                }
            default:
                uqc uqcVar = (uqc) eVar;
                if (!this.i0 && i4 != 0 && (q0 = uqcVar.q0()) != null) {
                    if (view == uqcVar.a && uqcVar.u0()) {
                        iArr[1] = a0(q0, i4) + iArr[1];
                        return;
                    } else if (view == q0 && i4 < 0) {
                        iArr[1] = a0(uqcVar.a, i4) + iArr[1];
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
        switch (this.g0) {
            case 0:
                return;
            default:
                l(view, i, i2, i3, i4, i5, new int[2]);
                return;
        }
    }

    @Override
    public final boolean n(View view, View view2, int i, int i2) {
        switch (this.g0) {
            case 0:
                if (((uc6) this.j0).R0 == null || i != 2) {
                    return false;
                }
                return true;
            default:
                if ((i & 2) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.g0) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                uc6 uc6Var = (uc6) this.j0;
                if (z) {
                    uc6Var.m0(this.i0);
                    this.i0 = false;
                    return;
                }
                uc6Var.N0(true);
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.g0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i2) * 0.75f);
                uqc uqcVar = (uqc) this.j0;
                if (uqcVar.r != size) {
                    uqcVar.r = size;
                    iqc iqcVar = uqcVar.e;
                    if (iqcVar != null) {
                        iqcVar.requestLayout();
                    }
                    gqc gqcVar = uqcVar.f;
                    if (gqcVar != null) {
                        gqcVar.requestLayout();
                    }
                }
                super.onMeasure(i, i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onNestedPreFling(View view, float f, float f2) {
        qqc qqcVar;
        switch (this.g0) {
            case 1:
                uqc uqcVar = (uqc) this.j0;
                if (view == uqcVar.q0() && (qqcVar = uqcVar.t0) != null) {
                    return qqcVar.a((int) f, (int) f2);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f, f2);
        }
    }

    @Override
    public final void onStopNestedScroll(View view) {
        switch (this.g0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final void q(View view, View view2, int i, int i2) {
        switch (this.g0) {
            case 0:
                this.h0.b = i;
                return;
            default:
                l09 l09Var = this.h0;
                if (i2 == 1) {
                    l09Var.c = i;
                    return;
                } else {
                    l09Var.b = i;
                    return;
                }
        }
    }

    @Override
    public final void r(android.view.View r5, int r6, int r7, int[] r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc6.r(android.view.View, int, int, int[], int):void");
    }

    public sc6(uqc uqcVar, Context context) {
        super(context, null);
        this.j0 = uqcVar;
        this.h0 = new l09((byte) 3);
    }

    private final void Z(View view) {
    }

    private final void Y(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
