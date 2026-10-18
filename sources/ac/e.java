package ac;

import ai.c1;
import android.content.Context;
import x7.ha;
public final class e extends c1 {
    public final rb.g f489b;

    public e(rb.g gVar) {
        super(6);
        this.f489b = gVar;
    }

    @Override
    public final Object Q0(Object obj) {
        b cVar;
        zb.a aVar = (zb.a) obj;
        Context b10 = this.f489b.b();
        k6.e.f14974b.getClass();
        if (k6.e.a(b10) >= 204700000) {
            cVar = new a(b10, aVar);
        } else {
            cVar = new c(b10, aVar);
        }
        return new f(aVar, cVar, ha.b());
    }
}
