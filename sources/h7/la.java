package h7;

import android.content.Context;
public final class la implements ja {
    public final y8.n f10020a;
    public final ga f10021b;

    public la(Context context, ga gaVar) {
        this.f10021b = gaVar;
        u2.a aVar = u2.a.f47963e;
        w2.q.b(context);
        w2.o c10 = w2.q.a().c(aVar);
        if (u2.a.d.contains(new t2.c("json"))) {
            new y8.n(new f7.e9(c10, 4));
        }
        this.f10020a = new y8.n(new f7.e9(c10, 5));
    }

    @Override
    public final void a(a6.a aVar) {
        t2.a aVar2;
        this.f10021b.getClass();
        w2.p pVar = (w2.p) this.f10020a.get();
        if (aVar.f102c != 0) {
            aVar2 = new t2.a(null, aVar.p(), t2.d.f47601a, null);
        } else {
            aVar2 = new t2.a(null, aVar.p(), t2.d.f47602b, null);
        }
        pVar.a(aVar2, new v0.l(1));
    }
}
