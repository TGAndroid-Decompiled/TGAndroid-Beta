package defpackage;
public abstract class x74 {
    public static final w74 a = new Object();
    public static final w74 b;

    static {
        ow8 ow8Var = ow8.c;
        w74 w74Var = null;
        try {
            w74Var = (w74) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = w74Var;
    }
}
