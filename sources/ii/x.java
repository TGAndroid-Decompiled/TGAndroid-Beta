package ii;

import android.view.View;
import bi.nc;
import org.telegram.messenger.id;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Wallet.v2;
import org.telegram.ui.Wallet.x2;
import org.telegram.ui.km0;
import org.telegram.ui.kt;
import org.telegram.ui.nt;
public final class x extends m61 {
    public final int f15614a;
    public final Object f15615b;

    public x(Object obj, int i7) {
        this.f15614a = i7;
        this.f15615b = obj;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        boolean z9;
        switch (this.f15614a) {
            case 0:
                ((b0) view).getClass();
                return;
            case 1:
                kt ktVar = (kt) view;
                ktVar.f47415f3 = i7;
                ktVar.f47421m3.clear();
                if (ktVar.z1(6) + ktVar.B1(6) <= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ktVar.f47428t3 = z9;
                ktVar.C1();
                ktVar.D1(false);
                ktVar.v0(0);
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
        switch (this.f15614a) {
            case 0:
                d0 d0Var = (d0) this.f15615b;
                if (i7 == 2) {
                    return d0Var.f15514w1;
                }
                if (i7 == 0) {
                    return d0Var.f15512u1;
                }
                return d0Var.f15513v1;
            case 1:
                nt ntVar = (nt) this.f15615b;
                kt ktVar = new kt(ntVar, ntVar.getParentActivity());
                ntVar.f48291e.add(ktVar);
                return ktVar;
            case 2:
                km0 km0Var = (km0) this.f15615b;
                if (i7 == 1) {
                    return km0Var.h;
                }
                if (i7 == 0) {
                    return km0Var.f47376n;
                }
                return null;
            case 3:
                return (View) ((x2) this.f15615b).f43321m1.get(i7);
            default:
                nc ncVar = (nc) this.f15615b;
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
        switch (this.f15614a) {
            case 0:
                if (((d0) this.f15615b).H1) {
                    return 1;
                }
                return 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((x2) this.f15615b).f43321m1.size();
            default:
                return 3;
        }
    }

    @Override
    public CharSequence g(int i7) {
        switch (this.f15614a) {
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
        switch (this.f15614a) {
            case 0:
                if (((d0) this.f15615b).H1 || i7 == 2) {
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
