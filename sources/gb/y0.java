package gb;
public final class y0 implements db.v {
    public final Class f10436a;
    public final Class f10437b;
    public final db.u f10438c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f10436a = cls;
        this.f10437b = cls2;
        this.f10438c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f14746a;
        if (cls != this.f10436a && cls != this.f10437b) {
            return null;
        }
        return this.f10438c;
    }

    public final String toString() {
        return "Factory[type=" + this.f10437b.getName() + "+" + this.f10436a.getName() + ",adapter=" + this.f10438c + "]";
    }
}
