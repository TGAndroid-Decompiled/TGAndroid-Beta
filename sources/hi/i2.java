package hi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.a20;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public class i2 extends org.telegram.ui.ActionBar.u2 implements is {
    public static int C1 = 1;
    public kg.g A1;
    public a20 B1;
    public String f14403m1;
    public int n1;
    public final g1 f14404o1;
    public final h1 f14405p1;
    public final i1 f14406q1;
    public final h2 f14407r1;
    public float f14408s1;
    public final boolean f14409t1;
    public final boolean f14410u1;
    public boolean f14411v1;
    public int f14412w1;
    public q4 f14413x1;
    public float f14414y1;
    public v10 f14415z1;

    public i2(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(1, context, e6Var, true);
        int i7;
        this.f14403m1 = null;
        this.n1 = -1;
        this.f14404o1 = new TLRPC.Document();
        this.f14405p1 = new TLRPC.Document();
        this.f14408s1 = -1.0f;
        this.f14409t1 = z10;
        this.f14410u1 = z11;
        this.G = true;
        P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, e6Var));
        this.f14412w1 = this.H0;
        this.f29721x = true;
        G0(false);
        this.f29682b = new k1(this, context);
        i1 i1Var = new i1(0, context, this);
        this.f14406q1 = i1Var;
        if (z10) {
            i7 = 0;
        } else {
            i7 = C1;
        }
        i1Var.f41298b = i7;
        i1Var.setAdapter(new j1(this, z10, context));
        this.f29682b.addView(i1Var, c8.ja.e(-1, -1, 87));
        new p3(this.f29682b, false, new d1(this, 0));
        if (!z10) {
            h2 h2Var = new h2(context);
            this.f14407r1 = h2Var;
            h2Var.H = new d1(this, 1);
            h2Var.G = i1Var.f41298b;
            h2Var.invalidate();
            this.f29682b.addView(h2Var, c8.ja.e(-1, -2, 87));
        }
        ns.f(this.f29679a).c(this, ns.f25601x0);
        ns.f(this.f29679a).c(this, ns.B0);
        boolean z12 = org.telegram.messenger.a8.f22472j;
        if (!z10) {
            si.b0(this.f29679a).B(5);
            si.b0(this.f29679a).w();
            si.b0(this.f29679a).V0(0, true, true, false);
        }
        si.b0(this.f29679a).B(0);
        si.b0(this.f29679a).V0(0, false, true, false);
        si.b0(this.f29679a).V0(2, false, true, false);
        si.b0(this.f29679a).V0(7, false, true, false);
    }

    @Override
    public final boolean H() {
        if (this.f14406q1.getTranslationY() >= ((int) this.f14408s1)) {
            return true;
        }
        return false;
    }

    public boolean I0(Integer num) {
        return true;
    }

    public boolean J0(Integer num) {
        return true;
    }

    public boolean K0(Runnable runnable) {
        return true;
    }

    public final void L0() {
        View[] viewPages;
        d2 d2Var;
        this.d = false;
        this.f29685c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f28644w).start();
        for (View view : this.f14406q1.getViewPages()) {
            if (view instanceof y1) {
                d2 d2Var2 = ((y1) view).f15411f;
                if (d2Var2 != null) {
                    org.telegram.messenger.g0.v1(d2Var2.f14091e);
                }
            } else if ((view instanceof t1) && (d2Var = ((t1) view).d) != null) {
                org.telegram.messenger.g0.v1(d2Var.f14091e);
            }
        }
    }

    public final void M0(int i7) {
        if (I0(Integer.valueOf(i7))) {
            if ((i7 != 1 || K0(new ai.w0(this, i7, 7))) && ((Boolean) this.B1.a(Integer.valueOf(i7))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void N0(a20 a20Var) {
        View[] viewPages;
        this.B1 = a20Var;
        for (View view : this.f14406q1.getViewPages()) {
            if (view instanceof y1) {
                x1 x1Var = ((y1) view).f15409c;
                if (x1Var.I == null) {
                    x1Var.D(null);
                }
            }
        }
    }

    @Override
    public final int S() {
        if (this.f29682b.getMeasuredHeight() <= 0) {
            return org.telegram.messenger.g0.f23611q.y;
        }
        return (int) (this.f29682b.getMeasuredHeight() - this.f14406q1.getY());
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        View[] viewPages;
        int i11 = ns.f25601x0;
        int i12 = ns.B0;
        if (i7 == i11 || i7 == i12) {
            for (View view : this.f14406q1.getViewPages()) {
                if (view instanceof y1) {
                    y1 y1Var = (y1) view;
                    if (i7 == i12 || ((y1Var.f15179a == 0 && ((Integer) objArr[0]).intValue() == 5) || (y1Var.f15179a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        x1 x1Var = y1Var.f15409c;
                        if (x1Var.I == null) {
                            x1Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        ns.f(this.f29679a).n(this, ns.f25601x0);
        ns.f(this.f29679a).n(this, ns.B0);
        L0();
        super.dismiss();
        boolean z10 = org.telegram.messenger.a8.f22472j;
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 < 0 && this.H0 == this.f14412w1 && (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0)) != this.H0) {
                this.H0 = w02;
                this.f14412w1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
