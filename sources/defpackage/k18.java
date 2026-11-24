package defpackage;

import org.telegram.ui.p;
public final class k18 extends c6 {
    public final p a;

    public k18(p pVar) {
        this.a = pVar;
    }

    @Override
    public final void b(int i) {
        p pVar = this.a;
        if (i == -1) {
            if (!pVar.Q0) {
                pVar.finishFragment();
            }
        } else if (i == 1 && !pVar.Q0) {
            if (pVar.v0 != 3) {
                gm.t1(pVar.getParentActivity().getCurrentFocus());
            }
            byte b = pVar.v0;
            if (b != 0) {
                int i2 = 0;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 6) {
                                pVar.G0(false);
                                return;
                            }
                            return;
                        }
                        pVar.a0();
                        return;
                    }
                    pVar.D0();
                    return;
                }
                while (true) {
                    w09[] w09VarArr = pVar.h;
                    if (i2 >= w09VarArr.length) {
                        break;
                    } else if (w09VarArr[i2].b.f) {
                        pVar.H0 = pVar.F0.shipping_options.get(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                pVar.i0();
                return;
            }
            pVar.J0(true);
            pVar.F0();
        }
    }
}
