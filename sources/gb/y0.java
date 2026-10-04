package gb;
public final class y0 implements db.v {
    public final Class f10437a;
    public final Class f10438b;
    public final db.u f10439c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f10437a = cls;
        this.f10438b = cls2;
        this.f10439c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f14747a;
        if (cls != this.f10437a && cls != this.f10438b) {
            return null;
        }
        return this.f10439c;
    }

    public final String toString() {
        return "Factory[type=" + this.f10438b.getName() + "+" + this.f10437a.getName() + ",adapter=" + this.f10439c + "]";
    }
}
