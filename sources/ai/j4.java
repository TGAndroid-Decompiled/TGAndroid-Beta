package ai;

import org.telegram.messenger.Utilities;
public final class j4 implements Utilities.Callback {
    public final int f1553a;
    public final k7 f1554b;
    public final pf.c f1555c;
    public final ug.m1 d;

    public j4(k7 k7Var, pf.c cVar, ug.m1 m1Var, int i10) {
        this.f1553a = i10;
        this.f1554b = k7Var;
        this.f1555c = cVar;
        this.d = m1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1553a) {
            case 0:
                k7.o1(this.f1554b, this.f1555c, this.d, (String) obj);
                return;
            default:
                k7.o0(this.f1554b, this.f1555c, this.d, (String) obj);
                return;
        }
    }
}
