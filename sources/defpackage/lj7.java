package defpackage;
public abstract class lj7 {
    public static final kj7 a;
    public static final kj7 b;

    static {
        ft8 ft8Var = ft8.c;
        kj7 kj7Var = null;
        try {
            kj7Var = (kj7) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = kj7Var;
        b = new Object();
    }
}
