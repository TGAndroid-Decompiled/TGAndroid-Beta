package hi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.si;
import org.telegram.messenger.u10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public class i2 extends org.telegram.ui.ActionBar.w2 implements gs {
    public static int C1 = 1;
    public kg.g A1;
    public z10 B1;
    public String f14774m1;
    public int n1;
    public final g1 f14775o1;
    public final h1 f14776p1;
    public final i1 f14777q1;
    public final h2 f14778r1;
    public float f14779s1;
    public final boolean f14780t1;
    public final boolean f14781u1;
    public boolean f14782v1;
    public int f14783w1;
    public bi.b f14784x1;
    public float f14785y1;
    public u10 f14786z1;

    public i2(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(1, context, h6Var, true);
        int i7;
        this.f14774m1 = null;
        this.n1 = -1;
        this.f14775o1 = new TLRPC.Document();
        this.f14776p1 = new TLRPC.Document();
        this.f14779s1 = -1.0f;
        this.f14780t1 = z10;
        this.f14781u1 = z11;
        this.G = true;
        P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, h6Var));
        this.f14783w1 = this.H0;
        this.f30215x = true;
        G0(false);
        this.f30176b = new k1(this, context);
        i1 i1Var = new i1(0, context, this);
        this.f14777q1 = i1Var;
        if (z10) {
            i7 = 0;
        } else {
            i7 = C1;
        }
        i1Var.f36433b = i7;
        i1Var.setAdapter(new j1(this, z10, context));
        this.f30176b.addView(i1Var, c8.ma.e(-1, -1, 87));
        new o3(this.f30176b, false, new e1(this, 0));
        if (!z10) {
            h2 h2Var = new h2(context);
            this.f14778r1 = h2Var;
            h2Var.H = new e1(this, 1);
            h2Var.G = i1Var.f36433b;
            h2Var.invalidate();
            this.f30176b.addView(h2Var, c8.ma.e(-1, -2, 87));
        }
        ls.f(this.f30173a).c(this, ls.f25412x0);
        ls.f(this.f30173a).c(this, ls.B0);
        boolean z12 = org.telegram.messenger.a8.f22881j;
        if (!z10) {
            si.d0(this.f30173a).D(5);
            si.d0(this.f30173a).y();
            si.d0(this.f30173a).Y0(0, true, true, false);
        }
        si.d0(this.f30173a).D(0);
        si.d0(this.f30173a).Y0(0, false, true, false);
        si.d0(this.f30173a).Y0(2, false, true, false);
        si.d0(this.f30173a).Y0(7, false, true, false);
    }

    @Override
    public final boolean G() {
        if (this.f14777q1.getTranslationY() >= ((int) this.f14779s1)) {
            return true;
        }
        return false;
    }

    public boolean J0(Integer num) {
        return true;
    }

    public boolean K0(Integer num) {
        return true;
    }

    public boolean L0(Runnable runnable) {
        return true;
    }

    public final void M0() {
        View[] viewPages;
        d2 d2Var;
        this.d = false;
        this.f30179c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f29005w).start();
        for (View view : this.f14777q1.getViewPages()) {
            if (view instanceof y1) {
                d2 d2Var2 = ((y1) view).f15783f;
                if (d2Var2 != null) {
                    org.telegram.messenger.g0.v1(d2Var2.f14479e);
                }
            } else if ((view instanceof t1) && (d2Var = ((t1) view).d) != null) {
                org.telegram.messenger.g0.v1(d2Var.f14479e);
            }
        }
    }

    public final void N0(int i7) {
        if (J0(Integer.valueOf(i7))) {
            if ((i7 != 1 || L0(new ai.c1(this, i7, 10))) && ((Boolean) this.B1.a(Integer.valueOf(i7))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void O0(z10 z10Var) {
        View[] viewPages;
        this.B1 = z10Var;
        for (View view : this.f14777q1.getViewPages()) {
            if (view instanceof y1) {
                x1 x1Var = ((y1) view).f15781c;
                if (x1Var.I == null) {
                    x1Var.D(null);
                }
            }
        }
    }

    @Override
    public final int S() {
        if (this.f30176b.getMeasuredHeight() <= 0) {
            return org.telegram.messenger.g0.f24046q.y;
        }
        return (int) (this.f30176b.getMeasuredHeight() - this.f14777q1.getY());
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        View[] viewPages;
        int i11 = ls.f25412x0;
        int i12 = ls.B0;
        if (i7 == i11 || i7 == i12) {
            for (View view : this.f14777q1.getViewPages()) {
                if (view instanceof y1) {
                    y1 y1Var = (y1) view;
                    if (i7 == i12 || ((y1Var.f15536a == 0 && ((Integer) objArr[0]).intValue() == 5) || (y1Var.f15536a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        x1 x1Var = y1Var.f15781c;
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
        ls.f(this.f30173a).n(this, ls.f25412x0);
        ls.f(this.f30173a).n(this, ls.B0);
        M0();
        super.dismiss();
        boolean z10 = org.telegram.messenger.a8.f22881j;
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 < 0 && this.H0 == this.f14783w1 && (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.J0)) != this.H0) {
                this.H0 = w02;
                this.f14783w1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
