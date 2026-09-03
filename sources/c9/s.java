package c9;
public final class s implements ba.b {
    public static final af.a f2205c = new af.a(7);
    public static final h d = new h(1);
    public ba.a f2206a;
    public volatile ba.b f2207b;

    public s(af.a aVar, ba.b bVar) {
        this.f2206a = aVar;
        this.f2207b = bVar;
    }

    public final void a(ba.a aVar) {
        ba.b bVar;
        ba.b bVar2;
        ba.b bVar3 = this.f2207b;
        h hVar = d;
        if (bVar3 != hVar) {
            aVar.f(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f2207b;
            if (bVar != hVar) {
                bVar2 = bVar;
            } else {
                this.f2206a = new c1.b(1, this.f2206a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.f(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f2207b.get();
    }
}
