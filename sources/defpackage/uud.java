package defpackage;
public abstract class uud {
    public static final oud a;
    public static final oud b;

    static {
        oud oudVar = null;
        try {
            oudVar = (oud) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = oudVar;
        b = new Object();
    }
}
