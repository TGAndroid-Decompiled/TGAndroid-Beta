package c8;

import android.content.Context;
public final class vf implements rf {
    public final u9.m f4740a;
    public final qf f4741b;

    public vf(Context context, qf qfVar) {
        this.f4741b = qfVar;
        m5.a aVar = m5.a.f20466e;
        o5.t.b(context);
        o5.r c10 = o5.t.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new a8.ya(c10, 2));
        }
        this.f4740a = new u9.m(new a8.ya(c10, 3));
    }

    @Override
    public final void a(a8.xa xaVar) {
        l5.a aVar;
        this.f4741b.getClass();
        o5.s sVar = (o5.s) this.f4740a.get();
        if (xaVar.f713b != 0) {
            aVar = l5.a.a(xaVar.D());
        } else {
            aVar = new l5.a(null, xaVar.D(), l5.d.f19309b, null);
        }
        sVar.a(aVar, new n2.a0(7));
    }
}
