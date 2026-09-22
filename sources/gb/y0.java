package gb;
public final class y0 implements db.v {
    public final Class f9601a;
    public final Class f9602b;
    public final db.u f9603c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f9601a = cls;
        this.f9602b = cls2;
        this.f9603c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f13577a;
        if (cls != this.f9601a && cls != this.f9602b) {
            return null;
        }
        return this.f9603c;
    }

    public final String toString() {
        return "Factory[type=" + this.f9602b.getName() + "+" + this.f9601a.getName() + ",adapter=" + this.f9603c + "]";
    }
}
