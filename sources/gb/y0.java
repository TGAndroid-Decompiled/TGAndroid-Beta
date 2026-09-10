package gb;
public final class y0 implements db.v {
    public final Class f8732a;
    public final Class f8733b;
    public final db.u f8734c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f8732a = cls;
        this.f8733b = cls2;
        this.f8734c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f12419a;
        if (cls != this.f8732a && cls != this.f8733b) {
            return null;
        }
        return this.f8734c;
    }

    public final String toString() {
        return "Factory[type=" + this.f8733b.getName() + "+" + this.f8732a.getName() + ",adapter=" + this.f8734c + "]";
    }
}
