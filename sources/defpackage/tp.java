package defpackage;
public final class tp extends pm4 {
    public final cq s;
    public final fq w;

    public tp(fq fqVar, fq fqVar2, cq cqVar) {
        super(fqVar2);
        this.w = fqVar;
        this.s = cqVar;
    }

    @Override
    public final vga b() {
        return this.s;
    }

    @Override
    public final boolean c() {
        fq fqVar = this.w;
        if (!fqVar.getInternalPopup().a()) {
            fqVar.f.m(wp.b(fqVar), wp.a(fqVar));
            return true;
        }
        return true;
    }
}
