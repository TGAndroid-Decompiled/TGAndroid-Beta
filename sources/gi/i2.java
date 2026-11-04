package gi;

import android.content.Context;
import android.view.View;
import b8.mf;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.q10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public class i2 extends org.telegram.ui.ActionBar.t2 implements cs {
    public static int f12950z1 = 1;
    public String f12951j1;
    public int k1;
    public final e1 f12952l1;
    public final f1 m1;
    public final g1 f12953n1;
    public final h2 f12954o1;
    public float f12955p1;
    public final boolean f12956q1;
    public final boolean f12957r1;
    public boolean f12958s1;
    public int f12959t1;
    public q4 f12960u1;
    public float f12961v1;
    public q10 f12962w1;
    public lg.g f12963x1;
    public v10 f12964y1;

    public i2(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(1, context, e6Var, true);
        int i3;
        this.f12951j1 = null;
        this.k1 = -1;
        this.f12952l1 = new TLRPC.Document();
        this.m1 = new TLRPC.Document();
        this.f12955p1 = -1.0f;
        this.f12956q1 = z10;
        this.f12957r1 = z11;
        this.G = true;
        O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, e6Var));
        this.f12959t1 = this.H0;
        this.f28622x = true;
        G0(false);
        this.f28586b = new i1(this, context);
        g1 g1Var = new g1(0, context, this);
        this.f12953n1 = g1Var;
        if (z10) {
            i3 = 0;
        } else {
            i3 = f12950z1;
        }
        g1Var.f36384b = i3;
        g1Var.setAdapter(new h1(this, z10, context));
        this.f28586b.addView(g1Var, mf.e(-1, -1, 87));
        new p3(this.f28586b, false, new c1(this, 0));
        if (!z10) {
            h2 h2Var = new h2(context);
            this.f12954o1 = h2Var;
            h2Var.H = new c1(this, 1);
            h2Var.G = g1Var.f36384b;
            h2Var.invalidate();
            this.f28586b.addView(h2Var, mf.e(-1, -2, 87));
        }
        hs.f(this.f28583a).c(this, hs.f23333x0);
        hs.f(this.f28583a).c(this, hs.B0);
        boolean z12 = org.telegram.messenger.a8.f21471j;
        if (!z10) {
            li.b0(this.f28583a).B(5);
            li.b0(this.f28583a).w();
            li.b0(this.f28583a).V0(0, true, true, false);
        }
        li.b0(this.f28583a).B(0);
        li.b0(this.f28583a).V0(0, false, true, false);
        li.b0(this.f28583a).V0(2, false, true, false);
        li.b0(this.f28583a).V0(7, false, true, false);
    }

    @Override
    public final boolean G() {
        if (this.f12953n1.getTranslationY() >= ((int) this.f12955p1)) {
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
        this.f28589c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.h1.f27551w).start();
        for (View view : this.f12953n1.getViewPages()) {
            if (view instanceof y1) {
                d2 d2Var2 = ((y1) view).f13917f;
                if (d2Var2 != null) {
                    org.telegram.messenger.g0.v1(d2Var2.f12551e);
                }
            } else if ((view instanceof t1) && (d2Var = ((t1) view).d) != null) {
                org.telegram.messenger.g0.v1(d2Var.f12551e);
            }
        }
    }

    public final void M0(int i3) {
        if (I0(Integer.valueOf(i3))) {
            if ((i3 != 1 || K0(new cg.l0(this, i3, 7))) && ((Boolean) this.f12964y1.a(Integer.valueOf(i3))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void N0(v10 v10Var) {
        View[] viewPages;
        this.f12964y1 = v10Var;
        for (View view : this.f12953n1.getViewPages()) {
            if (view instanceof y1) {
                x1 x1Var = ((y1) view).f13915c;
                if (x1Var.I == null) {
                    x1Var.D(null);
                }
            }
        }
    }

    @Override
    public final int R() {
        if (this.f28586b.getMeasuredHeight() <= 0) {
            return org.telegram.messenger.g0.f22608q.y;
        }
        return (int) (this.f28586b.getMeasuredHeight() - this.f12953n1.getY());
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        View[] viewPages;
        int i11 = hs.f23333x0;
        int i12 = hs.B0;
        if (i3 == i11 || i3 == i12) {
            for (View view : this.f12953n1.getViewPages()) {
                if (view instanceof y1) {
                    y1 y1Var = (y1) view;
                    if (i3 == i12 || ((y1Var.f13653a == 0 && ((Integer) objArr[0]).intValue() == 5) || (y1Var.f13653a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        x1 x1Var = y1Var.f13915c;
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
        hs.f(this.f28583a).n(this, hs.f23333x0);
        hs.f(this.f28583a).n(this, hs.B0);
        L0();
        super.dismiss();
        boolean z10 = org.telegram.messenger.a8.f21471j;
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 < 0 && this.H0 == this.f12959t1 && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0)) != this.H0) {
                this.H0 = w02;
                this.f12959t1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
