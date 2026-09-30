package gb;
public final class y0 implements db.v {
    public final Class f9598a;
    public final Class f9599b;
    public final db.u f9600c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f9598a = cls;
        this.f9599b = cls2;
        this.f9600c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f13578a;
        if (cls != this.f9598a && cls != this.f9599b) {
            return null;
        }
        return this.f9600c;
    }

    public final String toString() {
        return "Factory[type=" + this.f9599b.getName() + "+" + this.f9598a.getName() + ",adapter=" + this.f9600c + "]";
    }
}
