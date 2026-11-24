package defpackage;
public abstract class d74 {
    public static final c74 a = new Object();
    public static final c74 b;

    static {
        ft8 ft8Var = ft8.c;
        c74 c74Var = null;
        try {
            c74Var = (c74) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = c74Var;
    }
}
