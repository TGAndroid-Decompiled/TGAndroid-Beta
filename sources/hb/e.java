package hb;

import android.content.Context;
import h7.ma;
public final class e extends a8.a {
    public final ya.g f10395b;

    public e(ya.g gVar) {
        super(8);
        this.f10395b = gVar;
    }

    @Override
    public final Object F(Object obj) {
        b cVar;
        gb.b bVar = (gb.b) obj;
        Context b10 = this.f10395b.b();
        u5.e.f48110b.getClass();
        if (u5.e.a(b10) >= 204700000) {
            cVar = new a(b10, bVar);
        } else {
            cVar = new c(b10, bVar);
        }
        return new f(bVar, cVar, ma.b());
    }
}
