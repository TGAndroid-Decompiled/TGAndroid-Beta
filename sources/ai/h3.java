package ai;

import org.telegram.messenger.Utilities;
public final class h3 implements Utilities.Callback {
    public final int f1395a;
    public final l7 f1396b;
    public final Long f1397c;
    public final ug.l1[] d;

    public h3(l7 l7Var, Long l4, ug.l1[] l1VarArr, int i10) {
        this.f1395a = i10;
        this.f1396b = l7Var;
        this.f1397c = l4;
        this.d = l1VarArr;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1395a) {
            case 0:
                pf.c cVar = (pf.c) obj;
                cVar.d();
                long longValue = this.f1397c.longValue();
                l7 l7Var = this.f1396b;
                l7Var.P1(longValue, new a4(l7Var, cVar, this.d, 0));
                return;
            default:
                l7 l7Var2 = this.f1396b;
                l7Var2.getClass();
                l7Var2.O1(this.f1397c.longValue(), null, (pf.c) obj, this.d[0]);
                return;
        }
    }
}
