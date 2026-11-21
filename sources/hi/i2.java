package hi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.messenger.t10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public class i2 extends org.telegram.ui.ActionBar.w2 implements fs {
    public static int C1 = 1;
    public kg.g A1;
    public y10 B1;
    public String f14771m1;
    public int n1;
    public final g1 f14772o1;
    public final h1 f14773p1;
    public final i1 f14774q1;
    public final h2 f14775r1;
    public float f14776s1;
    public final boolean f14777t1;
    public final boolean f14778u1;
    public boolean f14779v1;
    public int f14780w1;
    public bi.b f14781x1;
    public float f14782y1;
    public t10 f14783z1;

    public i2(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(1, context, h6Var, true);
        int i7;
        this.f14771m1 = null;
        this.n1 = -1;
        this.f14772o1 = new TLRPC.Document();
        this.f14773p1 = new TLRPC.Document();
        this.f14776s1 = -1.0f;
        this.f14777t1 = z10;
        this.f14778u1 = z11;
        this.G = true;
        P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29451h5, h6Var));
        this.f14780w1 = this.H0;
        this.f30212x = true;
        G0(false);
        this.f30173b = new k1(this, context);
        i1 i1Var = new i1(0, context, this);
        this.f14774q1 = i1Var;
        if (z10) {
            i7 = 0;
        } else {
            i7 = C1;
        }
        i1Var.f36438b = i7;
        i1Var.setAdapter(new j1(this, z10, context));
        this.f30173b.addView(i1Var, c8.ma.e(-1, -1, 87));
        new o3(this.f30173b, false, new e1(this, 0));
        if (!z10) {
            h2 h2Var = new h2(context);
            this.f14775r1 = h2Var;
            h2Var.H = new e1(this, 1);
            h2Var.G = i1Var.f36438b;
            h2Var.invalidate();
            this.f30173b.addView(h2Var, c8.ma.e(-1, -2, 87));
        }
        ks.f(this.f30170a).c(this, ks.f25246x0);
        ks.f(this.f30170a).c(this, ks.B0);
        boolean z12 = org.telegram.messenger.a8.f22866j;
        if (!z10) {
            ri.d0(this.f30170a).D(5);
            ri.d0(this.f30170a).y();
            ri.d0(this.f30170a).Y0(0, true, true, false);
        }
        ri.d0(this.f30170a).D(0);
        ri.d0(this.f30170a).Y0(0, false, true, false);
        ri.d0(this.f30170a).Y0(2, false, true, false);
        ri.d0(this.f30170a).Y0(7, false, true, false);
    }

    @Override
    public final boolean G() {
        if (this.f14774q1.getTranslationY() >= ((int) this.f14776s1)) {
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
        this.f30176c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f29002w).start();
        for (View view : this.f14774q1.getViewPages()) {
            if (view instanceof y1) {
                d2 d2Var2 = ((y1) view).f15780f;
                if (d2Var2 != null) {
                    org.telegram.messenger.g0.v1(d2Var2.f14476e);
                }
            } else if ((view instanceof t1) && (d2Var = ((t1) view).d) != null) {
                org.telegram.messenger.g0.v1(d2Var.f14476e);
            }
        }
    }

    public final void N0(int i7) {
        if (J0(Integer.valueOf(i7))) {
            if ((i7 != 1 || L0(new ai.y0(this, i7, 10))) && ((Boolean) this.B1.a(Integer.valueOf(i7))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void O0(y10 y10Var) {
        View[] viewPages;
        this.B1 = y10Var;
        for (View view : this.f14774q1.getViewPages()) {
            if (view instanceof y1) {
                x1 x1Var = ((y1) view).f15778c;
                if (x1Var.I == null) {
                    x1Var.D(null);
                }
            }
        }
    }

    @Override
    public final int S() {
        if (this.f30173b.getMeasuredHeight() <= 0) {
            return org.telegram.messenger.g0.f24146q.y;
        }
        return (int) (this.f30173b.getMeasuredHeight() - this.f14774q1.getY());
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        View[] viewPages;
        int i11 = ks.f25246x0;
        int i12 = ks.B0;
        if (i7 == i11 || i7 == i12) {
            for (View view : this.f14774q1.getViewPages()) {
                if (view instanceof y1) {
                    y1 y1Var = (y1) view;
                    if (i7 == i12 || ((y1Var.f15533a == 0 && ((Integer) objArr[0]).intValue() == 5) || (y1Var.f15533a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        x1 x1Var = y1Var.f15778c;
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
        ks.f(this.f30170a).n(this, ks.f25246x0);
        ks.f(this.f30170a).n(this, ks.B0);
        M0();
        super.dismiss();
        boolean z10 = org.telegram.messenger.a8.f22866j;
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 < 0 && this.H0 == this.f14780w1 && (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29451h5, this.J0)) != this.H0) {
                this.H0 = w02;
                this.f14780w1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
