package defpackage;
public abstract class yud {
    public static final rud a;
    public static final rud b;

    static {
        rud rudVar = null;
        try {
            rudVar = (rud) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = rudVar;
        b = new Object();
    }
}
