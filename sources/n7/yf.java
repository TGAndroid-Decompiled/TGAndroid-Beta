package n7;

import android.content.Context;
public final class yf implements uf {
    public final c9.q f14827a;
    public final tf f14828b;

    public yf(Context context, tf tfVar) {
        this.f14828b = tfVar;
        w2.a aVar = w2.a.e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.q(new j7.e9(c3, 6));
        }
        this.f14827a = new c9.q(new j7.e9(c3, 7));
    }

    @Override
    public final void a(b4.e0 e0Var) {
        v2.a aVar;
        this.f14828b.getClass();
        y2.p pVar = (y2.p) this.f14827a.get();
        if (e0Var.f1378b != 0) {
            aVar = new v2.a(null, e0Var.E(), v2.d.f45624a, null);
        } else {
            aVar = new v2.a(null, e0Var.E(), v2.d.f45625b, null);
        }
        pVar.a(aVar, new s0.b(29));
    }
}
