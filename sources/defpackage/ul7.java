package defpackage;
public abstract class ul7 {
    public static final tl7 a;
    public static final tl7 b;

    static {
        ow8 ow8Var = ow8.c;
        tl7 tl7Var = null;
        try {
            tl7Var = (tl7) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = tl7Var;
        b = new Object();
    }
}
