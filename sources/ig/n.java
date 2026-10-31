package ig;

import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Wallet.w2;
import org.telegram.ui.Wallet.y2;
import org.telegram.ui.ju;
import org.telegram.ui.mu;
import org.telegram.ui.tn0;
public final class n extends o71 {
    public final int f8366a;
    public final Object f8367b;

    public n(Object obj, int i10) {
        this.f8366a = i10;
        this.f8367b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        switch (this.f8366a) {
            case 0:
                return;
            case 1:
                ju juVar = (ju) view;
                juVar.f38590f3 = i10;
                juVar.f38597m3.clear();
                if (juVar.z1(6) + juVar.B1(6) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                juVar.f38604t3 = z10;
                juVar.C1();
                juVar.D1(false);
                juVar.v0(0);
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
                ((yh.y) view).getClass();
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f8366a) {
            case 0:
                ai.b bVar = (ai.b) this.f8367b;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return (q) bVar.f833b;
                    }
                    return (t) bVar.d;
                }
                return (p) bVar.f834c;
            case 1:
                mu muVar = (mu) this.f8367b;
                ju juVar = new ju(muVar, muVar.getParentActivity());
                muVar.e.add(juVar);
                return juVar;
            case 2:
                tn0 tn0Var = (tn0) this.f8367b;
                if (i10 == 1) {
                    return tn0Var.h;
                }
                if (i10 == 0) {
                    return tn0Var.f41876n;
                }
                return null;
            case 3:
                return (View) ((y2) this.f8367b).f35408j1.get(i10);
            default:
                yh.a0 a0Var = (yh.a0) this.f8367b;
                if (i10 == 2) {
                    return a0Var.f54451t1;
                }
                if (i10 == 0) {
                    return a0Var.f54449r1;
                }
                return a0Var.f54450s1;
        }
    }

    @Override
    public final int e() {
        switch (this.f8366a) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((y2) this.f8367b).f35408j1.size();
            default:
                if (((yh.a0) this.f8367b).E1) {
                    return 1;
                }
                return 3;
        }
    }

    @Override
    public CharSequence g(int i10) {
        switch (this.f8366a) {
            case 0:
                if (i10 != 1) {
                    if (i10 != 2) {
                        return cd.L0(2131747685, null).toUpperCase();
                    }
                    return cd.L0(2131747684, null).toUpperCase();
                }
                return cd.L0(2131747679, null).toUpperCase();
            case 1:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                return "";
                            }
                            return cd.L0(2131748309, null);
                        }
                        return cd.L0(2131748307, null);
                    }
                    return cd.L0(2131748310, null);
                }
                return cd.L0(2131748311, null);
            default:
                return super.g(i10);
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f8366a) {
            case 0:
            case 2:
            case 3:
                return i10;
            case 1:
            default:
                return super.h(i10);
            case 4:
                if (((yh.a0) this.f8367b).E1 || i10 == 2) {
                    return 2;
                }
                if (i10 == 0) {
                    return 0;
                }
                return 1;
        }
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }
}
