package defpackage;
public abstract class tl7 {
    public static final sl7 a;
    public static final sl7 b;

    static {
        ow8 ow8Var = ow8.c;
        sl7 sl7Var = null;
        try {
            sl7Var = (sl7) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = sl7Var;
        b = new Object();
    }
}
