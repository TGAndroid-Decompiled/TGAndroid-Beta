package defpackage;
public abstract class g0f {
    public static final k0f a;
    public static final k0f b;

    static {
        k0f k0fVar = null;
        try {
            k0fVar = (k0f) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = k0fVar;
        b = new Object();
    }
}
