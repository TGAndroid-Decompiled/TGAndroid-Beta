package ai;

import org.telegram.messenger.Utilities;
public final class m3 implements Utilities.Callback {
    public final int f1822a;
    public final k7 f1823b;
    public final Long f1824c;
    public final ug.l1[] d;

    public m3(k7 k7Var, Long l4, ug.l1[] l1VarArr, int i10) {
        this.f1822a = i10;
        this.f1823b = k7Var;
        this.f1824c = l4;
        this.d = l1VarArr;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1822a) {
            case 0:
                pf.c cVar = (pf.c) obj;
                cVar.d();
                long longValue = this.f1824c.longValue();
                k7 k7Var = this.f1823b;
                k7Var.I1(longValue, new w3(k7Var, cVar, this.d, 0));
                return;
            default:
                k7 k7Var2 = this.f1823b;
                k7Var2.getClass();
                k7Var2.H1(this.f1824c.longValue(), null, (pf.c) obj, this.d[0]);
                return;
        }
    }
}
