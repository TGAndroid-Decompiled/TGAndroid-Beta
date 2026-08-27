package ib;

import android.content.Context;
import i7.ma;

public final class e extends b8.a {

    public final za.g f11104b;

    public e(za.g gVar) {
        super(8);
        this.f11104b = gVar;
    }

    @Override
    public final Object F(Object obj) {
        hb.b bVar = (hb.b) obj;
        Context contextB = this.f11104b.b();
        v5.e.f48795b.getClass();
        return new f(bVar, v5.e.a(contextB) >= 204700000 ? new a(contextB, bVar) : new c(contextB, bVar), ma.b());
    }
}
