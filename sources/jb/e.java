package jb;

import ab.h;
import android.content.Context;
import j7.na;
public final class e extends ab.e {
    public final h f11430b;

    public e(h hVar) {
        super(0);
        this.f11430b = hVar;
    }

    @Override
    public final Object F(Object obj) {
        b cVar;
        ib.b bVar = (ib.b) obj;
        Context b10 = this.f11430b.b();
        w5.e.f49769b.getClass();
        if (w5.e.a(b10) >= 204700000) {
            cVar = new a(b10, bVar);
        } else {
            cVar = new c(b10, bVar);
        }
        return new f(bVar, cVar, na.b());
    }
}
