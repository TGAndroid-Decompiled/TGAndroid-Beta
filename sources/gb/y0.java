package gb;
public final class y0 implements db.v {
    public final Class f10508a;
    public final Class f10509b;
    public final db.u f10510c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.f10508a = cls;
        this.f10509b = cls2;
        this.f10510c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f14778a;
        if (cls != this.f10508a && cls != this.f10509b) {
            return null;
        }
        return this.f10510c;
    }

    public final String toString() {
        return "Factory[type=" + this.f10509b.getName() + "+" + this.f10508a.getName() + ",adapter=" + this.f10510c + "]";
    }
}
