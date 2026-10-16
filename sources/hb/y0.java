package hb;
public final class y0 implements eb.v {
    public final Class f10471a;
    public final Class f10472b;
    public final eb.u f10473c;

    public y0(Class cls, Class cls2, eb.u uVar) {
        this.f10471a = cls;
        this.f10472b = cls2;
        this.f10473c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Class cls = aVar.f14653a;
        if (cls != this.f10471a && cls != this.f10472b) {
            return null;
        }
        return this.f10473c;
    }

    public final String toString() {
        return "Factory[type=" + this.f10472b.getName() + "+" + this.f10471a.getName() + ",adapter=" + this.f10473c + "]";
    }
}
