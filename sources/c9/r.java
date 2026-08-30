package c9;

import androidx.emoji2.text.w;
public final class r implements ba.b {
    public static final w f2181c = new w(7);
    public static final g d = new g(1);
    public ba.a f2182a;
    public volatile ba.b f2183b;

    public r(w wVar, ba.b bVar) {
        this.f2182a = wVar;
        this.f2183b = bVar;
    }

    public final void a(ba.a aVar) {
        ba.b bVar;
        ba.b bVar2;
        ba.b bVar3 = this.f2183b;
        g gVar = d;
        if (bVar3 != gVar) {
            aVar.f(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f2183b;
            if (bVar != gVar) {
                bVar2 = bVar;
            } else {
                this.f2182a = new c1.b(1, this.f2182a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.f(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f2183b.get();
    }
}
