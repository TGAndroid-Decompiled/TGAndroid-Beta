package jg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.f8;
import org.telegram.messenger.fj;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.ih0;
import vh.s3;
public final class g1 extends s4.s {
    public final int S;
    public final KeyEvent.Callback T;

    public g1(KeyEvent.Callback callback, int i10) {
        super(true);
        this.S = i10;
        this.T = callback;
    }

    @Override
    public final boolean B1(int i10) {
        cj d;
        byte b10;
        byte b11;
        byte b12;
        switch (this.S) {
            case 0:
                s3 s3Var = (s3) this.T;
                ArrayList arrayList = s3Var.f10058s0;
                int size = (arrayList.size() - 1) - i10;
                fj fjVar = s3Var.f10059t0;
                if (fjVar != null && size >= 0 && size < arrayList.size() && (d = fjVar.d((kj) arrayList.get(size))) != null && d.f15158a != d.f15159b && (b10 = d.f15160c) == d.d && b10 != 0) {
                    int size2 = fjVar.e.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        cj cjVar = (cj) fjVar.e.get(i11);
                        if (cjVar != d) {
                            byte b13 = cjVar.f15160c;
                            byte b14 = d.f15160c;
                            if (b13 <= b14 && cjVar.d >= b14) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 1:
                ua0 ua0Var = (ua0) this.T;
                kj kjVar = (kj) ua0Var.f30918r.f17133f.get(i10);
                fj a2 = ua0.a(ua0Var, kjVar);
                if (a2 == null) {
                    return false;
                }
                ArrayList arrayList2 = a2.e;
                cj d10 = a2.d(kjVar);
                if (d10.f15158a == d10.f15159b || (b11 = d10.f15160c) != d10.d || b11 == 0) {
                    return false;
                }
                int size3 = arrayList2.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    cj cjVar2 = (cj) arrayList2.get(i12);
                    if (cjVar2 != d10) {
                        byte b15 = cjVar2.f15160c;
                        byte b16 = d10.f15160c;
                        if (b15 <= b16 && cjVar2.d >= b16) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                ih0 ih0Var = (ih0) this.T;
                kj kjVar2 = (kj) ih0Var.M.get((B() - 1) - i10);
                fj k10 = ih0Var.k(kjVar2);
                if (k10 != null) {
                    ArrayList arrayList3 = k10.e;
                    cj d11 = k10.d(kjVar2);
                    if (d11.f15158a != d11.f15159b && (b12 = d11.f15160c) == d11.d && b12 != 0) {
                        int size4 = arrayList3.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            cj cjVar3 = (cj) arrayList3.get(i13);
                            if (cjVar3 != d11) {
                                byte b17 = cjVar3.f15160c;
                                byte b18 = d11.f15160c;
                                if (b17 <= b18 && cjVar3.d >= b18) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public final boolean C1(View view) {
        switch (this.S) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.q1) {
                    return !((org.telegram.ui.Cells.q1) view).getMessageObject().P3();
                }
                return false;
            case 1:
                return false;
            default:
                if (view instanceof org.telegram.ui.Cells.q1) {
                    return !((org.telegram.ui.Cells.q1) view).getMessageObject().P3();
                }
                return false;
        }
    }

    @Override
    public void b0(hf.e eVar, s4.z0 z0Var) {
        switch (this.S) {
            case 1:
                boolean z10 = org.telegram.messenger.v2.f18578a;
                try {
                    super.b0(eVar, z0Var);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    org.telegram.messenger.i0.g3(new ho(this, 29));
                    return;
                }
            default:
                super.b0(eVar, z0Var);
                return;
        }
    }

    @Override
    public int j(s4.z0 z0Var) {
        switch (this.S) {
            case 2:
                return B0(z0Var);
            default:
                return super.j(z0Var);
        }
    }

    @Override
    public int k(s4.z0 z0Var) {
        switch (this.S) {
            case 2:
                return C0(z0Var);
            default:
                return super.k(z0Var);
        }
    }

    @Override
    public int l(s4.z0 z0Var) {
        switch (this.S) {
            case 2:
                return D0(z0Var);
            default:
                return super.l(z0Var);
        }
    }

    @Override
    public boolean y0() {
        switch (this.S) {
            case 0:
                return false;
            case 1:
            default:
                return super.y0();
            case 2:
                return true;
        }
    }
}
