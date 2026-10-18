package ai;

import org.telegram.messenger.Utilities;
public final class b4 implements Utilities.Callback {
    public final int f1023a;
    public final k7 f1024b;
    public final pf.c f1025c;
    public final ug.m1 d;

    public b4(k7 k7Var, pf.c cVar, ug.m1 m1Var, int i10) {
        this.f1023a = i10;
        this.f1024b = k7Var;
        this.f1025c = cVar;
        this.d = m1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1023a) {
            case 0:
                k7.o0(this.f1024b, this.f1025c, this.d, (String) obj);
                return;
            default:
                k7.a0(this.f1024b, this.f1025c, this.d, (String) obj);
                return;
        }
    }
}
