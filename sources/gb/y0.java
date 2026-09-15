package gb;
public final class y0 implements db.v {
    public final Class f9600a;
    public final Class f9601b;
    public final db.u f9602c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f9600a = cls;
        this.f9601b = cls2;
        this.f9602c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f13575a;
        if (cls != this.f9600a && cls != this.f9601b) {
            return null;
        }
        return this.f9602c;
    }

    public final String toString() {
        return "Factory[type=" + this.f9601b.getName() + "+" + this.f9600a.getName() + ",adapter=" + this.f9602c + "]";
    }
}
