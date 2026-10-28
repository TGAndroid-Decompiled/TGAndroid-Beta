package kotlin.jvm.internal;
public abstract class q {
    public static final r f16669a;

    static {
        ?? r02;
        try {
            r02 = (r) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            r02 = 0;
        }
        if (r02 == 0) {
            r02 = new Object();
        }
        f16669a = r02;
    }

    public static d a(Class cls) {
        f16669a.getClass();
        return new d(cls);
    }
}
