package hi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.messenger.s10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public class r2 extends org.telegram.ui.ActionBar.w2 implements fs {
    public static int D1 = 1;
    public kg.g A1;
    public x10 B1;
    public final ArrayList C1;
    public String f15276m1;
    public int n1;
    public final o1 f15277o1;
    public final p1 f15278p1;
    public final q1 f15279q1;
    public final q2 f15280r1;
    public float f15281s1;
    public final boolean f15282t1;
    public final boolean f15283u1;
    public boolean f15284v1;
    public int f15285w1;
    public bi.b f15286x1;
    public float f15287y1;
    public s10 f15288z1;

    public r2(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(1, context, i6Var, true);
        int i7;
        this.f15276m1 = null;
        this.n1 = -1;
        this.f15277o1 = new TLRPC.Document();
        this.f15278p1 = new TLRPC.Document();
        this.f15281s1 = -1.0f;
        this.C1 = new ArrayList();
        this.f15282t1 = z10;
        this.f15283u1 = z11;
        this.G = true;
        P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, i6Var));
        this.f15285w1 = this.H0;
        this.f30265x = true;
        G0(false);
        this.f30226b = new s1(this, context);
        q1 q1Var = new q1(0, context, this);
        this.f15279q1 = q1Var;
        if (z10) {
            i7 = 0;
        } else {
            i7 = D1;
        }
        q1Var.f36663b = i7;
        q1Var.setAdapter(new r1(this, z10, context));
        this.f30226b.addView(q1Var, c8.na.e(-1, -1, 87));
        new x3(this.f30226b, false, new m1(this, 0));
        if (!z10) {
            q2 q2Var = new q2(context);
            this.f15280r1 = q2Var;
            q2Var.H = new m1(this, 1);
            q2Var.G = q1Var.f36663b;
            q2Var.invalidate();
            this.f30226b.addView(q2Var, c8.na.e(-1, -2, 87));
        }
        ks.f(this.f30223a).c(this, ks.f25317x0);
        ks.f(this.f30223a).c(this, ks.B0);
        boolean z12 = org.telegram.messenger.a8.f22949j;
        if (!z10) {
            ri.d0(this.f30223a).D(5);
            ri.d0(this.f30223a).y();
            ri.d0(this.f30223a).Y0(0, true, true, false);
        }
        ri.d0(this.f30223a).D(0);
        ri.d0(this.f30223a).Y0(0, false, true, false);
        ri.d0(this.f30223a).Y0(2, false, true, false);
        ri.d0(this.f30223a).Y0(7, false, true, false);
    }

    @Override
    public final boolean F() {
        if (this.f15279q1.getTranslationY() >= ((int) this.f15281s1)) {
            return true;
        }
        return false;
    }

    public boolean J0(Integer num) {
        return true;
    }

    public boolean K0(Integer num) {
        if (num.intValue() != 6) {
            return true;
        }
        return false;
    }

    public boolean L0(Runnable runnable) {
        return true;
    }

    public final void M0() {
        View[] viewPages;
        l2 l2Var;
        this.d = false;
        this.f30229c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f29066w).start();
        for (View view : this.f15279q1.getViewPages()) {
            if (view instanceof g2) {
                l2 l2Var2 = ((g2) view).f14523f;
                if (l2Var2 != null) {
                    org.telegram.messenger.g0.v1(l2Var2.f14825e);
                }
            } else if ((view instanceof b2) && (l2Var = ((b2) view).d) != null) {
                org.telegram.messenger.g0.v1(l2Var.f14825e);
            }
        }
    }

    public final void N0(int i7) {
        if (J0(Integer.valueOf(i7))) {
            if ((i7 != 1 || L0(new ai.u0(this, i7, 12))) && ((Boolean) this.B1.a(Integer.valueOf(i7))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void O0() {
        boolean z10;
        ArrayList arrayList = this.C1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            p2 p2Var = (p2) obj;
            boolean K0 = p2Var.f15180f.K0(6);
            ArrayList arrayList2 = p2Var.f15178c;
            int size2 = arrayList2.size();
            int i10 = -1;
            int i11 = 0;
            while (true) {
                z10 = true;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                int i12 = ((m2) arrayList2.get(i11)).f14880a;
                if (i12 == 6) {
                    i10 = i11;
                }
                if (size2 == arrayList2.size() && (i12 == 1 || i12 == 2 || i12 == 3)) {
                    size2 = i11;
                }
                i11++;
            }
            if (i10 < 0) {
                z10 = false;
            }
            if (K0 != z10) {
                if (K0) {
                    arrayList2.add(size2, new n2(p2Var, 6, 2131231190, gd.N0(2131744199, null)));
                } else {
                    arrayList2.remove(i10);
                }
                p2Var.requestLayout();
                p2Var.invalidate();
            }
        }
    }

    public final void P0(x10 x10Var) {
        View[] viewPages;
        this.B1 = x10Var;
        for (View view : this.f15279q1.getViewPages()) {
            if (view instanceof g2) {
                f2 f2Var = ((g2) view).f14521c;
                if (f2Var.I == null) {
                    f2Var.D(null);
                }
            }
        }
    }

    @Override
    public final int S() {
        if (this.f30226b.getMeasuredHeight() <= 0) {
            return org.telegram.messenger.g0.f24226q.y;
        }
        return (int) (this.f30226b.getMeasuredHeight() - this.f15279q1.getY());
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        View[] viewPages;
        int i11 = ks.f25317x0;
        int i12 = ks.B0;
        if (i7 == i11 || i7 == i12) {
            for (View view : this.f15279q1.getViewPages()) {
                if (view instanceof g2) {
                    g2 g2Var = (g2) view;
                    if (i7 == i12 || ((g2Var.f14262a == 0 && ((Integer) objArr[0]).intValue() == 5) || (g2Var.f14262a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        f2 f2Var = g2Var.f14521c;
                        if (f2Var.I == null) {
                            f2Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        ks.f(this.f30223a).n(this, ks.f25317x0);
        ks.f(this.f30223a).n(this, ks.B0);
        M0();
        super.dismiss();
        boolean z10 = org.telegram.messenger.a8.f22949j;
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 < 0 && this.H0 == this.f15285w1 && (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, this.J0)) != this.H0) {
                this.H0 = w02;
                this.f15285w1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
