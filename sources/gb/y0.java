package gb;
public final class y0 implements db.v {
    public final Class f9586a;
    public final Class f9587b;
    public final db.u f9588c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f9586a = cls;
        this.f9587b = cls2;
        this.f9588c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f13563a;
        if (cls != this.f9586a && cls != this.f9587b) {
            return null;
        }
        return this.f9588c;
    }

    public final String toString() {
        return "Factory[type=" + this.f9587b.getName() + "+" + this.f9586a.getName() + ",adapter=" + this.f9588c + "]";
    }
}
