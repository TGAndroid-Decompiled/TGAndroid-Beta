package ai;

import org.telegram.messenger.Utilities;
public final class j4 implements Utilities.Callback {
    public final int f1540a;
    public final l7 f1541b;
    public final pf.c f1542c;
    public final ug.l1 d;

    public j4(l7 l7Var, pf.c cVar, ug.l1 l1Var, int i10) {
        this.f1540a = i10;
        this.f1541b = l7Var;
        this.f1542c = cVar;
        this.d = l1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1540a) {
            case 0:
                l7.f0(this.f1541b, this.f1542c, this.d, (String) obj);
                return;
            default:
                l7.h0(this.f1541b, this.f1542c, this.d, (String) obj);
                return;
        }
    }
}
