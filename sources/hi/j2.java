package hi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.messenger.t10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public class j2 extends org.telegram.ui.ActionBar.x2 implements fs {
    public static int C1 = 1;
    public kg.g A1;
    public y10 B1;
    public String f14796m1;
    public int n1;
    public final g1 f14797o1;
    public final h1 f14798p1;
    public final i1 f14799q1;
    public final i2 f14800r1;
    public float f14801s1;
    public final boolean f14802t1;
    public final boolean f14803u1;
    public boolean f14804v1;
    public int f14805w1;
    public bi.b f14806x1;
    public float f14807y1;
    public t10 f14808z1;

    public j2(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(1, context, i6Var, true);
        int i7;
        this.f14796m1 = null;
        this.n1 = -1;
        this.f14797o1 = new TLRPC.Document();
        this.f14798p1 = new TLRPC.Document();
        this.f14801s1 = -1.0f;
        this.f14802t1 = z10;
        this.f14803u1 = z11;
        this.G = true;
        P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, i6Var));
        this.f14805w1 = this.H0;
        this.f30231x = true;
        G0(false);
        this.f30192b = new k1(this, context);
        i1 i1Var = new i1(0, context, this);
        this.f14799q1 = i1Var;
        if (z10) {
            i7 = 0;
        } else {
            i7 = C1;
        }
        i1Var.f35376b = i7;
        i1Var.setAdapter(new j1(this, z10, context));
        this.f30192b.addView(i1Var, c8.ma.e(-1, -1, 87));
        new p3(this.f30192b, false, new e1(this, 0));
        if (!z10) {
            i2 i2Var = new i2(context);
            this.f14800r1 = i2Var;
            i2Var.H = new e1(this, 1);
            i2Var.G = i1Var.f35376b;
            i2Var.invalidate();
            this.f30192b.addView(i2Var, c8.ma.e(-1, -2, 87));
        }
        ks.f(this.f30189a).c(this, ks.f25220x0);
        ks.f(this.f30189a).c(this, ks.B0);
        boolean z12 = org.telegram.messenger.a8.f22841j;
        if (!z10) {
            ri.d0(this.f30189a).D(5);
            ri.d0(this.f30189a).y();
            ri.d0(this.f30189a).Y0(0, true, true, false);
        }
        ri.d0(this.f30189a).D(0);
        ri.d0(this.f30189a).Y0(0, false, true, false);
        ri.d0(this.f30189a).Y0(2, false, true, false);
        ri.d0(this.f30189a).Y0(7, false, true, false);
    }

    @Override
    public final boolean G() {
        if (this.f14799q1.getTranslationY() >= ((int) this.f14801s1)) {
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
        e2 e2Var;
        this.d = false;
        this.f30195c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.j1.f29019w).start();
        for (View view : this.f14799q1.getViewPages()) {
            if (view instanceof z1) {
                e2 e2Var2 = ((z1) view).f15805f;
                if (e2Var2 != null) {
                    org.telegram.messenger.g0.v1(e2Var2.f14528e);
                }
            } else if ((view instanceof u1) && (e2Var = ((u1) view).d) != null) {
                org.telegram.messenger.g0.v1(e2Var.f14528e);
            }
        }
    }

    public final void N0(int i7) {
        if (J0(Integer.valueOf(i7))) {
            if ((i7 != 1 || L0(new ai.w0(this, i7, 10))) && ((Boolean) this.B1.a(Integer.valueOf(i7))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void O0(y10 y10Var) {
        View[] viewPages;
        this.B1 = y10Var;
        for (View view : this.f14799q1.getViewPages()) {
            if (view instanceof z1) {
                y1 y1Var = ((z1) view).f15803c;
                if (y1Var.I == null) {
                    y1Var.D(null);
                }
            }
        }
    }

    @Override
    public final int S() {
        if (this.f30192b.getMeasuredHeight() <= 0) {
            return org.telegram.messenger.g0.f24121q.y;
        }
        return (int) (this.f30192b.getMeasuredHeight() - this.f14799q1.getY());
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        View[] viewPages;
        int i11 = ks.f25220x0;
        int i12 = ks.B0;
        if (i7 == i11 || i7 == i12) {
            for (View view : this.f14799q1.getViewPages()) {
                if (view instanceof z1) {
                    z1 z1Var = (z1) view;
                    if (i7 == i12 || ((z1Var.f15570a == 0 && ((Integer) objArr[0]).intValue() == 5) || (z1Var.f15570a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        y1 y1Var = z1Var.f15803c;
                        if (y1Var.I == null) {
                            y1Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        ks.f(this.f30189a).n(this, ks.f25220x0);
        ks.f(this.f30189a).n(this, ks.B0);
        M0();
        super.dismiss();
        boolean z10 = org.telegram.messenger.a8.f22841j;
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 < 0 && this.H0 == this.f14805w1 && (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, this.J0)) != this.H0) {
                this.H0 = w02;
                this.f14805w1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
