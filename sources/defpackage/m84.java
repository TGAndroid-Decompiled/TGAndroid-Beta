package defpackage;
public abstract class m84 {
    public static final l84 a = new Object();
    public static final l84 b;

    static {
        gv8 gv8Var = gv8.c;
        l84 l84Var = null;
        try {
            l84Var = (l84) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = l84Var;
    }
}
