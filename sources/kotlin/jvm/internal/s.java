package kotlin.jvm.internal;
public abstract class s {
    public static final t f19218a;

    static {
        ?? r02;
        try {
            r02 = (t) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            r02 = 0;
        }
        if (r02 == 0) {
            r02 = new Object();
        }
        f19218a = r02;
    }

    public static e a(Class cls) {
        f19218a.getClass();
        return new e(cls);
    }
}
