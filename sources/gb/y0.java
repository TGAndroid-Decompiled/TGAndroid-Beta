package gb;
public final class y0 implements db.v {
    public final Class f10600a;
    public final Class f10601b;
    public final db.u f10602c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f10600a = cls;
        this.f10601b = cls2;
        this.f10602c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f14914a;
        if (cls != this.f10600a && cls != this.f10601b) {
            return null;
        }
        return this.f10602c;
    }

    public final String toString() {
        return "Factory[type=" + this.f10601b.getName() + "+" + this.f10600a.getName() + ",adapter=" + this.f10602c + "]";
    }
}
