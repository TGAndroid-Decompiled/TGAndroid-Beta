package c8;

import android.content.Context;
public final class vf implements rf {
    public final u9.m f5017a;
    public final qf f5018b;

    public vf(Context context, qf qfVar) {
        this.f5018b = qfVar;
        m5.a aVar = m5.a.f20920e;
        o5.t.b(context);
        o5.r c10 = o5.t.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new a8.ya(c10, 2));
        }
        this.f5017a = new u9.m(new a8.ya(c10, 3));
    }

    @Override
    public final void a(a8.xa xaVar) {
        l5.a aVar;
        this.f5018b.getClass();
        o5.s sVar = (o5.s) this.f5017a.get();
        if (xaVar.f713b != 0) {
            aVar = l5.a.a(xaVar.E());
        } else {
            aVar = new l5.a(null, xaVar.E(), l5.d.f19770b, null);
        }
        sVar.a(aVar, new n2.a0(8));
    }
}
