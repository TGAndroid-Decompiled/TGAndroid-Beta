package hb;
public final class y0 implements eb.v {
    public final Class f11778a;
    public final Class f11779b;
    public final eb.u f11780c;

    public y0(Class cls, Class cls2, eb.u uVar) {
        this.f11778a = cls;
        this.f11779b = cls2;
        this.f11780c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Class cls = aVar.f15995a;
        if (cls != this.f11778a && cls != this.f11779b) {
            return null;
        }
        return this.f11780c;
    }

    public final String toString() {
        return "Factory[type=" + this.f11779b.getName() + "+" + this.f11778a.getName() + ",adapter=" + this.f11780c + "]";
    }
}
