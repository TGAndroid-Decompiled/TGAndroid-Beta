package defpackage;
public abstract class h79 {
    public static final i79 a;

    static {
        ?? r0 = 0;
        try {
            r0 = (i79) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r0 == 0) {
            r0 = new Object();
        }
        a = r0;
    }

    public static cj2 a(Class cls) {
        a.getClass();
        return new cj2(cls);
    }
}
