package j7;

import android.content.Context;
public final class f9 implements b9 {
    public final c9.q f8978a;
    public final z8 f8979b;

    public f9(Context context, z8 z8Var) {
        this.f8979b = z8Var;
        w2.a aVar = w2.a.e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.q(new e9(c3, 0));
        }
        this.f8978a = new c9.q(new e9(c3, 1));
    }

    @Override
    public final void a(b4.e0 e0Var) {
        v2.a aVar;
        this.f8979b.getClass();
        y2.p pVar = (y2.p) this.f8978a.get();
        if (e0Var.f1378b != 0) {
            aVar = new v2.a(null, e0Var.E(), v2.d.f45624a, null);
        } else {
            aVar = new v2.a(null, e0Var.E(), v2.d.f45625b, null);
        }
        pVar.a(aVar, new s0.b(29));
    }
}
