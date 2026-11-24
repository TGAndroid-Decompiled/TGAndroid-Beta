package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
public final class coc extends i69 {
    public va a;
    public va c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final goc j;
    public final i62 b = new i62(this);
    public final f8c i = new f8c(this, (byte) 28);

    public coc(goc gocVar) {
        this.j = gocVar;
    }

    @Override
    public final boolean a(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coc.a(int, int):boolean");
    }

    public final void b(va vaVar) {
        va vaVar2 = this.c;
        if (vaVar2 != null) {
            vaVar2.removeCallbacks(this.i);
        }
        this.c = vaVar;
        va vaVar3 = this.a;
        if (vaVar3 != vaVar) {
            i62 i62Var = this.b;
            if (vaVar3 != null) {
                ArrayList arrayList = vaVar3.x0;
                if (arrayList != null) {
                    arrayList.remove(i62Var);
                }
                this.a.setOnFlingListener(null);
            }
            this.a = vaVar;
            if (vaVar != null) {
                if (vaVar.getOnFlingListener() == null) {
                    this.a.j(i62Var);
                    this.a.setOnFlingListener(this);
                    new Scroller(this.a.getContext(), new DecelerateInterpolator());
                    f();
                    return;
                }
                dq9.m("An instance of OnFlingListener already set.");
            }
        }
    }

    public final void c() {
        this.e = false;
        this.f = false;
        this.d = false;
        va vaVar = this.c;
        if (vaVar != null) {
            vaVar.removeCallbacks(this.i);
        }
    }

    public final View d(f69 f69Var) {
        va vaVar;
        if (!this.e && (vaVar = this.c) != null && vaVar.getScrollState() == 0) {
            goc gocVar = this.j;
            q7c r0 = gocVar.r0();
            if ((r0 == null || r0.getScrollState() == 0) && this.d) {
                this.d = false;
                if (gocVar.t0()) {
                    View m = f69Var.m(0);
                    View m2 = f69Var.m(f69Var.A() - 1);
                    if (m == null) {
                        return m2;
                    }
                    if (m2 == null || Math.abs(new int[]{0, f69.y(m) - f69Var.E()}[1]) < Math.abs(new int[]{0, f69.y(m2) - f69Var.E()}[1])) {
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
        f69 layoutManager;
        View d;
        va vaVar = this.a;
        if (vaVar != null && (layoutManager = vaVar.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] iArr = {0, f69.y(d) - layoutManager.E()};
            int i = iArr[0];
            if (i == 0 && iArr[1] == 0) {
                return;
            }
            this.a.x0(i, iArr[1], null);
        }
    }
}
