package ib;
public class v0 implements fb.v {
    @Override
    public final fb.u create(fb.g gVar, mb.a aVar) {
        Class cls = aVar.f18407a;
        if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new o(cls);
        }
        return null;
    }
}
