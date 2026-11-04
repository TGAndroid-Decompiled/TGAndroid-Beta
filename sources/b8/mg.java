package b8;

import android.content.Context;
public final class mg implements ag {
    public final t9.n f2760a;
    public final zf f2761b;

    public mg(Context context, zf zfVar) {
        this.f2761b = zfVar;
        l5.a aVar = l5.a.f18036e;
        n5.s.b(context);
        n5.q c2 = n5.s.a().c(aVar);
        if (l5.a.d.contains(new k5.c("json"))) {
            new t9.n(new lg(c2, 0));
        }
        this.f2760a = new t9.n(new lg(c2, 1));
    }

    @Override
    public final void a(kg kgVar) {
        k5.a aVar;
        this.f2761b.getClass();
        n5.r rVar = (n5.r) this.f2760a.get();
        if (kgVar.f2722b != 0) {
            aVar = k5.a.a(kgVar.F());
        } else {
            aVar = new k5.a(null, kgVar.F(), k5.d.f16878b, null);
        }
        rVar.a(aVar, new l2.d(27));
    }
}
