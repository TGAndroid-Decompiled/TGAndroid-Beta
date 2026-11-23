package a8;

import android.content.Context;
public final class za implements ta {
    public final u9.m f751a;
    public final na f752b;

    public za(Context context, na naVar) {
        this.f752b = naVar;
        m5.a aVar = m5.a.f20920e;
        o5.t.b(context);
        o5.r c10 = o5.t.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.m(new ya(c10, 0));
        }
        this.f751a = new u9.m(new ya(c10, 1));
    }

    @Override
    public final void a(xa xaVar) {
        l5.a aVar;
        this.f752b.getClass();
        o5.s sVar = (o5.s) this.f751a.get();
        if (xaVar.f713b != 0) {
            aVar = l5.a.a(xaVar.E());
        } else {
            aVar = new l5.a(null, xaVar.E(), l5.d.f19770b, null);
        }
        sVar.a(aVar, new n2.a0(8));
    }
}
