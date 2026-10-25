package bi;

import org.telegram.messenger.Utilities;
public final class d3 implements Utilities.Callback {
    public final int f4486a;
    public final h7 f4487b;
    public final Long f4488c;
    public final vg.n1[] d;

    public d3(h7 h7Var, Long l4, vg.n1[] n1VarArr, int i10) {
        this.f4486a = i10;
        this.f4487b = h7Var;
        this.f4488c = l4;
        this.d = n1VarArr;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f4486a) {
            case 0:
                qf.c cVar = (qf.c) obj;
                cVar.d();
                long longValue = this.f4488c.longValue();
                h7 h7Var = this.f4487b;
                h7Var.P1(longValue, new v3(h7Var, cVar, this.d, 0));
                return;
            default:
                h7 h7Var2 = this.f4487b;
                h7Var2.getClass();
                h7Var2.O1(this.f4488c.longValue(), null, (qf.c) obj, this.d[0]);
                return;
        }
    }
}
