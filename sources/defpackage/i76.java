package defpackage;
public abstract class i76 {
    public static final h76 a;
    public static final h76 b;

    static {
        ow8 ow8Var = ow8.c;
        h76 h76Var = null;
        try {
            h76Var = (h76) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = h76Var;
        b = new Object();
    }
}
