package defpackage;
public abstract class ei6 {
    public static final di6 a;
    public static final di6 b;

    static {
        ft8 ft8Var = ft8.c;
        di6 di6Var = null;
        try {
            di6Var = (di6) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = di6Var;
        b = new Object();
    }
}
