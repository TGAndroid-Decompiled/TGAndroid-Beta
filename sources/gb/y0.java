package gb;
public final class y0 implements db.v {
    public final Class f9605a;
    public final Class f9606b;
    public final db.u f9607c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f9605a = cls;
        this.f9606b = cls2;
        this.f9607c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f13577a;
        if (cls != this.f9605a && cls != this.f9606b) {
            return null;
        }
        return this.f9607c;
    }

    public final String toString() {
        return "Factory[type=" + this.f9606b.getName() + "+" + this.f9605a.getName() + ",adapter=" + this.f9607c + "]";
    }
}
