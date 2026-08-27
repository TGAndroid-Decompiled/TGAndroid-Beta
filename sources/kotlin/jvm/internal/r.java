package kotlin.jvm.internal;

public abstract class r {

    public static final s f15254a;

    static {
        s sVar = null;
        try {
            sVar = (s) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (sVar == null) {
            sVar = new s();
        }
        f15254a = sVar;
    }

    public static e a(Class cls) {
        f15254a.getClass();
        return new e(cls);
    }
}
