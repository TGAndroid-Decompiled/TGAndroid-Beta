package n7;

import android.content.Context;
public final class yf implements uf {
    public final c9.p f15852a;
    public final tf f15853b;

    public yf(Context context, tf tfVar) {
        this.f15853b = tfVar;
        w2.a aVar = w2.a.f49361e;
        y2.q.b(context);
        y2.o c3 = y2.q.a().c(aVar);
        if (w2.a.d.contains(new v2.c("json"))) {
            new c9.p(new j7.e9(c3, 6));
        }
        this.f15852a = new c9.p(new j7.e9(c3, 7));
    }

    @Override
    public final void a(b4.e0 e0Var) {
        v2.a aVar;
        this.f15853b.getClass();
        y2.p pVar = (y2.p) this.f15852a.get();
        if (e0Var.f1474b != 0) {
            aVar = new v2.a(null, e0Var.E(), v2.d.f48886a, null);
        } else {
            aVar = new v2.a(null, e0Var.E(), v2.d.f48887b, null);
        }
        pVar.a(aVar, new sg.a(29));
    }
}
