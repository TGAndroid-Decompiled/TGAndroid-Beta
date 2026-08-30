package l7;

import android.content.Context;
public final class ma implements ka {
    public final c9.p f11558a;
    public final ha f11559b;

    public ma(Context context, ha haVar) {
        this.f11559b = haVar;
        w2.a aVar = w2.a.e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.p(new j7.e9(c3, 4));
        }
        this.f11558a = new c9.p(new j7.e9(c3, 5));
    }

    @Override
    public final void a(b4.e0 e0Var) {
        v2.a aVar;
        this.f11559b.getClass();
        y2.p pVar = (y2.p) this.f11558a.get();
        if (e0Var.f1367b != 0) {
            aVar = new v2.a(null, e0Var.D(), v2.d.f45560a, null);
        } else {
            aVar = new v2.a(null, e0Var.D(), v2.d.f45561b, null);
        }
        pVar.a(aVar, new s0.b(28));
    }
}
