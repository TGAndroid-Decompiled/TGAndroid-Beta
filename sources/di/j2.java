package di;

import org.telegram.messenger.z10;
public final class j2 implements z10 {
    public final int f8849a;
    public final c6 f8850b;
    public final Long f8851c;
    public final wg.c1[] d;

    public j2(c6 c6Var, Long l10, wg.c1[] c1VarArr, int i7) {
        this.f8849a = i7;
        this.f8850b = c6Var;
        this.f8851c = l10;
        this.d = c1VarArr;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f8849a) {
            case 0:
                vf.b bVar = (vf.b) obj;
                bVar.d();
                long longValue = this.f8851c.longValue();
                c6 c6Var = this.f8850b;
                c6Var.s1(longValue, new bi.j(c6Var, bVar, this.d, 2));
                return;
            default:
                c6 c6Var2 = this.f8850b;
                c6Var2.getClass();
                c6Var2.r1(this.f8851c.longValue(), null, (vf.b) obj, this.d[0]);
                return;
        }
    }
}
