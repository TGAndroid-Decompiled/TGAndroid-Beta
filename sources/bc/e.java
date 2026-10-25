package bc;

import android.content.Context;
import b2.h;
import y7.ea;
public final class e extends h {
    public final sb.g f3844b;

    public e(sb.g gVar) {
        super(6);
        this.f3844b = gVar;
    }

    @Override
    public final Object Q0(Object obj) {
        b cVar;
        ac.b bVar = (ac.b) obj;
        Context b10 = this.f3844b.b();
        l6.e.f16932b.getClass();
        if (l6.e.a(b10) >= 204700000) {
            cVar = new a(b10, bVar);
        } else {
            cVar = new c(b10, bVar);
        }
        return new f(bVar, cVar, ea.b());
    }
}
