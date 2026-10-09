package gb;
public final class y0 implements db.v {
    public final Class f10509a;
    public final Class f10510b;
    public final db.u f10511c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f10509a = cls;
        this.f10510b = cls2;
        this.f10511c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f14779a;
        if (cls != this.f10509a && cls != this.f10510b) {
            return null;
        }
        return this.f10511c;
    }

    public final String toString() {
        return "Factory[type=" + this.f10510b.getName() + "+" + this.f10509a.getName() + ",adapter=" + this.f10511c + "]";
    }
}
