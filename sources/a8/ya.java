package a8;

import android.content.Context;
public final class ya implements sa {
    public final u9.n f723a;
    public final ma f724b;

    public ya(Context context, ma maVar) {
        this.f724b = maVar;
        m5.a aVar = m5.a.f19872e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.n(new xa(c10, 0));
        }
        this.f723a = new u9.n(new xa(c10, 1));
    }

    @Override
    public final void a(wa waVar) {
        l5.a aVar;
        this.f724b.getClass();
        o5.r rVar = (o5.r) this.f723a.get();
        if (waVar.f700b != 0) {
            aVar = l5.a.a(waVar.E());
        } else {
            aVar = new l5.a(null, waVar.E(), l5.d.f18176b, null);
        }
        rVar.a(aVar, new ni.a(3));
    }
}
