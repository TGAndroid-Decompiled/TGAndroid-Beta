package f7;

import android.content.Context;
public final class f9 implements b9 {
    public final y8.n f5670a;
    public final z8 f5671b;

    public f9(Context context, z8 z8Var) {
        this.f5671b = z8Var;
        u2.a aVar = u2.a.f47963e;
        w2.q.b(context);
        w2.o c10 = w2.q.a().c(aVar);
        if (u2.a.d.contains(new t2.c("json"))) {
            new y8.n(new e9(c10, 0));
        }
        this.f5670a = new y8.n(new e9(c10, 1));
    }

    @Override
    public final void a(a6.a aVar) {
        t2.a aVar2;
        this.f5671b.getClass();
        w2.p pVar = (w2.p) this.f5670a.get();
        if (aVar.f102c != 0) {
            aVar2 = new t2.a(null, aVar.p(), t2.d.f47601a, null);
        } else {
            aVar2 = new t2.a(null, aVar.p(), t2.d.f47602b, null);
        }
        pVar.a(aVar2, new v0.l(1));
    }
}
