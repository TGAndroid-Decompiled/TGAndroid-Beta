package ii;

import android.view.View;
import bi.nc;
import org.telegram.messenger.id;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Wallet.w2;
import org.telegram.ui.Wallet.y2;
import org.telegram.ui.gt;
import org.telegram.ui.hm0;
import org.telegram.ui.kt;
public final class x extends m61 {
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
                gt gtVar = (gt) view;
                gtVar.f46094f3 = i7;
                gtVar.f46100m3.clear();
                if (gtVar.z1(6) + gtVar.B1(6) <= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                gtVar.f46107t3 = z9;
                gtVar.C1();
                gtVar.D1(false);
                gtVar.v0(0);
                return;
            case 2:
                return;
            case 3:
                if (view instanceof w2) {
                    ((w2) view).getClass();
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
                kt ktVar = (kt) this.f15616b;
                gt gtVar = new gt(ktVar, ktVar.getParentActivity());
                ktVar.f47310e.add(gtVar);
                return gtVar;
            case 2:
                hm0 hm0Var = (hm0) this.f15616b;
                if (i7 == 1) {
                    return hm0Var.h;
                }
                if (i7 == 0) {
                    return hm0Var.f46457n;
                }
                return null;
            case 3:
                return (View) ((y2) this.f15616b).f43386j1.get(i7);
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
                return ((y2) this.f15616b).f43386j1.size();
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
                            return id.M0(2131748296, null);
                        }
                        return id.M0(2131748294, null);
                    }
                    return id.M0(2131748297, null);
                }
                return id.M0(2131748298, null);
            case 4:
                if (i7 != 1) {
                    if (i7 != 2) {
                        return id.M0(2131747670, null).toUpperCase();
                    }
                    return id.M0(2131747669, null).toUpperCase();
                }
                return id.M0(2131747664, null).toUpperCase();
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
