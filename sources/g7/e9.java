package g7;

import android.content.Context;

public final class e9 implements a9 {

    public final z8.m f6464a;

    public final y8 f6465b;

    public e9(Context context, y8 y8Var) {
        this.f6465b = y8Var;
        u2.a aVar = u2.a.f48257e;
        w2.q.b(context);
        w2.o oVarC = w2.q.a().c(aVar);
        if (u2.a.d.contains(new t2.c("json"))) {
            new z8.m(new d9(oVarC, 0));
        }
        this.f6464a = new z8.m(new d9(oVarC, 1));
    }

    @Override
    public final void a(b6.a aVar) {
        this.f6465b.getClass();
        ((w2.p) this.f6464a.get()).a(aVar.f2034c != 0 ? new t2.a(null, aVar.p(), t2.d.f48012a, null) : new t2.a(null, aVar.p(), t2.d.f48013b, null), new u3.k(6));
    }
}
