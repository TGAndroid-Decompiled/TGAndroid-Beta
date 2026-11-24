package defpackage;
public abstract class tfd {
    public static final jfd a = new Object();
    public static final jfd b;

    static {
        jfd jfdVar = null;
        try {
            jfdVar = (jfd) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = jfdVar;
    }
}
