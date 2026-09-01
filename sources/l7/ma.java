package l7;

import android.content.Context;
public final class ma implements ka {
    public final c9.p f11950a;
    public final ha f11951b;

    public ma(Context context, ha haVar) {
        this.f11951b = haVar;
        w2.a aVar = w2.a.f49325e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.p(new j7.e9(c3, 4));
        }
        this.f11950a = new c9.p(new j7.e9(c3, 5));
    }

    @Override
    public final void a(b4.e0 e0Var) {
        v2.a aVar;
        this.f11951b.getClass();
        y2.p pVar = (y2.p) this.f11950a.get();
        if (e0Var.f1474b != 0) {
            aVar = new v2.a(null, e0Var.E(), v2.d.f48850a, null);
        } else {
            aVar = new v2.a(null, e0Var.E(), v2.d.f48851b, null);
        }
        pVar.a(aVar, new sg.a(28));
    }
}
