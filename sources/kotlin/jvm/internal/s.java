package kotlin.jvm.internal;
public abstract class s {
    public static final t f17619a;

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
        f17619a = r02;
    }

    public static e a(Class cls) {
        f17619a.getClass();
        return new e(cls);
    }
}
