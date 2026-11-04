package ci;

import org.telegram.messenger.u10;
public final class p2 implements u10 {
    public final int f5740a;
    public final l6 f5741b;
    public final Long f5742c;
    public final xg.e1[] d;

    public p2(l6 l6Var, Long l10, xg.e1[] e1VarArr, int i3) {
        this.f5740a = i3;
        this.f5741b = l6Var;
        this.f5742c = l10;
        this.d = e1VarArr;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f5740a) {
            case 0:
                sf.b bVar = (sf.b) obj;
                bVar.d();
                long longValue = this.f5742c.longValue();
                l6 l6Var = this.f5741b;
                l6Var.s1(longValue, new ai.m(l6Var, bVar, this.d, 2));
                return;
            default:
                l6 l6Var2 = this.f5741b;
                l6Var2.getClass();
                l6Var2.r1(this.f5742c.longValue(), null, (sf.b) obj, this.d[0]);
                return;
        }
    }
}
