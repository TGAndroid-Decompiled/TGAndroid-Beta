package a8;

import android.content.Context;
public final class pg implements dg {
    public final s9.o f741a;
    public final cg f742b;

    public pg(Context context, cg cgVar) {
        this.f742b = cgVar;
        k5.a aVar = k5.a.e;
        m5.t.b(context);
        m5.r c10 = m5.t.a().c(aVar);
        if (k5.a.d.contains(new j5.c("json"))) {
            new s9.o(new og(c10, 0));
        }
        this.f741a = new s9.o(new og(c10, 1));
    }

    @Override
    public final void a(ng ngVar) {
        j5.a aVar;
        this.f742b.getClass();
        m5.s sVar = (m5.s) this.f741a.get();
        if (ngVar.f639b != 0) {
            aVar = new j5.a(null, ngVar.F(), j5.d.f15512a, null);
        } else {
            aVar = new j5.a(null, ngVar.F(), j5.d.f15513b, null);
        }
        sVar.a(aVar, new m4.x0(11));
    }
}
