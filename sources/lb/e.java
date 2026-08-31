package lb;

import android.content.Context;
import cb.h;
import l7.na;
public final class e extends cb.e {
    public final h f12266b;

    public e(h hVar) {
        super(0);
        this.f12266b = hVar;
    }

    @Override
    public final Object E(Object obj) {
        b cVar;
        kb.b bVar = (kb.b) obj;
        Context b10 = this.f12266b.b();
        y5.e.f50768b.getClass();
        if (y5.e.a(b10) >= 204700000) {
            cVar = new a(b10, bVar);
        } else {
            cVar = new c(b10, bVar);
        }
        return new f(bVar, cVar, na.b());
    }
}
