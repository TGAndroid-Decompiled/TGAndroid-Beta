package hb;
public final class y0 implements eb.v {
    public final Class f11775a;
    public final Class f11776b;
    public final eb.u f11777c;

    public y0(Class cls, Class cls2, eb.u uVar) {
        this.f11775a = cls;
        this.f11776b = cls2;
        this.f11777c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Class cls = aVar.f15994a;
        if (cls != this.f11775a && cls != this.f11776b) {
            return null;
        }
        return this.f11777c;
    }

    public final String toString() {
        return "Factory[type=" + this.f11776b.getName() + "+" + this.f11775a.getName() + ",adapter=" + this.f11777c + "]";
    }
}
