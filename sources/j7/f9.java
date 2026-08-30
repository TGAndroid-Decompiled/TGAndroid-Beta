package j7;

import android.content.Context;
public final class f9 implements b9 {
    public final c9.p f9004a;
    public final z8 f9005b;

    public f9(Context context, z8 z8Var) {
        this.f9005b = z8Var;
        w2.a aVar = w2.a.e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.p(new e9(c3, 0));
        }
        this.f9004a = new c9.p(new e9(c3, 1));
    }

    @Override
    public final void a(b4.e0 e0Var) {
        v2.a aVar;
        this.f9005b.getClass();
        y2.p pVar = (y2.p) this.f9004a.get();
        if (e0Var.f1367b != 0) {
            aVar = new v2.a(null, e0Var.D(), v2.d.f45560a, null);
        } else {
            aVar = new v2.a(null, e0Var.D(), v2.d.f45561b, null);
        }
        pVar.a(aVar, new s0.b(28));
    }
}
