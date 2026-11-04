package ji;

import android.view.View;
import ci.gb;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Wallet.v2;
import org.telegram.ui.Wallet.x2;
import org.telegram.ui.cm0;
import org.telegram.ui.et;
import org.telegram.ui.ht;
public final class v extends f61 {
    public final int f16374a;
    public final Object f16375b;

    public v(Object obj, int i3) {
        this.f16374a = i3;
        this.f16375b = obj;
    }

    @Override
    public final void b(View view, int i3, int i10) {
        boolean z10;
        switch (this.f16374a) {
            case 0:
                ((z) view).getClass();
                return;
            case 1:
                et etVar = (et) view;
                etVar.f45030g3 = i3;
                etVar.f45036n3.clear();
                if (etVar.z1(6) + etVar.B1(6) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                etVar.f45043u3 = z10;
                etVar.C1();
                etVar.D1(false);
                etVar.v0(0);
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
    public final View d(int i3) {
        switch (this.f16374a) {
            case 0:
                b0 b0Var = (b0) this.f16375b;
                if (i3 == 2) {
                    return b0Var.f16273u1;
                }
                if (i3 == 0) {
                    return b0Var.f16271s1;
                }
                return b0Var.f16272t1;
            case 1:
                ht htVar = (ht) this.f16375b;
                et etVar = new et(htVar, htVar.getParentActivity());
                htVar.f45983e.add(etVar);
                return etVar;
            case 2:
                cm0 cm0Var = (cm0) this.f16375b;
                if (i3 == 1) {
                    return cm0Var.h;
                }
                if (i3 == 0) {
                    return cm0Var.f44398n;
                }
                return null;
            case 3:
                return (View) ((x2) this.f16375b).k1.get(i3);
            default:
                gb gbVar = (gb) this.f16375b;
                if (i3 != 1) {
                    if (i3 != 2) {
                        return (tg.o) gbVar.f5198b;
                    }
                    return (tg.p) gbVar.d;
                }
                return (tg.n) gbVar.f5199c;
        }
    }

    @Override
    public final int e() {
        switch (this.f16374a) {
            case 0:
                if (((b0) this.f16375b).F1) {
                    return 1;
                }
                return 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((x2) this.f16375b).k1.size();
            default:
                return 3;
        }
    }

    @Override
    public CharSequence g(int i3) {
        switch (this.f16374a) {
            case 1:
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                return "";
                            }
                            return bd.M0(2131748303, null);
                        }
                        return bd.M0(2131748301, null);
                    }
                    return bd.M0(2131748304, null);
                }
                return bd.M0(2131748305, null);
            case 4:
                if (i3 != 1) {
                    if (i3 != 2) {
                        return bd.M0(2131747677, null).toUpperCase();
                    }
                    return bd.M0(2131747676, null).toUpperCase();
                }
                return bd.M0(2131747671, null).toUpperCase();
            default:
                return super.g(i3);
        }
    }

    @Override
    public int h(int i3) {
        switch (this.f16374a) {
            case 0:
                if (((b0) this.f16375b).F1 || i3 == 2) {
                    return 2;
                }
                if (i3 == 0) {
                    return 0;
                }
                return 1;
            case 1:
            default:
                return super.h(i3);
            case 2:
            case 3:
            case 4:
                return i3;
        }
    }

    private final void i(View view, int i3, int i10) {
    }

    private final void j(View view, int i3, int i10) {
    }
}
