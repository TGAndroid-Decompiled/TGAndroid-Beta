package oa;
public class v0 implements la.v {
    @Override
    public final la.u create(la.g gVar, sa.a aVar) {
        Class cls = aVar.f47502a;
        if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new o(cls);
        }
        return null;
    }
}
