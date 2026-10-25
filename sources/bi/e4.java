package bi;

import org.telegram.messenger.Utilities;
public final class e4 implements Utilities.Callback {
    public final int f4548a;
    public final h7 f4549b;
    public final qf.c f4550c;
    public final vg.n1 d;

    public e4(h7 h7Var, qf.c cVar, vg.n1 n1Var, int i10) {
        this.f4548a = i10;
        this.f4549b = h7Var;
        this.f4550c = cVar;
        this.d = n1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f4548a) {
            case 0:
                h7.f0(this.f4549b, this.f4550c, this.d, (String) obj);
                return;
            default:
                h7.h0(this.f4549b, this.f4550c, this.d, (String) obj);
                return;
        }
    }
}
