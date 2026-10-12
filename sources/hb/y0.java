package hb;
public final class y0 implements eb.v {
    public final Class f10467a;
    public final Class f10468b;
    public final eb.u f10469c;

    public y0(Class cls, Class cls2, eb.u uVar) {
        this.f10467a = cls;
        this.f10468b = cls2;
        this.f10469c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Class cls = aVar.f14653a;
        if (cls != this.f10467a && cls != this.f10468b) {
            return null;
        }
        return this.f10469c;
    }

    public final String toString() {
        return "Factory[type=" + this.f10468b.getName() + "+" + this.f10467a.getName() + ",adapter=" + this.f10469c + "]";
    }
}
