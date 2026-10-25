package ib;
public final class y0 implements fb.v {
    public final Class f13976a;
    public final Class f13977b;
    public final fb.u f13978c;

    public y0(Class cls, Class cls2, fb.u uVar) {
        this.f13976a = cls;
        this.f13977b = cls2;
        this.f13978c = uVar;
    }

    @Override
    public final fb.u create(fb.g gVar, mb.a aVar) {
        Class cls = aVar.f18407a;
        if (cls != this.f13976a && cls != this.f13977b) {
            return null;
        }
        return this.f13978c;
    }

    public final String toString() {
        return "Factory[type=" + this.f13977b.getName() + "+" + this.f13976a.getName() + ",adapter=" + this.f13978c + "]";
    }
}
