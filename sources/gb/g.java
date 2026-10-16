package gb;
public final class g extends eb.u {
    public volatile eb.u f10049a;
    public final boolean f10050b;
    public final boolean f10051c;
    public final eb.g d;
    public final lb.a e;
    public final h f10052f;

    public g(h hVar, boolean z10, boolean z11, eb.g gVar, lb.a aVar) {
        this.f10052f = hVar;
        this.f10050b = z10;
        this.f10051c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        if (this.f10050b) {
            aVar.C();
            return null;
        }
        eb.u uVar = this.f10049a;
        if (uVar == null) {
            uVar = this.d.c(this.f10052f, this.e);
            this.f10049a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        if (this.f10051c) {
            bVar.i();
            return;
        }
        eb.u uVar = this.f10049a;
        if (uVar == null) {
            uVar = this.d.c(this.f10052f, this.e);
            this.f10049a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
