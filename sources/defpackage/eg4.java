package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.FiltersSetupActivity;
public final class eg4 extends iu5 {
    public final byte e = 0;
    public final Runnable f = new lw3(this, (byte) 23);
    public final Object g;

    public eg4(FiltersSetupActivity filtersSetupActivity) {
        this.g = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, f89 f89Var) {
        switch (this.e) {
            case 0:
                super.a(recyclerView, f89Var);
                View view = f89Var.a;
                view.setPressed(false);
                view.setBackground(null);
                view.setTag(2131296421, null);
                return;
            default:
                super.a(recyclerView, f89Var);
                View view2 = f89Var.a;
                view2.setPressed(false);
                view2.setTag(2131296421, null);
                if (view2 instanceof eh4) {
                    ((eh4) view2).setDragging(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final int f(RecyclerView recyclerView, f89 f89Var) {
        switch (this.e) {
            case 0:
                fg4 fg4Var = (fg4) this.g;
                if (uc7.s1(yac.t0).M3() && (!fg4Var.n || (f89Var.b() == 0 && ((bg4) fg4Var.h.get(0)).e && !yac.h(yac.t0).p()))) {
                    return iu5.m(0, 0);
                }
                return iu5.m(12, 0);
            default:
                if (f89Var.f != 2) {
                    return iu5.m(0, 0);
                }
                return iu5.m(3, 0);
        }
    }

    @Override
    public final boolean l() {
        switch (this.e) {
            case 0:
                return ((fg4) this.g).n;
            default:
                return true;
        }
    }

    @Override
    public final boolean o(RecyclerView recyclerView, f89 f89Var, f89 f89Var2) {
        ac7 ac7Var;
        ac7 ac7Var2;
        byte b = this.e;
        Object obj = this.g;
        switch (b) {
            case 0:
                if (uc7.s1(yac.t0).M3() && ((f89Var.b() == 0 || f89Var2.b() == 0) && !yac.h(yac.t0).p())) {
                    return false;
                }
                t20 t20Var = ((fg4) obj).J;
                int b2 = f89Var.b();
                int b3 = f89Var2.b();
                fg4 fg4Var = (fg4) t20Var.e;
                ArrayList arrayList = fg4Var.h;
                SparseIntArray sparseIntArray = fg4Var.m0;
                int size = arrayList.size();
                if (b2 >= 0 && b3 >= 0 && b2 < size && b3 < size) {
                    ArrayList T0 = uc7.s1(yac.t0).T0();
                    ac7 ac7Var3 = (ac7) T0.get(b2);
                    ac7 ac7Var4 = (ac7) T0.get(b3);
                    int i = ac7Var3.f;
                    ac7Var3.f = ac7Var4.f;
                    ac7Var4.f = i;
                    T0.set(b2, ac7Var4);
                    T0.set(b3, ac7Var3);
                    bg4 bg4Var = (bg4) arrayList.get(b2);
                    bg4 bg4Var2 = (bg4) arrayList.get(b3);
                    int i2 = bg4Var.a;
                    bg4Var.a = bg4Var2.a;
                    bg4Var2.a = i2;
                    int i3 = sparseIntArray.get(b2);
                    sparseIntArray.put(b2, sparseIntArray.get(b3));
                    sparseIntArray.put(b3, i3);
                    fg4Var.K.p(bg4Var2.a, bg4Var.a);
                    int i4 = fg4Var.L;
                    if (i4 == b2) {
                        fg4Var.L = b3;
                        fg4Var.M = bg4Var.a;
                    } else if (i4 == b3) {
                        fg4Var.L = b2;
                        fg4Var.M = bg4Var2.a;
                    }
                    int i5 = fg4Var.s0;
                    if (i5 == b2) {
                        fg4Var.s0 = b3;
                        fg4Var.t0 = bg4Var.a;
                    } else if (i5 == b3) {
                        fg4Var.s0 = b2;
                        fg4Var.t0 = bg4Var2.a;
                    }
                    arrayList.set(b2, bg4Var2);
                    arrayList.set(b3, bg4Var);
                    fg4Var.o();
                    fg4Var.E = true;
                    fg4Var.G.setItemAnimator(fg4Var.u0);
                    t20Var.j(b2, b3);
                }
                return true;
            default:
                if (f89Var.f != f89Var2.f) {
                    return false;
                }
                ih4 ih4Var = ((FiltersSetupActivity) obj).b;
                int b4 = f89Var.b();
                int b5 = f89Var2.b();
                FiltersSetupActivity filtersSetupActivity = ih4Var.e;
                int i6 = filtersSetupActivity.r;
                ArrayList arrayList2 = filtersSetupActivity.n;
                if (b4 >= i6 && b5 >= i6) {
                    gh4 gh4Var = (gh4) arrayList2.get(b4);
                    gh4 gh4Var2 = (gh4) arrayList2.get(b5);
                    if (gh4Var != null && gh4Var2 != null && (ac7Var = gh4Var.d) != null && (ac7Var2 = gh4Var2.d) != null) {
                        int i7 = ac7Var.f;
                        ac7Var.f = ac7Var2.f;
                        ac7Var2.f = i7;
                        ArrayList arrayList3 = filtersSetupActivity.getMessagesController().G0;
                        try {
                            arrayList3.set(b4 - filtersSetupActivity.r, gh4Var2.d);
                            arrayList3.set(b5 - filtersSetupActivity.r, gh4Var.d);
                        } catch (Exception unused) {
                        }
                        filtersSetupActivity.e = true;
                        filtersSetupActivity.f0(true);
                    }
                }
                return true;
        }
    }

    @Override
    public final void q(f89 f89Var, int i) {
        byte b = this.e;
        Boolean bool = null;
        Object obj = this.g;
        boolean z = false;
        Runnable runnable = this.f;
        switch (b) {
            case 0:
                lw3 lw3Var = (lw3) runnable;
                fg4 fg4Var = (fg4) obj;
                if (i != 0) {
                    fg4Var.G.K0(false);
                    f89Var.a.setPressed(true);
                    yob.h(fg4Var.d0, fg4Var.a, f89Var.a);
                } else {
                    hl.r(lw3Var);
                    hl.d3(lw3Var, 320L);
                }
                if (f89Var != null) {
                    View view = f89Var.a;
                    if (i == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296421, bool);
                    return;
                }
                return;
            default:
                lw3 lw3Var2 = (lw3) runnable;
                if (i != 0) {
                    ((FiltersSetupActivity) obj).a.K0(false);
                    f89Var.a.setPressed(true);
                } else {
                    hl.r(lw3Var2);
                    hl.d3(lw3Var2, 320L);
                }
                if (f89Var != null) {
                    View view2 = f89Var.a;
                    if (i == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296421, bool);
                    if (view2 instanceof eh4) {
                        eh4 eh4Var = (eh4) view2;
                        if (i == 2) {
                            z = true;
                        }
                        eh4Var.setDragging(z);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void r(f89 f89Var) {
        byte b = this.e;
    }

    public eg4(fg4 fg4Var) {
        this.g = fg4Var;
    }

    private final void u(f89 f89Var) {
    }

    private final void v(f89 f89Var) {
    }
}
