package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
public final class qqc extends t79 {
    public wa a;
    public wa c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final uqc j;
    public final n52 b = new n52(this);
    public final olc i = new olc(this, (byte) 7);

    public qqc(uqc uqcVar) {
        this.j = uqcVar;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqc.a(int, int):boolean");
    }

    public final void b(wa waVar) {
        wa waVar2 = this.c;
        if (waVar2 != null) {
            waVar2.removeCallbacks(this.i);
        }
        this.c = waVar;
        wa waVar3 = this.a;
        if (waVar3 != waVar) {
            n52 n52Var = this.b;
            if (waVar3 != null) {
                ArrayList arrayList = waVar3.x0;
                if (arrayList != null) {
                    arrayList.remove(n52Var);
                }
                this.a.setOnFlingListener(null);
            }
            this.a = waVar;
            if (waVar != null) {
                if (waVar.getOnFlingListener() == null) {
                    this.a.j(n52Var);
                    this.a.setOnFlingListener(this);
                    new Scroller(this.a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                grb.i("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.e = false;
        this.f = false;
        this.d = false;
        wa waVar = this.c;
        if (waVar != null) {
            waVar.removeCallbacks(this.i);
        }
    }

    public final View d(q79 q79Var) {
        wa waVar;
        if (!this.e && (waVar = this.c) != null && waVar.getScrollState() == 0) {
            uqc uqcVar = this.j;
            q9c q0 = uqcVar.q0();
            if ((q0 == null || q0.getScrollState() == 0) && this.d) {
                this.d = false;
                if (uqcVar.s0()) {
                    View m = q79Var.m(0);
                    View m2 = q79Var.m(q79Var.A() - 1);
                    if (m == null) {
                        return m2;
                    }
                    if (m2 == null || Math.abs(new int[]{0, q79.y(m) - q79Var.E()}[1]) < Math.abs(new int[]{0, q79.y(m2) - q79Var.E()}[1])) {
                        return m;
                    }
                    return m2;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void e(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c();
            this.e = true;
            this.g = motionEvent.getX();
            this.h = motionEvent.getY();
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            if (abs2 > ViewConfiguration.get(this.c.getContext()).getScaledTouchSlop() && abs2 > abs * 1.5f) {
                z = true;
            } else {
                z = false;
            }
            this.f = z;
            if (!z) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.e = false;
            }
        }
    }

    public final void f() {
        q79 layoutManager;
        View d;
        wa waVar = this.a;
        if (waVar != null && (layoutManager = waVar.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, q79.y(d) - layoutManager.E()};
            int i = iArr[0];
            if (i == 0 && iArr[1] == 0) {
                return;
            }
            this.a.y0(i, iArr[1], null);
        }
    }
}
