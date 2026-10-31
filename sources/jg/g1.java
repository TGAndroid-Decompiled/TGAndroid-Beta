package jg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.ej;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.kh0;
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
        bj d;
        byte b10;
        byte b11;
        byte b12;
        switch (this.S) {
            case 0:
                s3 s3Var = (s3) this.T;
                ArrayList arrayList = s3Var.f10057s0;
                int size = (arrayList.size() - 1) - i10;
                ej ejVar = s3Var.f10058t0;
                if (ejVar != null && size >= 0 && size < arrayList.size() && (d = ejVar.d((jj) arrayList.get(size))) != null && d.f14775a != d.f14776b && (b10 = d.f14777c) == d.d && b10 != 0) {
                    int size2 = ejVar.e.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        bj bjVar = (bj) ejVar.e.get(i11);
                        if (bjVar != d) {
                            byte b13 = bjVar.f14777c;
                            byte b14 = d.f14777c;
                            if (b13 <= b14 && bjVar.d >= b14) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 1:
                ua0 ua0Var = (ua0) this.T;
                jj jjVar = (jj) ua0Var.f30884r.f16749f.get(i10);
                ej a2 = ua0.a(ua0Var, jjVar);
                if (a2 == null) {
                    return false;
                }
                ArrayList arrayList2 = a2.e;
                bj d10 = a2.d(jjVar);
                if (d10.f14775a == d10.f14776b || (b11 = d10.f14777c) != d10.d || b11 == 0) {
                    return false;
                }
                int size3 = arrayList2.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    bj bjVar2 = (bj) arrayList2.get(i12);
                    if (bjVar2 != d10) {
                        byte b15 = bjVar2.f14777c;
                        byte b16 = d10.f14777c;
                        if (b15 <= b16 && bjVar2.d >= b16) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                kh0 kh0Var = (kh0) this.T;
                jj jjVar2 = (jj) kh0Var.M.get((B() - 1) - i10);
                ej k10 = kh0Var.k(jjVar2);
                if (k10 != null) {
                    ArrayList arrayList3 = k10.e;
                    bj d11 = k10.d(jjVar2);
                    if (d11.f14775a != d11.f14776b && (b12 = d11.f14777c) == d11.d && b12 != 0) {
                        int size4 = arrayList3.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            bj bjVar3 = (bj) arrayList3.get(i13);
                            if (bjVar3 != d11) {
                                byte b17 = bjVar3.f14777c;
                                byte b18 = d11.f14777c;
                                if (b17 <= b18 && bjVar3.d >= b18) {
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
                boolean z10 = org.telegram.messenger.v2.f18448a;
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
