package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public class k2 extends org.telegram.ui.ActionBar.w2 implements ls {
    public static int B1 = 1;
    public d20 A1;
    public String l1;
    public int f12254m1;
    public final e1 n1;
    public final f1 f12255o1;
    public final g1 f12256p1;
    public final j2 f12257q1;
    public float f12258r1;
    public final boolean f12259s1;
    public final boolean f12260t1;
    public boolean f12261u1;
    public int f12262v1;
    public ai.e f12263w1;
    public float f12264x1;
    public y10 f12265y1;
    public kg.g f12266z1;

    public k2(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10) {
        super(1, context, h6Var, true);
        int i7;
        this.l1 = null;
        this.f12254m1 = -1;
        this.n1 = new TLRPC.Document();
        this.f12255o1 = new TLRPC.Document();
        this.f12258r1 = -1.0f;
        this.f12259s1 = z9;
        this.f12260t1 = z10;
        this.F = true;
        O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, h6Var));
        this.f12262v1 = this.G0;
        this.f28710x = true;
        G0(false);
        this.f28672b = new i1(this, context);
        g1 g1Var = new g1(0, context, this);
        this.f12256p1 = g1Var;
        if (z9) {
            i7 = 0;
        } else {
            i7 = B1;
        }
        g1Var.f38891b = i7;
        g1Var.setAdapter(new h1(this, z9, context));
        this.f28672b.addView(g1Var, c8.ha.e(-1, -1, 87));
        new q3(this.f28672b, false, new c1(this, 0));
        if (!z9) {
            j2 j2Var = new j2(context);
            this.f12257q1 = j2Var;
            j2Var.G = new c1(this, 1);
            j2Var.F = g1Var.f38891b;
            j2Var.invalidate();
            this.f28672b.addView(j2Var, c8.ha.e(-1, -2, 87));
        }
        qs.f(this.f28669a).c(this, qs.f25108x0);
        qs.f(this.f28669a).c(this, qs.B0);
        boolean z11 = org.telegram.messenger.a8.f21400j;
        if (!z9) {
            ui.b0(this.f28669a).B(5);
            ui.b0(this.f28669a).w();
            ui.b0(this.f28669a).V0(0, true, true, false);
        }
        ui.b0(this.f28669a).B(0);
        ui.b0(this.f28669a).V0(0, false, true, false);
        ui.b0(this.f28669a).V0(2, false, true, false);
        ui.b0(this.f28669a).V0(7, false, true, false);
    }

    @Override
    public final boolean G() {
        if (this.f12256p1.getTranslationY() >= ((int) this.f12258r1)) {
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
        e2 e2Var;
        this.d = false;
        this.f28675c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f27527w).start();
        for (View view : this.f12256p1.getViewPages()) {
            if (view instanceof z1) {
                e2 e2Var2 = ((z1) view).f13240f;
                if (e2Var2 != null) {
                    org.telegram.messenger.g0.v1(e2Var2.f11862e);
                }
            } else if ((view instanceof t1) && (e2Var = ((t1) view).d) != null) {
                org.telegram.messenger.g0.v1(e2Var.f11862e);
            }
        }
    }

    public final void M0(int i7) {
        if (I0(Integer.valueOf(i7))) {
            if ((i7 != 1 || K0(new bg.m0(this, i7, 7))) && ((Boolean) this.A1.a(Integer.valueOf(i7))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void N0(d20 d20Var) {
        View[] viewPages;
        this.A1 = d20Var;
        for (View view : this.f12256p1.getViewPages()) {
            if (view instanceof z1) {
                y1 y1Var = ((z1) view).f13238c;
                if (y1Var.H == null) {
                    y1Var.D(null);
                }
            }
        }
    }

    @Override
    public final int R() {
        if (this.f28672b.getMeasuredHeight() <= 0) {
            return org.telegram.messenger.g0.f22567q.y;
        }
        return (int) (this.f28672b.getMeasuredHeight() - this.f12256p1.getY());
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        View[] viewPages;
        int i11 = qs.f25108x0;
        int i12 = qs.B0;
        if (i7 == i11 || i7 == i12) {
            for (View view : this.f12256p1.getViewPages()) {
                if (view instanceof z1) {
                    z1 z1Var = (z1) view;
                    if (i7 == i12 || ((z1Var.f12883a == 0 && ((Integer) objArr[0]).intValue() == 5) || (z1Var.f12883a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        y1 y1Var = z1Var.f13238c;
                        if (y1Var.H == null) {
                            y1Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        qs.f(this.f28669a).n(this, qs.f25108x0);
        qs.f(this.f28669a).n(this, qs.B0);
        L0();
        super.dismiss();
        boolean z9 = org.telegram.messenger.a8.f21400j;
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 < 0 && this.G0 == this.f12262v1 && (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.I0)) != this.G0) {
                this.G0 = w02;
                this.f12262v1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
