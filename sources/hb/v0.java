package hb;
public class v0 implements eb.v {
    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Class cls = aVar.f15993a;
        if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new o(cls);
        }
        return null;
    }
}
