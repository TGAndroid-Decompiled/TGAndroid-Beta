package gb;
public class v0 implements db.v {
    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f14914a;
        if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new o(cls);
        }
        return null;
    }
}
