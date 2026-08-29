package kotlin.jvm.internal;
public abstract class r {
    public static final s f13928a;

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
        f13928a = r02;
    }

    public static e a(Class cls) {
        f13928a.getClass();
        return new e(cls);
    }
}
