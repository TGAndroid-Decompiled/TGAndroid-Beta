package ai;

import org.telegram.messenger.Utilities;
public final class j4 implements Utilities.Callback {
    public final int f1562a;
    public final l7 f1563b;
    public final pf.c f1564c;
    public final ug.m1 d;

    public j4(l7 l7Var, pf.c cVar, ug.m1 m1Var, int i10) {
        this.f1562a = i10;
        this.f1563b = l7Var;
        this.f1564c = cVar;
        this.d = m1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1562a) {
            case 0:
                l7.g0(this.f1563b, this.f1564c, this.d, (String) obj);
                return;
            default:
                l7.i0(this.f1563b, this.f1564c, this.d, (String) obj);
                return;
        }
    }
}
