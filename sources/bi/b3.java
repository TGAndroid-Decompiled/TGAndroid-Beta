package bi;

import org.telegram.messenger.c20;
public final class b3 implements c20 {
    public final int f3504a;
    public final k7 f3505b;
    public final Long f3506c;
    public final wg.f1[] d;

    public b3(k7 k7Var, Long l10, wg.f1[] f1VarArr, int i7) {
        this.f3504a = i7;
        this.f3505b = k7Var;
        this.f3506c = l10;
        this.d = f1VarArr;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3504a) {
            case 0:
                vf.b bVar = (vf.b) obj;
                bVar.d();
                long longValue = this.f3506c.longValue();
                k7 k7Var = this.f3505b;
                k7Var.s1(longValue, new v3(k7Var, bVar, this.d, 0));
                return;
            default:
                k7 k7Var2 = this.f3505b;
                k7Var2.getClass();
                k7Var2.r1(this.f3506c.longValue(), null, (vf.b) obj, this.d[0]);
                return;
        }
    }
}
