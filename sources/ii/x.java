package ii;

import android.view.View;
import bi.nc;
import org.telegram.messenger.id;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Wallet.v2;
import org.telegram.ui.Wallet.x2;
import org.telegram.ui.jm0;
import org.telegram.ui.jt;
import org.telegram.ui.mt;
public final class x extends n61 {
    public final int f15615a;
    public final Object f15616b;

    public x(Object obj, int i7) {
        this.f15615a = i7;
        this.f15616b = obj;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        boolean z9;
        switch (this.f15615a) {
            case 0:
                ((b0) view).getClass();
                return;
            case 1:
                jt jtVar = (jt) view;
                jtVar.f47081f3 = i7;
                jtVar.f47087m3.clear();
                if (jtVar.z1(6) + jtVar.B1(6) <= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                jtVar.f47094t3 = z9;
                jtVar.C1();
                jtVar.D1(false);
                jtVar.v0(0);
                return;
            case 2:
                return;
            case 3:
                if (view instanceof v2) {
                    ((v2) view).getClass();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final View d(int i7) {
        switch (this.f15615a) {
            case 0:
                d0 d0Var = (d0) this.f15616b;
                if (i7 == 2) {
                    return d0Var.f15512t1;
                }
                if (i7 == 0) {
                    return d0Var.f15510r1;
                }
                return d0Var.f15511s1;
            case 1:
                mt mtVar = (mt) this.f15616b;
                jt jtVar = new jt(mtVar, mtVar.getParentActivity());
                mtVar.f47994e.add(jtVar);
                return jtVar;
            case 2:
                jm0 jm0Var = (jm0) this.f15616b;
                if (i7 == 1) {
                    return jm0Var.h;
                }
                if (i7 == 0) {
                    return jm0Var.f47045n;
                }
                return null;
            case 3:
                return (View) ((x2) this.f15616b).f43304j1.get(i7);
            default:
                nc ncVar = (nc) this.f15616b;
                if (i7 != 1) {
                    if (i7 != 2) {
                        return (sg.o) ncVar.f4435b;
                    }
                    return (sg.p) ncVar.d;
                }
                return (sg.n) ncVar.f4436c;
        }
    }

    @Override
    public final int e() {
        switch (this.f15615a) {
            case 0:
                if (((d0) this.f15616b).E1) {
                    return 1;
                }
                return 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((x2) this.f15616b).f43304j1.size();
            default:
                return 3;
        }
    }

    @Override
    public CharSequence g(int i7) {
        switch (this.f15615a) {
            case 1:
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                return "";
                            }
                            return id.M0(2131748295, null);
                        }
                        return id.M0(2131748293, null);
                    }
                    return id.M0(2131748296, null);
                }
                return id.M0(2131748297, null);
            case 4:
                if (i7 != 1) {
                    if (i7 != 2) {
                        return id.M0(2131747669, null).toUpperCase();
                    }
                    return id.M0(2131747668, null).toUpperCase();
                }
                return id.M0(2131747663, null).toUpperCase();
            default:
                return super.g(i7);
        }
    }

    @Override
    public int h(int i7) {
        switch (this.f15615a) {
            case 0:
                if (((d0) this.f15616b).E1 || i7 == 2) {
                    return 2;
                }
                if (i7 == 0) {
                    return 0;
                }
                return 1;
            case 1:
            default:
                return super.h(i7);
            case 2:
            case 3:
            case 4:
                return i7;
        }
    }

    private final void i(View view, int i7, int i10) {
    }

    private final void j(View view, int i7, int i10) {
    }
}
