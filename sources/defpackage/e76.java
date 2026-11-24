package defpackage;
public abstract class e76 {
    public static final d76 a;
    public static final d76 b;

    static {
        gv8 gv8Var = gv8.c;
        d76 d76Var = null;
        try {
            d76Var = (d76) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = d76Var;
        b = new Object();
    }
}
