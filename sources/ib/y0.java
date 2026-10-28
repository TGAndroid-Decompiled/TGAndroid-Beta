package ib;
public final class y0 implements fb.v {
    public final Class f13975a;
    public final Class f13976b;
    public final fb.u f13977c;

    public y0(Class cls, Class cls2, fb.u uVar) {
        this.f13975a = cls;
        this.f13976b = cls2;
        this.f13977c = uVar;
    }

    @Override
    public final fb.u create(fb.g gVar, mb.a aVar) {
        Class cls = aVar.f18406a;
        if (cls != this.f13975a && cls != this.f13976b) {
            return null;
        }
        return this.f13977c;
    }

    public final String toString() {
        return "Factory[type=" + this.f13976b.getName() + "+" + this.f13975a.getName() + ",adapter=" + this.f13977c + "]";
    }
}
