package l7;

import android.content.Context;
public final class xf implements tf {
    public final a9.q f15048a;
    public final sf f15049b;

    public xf(Context context, sf sfVar) {
        this.f15049b = sfVar;
        w2.a aVar = w2.a.f49622e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new a9.q(new h7.c9(c3, 6));
        }
        this.f15048a = new a9.q(new h7.c9(c3, 7));
    }

    @Override
    public final void a(ag.j2 j2Var) {
        v2.a aVar;
        this.f15049b.getClass();
        y2.p pVar = (y2.p) this.f15048a.get();
        if (j2Var.f558b != 0) {
            aVar = new v2.a(null, j2Var.r(), v2.d.f49328a, null);
        } else {
            aVar = new v2.a(null, j2Var.r(), v2.d.f49329b, null);
        }
        pVar.a(aVar, new sg.j(17));
    }
}
