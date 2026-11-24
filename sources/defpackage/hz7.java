package defpackage;

import org.telegram.ui.p;
public final class hz7 extends c6 {
    public final p a;

    public hz7(p pVar) {
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
                gl.t1(pVar.getParentActivity().getCurrentFocus());
            }
            byte b = pVar.v0;
            if (b != 0) {
                int i2 = 0;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 6) {
                                pVar.F0(false);
                                return;
                            }
                            return;
                        }
                        pVar.Z();
                        return;
                    }
                    pVar.C0();
                    return;
                }
                while (true) {
                    vy8[] vy8VarArr = pVar.h;
                    if (i2 >= vy8VarArr.length) {
                        break;
                    } else if (vy8VarArr[i2].b.f) {
                        pVar.H0 = pVar.F0.shipping_options.get(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                pVar.h0();
                return;
            }
            pVar.I0(true);
            pVar.E0();
        }
    }
}
