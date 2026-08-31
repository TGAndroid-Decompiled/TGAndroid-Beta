package kotlin.jvm.internal;
public abstract class r {
    public static final s f11341a;

    static {
        ?? r02;
        try {
            r02 = (s) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            r02 = 0;
        }
        if (r02 == 0) {
            r02 = new Object();
        }
        f11341a = r02;
    }

    public static e a(Class cls) {
        f11341a.getClass();
        return new e(cls);
    }
}
