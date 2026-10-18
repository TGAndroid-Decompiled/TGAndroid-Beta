package ai;

import org.telegram.messenger.Utilities;
public final class d4 implements Utilities.Callback {
    public final int f1131a;
    public final k7 f1132b;
    public final pf.c f1133c;
    public final ug.m1 d;

    public d4(k7 k7Var, pf.c cVar, ug.m1 m1Var, int i10) {
        this.f1131a = i10;
        this.f1132b = k7Var;
        this.f1133c = cVar;
        this.d = m1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1131a) {
            case 0:
                k7.o0(this.f1132b, this.f1133c, this.d, (String) obj);
                return;
            default:
                k7.Z(this.f1132b, this.f1133c, this.d, (String) obj);
                return;
        }
    }
}
