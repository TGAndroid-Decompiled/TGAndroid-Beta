package hb;
public final class y0 implements eb.v {
    public final Class f11802a;
    public final Class f11803b;
    public final eb.u f11804c;

    public y0(Class cls, Class cls2, eb.u uVar) {
        this.f11802a = cls;
        this.f11803b = cls2;
        this.f11804c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Class cls = aVar.f16057a;
        if (cls != this.f11802a && cls != this.f11803b) {
            return null;
        }
        return this.f11804c;
    }

    public final String toString() {
        return "Factory[type=" + this.f11803b.getName() + "+" + this.f11802a.getName() + ",adapter=" + this.f11804c + "]";
    }
}
