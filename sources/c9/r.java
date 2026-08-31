package c9;

import androidx.emoji2.text.w;
public final class r implements ba.b {
    public static final w f2371c = new w(7);
    public static final g d = new g(1);
    public ba.a f2372a;
    public volatile ba.b f2373b;

    public r(w wVar, ba.b bVar) {
        this.f2372a = wVar;
        this.f2373b = bVar;
    }

    public final void a(ba.a aVar) {
        ba.b bVar;
        ba.b bVar2;
        ba.b bVar3 = this.f2373b;
        g gVar = d;
        if (bVar3 != gVar) {
            aVar.f(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f2373b;
            if (bVar != gVar) {
                bVar2 = bVar;
            } else {
                this.f2372a = new c1.b(1, this.f2372a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.f(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f2373b.get();
    }
}
