package li;

import android.view.View;
import di.za;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Wallet.b3;
import org.telegram.ui.Wallet.d3;
import org.telegram.ui.lm0;
import org.telegram.ui.mt;
import org.telegram.ui.pt;
public final class x extends b71 {
    public final int f20037a;
    public final Object f20038b;

    public x(Object obj, int i7) {
        this.f20037a = i7;
        this.f20038b = obj;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        boolean z10;
        switch (this.f20037a) {
            case 0:
                ((b0) view).getClass();
                return;
            case 1:
                mt mtVar = (mt) view;
                mtVar.f49969g3 = i7;
                mtVar.f49975n3.clear();
                if (mtVar.z1(6) + mtVar.B1(6) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mtVar.f49982u3 = z10;
                mtVar.C1();
                mtVar.D1(false);
                mtVar.v0(0);
                return;
            case 2:
                return;
            case 3:
                if (view instanceof b3) {
                    ((b3) view).getClass();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final View d(int i7) {
        switch (this.f20037a) {
            case 0:
                d0 d0Var = (d0) this.f20038b;
                if (i7 == 2) {
                    return d0Var.f19939x1;
                }
                if (i7 == 0) {
                    return d0Var.f19937v1;
                }
                return d0Var.f19938w1;
            case 1:
                pt ptVar = (pt) this.f20038b;
                mt mtVar = new mt(ptVar, ptVar.getParentActivity());
                ptVar.f50978e.add(mtVar);
                return mtVar;
            case 2:
                lm0 lm0Var = (lm0) this.f20038b;
                if (i7 == 1) {
                    return lm0Var.h;
                }
                if (i7 == 0) {
                    return lm0Var.f49652n;
                }
                return null;
            case 3:
                return (View) ((d3) this.f20038b).n1.get(i7);
            default:
                za zaVar = (za) this.f20038b;
                if (i7 != 1) {
                    if (i7 != 2) {
                        return (sg.o) zaVar.f10202b;
                    }
                    return (sg.p) zaVar.d;
                }
                return (sg.n) zaVar.f10203c;
        }
    }

    @Override
    public final int e() {
        switch (this.f20037a) {
            case 0:
                if (((d0) this.f20038b).I1) {
                    return 1;
                }
                return 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((d3) this.f20038b).n1.size();
            default:
                return 3;
        }
    }

    @Override
    public CharSequence g(int i7) {
        switch (this.f20037a) {
            case 1:
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                return "";
                            }
                            return gd.N0(2131748102, null);
                        }
                        return gd.N0(2131748100, null);
                    }
                    return gd.N0(2131748103, null);
                }
                return gd.N0(2131748104, null);
            case 4:
                if (i7 != 1) {
                    if (i7 != 2) {
                        return gd.N0(2131747475, null).toUpperCase();
                    }
                    return gd.N0(2131747474, null).toUpperCase();
                }
                return gd.N0(2131747469, null).toUpperCase();
            default:
                return super.g(i7);
        }
    }

    @Override
    public int h(int i7) {
        switch (this.f20037a) {
            case 0:
                if (((d0) this.f20038b).I1 || i7 == 2) {
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
