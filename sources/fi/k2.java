package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public class k2 extends org.telegram.ui.ActionBar.v2 implements ls {
    public static int f12251y1 = 1;
    public String f12252i1;
    public int f12253j1;
    public final e1 f12254k1;
    public final f1 l1;
    public final g1 f12255m1;
    public final j2 n1;
    public float f12256o1;
    public final boolean f12257p1;
    public final boolean f12258q1;
    public boolean f12259r1;
    public int f12260s1;
    public ai.e f12261t1;
    public float f12262u1;
    public y10 f12263v1;
    public kg.g f12264w1;
    public d20 f12265x1;

    public k2(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10) {
        super(1, context, f6Var, true);
        int i7;
        this.f12252i1 = null;
        this.f12253j1 = -1;
        this.f12254k1 = new TLRPC.Document();
        this.l1 = new TLRPC.Document();
        this.f12256o1 = -1.0f;
        this.f12257p1 = z9;
        this.f12258q1 = z10;
        this.F = true;
        O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, f6Var));
        this.f12260s1 = this.G0;
        this.f28650x = true;
        G0(false);
        this.f28615b = new i1(this, context);
        g1 g1Var = new g1(0, context, this);
        this.f12255m1 = g1Var;
        if (z9) {
            i7 = 0;
        } else {
            i7 = f12251y1;
        }
        g1Var.f36904b = i7;
        g1Var.setAdapter(new h1(this, z9, context));
        this.f28615b.addView(g1Var, c8.ha.e(-1, -1, 87));
        new q3(this.f28615b, false, new c1(this, 0));
        if (!z9) {
            j2 j2Var = new j2(context);
            this.n1 = j2Var;
            j2Var.G = new c1(this, 1);
            j2Var.F = g1Var.f36904b;
            j2Var.invalidate();
            this.f28615b.addView(j2Var, c8.ha.e(-1, -2, 87));
        }
        qs.f(this.f28612a).c(this, qs.f25087x0);
        qs.f(this.f28612a).c(this, qs.B0);
        boolean z11 = org.telegram.messenger.a8.f21397j;
        if (!z9) {
            ui.b0(this.f28612a).B(5);
            ui.b0(this.f28612a).w();
            ui.b0(this.f28612a).V0(0, true, true, false);
        }
        ui.b0(this.f28612a).B(0);
        ui.b0(this.f28612a).V0(0, false, true, false);
        ui.b0(this.f28612a).V0(2, false, true, false);
        ui.b0(this.f28612a).V0(7, false, true, false);
    }

    @Override
    public final boolean G() {
        if (this.f12255m1.getTranslationY() >= ((int) this.f12256o1)) {
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
        this.f28618c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f27540w).start();
        for (View view : this.f12255m1.getViewPages()) {
            if (view instanceof z1) {
                e2 e2Var2 = ((z1) view).f13238f;
                if (e2Var2 != null) {
                    org.telegram.messenger.g0.v1(e2Var2.f11858e);
                }
            } else if ((view instanceof t1) && (e2Var = ((t1) view).d) != null) {
                org.telegram.messenger.g0.v1(e2Var.f11858e);
            }
        }
    }

    public final void M0(int i7) {
        if (I0(Integer.valueOf(i7))) {
            if ((i7 != 1 || K0(new bg.m0(this, i7, 7))) && ((Boolean) this.f12265x1.a(Integer.valueOf(i7))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void N0(d20 d20Var) {
        View[] viewPages;
        this.f12265x1 = d20Var;
        for (View view : this.f12255m1.getViewPages()) {
            if (view instanceof z1) {
                y1 y1Var = ((z1) view).f13236c;
                if (y1Var.H == null) {
                    y1Var.D(null);
                }
            }
        }
    }

    @Override
    public final int R() {
        if (this.f28615b.getMeasuredHeight() <= 0) {
            return org.telegram.messenger.g0.f22537q.y;
        }
        return (int) (this.f28615b.getMeasuredHeight() - this.f12255m1.getY());
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        View[] viewPages;
        int i11 = qs.f25087x0;
        int i12 = qs.B0;
        if (i7 == i11 || i7 == i12) {
            for (View view : this.f12255m1.getViewPages()) {
                if (view instanceof z1) {
                    z1 z1Var = (z1) view;
                    if (i7 == i12 || ((z1Var.f12881a == 0 && ((Integer) objArr[0]).intValue() == 5) || (z1Var.f12881a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        y1 y1Var = z1Var.f13236c;
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
        qs.f(this.f28612a).n(this, qs.f25087x0);
        qs.f(this.f28612a).n(this, qs.B0);
        L0();
        super.dismiss();
        boolean z9 = org.telegram.messenger.a8.f21397j;
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 < 0 && this.G0 == this.f12260s1 && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, this.I0)) != this.G0) {
                this.G0 = w02;
                this.f12260s1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
