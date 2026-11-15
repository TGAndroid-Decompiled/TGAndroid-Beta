package li;

import android.view.View;
import di.va;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Wallet.u2;
import org.telegram.ui.Wallet.w2;
import org.telegram.ui.jm0;
import org.telegram.ui.kt;
import org.telegram.ui.nt;
public final class x extends n61 {
    public final int f19645a;
    public final Object f19646b;

    public x(Object obj, int i7) {
        this.f19645a = i7;
        this.f19646b = obj;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        boolean z10;
        switch (this.f19645a) {
            case 0:
                ((b0) view).getClass();
                return;
            case 1:
                kt ktVar = (kt) view;
                ktVar.f48754g3 = i7;
                ktVar.f48760n3.clear();
                if (ktVar.z1(6) + ktVar.B1(6) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ktVar.f48767u3 = z10;
                ktVar.C1();
                ktVar.D1(false);
                ktVar.v0(0);
                return;
            case 2:
                return;
            case 3:
                if (view instanceof u2) {
                    ((u2) view).getClass();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final View d(int i7) {
        switch (this.f19645a) {
            case 0:
                d0 d0Var = (d0) this.f19646b;
                if (i7 == 2) {
                    return d0Var.f19550x1;
                }
                if (i7 == 0) {
                    return d0Var.f19548v1;
                }
                return d0Var.f19549w1;
            case 1:
                nt ntVar = (nt) this.f19646b;
                kt ktVar = new kt(ntVar, ntVar.getParentActivity());
                ntVar.f49681e.add(ktVar);
                return ktVar;
            case 2:
                jm0 jm0Var = (jm0) this.f19646b;
                if (i7 == 1) {
                    return jm0Var.h;
                }
                if (i7 == 0) {
                    return jm0Var.f48378n;
                }
                return null;
            case 3:
                return (View) ((w2) this.f19646b).n1.get(i7);
            default:
                va vaVar = (va) this.f19646b;
                if (i7 != 1) {
                    if (i7 != 2) {
                        return (sg.o) vaVar.f9622b;
                    }
                    return (sg.p) vaVar.d;
                }
                return (sg.n) vaVar.f9623c;
        }
    }

    @Override
    public final int e() {
        switch (this.f19645a) {
            case 0:
                if (((d0) this.f19646b).I1) {
                    return 1;
                }
                return 3;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return ((w2) this.f19646b).n1.size();
            default:
                return 3;
        }
    }

    @Override
    public CharSequence g(int i7) {
        switch (this.f19645a) {
            case 1:
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                return "";
                            }
                            return hd.M0(2131748295, null);
                        }
                        return hd.M0(2131748293, null);
                    }
                    return hd.M0(2131748296, null);
                }
                return hd.M0(2131748297, null);
            case 4:
                if (i7 != 1) {
                    if (i7 != 2) {
                        return hd.M0(2131747669, null).toUpperCase();
                    }
                    return hd.M0(2131747668, null).toUpperCase();
                }
                return hd.M0(2131747663, null).toUpperCase();
            default:
                return super.g(i7);
        }
    }

    @Override
    public int h(int i7) {
        switch (this.f19645a) {
            case 0:
                if (((d0) this.f19646b).I1 || i7 == 2) {
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
