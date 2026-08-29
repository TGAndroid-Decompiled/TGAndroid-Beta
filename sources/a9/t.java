package a9;
public final class t implements z9.b {
    public static final f f271c = new f(1);
    public static final h d = new h(1);
    public z9.a f272a;
    public volatile z9.b f273b;

    public t(f fVar, z9.b bVar) {
        this.f272a = fVar;
        this.f273b = bVar;
    }

    public final void a(z9.a aVar) {
        z9.b bVar;
        z9.b bVar2;
        z9.b bVar3 = this.f273b;
        h hVar = d;
        if (bVar3 != hVar) {
            aVar.j(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f273b;
            if (bVar != hVar) {
                bVar2 = bVar;
            } else {
                this.f272a = new s(0, this.f272a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.j(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f273b.get();
    }
}
