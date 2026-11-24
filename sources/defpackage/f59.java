package defpackage;
public abstract class f59 {
    public static final g59 a;

    static {
        ?? r0 = 0;
        try {
            r0 = (g59) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r0 == 0) {
            r0 = new Object();
        }
        a = r0;
    }

    public static oh2 a(Class cls) {
        a.getClass();
        return new oh2(cls);
    }
}
