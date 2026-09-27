package gb;
public final class y0 implements db.v {
    public final Class f9592a;
    public final Class f9593b;
    public final db.u f9594c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f9592a = cls;
        this.f9593b = cls2;
        this.f9594c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f13565a;
        if (cls != this.f9592a && cls != this.f9593b) {
            return null;
        }
        return this.f9594c;
    }

    public final String toString() {
        return "Factory[type=" + this.f9593b.getName() + "+" + this.f9592a.getName() + ",adapter=" + this.f9594c + "]";
    }
}
