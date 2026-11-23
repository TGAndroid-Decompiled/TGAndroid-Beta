package li;

import android.view.View;
import di.za;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Wallet.c3;
import org.telegram.ui.Wallet.e3;
import org.telegram.ui.jm0;
import org.telegram.ui.lt;
import org.telegram.ui.ot;
public final class w extends c71 {
    public final int f20103a;
    public final Object f20104b;

    public w(Object obj, int i7) {
        this.f20103a = i7;
        this.f20104b = obj;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        boolean z10;
        switch (this.f20103a) {
            case 0:
                ((a0) view).getClass();
                return;
            case 1:
                lt ltVar = (lt) view;
                ltVar.f49824g3 = i7;
                ltVar.f49830n3.clear();
                if (ltVar.z1(6) + ltVar.B1(6) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ltVar.f49837u3 = z10;
                ltVar.C1();
                ltVar.D1(false);
                ltVar.v0(0);
                return;
            case 2:
                return;
            case 3:
                if (view instanceof c3) {
                    ((c3) view).getClass();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final View d(int i7) {
        switch (this.f20103a) {
            case 0:
                c0 c0Var = (c0) this.f20104b;
                if (i7 == 2) {
                    return c0Var.f20005x1;
                }
                if (i7 == 0) {
                    return c0Var.f20003v1;
                }
                return c0Var.f20004w1;
            case 1:
                ot otVar = (ot) this.f20104b;
                lt ltVar = new lt(otVar, otVar.getParentActivity());
                otVar.f50760e.add(ltVar);
                return ltVar;
            case 2:
                jm0 jm0Var = (jm0) this.f20104b;
                if (i7 == 1) {
                    return jm0Var.h;
                }
                if (i7 == 0) {
                    return jm0Var.f49164n;
                }
                return null;
            case 3:
                return (View) ((e3) this.f20104b).n1.get(i7);
            default:
                za zaVar = (za) this.f20104b;
                if (i7 != 1) {
                    if (i7 != 2) {
                        return (sg.o) zaVar.f10166b;
                    }
                    return (sg.p) zaVar.d;
                }
                return (sg.n) zaVar.f10167c;
        }
    }

    @Override
    public final int e() {
        switch (this.f20103a) {
            case 0:
                if (((c0) this.f20104b).I1) {
                    return 1;
                }
                return 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((e3) this.f20104b).n1.size();
            default:
                return 3;
        }
    }

    @Override
    public CharSequence g(int i7) {
        switch (this.f20103a) {
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
        switch (this.f20103a) {
            case 0:
                if (((c0) this.f20104b).I1 || i7 == 2) {
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
