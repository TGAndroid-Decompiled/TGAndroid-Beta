package ii;

import android.view.View;
import bi.nc;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Wallet.x2;
import org.telegram.ui.Wallet.z2;
import org.telegram.ui.gt;
import org.telegram.ui.hm0;
import org.telegram.ui.kt;
public final class x extends h61 {
    public final int f15612a;
    public final Object f15613b;

    public x(Object obj, int i7) {
        this.f15612a = i7;
        this.f15613b = obj;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        boolean z9;
        switch (this.f15612a) {
            case 0:
                ((b0) view).getClass();
                return;
            case 1:
                gt gtVar = (gt) view;
                gtVar.f46074f3 = i7;
                gtVar.f46080m3.clear();
                if (gtVar.z1(6) + gtVar.B1(6) <= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                gtVar.f46087t3 = z9;
                gtVar.C1();
                gtVar.D1(false);
                gtVar.v0(0);
                return;
            case 2:
                return;
            case 3:
                if (view instanceof x2) {
                    ((x2) view).getClass();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final View d(int i7) {
        switch (this.f15612a) {
            case 0:
                d0 d0Var = (d0) this.f15613b;
                if (i7 == 2) {
                    return d0Var.f15509t1;
                }
                if (i7 == 0) {
                    return d0Var.f15507r1;
                }
                return d0Var.f15508s1;
            case 1:
                kt ktVar = (kt) this.f15613b;
                gt gtVar = new gt(ktVar, ktVar.getParentActivity());
                ktVar.f47282e.add(gtVar);
                return gtVar;
            case 2:
                hm0 hm0Var = (hm0) this.f15613b;
                if (i7 == 1) {
                    return hm0Var.h;
                }
                if (i7 == 0) {
                    return hm0Var.f46439n;
                }
                return null;
            case 3:
                return (View) ((z2) this.f15613b).f43390j1.get(i7);
            default:
                nc ncVar = (nc) this.f15613b;
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
        switch (this.f15612a) {
            case 0:
                if (((d0) this.f15613b).E1) {
                    return 1;
                }
                return 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((z2) this.f15613b).f43390j1.size();
            default:
                return 3;
        }
    }

    @Override
    public CharSequence g(int i7) {
        switch (this.f15612a) {
            case 1:
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                return "";
                            }
                            return hd.M0(2131748294, null);
                        }
                        return hd.M0(2131748292, null);
                    }
                    return hd.M0(2131748295, null);
                }
                return hd.M0(2131748296, null);
            case 4:
                if (i7 != 1) {
                    if (i7 != 2) {
                        return hd.M0(2131747668, null).toUpperCase();
                    }
                    return hd.M0(2131747667, null).toUpperCase();
                }
                return hd.M0(2131747662, null).toUpperCase();
            default:
                return super.g(i7);
        }
    }

    @Override
    public int h(int i7) {
        switch (this.f15612a) {
            case 0:
                if (((d0) this.f15613b).E1 || i7 == 2) {
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
