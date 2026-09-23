package gb;
public final class y0 implements db.v {
    public final Class f9587a;
    public final Class f9588b;
    public final db.u f9589c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f9587a = cls;
        this.f9588b = cls2;
        this.f9589c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f13565a;
        if (cls != this.f9587a && cls != this.f9588b) {
            return null;
        }
        return this.f9589c;
    }

    public final String toString() {
        return "Factory[type=" + this.f9588b.getName() + "+" + this.f9587a.getName() + ",adapter=" + this.f9589c + "]";
    }
}
