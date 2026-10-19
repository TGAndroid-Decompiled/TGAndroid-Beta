package hb;
public final class y0 implements eb.v {
    public final Class f11777a;
    public final Class f11778b;
    public final eb.u f11779c;

    public y0(Class cls, Class cls2, eb.u uVar) {
        this.f11777a = cls;
        this.f11778b = cls2;
        this.f11779c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Class cls = aVar.f15996a;
        if (cls != this.f11777a && cls != this.f11778b) {
            return null;
        }
        return this.f11779c;
    }

    public final String toString() {
        return "Factory[type=" + this.f11778b.getName() + "+" + this.f11777a.getName() + ",adapter=" + this.f11779c + "]";
    }
}
