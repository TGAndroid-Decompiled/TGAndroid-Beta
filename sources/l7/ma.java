package l7;

import android.content.Context;
public final class ma implements ka {
    public final c9.q f11668a;
    public final ha f11669b;

    public ma(Context context, ha haVar) {
        this.f11669b = haVar;
        w2.a aVar = w2.a.e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.q(new j7.e9(c3, 4));
        }
        this.f11668a = new c9.q(new j7.e9(c3, 5));
    }

    @Override
    public final void a(b4.e0 e0Var) {
        v2.a aVar;
        this.f11669b.getClass();
        y2.p pVar = (y2.p) this.f11668a.get();
        if (e0Var.f1378b != 0) {
            aVar = new v2.a(null, e0Var.E(), v2.d.f45624a, null);
        } else {
            aVar = new v2.a(null, e0Var.E(), v2.d.f45625b, null);
        }
        pVar.a(aVar, new s0.b(29));
    }
}
