package h7;

import android.content.Context;
public final class d9 implements z8 {
    public final a9.q f7597a;
    public final x8 f7598b;

    public d9(Context context, x8 x8Var) {
        this.f7598b = x8Var;
        w2.a aVar = w2.a.f49622e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new a9.q(new c9(c3, 0));
        }
        this.f7597a = new a9.q(new c9(c3, 1));
    }

    @Override
    public final void a(ag.j2 j2Var) {
        v2.a aVar;
        this.f7598b.getClass();
        y2.p pVar = (y2.p) this.f7597a.get();
        if (j2Var.f558b != 0) {
            aVar = new v2.a(null, j2Var.r(), v2.d.f49328a, null);
        } else {
            aVar = new v2.a(null, j2Var.r(), v2.d.f49329b, null);
        }
        pVar.a(aVar, new sg.j(17));
    }
}
