package c8;

import android.content.Context;
public final class vf implements rf {
    public final u9.n f5913a;
    public final qf f5914b;

    public vf(Context context, qf qfVar) {
        this.f5914b = qfVar;
        m5.a aVar = m5.a.f19872e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.n(new a8.xa(c10, 2));
        }
        this.f5913a = new u9.n(new a8.xa(c10, 3));
    }

    @Override
    public final void a(a8.wa waVar) {
        l5.a aVar;
        this.f5914b.getClass();
        o5.r rVar = (o5.r) this.f5913a.get();
        if (waVar.f700b != 0) {
            aVar = l5.a.a(waVar.E());
        } else {
            aVar = new l5.a(null, waVar.E(), l5.d.f18176b, null);
        }
        rVar.a(aVar, new ni.a(3));
    }
}
