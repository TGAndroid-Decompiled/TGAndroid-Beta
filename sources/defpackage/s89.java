package defpackage;
public abstract class s89 {
    public static final t89 a;

    static {
        ?? r0 = 0;
        try {
            r0 = (t89) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r0 == 0) {
            r0 = new Object();
        }
        a = r0;
    }

    public static ki2 a(Class cls) {
        a.getClass();
        return new ki2(cls);
    }
}
