package gb;
public final class y0 implements db.v {
    public final Class f10572a;
    public final Class f10573b;
    public final db.u f10574c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f10572a = cls;
        this.f10573b = cls2;
        this.f10574c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f14888a;
        if (cls != this.f10572a && cls != this.f10573b) {
            return null;
        }
        return this.f10574c;
    }

    public final String toString() {
        return "Factory[type=" + this.f10573b.getName() + "+" + this.f10572a.getName() + ",adapter=" + this.f10574c + "]";
    }
}
