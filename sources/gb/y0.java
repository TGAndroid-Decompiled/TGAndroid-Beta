package gb;
public final class y0 implements db.v {
    public final Class f9604a;
    public final Class f9605b;
    public final db.u f9606c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f9604a = cls;
        this.f9605b = cls2;
        this.f9606c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f13576a;
        if (cls != this.f9604a && cls != this.f9605b) {
            return null;
        }
        return this.f9606c;
    }

    public final String toString() {
        return "Factory[type=" + this.f9605b.getName() + "+" + this.f9604a.getName() + ",adapter=" + this.f9606c + "]";
    }
}
