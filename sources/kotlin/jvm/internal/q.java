package kotlin.jvm.internal;
public abstract class q {
    public static final r f15054a;

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
        f15054a = r02;
    }

    public static d a(Class cls) {
        f15054a.getClass();
        return new d(cls);
    }
}
