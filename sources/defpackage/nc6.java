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
import org.telegram.ui.ActionBar.d;
public final class nc6 extends ela implements vk7 {
    public final byte m0 = 1;
    public final az8 n0;
    public boolean o0;
    public final d p0;

    public nc6(pc6 pc6Var, Context context) {
        super(context, null);
        this.p0 = pc6Var;
        this.o0 = true;
        this.n0 = new az8((byte) 3);
    }

    public final void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        coc cocVar = ((goc) this.p0).t0;
        if (cocVar != null) {
            cocVar.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public final int a0(q7c q7cVar, int i) {
        int[] iArr = {0};
        k2b k2bVar = new k2b(iArr, (byte) 11);
        this.o0 = true;
        q7cVar.j(k2bVar);
        try {
            q7cVar.scrollBy(0, i);
            ArrayList arrayList = q7cVar.x0;
            if (arrayList != null) {
                arrayList.remove(k2bVar);
            }
            this.o0 = false;
            return iArr[0];
        } catch (Throwable th) {
            ArrayList arrayList2 = q7cVar.x0;
            if (arrayList2 != null) {
                arrayList2.remove(k2bVar);
            }
            this.o0 = false;
            throw th;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        coc cocVar;
        moc mocVar;
        boolean z;
        float f;
        float f2;
        boolean z2;
        lqc lqcVar;
        boolean z3;
        int i;
        boolean z4;
        int i2;
        lqc lqcVar2;
        float f3;
        Iterator it;
        boolean z5;
        byte b;
        long j;
        boolean z6;
        switch (this.m0) {
            case 1:
                goc gocVar = (goc) this.p0;
                mqc mqcVar = gocVar.k0;
                int i3 = 1;
                if (mqcVar != null) {
                    cqc cqcVar = mqcVar.C1;
                    LinkedHashMap linkedHashMap = mqcVar.f;
                    cqc cqcVar2 = mqcVar.B1;
                    boolean z7 = false;
                    if (!mqcVar.b && ((mocVar = mqcVar.c.E) == null || !mocVar.a || mqcVar.q0 || mqcVar.r0)) {
                        if (!mqcVar.b1 && !mqcVar.t0 && mqcVar.A()) {
                            if (mqcVar.i1) {
                                mqcVar.f0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                mqcVar.removeCallbacks(cqcVar2);
                                mqcVar.removeCallbacks(cqcVar);
                                mqcVar.h0 = null;
                                mqcVar.p0 = false;
                                mqcVar.j0 = false;
                                mqcVar.o0 = false;
                                mqcVar.n0 = false;
                                mqcVar.r0 = false;
                                mqcVar.q0 = false;
                                mqcVar.w0 = motionEvent.getPointerId(0);
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                float[] fArr = {x, y};
                                mqcVar.s.mapPoints(fArr);
                                lqc lqcVar3 = mqcVar.i0;
                                if (lqcVar3 == null || lqcVar3.H != 2) {
                                    i = 1;
                                } else {
                                    float P = (mqcVar.P(lqcVar3) * 0.5f) + gm.L(9.0f);
                                    double radians = Math.toRadians(lqcVar3.i.a);
                                    int i4 = -1;
                                    while (true) {
                                        i = i3;
                                        if (i4 <= i3) {
                                            float f4 = i4 * P;
                                            double d = radians;
                                            float[] L = mqcVar.L((((float) Math.cos(d)) * f4) + lqcVar3.e.a + lqcVar3.n.a, (f4 * ((float) Math.sin(d))) + lqcVar3.f.a + lqcVar3.o.a);
                                            if (Utilities.t(x, y, L[0], L[i]) < gm.L(22.0f)) {
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
                                mqcVar.j0 = z4;
                                if (z4) {
                                    lqcVar2 = mqcVar.i0;
                                } else {
                                    float f5 = fArr[0];
                                    float f6 = fArr[i2];
                                    Iterator it2 = linkedHashMap.values().iterator();
                                    lqc lqcVar4 = null;
                                    while (it2.hasNext()) {
                                        lqc lqcVar5 = (lqc) it2.next();
                                        if (lqcVar5.H == 2 && Utilities.t(f5, f6, lqcVar5.e.a, lqcVar5.f.a) < mqcVar.P(lqcVar5) * 0.44f) {
                                            if (lqcVar4 != null) {
                                                f3 = f6;
                                                it = it2;
                                                if (lqcVar5.I <= lqcVar4.I) {
                                                }
                                            } else {
                                                f3 = f6;
                                                it = it2;
                                            }
                                            lqcVar4 = lqcVar5;
                                        } else {
                                            f3 = f6;
                                            it = it2;
                                        }
                                        f6 = f3;
                                        it2 = it;
                                    }
                                    lqcVar2 = lqcVar4;
                                }
                                mqcVar.h0 = lqcVar2;
                                if (!mqcVar.j0 && lqcVar2 != mqcVar.i0) {
                                    mqcVar.i0 = null;
                                    mqcVar.f0();
                                }
                                lqc lqcVar6 = mqcVar.h0;
                                if (lqcVar6 != null) {
                                    z5 = i2;
                                } else {
                                    z5 = false;
                                }
                                mqcVar.v0 = z5;
                                if (lqcVar6 == null) {
                                    Iterator it3 = linkedHashMap.values().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            lqc lqcVar7 = (lqc) it3.next();
                                            RectF Z = mqcVar.Z(lqcVar7);
                                            if (Z != null && Z.contains(x, y)) {
                                                if (mqc.b(lqcVar7)) {
                                                    if (Math.abs(x - Z.centerX()) < Z.width() * 0.35f && Math.abs(y - Z.centerY()) < Z.height() * 0.35f) {
                                                        z6 = i2;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    mqcVar.s0 = z6;
                                                    mqcVar.h0 = lqcVar7;
                                                }
                                            }
                                        }
                                    }
                                }
                                lqc lqcVar8 = mqcVar.h0;
                                if (lqcVar8 != null && ((b = lqcVar8.H) == 0 || b == 2)) {
                                    mqcVar.y0 = x;
                                    mqcVar.z0 = y;
                                    SystemClock.uptimeMillis();
                                    lqc lqcVar9 = mqcVar.h0;
                                    mqcVar.L0 = lqcVar9.H;
                                    mqcVar.H0 = lqcVar9.e.b;
                                    mqcVar.I0 = lqcVar9.f.b;
                                    mqcVar.K0 = lqcVar9.i.b;
                                    mqcVar.J0 = lqcVar9.h.b;
                                    VelocityTracker velocityTracker = mqcVar.P0;
                                    if (velocityTracker != null) {
                                        velocityTracker.recycle();
                                    }
                                    VelocityTracker obtain = VelocityTracker.obtain();
                                    mqcVar.P0 = obtain;
                                    obtain.addMovement(motionEvent);
                                    if (mqcVar.j0) {
                                        mqcVar.C0 = Float.NaN;
                                        mqcVar.F0 = Float.NaN;
                                        mqcVar.D0 = 0.0f;
                                        lqc lqcVar10 = mqcVar.h0;
                                        mqcVar.E0 = lqcVar10.i.b;
                                        mqcVar.M0 = false;
                                        long j2 = mqcVar.O0 + 1;
                                        mqcVar.O0 = j2;
                                        lqcVar10.I = j2;
                                        mqcVar.M(lqcVar10, x, y);
                                    } else {
                                        if (mqcVar.v0) {
                                            j = 450;
                                        } else {
                                            j = 500;
                                        }
                                        mqcVar.postDelayed(cqcVar2, j);
                                    }
                                    if (mqcVar.v0) {
                                        boolean z8 = i2;
                                        mqcVar.q0 = z8;
                                        mqcVar.getParent().requestDisallowInterceptTouchEvent(z8);
                                        mqcVar.f0();
                                        z7 = z8;
                                    } else {
                                        mqcVar.r0 = i2;
                                        mqcVar.postDelayed(cqcVar, 170L);
                                    }
                                } else {
                                    mqcVar.h0 = null;
                                }
                                z7 = false;
                            } else {
                                if (mqcVar.q0 || mqcVar.r0) {
                                    VelocityTracker velocityTracker2 = mqcVar.P0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(mqcVar.w0);
                                    if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == mqcVar.w0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (findPointerIndex < 0) {
                                        if (mqcVar.r0) {
                                            mqcVar.a();
                                        } else {
                                            mqcVar.w(0.0f, 0.0f, true);
                                        }
                                    } else {
                                        float x2 = motionEvent.getX(findPointerIndex);
                                        float y2 = motionEvent.getY(findPointerIndex);
                                        if (mqcVar.r0) {
                                            if (actionMasked == 2 && Utilities.t(x2, y2, mqcVar.y0, mqcVar.z0) > ViewConfiguration.get(mqcVar.getContext()).getScaledTouchSlop()) {
                                                if (mqcVar.s0 && mqcVar.h0.H == 0) {
                                                    mqcVar.r0 = false;
                                                    mqcVar.q0 = true;
                                                    mqcVar.removeCallbacks(cqcVar);
                                                    ((nc6) mqcVar.d.b).X();
                                                    mqcVar.getParent().requestDisallowInterceptTouchEvent(true);
                                                    mqcVar.W(mqcVar.h0, x2, y2);
                                                    mqcVar.q(mqcVar.h0, x2, y2);
                                                    mqcVar.f0();
                                                } else {
                                                    z3 = false;
                                                    mqcVar.a();
                                                }
                                            } else {
                                                z3 = false;
                                                if (actionMasked == 1 || actionMasked == 3 || z) {
                                                    mqcVar.a();
                                                }
                                            }
                                            z7 = z3;
                                        } else {
                                            if (actionMasked == 2 && (lqcVar = mqcVar.h0) != null) {
                                                if (!mqcVar.o0 && !mqcVar.j0) {
                                                    if (Utilities.t(x2, y2, mqcVar.y0, mqcVar.z0) > ViewConfiguration.get(mqcVar.getContext()).getScaledTouchSlop()) {
                                                        mqcVar.removeCallbacks(cqcVar2);
                                                        if (!mqcVar.n0 && (mqcVar.v0 || mqcVar.h0.H == 0)) {
                                                            mqcVar.W(mqcVar.h0, x2, y2);
                                                        }
                                                        if (mqcVar.n0) {
                                                            mqcVar.q(mqcVar.h0, x2, y2);
                                                        }
                                                    }
                                                } else {
                                                    mqcVar.M(lqcVar, x2, y2);
                                                }
                                                mqcVar.f0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z) {
                                                VelocityTracker velocityTracker3 = mqcVar.P0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(1000);
                                                    f = mqcVar.P0.getXVelocity(mqcVar.w0);
                                                    f2 = mqcVar.P0.getYVelocity(mqcVar.w0);
                                                } else {
                                                    f = 0.0f;
                                                    f2 = 0.0f;
                                                }
                                                if (actionMasked == 3) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                mqcVar.w(f, f2, z2);
                                            }
                                        }
                                    }
                                    z7 = true;
                                }
                                z7 = false;
                            }
                        } else {
                            z7 = mqcVar.q0;
                        }
                    }
                    if (z7) {
                        return true;
                    }
                }
                coc cocVar2 = gocVar.t0;
                if (cocVar2 != null) {
                    cocVar2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (cocVar = gocVar.t0) != null) {
                    f8c f8cVar = cocVar.i;
                    va vaVar = cocVar.c;
                    if (vaVar != null) {
                        vaVar.removeCallbacks(f8cVar);
                        cocVar.c.post(f8cVar);
                    }
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final int getNestedScrollAxes() {
        switch (this.m0) {
            case 1:
                return this.n0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override
    public final void k(int i, View view) {
        byte b = this.m0;
        az8 az8Var = this.n0;
        switch (b) {
            case 0:
                az8Var.b = 0;
                return;
            default:
                if (i == 1) {
                    az8Var.c = 0;
                } else {
                    az8Var.b = 0;
                }
                coc cocVar = ((goc) this.p0).t0;
                if (cocVar != null) {
                    f8c f8cVar = cocVar.i;
                    va vaVar = cocVar.c;
                    if (vaVar != null) {
                        vaVar.removeCallbacks(f8cVar);
                        cocVar.c.post(f8cVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ic6 ic6Var;
        q7c r0;
        byte b = this.m0;
        d dVar = this.p0;
        switch (b) {
            case 0:
                pc6 pc6Var = (pc6) dVar;
                try {
                    if (view == pc6Var.R && (ic6Var = pc6Var.R0) != null && ic6Var.isAttachedToWindow()) {
                        r59 currentListView = pc6Var.R0.getCurrentListView();
                        int top = pc6Var.R0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i4;
                            currentListView.scrollBy(0, i4);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    fc4.g(th, true);
                    gm.c3(new kg5(this, (byte) 25));
                    return;
                }
            default:
                goc gocVar = (goc) dVar;
                if (!this.o0 && i4 != 0 && (r0 = gocVar.r0()) != null) {
                    if (view == gocVar.a && gocVar.v0()) {
                        iArr[1] = a0(r0, i4) + iArr[1];
                        return;
                    } else if (view == r0 && i4 < 0) {
                        iArr[1] = a0(gocVar.a, i4) + iArr[1];
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
        switch (this.m0) {
            case 0:
                return;
            default:
                l(view, i, i2, i3, i4, i5, new int[2]);
                return;
        }
    }

    @Override
    public final boolean n(View view, View view2, int i, int i2) {
        switch (this.m0) {
            case 0:
                if (((pc6) this.p0).R0 == null || i != 2) {
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
        switch (this.m0) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                pc6 pc6Var = (pc6) this.p0;
                if (z) {
                    pc6Var.n0(this.o0);
                    this.o0 = false;
                    return;
                }
                pc6Var.N0(true);
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.m0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i2) * 0.75f);
                goc gocVar = (goc) this.p0;
                if (gocVar.r != size) {
                    gocVar.r = size;
                    unc uncVar = gocVar.e;
                    if (uncVar != null) {
                        uncVar.requestLayout();
                    }
                    snc sncVar = gocVar.f;
                    if (sncVar != null) {
                        sncVar.requestLayout();
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
        coc cocVar;
        switch (this.m0) {
            case 1:
                goc gocVar = (goc) this.p0;
                if (view == gocVar.r0() && (cocVar = gocVar.t0) != null) {
                    return cocVar.a((int) f, (int) f2);
                }
                return false;
            default:
                return super.onNestedPreFling(view, f, f2);
        }
    }

    @Override
    public final void onStopNestedScroll(View view) {
        switch (this.m0) {
            case 0:
                return;
            default:
                super.onStopNestedScroll(view);
                return;
        }
    }

    @Override
    public final void q(View view, View view2, int i, int i2) {
        switch (this.m0) {
            case 0:
                this.n0.b = i;
                return;
            default:
                az8 az8Var = this.n0;
                if (i2 == 1) {
                    az8Var.c = i;
                    return;
                } else {
                    az8Var.b = i;
                    return;
                }
        }
    }

    @Override
    public final void r(android.view.View r5, int r6, int r7, int[] r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc6.r(android.view.View, int, int, int[], int):void");
    }

    public nc6(goc gocVar, Context context) {
        super(context, null);
        this.p0 = gocVar;
        this.n0 = new az8((byte) 3);
    }

    private final void Z(View view) {
    }

    private final void Y(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
