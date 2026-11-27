package defpackage;

import org.telegram.ui.p;
public final class n28 extends d6 {
    public final p a;

    public n28(p pVar) {
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
                hl.t1(pVar.getParentActivity().getCurrentFocus());
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
                        pVar.Z();
                        return;
                    }
                    pVar.D0();
                    return;
                }
                while (true) {
                    i29[] i29VarArr = pVar.h;
                    if (i2 >= i29VarArr.length) {
                        break;
                    } else if (i29VarArr[i2].b.f) {
                        pVar.H0 = pVar.F0.shipping_options.get(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                pVar.h0();
                return;
            }
            pVar.J0(true);
            pVar.F0();
        }
    }
}
