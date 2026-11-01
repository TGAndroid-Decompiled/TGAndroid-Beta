package ig;

import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Wallet.x2;
import org.telegram.ui.Wallet.z2;
import org.telegram.ui.iu;
import org.telegram.ui.lu;
import org.telegram.ui.rn0;
public final class n extends p71 {
    public final int f8367a;
    public final Object f8368b;

    public n(Object obj, int i10) {
        this.f8367a = i10;
        this.f8368b = obj;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        boolean z10;
        switch (this.f8367a) {
            case 0:
                return;
            case 1:
                iu iuVar = (iu) view;
                iuVar.f38173f3 = i10;
                iuVar.f38180m3.clear();
                if (iuVar.z1(6) + iuVar.B1(6) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                iuVar.f38187t3 = z10;
                iuVar.C1();
                iuVar.D1(false);
                iuVar.v0(0);
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
                ((yh.x) view).getClass();
                return;
        }
    }

    @Override
    public final View d(int i10) {
        switch (this.f8367a) {
            case 0:
                ai.b bVar = (ai.b) this.f8368b;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return (q) bVar.f833b;
                    }
                    return (t) bVar.d;
                }
                return (p) bVar.f834c;
            case 1:
                lu luVar = (lu) this.f8368b;
                iu iuVar = new iu(luVar, luVar.getParentActivity());
                luVar.e.add(iuVar);
                return iuVar;
            case 2:
                rn0 rn0Var = (rn0) this.f8368b;
                if (i10 == 1) {
                    return rn0Var.h;
                }
                if (i10 == 0) {
                    return rn0Var.f41118n;
                }
                return null;
            case 3:
                return (View) ((z2) this.f8368b).f35456j1.get(i10);
            default:
                yh.z zVar = (yh.z) this.f8368b;
                if (i10 == 2) {
                    return zVar.f54553t1;
                }
                if (i10 == 0) {
                    return zVar.f54551r1;
                }
                return zVar.f54552s1;
        }
    }

    @Override
    public final int e() {
        switch (this.f8367a) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((z2) this.f8368b).f35456j1.size();
            default:
                if (((yh.z) this.f8368b).E1) {
                    return 1;
                }
                return 3;
        }
    }

    @Override
    public CharSequence g(int i10) {
        switch (this.f8367a) {
            case 0:
                if (i10 != 1) {
                    if (i10 != 2) {
                        return dd.L0(2131747685, null).toUpperCase();
                    }
                    return dd.L0(2131747684, null).toUpperCase();
                }
                return dd.L0(2131747679, null).toUpperCase();
            case 1:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                return "";
                            }
                            return dd.L0(2131748309, null);
                        }
                        return dd.L0(2131748307, null);
                    }
                    return dd.L0(2131748310, null);
                }
                return dd.L0(2131748311, null);
            default:
                return super.g(i10);
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f8367a) {
            case 0:
            case 2:
            case 3:
                return i10;
            case 1:
            default:
                return super.h(i10);
            case 4:
                if (((yh.z) this.f8368b).E1 || i10 == 2) {
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
