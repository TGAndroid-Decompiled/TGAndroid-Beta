package ei;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.ui.Components.da;
import org.telegram.ui.ls0;
public final class v7 implements b5.h {
    public final int f11129a;
    public final Object f11130b;
    public final KeyEvent.Callback f11131c;

    public v7(int i3, KeyEvent.Callback callback, Object obj) {
        this.f11129a = i3;
        this.f11131c = callback;
        this.f11130b = obj;
    }

    @Override
    public final void a(int i3) {
        int i10 = this.f11129a;
        KeyEvent.Callback callback = this.f11131c;
        switch (i10) {
            case 0:
                r9 r9Var = (r9) this.f11130b;
                x xVar = (x) callback;
                j4 currentPeerView = xVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    c4 c4Var = xVar.C0;
                    i9 i9Var = (i9) c4Var;
                    i9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    xVar.F();
                    n9 n9Var = r9Var.f10953u0;
                    if (n9Var != null) {
                        if (i3 < 3) {
                            n9Var.c(false);
                            return;
                        } else if (i3 > xVar.A0.b() - 4) {
                            r9Var.f10953u0.c(true);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                vg.v0 v0Var = (vg.v0) callback;
                ArrayList arrayList = v0Var.f56875l1;
                if (((ls0) arrayList.get(i3)).f47430a == 0) {
                    v0Var.F1.setTitle(bd.M0(2131751350, null));
                    v0Var.F1.requestLayout();
                } else if (((ls0) arrayList.get(i3)).f47430a == 14) {
                    v0Var.F1.setTitle(bd.M0(2131743815, null));
                    v0Var.F1.requestLayout();
                } else if (((ls0) arrayList.get(i3)).f47430a == 40) {
                    v0Var.F1.setTitle(bd.M0(2131750838, null));
                    v0Var.F1.requestLayout();
                } else if (((ls0) arrayList.get(i3)).f47430a == 28) {
                    v0Var.F1.setTitle(bd.M0(2131744262, null));
                    v0Var.F1.requestLayout();
                }
                d();
                return;
        }
    }

    @Override
    public final void b(float f10, int i3, int i10) {
        int i11;
        int i12;
        switch (this.f11129a) {
            case 0:
                x xVar = (x) this.f11131c;
                xVar.J0 = i3;
                if (i10 > 0) {
                    i11 = i3 + 1;
                } else {
                    i11 = i3 - 1;
                }
                xVar.K0 = i11;
                xVar.L0 = f10;
                long j10 = h10.i(xVar.f11212z0).f22848n;
                int i13 = xVar.J0;
                if (i13 >= 0 && (xVar.f11211y0 != null ? xVar.f11210x0 == j10 : !(i13 >= xVar.B0.size() || ((Long) xVar.B0.get(xVar.J0)).longValue() != j10))) {
                    ((i9) xVar.C0).d(1.0f - xVar.L0);
                    return;
                }
                int i14 = xVar.K0;
                if (i14 >= 0 && (xVar.f11211y0 != null ? xVar.f11210x0 == j10 : !(i14 >= xVar.B0.size() || ((Long) xVar.B0.get(xVar.K0)).longValue() != j10))) {
                    ((i9) xVar.C0).d(xVar.L0);
                    return;
                }
                ((i9) xVar.C0).d(0.0f);
                return;
            default:
                da daVar = (da) this.f11130b;
                daVar.f33027b = f10;
                daVar.f33028c = i3;
                daVar.invalidate();
                vg.v0 v0Var = (vg.v0) this.f11131c;
                v0Var.f56887y1 = i3;
                if (i10 > 0) {
                    i12 = i3 + 1;
                } else {
                    i12 = i3 - 1;
                }
                v0Var.f56888z1 = i12;
                v0Var.A1 = f10;
                d();
                return;
        }
    }

    @Override
    public final void c(int i3) {
        switch (this.f11129a) {
            case 0:
                x xVar = (x) this.f11131c;
                ((i9) xVar.C0).d.d0();
                Runnable runnable = xVar.H0;
                if (runnable != null && i3 == 0) {
                    runnable.run();
                    xVar.H0 = null;
                }
                xVar.G0 = i3;
                r9 r9Var = ((g9) xVar).S0;
                if (r9Var.f10939o0.G0 == 1) {
                    org.telegram.messenger.g0.r(r9Var.f10916c1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void d() {
        boolean z10;
        boolean z11;
        int i3;
        int i10;
        vg.v0 v0Var = (vg.v0) this.f11131c;
        vg.t0 t0Var = v0Var.f56878p1;
        ArrayList arrayList = v0Var.f56875l1;
        int i11 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i11 >= t0Var.getChildCount()) {
                break;
            }
            vg.u0 u0Var = (vg.u0) t0Var.getChildAt(i11);
            if (!v0Var.f56882t1 || !(u0Var.f56869f instanceof vg.m0)) {
                int i12 = u0Var.f56865a;
                vg.k0 k0Var = u0Var.f56868e;
                if (i12 == v0Var.f56887y1) {
                    f10 = (-u0Var.getMeasuredWidth()) * v0Var.A1;
                    k0Var.setOffset(f10);
                } else if (i12 == v0Var.f56888z1) {
                    f10 = ((-u0Var.getMeasuredWidth()) * v0Var.A1) + u0Var.getMeasuredWidth();
                    k0Var.setOffset(f10);
                } else {
                    k0Var.setOffset(u0Var.getMeasuredWidth());
                }
            }
            if (u0Var.f56869f instanceof vg.m0) {
                u0Var.setTranslationX(-f10);
                u0Var.f56866b.setTranslationX(f10);
                u0Var.f56867c.setTranslationX(f10);
            }
            i11++;
        }
        int i13 = v0Var.f56887y1;
        if (i13 >= 0 && i13 < arrayList.size() && ((i10 = ((ls0) arrayList.get(v0Var.f56887y1)).f47430a) == 0 || i10 == 14 || i10 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i14 = v0Var.f56888z1;
        if (i14 >= 0 && i14 < arrayList.size() && ((i3 = ((ls0) arrayList.get(v0Var.f56888z1)).f47430a) == 0 || i3 == 14 || i3 == 28)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            v0Var.f56876n1 = 1.0f;
            float f11 = v0Var.A1;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            v0Var.m1 = f11;
            v0Var.f56877o1 = true;
        } else if (z10) {
            float f12 = 1.0f - v0Var.A1;
            v0Var.m1 = f12;
            v0Var.f56876n1 = f12;
            v0Var.f56877o1 = true;
        } else if (z11) {
            float f13 = v0Var.A1;
            v0Var.m1 = f13;
            v0Var.f56876n1 = f13;
            v0Var.f56877o1 = false;
        } else {
            v0Var.m1 = 0.0f;
            v0Var.f56876n1 = 0.0f;
            v0Var.f56877o1 = true;
        }
        int i15 = (int) ((1.0f - v0Var.m1) * 255.0f);
        if (i15 != v0Var.C1) {
            v0Var.C1 = i15;
            v0Var.f56879q1.invalidate();
            org.telegram.messenger.g0.h3(new r4.u(this, 20));
        }
    }

    private final void e(int i3) {
    }
}
