package oa;
public final class y0 implements la.v {
    public final Class f19181a;
    public final Class f19182b;
    public final la.u f19183c;

    public y0(Class cls, Class cls2, la.u uVar) {
        this.f19181a = cls;
        this.f19182b = cls2;
        this.f19183c = uVar;
    }

    @Override
    public final la.u create(la.g gVar, sa.a aVar) {
        Class cls = aVar.f47502a;
        if (cls != this.f19181a && cls != this.f19182b) {
            return null;
        }
        return this.f19183c;
    }

    public final String toString() {
        return "Factory[type=" + this.f19182b.getName() + "+" + this.f19181a.getName() + ",adapter=" + this.f19183c + "]";
    }
}
