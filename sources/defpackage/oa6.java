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
public final class oa6 extends cja implements ti7 {
    public final byte m0 = 1;
    public final zw8 n0;
    public boolean o0;
    public final d p0;

    public oa6(qa6 qa6Var, Context context) {
        super(context, null);
        this.p0 = qa6Var;
        this.o0 = true;
        this.n0 = new zw8((byte) 3);
    }

    public final void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        dmc dmcVar = ((hmc) this.p0).t0;
        if (dmcVar != null) {
            dmcVar.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public final int a0(q5c q5cVar, int i) {
        int[] iArr = {0};
        vdb vdbVar = new vdb(iArr, (byte) 10);
        this.o0 = true;
        q5cVar.j(vdbVar);
        try {
            q5cVar.scrollBy(0, i);
            ArrayList arrayList = q5cVar.x0;
            if (arrayList != null) {
                arrayList.remove(vdbVar);
            }
            this.o0 = false;
            return iArr[0];
        } catch (Throwable th) {
            ArrayList arrayList2 = q5cVar.x0;
            if (arrayList2 != null) {
                arrayList2.remove(vdbVar);
            }
            this.o0 = false;
            throw th;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dmc dmcVar;
        mmc mmcVar;
        boolean z;
        float f;
        float f2;
        boolean z2;
        joc jocVar;
        boolean z3;
        int i;
        boolean z4;
        int i2;
        joc jocVar2;
        float f3;
        Iterator it;
        boolean z5;
        byte b;
        long j;
        boolean z6;
        switch (this.m0) {
            case 1:
                hmc hmcVar = (hmc) this.p0;
                koc kocVar = hmcVar.k0;
                int i3 = 1;
                if (kocVar != null) {
                    aoc aocVar = kocVar.C1;
                    LinkedHashMap linkedHashMap = kocVar.f;
                    aoc aocVar2 = kocVar.B1;
                    boolean z7 = false;
                    if (!kocVar.b && ((mmcVar = kocVar.c.E) == null || !mmcVar.a || kocVar.q0 || kocVar.r0)) {
                        if (!kocVar.b1 && !kocVar.t0 && kocVar.A()) {
                            if (kocVar.i1) {
                                kocVar.f0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                kocVar.removeCallbacks(aocVar2);
                                kocVar.removeCallbacks(aocVar);
                                kocVar.h0 = null;
                                kocVar.p0 = false;
                                kocVar.j0 = false;
                                kocVar.o0 = false;
                                kocVar.n0 = false;
                                kocVar.r0 = false;
                                kocVar.q0 = false;
                                kocVar.w0 = motionEvent.getPointerId(0);
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                float[] fArr = {x, y};
                                kocVar.s.mapPoints(fArr);
                                joc jocVar3 = kocVar.i0;
                                if (jocVar3 == null || jocVar3.H != 2) {
                                    i = 1;
                                } else {
                                    float P = (kocVar.P(jocVar3) * 0.5f) + gl.L(9.0f);
                                    double radians = Math.toRadians(jocVar3.i.a);
                                    int i4 = -1;
                                    while (true) {
                                        i = i3;
                                        if (i4 <= i3) {
                                            float f4 = i4 * P;
                                            double d = radians;
                                            float[] L = kocVar.L((((float) Math.cos(d)) * f4) + jocVar3.e.a + jocVar3.n.a, (f4 * ((float) Math.sin(d))) + jocVar3.f.a + jocVar3.o.a);
                                            if (Utilities.t(x, y, L[0], L[i]) < gl.L(22.0f)) {
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
                                kocVar.j0 = z4;
                                if (z4) {
                                    jocVar2 = kocVar.i0;
                                } else {
                                    float f5 = fArr[0];
                                    float f6 = fArr[i2];
                                    Iterator it2 = linkedHashMap.values().iterator();
                                    joc jocVar4 = null;
                                    while (it2.hasNext()) {
                                        joc jocVar5 = (joc) it2.next();
                                        if (jocVar5.H == 2 && Utilities.t(f5, f6, jocVar5.e.a, jocVar5.f.a) < kocVar.P(jocVar5) * 0.44f) {
                                            if (jocVar4 != null) {
                                                f3 = f6;
                                                it = it2;
                                                if (jocVar5.I <= jocVar4.I) {
                                                }
                                            } else {
                                                f3 = f6;
                                                it = it2;
                                            }
                                            jocVar4 = jocVar5;
                                        } else {
                                            f3 = f6;
                                            it = it2;
                                        }
                                        f6 = f3;
                                        it2 = it;
                                    }
                                    jocVar2 = jocVar4;
                                }
                                kocVar.h0 = jocVar2;
                                if (!kocVar.j0 && jocVar2 != kocVar.i0) {
                                    kocVar.i0 = null;
                                    kocVar.f0();
                                }
                                joc jocVar6 = kocVar.h0;
                                if (jocVar6 != null) {
                                    z5 = i2;
                                } else {
                                    z5 = false;
                                }
                                kocVar.v0 = z5;
                                if (jocVar6 == null) {
                                    Iterator it3 = linkedHashMap.values().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            joc jocVar7 = (joc) it3.next();
                                            RectF Z = kocVar.Z(jocVar7);
                                            if (Z != null && Z.contains(x, y)) {
                                                if (koc.b(jocVar7)) {
                                                    if (Math.abs(x - Z.centerX()) < Z.width() * 0.35f && Math.abs(y - Z.centerY()) < Z.height() * 0.35f) {
                                                        z6 = i2;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    kocVar.s0 = z6;
                                                    kocVar.h0 = jocVar7;
                                                }
                                            }
                                        }
                                    }
                                }
                                joc jocVar8 = kocVar.h0;
                                if (jocVar8 != null && ((b = jocVar8.H) == 0 || b == 2)) {
                                    kocVar.y0 = x;
                                    kocVar.z0 = y;
                                    SystemClock.uptimeMillis();
                                    joc jocVar9 = kocVar.h0;
                                    kocVar.L0 = jocVar9.H;
                                    kocVar.H0 = jocVar9.e.b;
                                    kocVar.I0 = jocVar9.f.b;
                                    kocVar.K0 = jocVar9.i.b;
                                    kocVar.J0 = jocVar9.h.b;
                                    VelocityTracker velocityTracker = kocVar.P0;
                                    if (velocityTracker != null) {
                                        velocityTracker.recycle();
                                    }
                                    VelocityTracker obtain = VelocityTracker.obtain();
                                    kocVar.P0 = obtain;
                                    obtain.addMovement(motionEvent);
                                    if (kocVar.j0) {
                                        kocVar.C0 = Float.NaN;
                                        kocVar.F0 = Float.NaN;
                                        kocVar.D0 = 0.0f;
                                        joc jocVar10 = kocVar.h0;
                                        kocVar.E0 = jocVar10.i.b;
                                        kocVar.M0 = false;
                                        long j2 = kocVar.O0 + 1;
                                        kocVar.O0 = j2;
                                        jocVar10.I = j2;
                                        kocVar.M(jocVar10, x, y);
                                    } else {
                                        if (kocVar.v0) {
                                            j = 450;
                                        } else {
                                            j = 500;
                                        }
                                        kocVar.postDelayed(aocVar2, j);
                                    }
                                    if (kocVar.v0) {
                                        boolean z8 = i2;
                                        kocVar.q0 = z8;
                                        kocVar.getParent().requestDisallowInterceptTouchEvent(z8);
                                        kocVar.f0();
                                        z7 = z8;
                                    } else {
                                        kocVar.r0 = i2;
                                        kocVar.postDelayed(aocVar, 170L);
                                    }
                                } else {
                                    kocVar.h0 = null;
                                }
                                z7 = false;
                            } else {
                                if (kocVar.q0 || kocVar.r0) {
                                    VelocityTracker velocityTracker2 = kocVar.P0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(kocVar.w0);
                                    if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == kocVar.w0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (findPointerIndex < 0) {
                                        if (kocVar.r0) {
                                            kocVar.a();
                                        } else {
                                            kocVar.w(0.0f, 0.0f, true);
                                        }
                                    } else {
                                        float x2 = motionEvent.getX(findPointerIndex);
                                        float y2 = motionEvent.getY(findPointerIndex);
                                        if (kocVar.r0) {
                                            if (actionMasked == 2 && Utilities.t(x2, y2, kocVar.y0, kocVar.z0) > ViewConfiguration.get(kocVar.getContext()).getScaledTouchSlop()) {
                                                if (kocVar.s0 && kocVar.h0.H == 0) {
                                                    kocVar.r0 = false;
                                                    kocVar.q0 = true;
                                                    kocVar.removeCallbacks(aocVar);
                                                    ((oa6) kocVar.d.b).X();
                                                    kocVar.getParent().requestDisallowInterceptTouchEvent(true);
                                                    kocVar.W(kocVar.h0, x2, y2);
                                                    kocVar.q(kocVar.h0, x2, y2);
                                                    kocVar.f0();
                                                } else {
                                                    z3 = false;
                                                    kocVar.a();
                                                }
                                            } else {
                                                z3 = false;
                                                if (actionMasked == 1 || actionMasked == 3 || z) {
                                                    kocVar.a();
                                                }
                                            }
                                            z7 = z3;
                                        } else {
                                            if (actionMasked == 2 && (jocVar = kocVar.h0) != null) {
                                                if (!kocVar.o0 && !kocVar.j0) {
                                                    if (Utilities.t(x2, y2, kocVar.y0, kocVar.z0) > ViewConfiguration.get(kocVar.getContext()).getScaledTouchSlop()) {
                                                        kocVar.removeCallbacks(aocVar2);
                                                        if (!kocVar.n0 && (kocVar.v0 || kocVar.h0.H == 0)) {
                                                            kocVar.W(kocVar.h0, x2, y2);
                                                        }
                                                        if (kocVar.n0) {
                                                            kocVar.q(kocVar.h0, x2, y2);
                                                        }
                                                    }
                                                } else {
                                                    kocVar.M(jocVar, x2, y2);
                                                }
                                                kocVar.f0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z) {
                                                VelocityTracker velocityTracker3 = kocVar.P0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(1000);
                                                    f = kocVar.P0.getXVelocity(kocVar.w0);
                                                    f2 = kocVar.P0.getYVelocity(kocVar.w0);
                                                } else {
                                                    f = 0.0f;
                                                    f2 = 0.0f;
                                                }
                                                if (actionMasked == 3) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                kocVar.w(f, f2, z2);
                                            }
                                        }
                                    }
                                    z7 = true;
                                }
                                z7 = false;
                            }
                        } else {
                            z7 = kocVar.q0;
                        }
                    }
                    if (z7) {
                        return true;
                    }
                }
                dmc dmcVar2 = hmcVar.t0;
                if (dmcVar2 != null) {
                    dmcVar2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (dmcVar = hmcVar.t0) != null) {
                    kbc kbcVar = dmcVar.i;
                    va vaVar = dmcVar.c;
                    if (vaVar != null) {
                        vaVar.removeCallbacks(kbcVar);
                        dmcVar.c.post(kbcVar);
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
        zw8 zw8Var = this.n0;
        switch (b) {
            case 0:
                zw8Var.b = 0;
                return;
            default:
                if (i == 1) {
                    zw8Var.c = 0;
                } else {
                    zw8Var.b = 0;
                }
                dmc dmcVar = ((hmc) this.p0).t0;
                if (dmcVar != null) {
                    kbc kbcVar = dmcVar.i;
                    va vaVar = dmcVar.c;
                    if (vaVar != null) {
                        vaVar.removeCallbacks(kbcVar);
                        dmcVar.c.post(kbcVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ja6 ja6Var;
        q5c q0;
        byte b = this.m0;
        d dVar = this.p0;
        switch (b) {
            case 0:
                qa6 qa6Var = (qa6) dVar;
                try {
                    if (view == qa6Var.R && (ja6Var = qa6Var.R0) != null && ja6Var.isAttachedToWindow()) {
                        o39 currentListView = qa6Var.R0.getCurrentListView();
                        int top = qa6Var.R0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i4;
                            currentListView.scrollBy(0, i4);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    fa4.g(th, true);
                    gl.c3(new tp5(this, (byte) 18));
                    return;
                }
            default:
                hmc hmcVar = (hmc) dVar;
                if (!this.o0 && i4 != 0 && (q0 = hmcVar.q0()) != null) {
                    if (view == hmcVar.a && hmcVar.u0()) {
                        iArr[1] = a0(q0, i4) + iArr[1];
                        return;
                    } else if (view == q0 && i4 < 0) {
                        iArr[1] = a0(hmcVar.a, i4) + iArr[1];
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
                if (((qa6) this.p0).R0 == null || i != 2) {
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
                qa6 qa6Var = (qa6) this.p0;
                if (z) {
                    qa6Var.m0(this.o0);
                    this.o0 = false;
                    return;
                }
                qa6Var.M0(true);
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
                hmc hmcVar = (hmc) this.p0;
                if (hmcVar.r != size) {
                    hmcVar.r = size;
                    vlc vlcVar = hmcVar.e;
                    if (vlcVar != null) {
                        vlcVar.requestLayout();
                    }
                    tlc tlcVar = hmcVar.f;
                    if (tlcVar != null) {
                        tlcVar.requestLayout();
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
        dmc dmcVar;
        switch (this.m0) {
            case 1:
                hmc hmcVar = (hmc) this.p0;
                if (view == hmcVar.q0() && (dmcVar = hmcVar.t0) != null) {
                    return dmcVar.a((int) f, (int) f2);
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
                zw8 zw8Var = this.n0;
                if (i2 == 1) {
                    zw8Var.c = i;
                    return;
                } else {
                    zw8Var.b = i;
                    return;
                }
        }
    }

    @Override
    public final void r(android.view.View r5, int r6, int r7, int[] r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa6.r(android.view.View, int, int, int[], int):void");
    }

    public oa6(hmc hmcVar, Context context) {
        super(context, null);
        this.p0 = hmcVar;
        this.n0 = new zw8((byte) 3);
    }

    private final void Z(View view) {
    }

    private final void Y(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
