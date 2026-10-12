package gb;
public final class y0 implements db.v {
    public final Class f10507a;
    public final Class f10508b;
    public final db.u f10509c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f10507a = cls;
        this.f10508b = cls2;
        this.f10509c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f14775a;
        if (cls != this.f10507a && cls != this.f10508b) {
            return null;
        }
        return this.f10509c;
    }

    public final String toString() {
        return "Factory[type=" + this.f10508b.getName() + "+" + this.f10507a.getName() + ",adapter=" + this.f10509c + "]";
    }
}
