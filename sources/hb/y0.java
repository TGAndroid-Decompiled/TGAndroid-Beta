package hb;
public final class y0 implements eb.v {
    public final Class f11776a;
    public final Class f11777b;
    public final eb.u f11778c;

    public y0(Class cls, Class cls2, eb.u uVar) {
        this.f11776a = cls;
        this.f11777b = cls2;
        this.f11778c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Class cls = aVar.f15988a;
        if (cls != this.f11776a && cls != this.f11777b) {
            return null;
        }
        return this.f11778c;
    }

    public final String toString() {
        return "Factory[type=" + this.f11777b.getName() + "+" + this.f11776a.getName() + ",adapter=" + this.f11778c + "]";
    }
}
