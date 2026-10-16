package ac;

import android.content.Context;
import b2.h;
import x7.ha;
public final class e extends h {
    public final rb.g f490b;

    public e(rb.g gVar) {
        super(5);
        this.f490b = gVar;
    }

    @Override
    public final Object Q0(Object obj) {
        b cVar;
        zb.a aVar = (zb.a) obj;
        Context b10 = this.f490b.b();
        k6.e.f14172b.getClass();
        if (k6.e.a(b10) >= 204700000) {
            cVar = new a(b10, aVar);
        } else {
            cVar = new c(b10, aVar);
        }
        return new f(aVar, cVar, ha.b());
    }
}
