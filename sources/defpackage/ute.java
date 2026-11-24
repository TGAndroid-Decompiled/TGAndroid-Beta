package defpackage;
public abstract class ute {
    public static final ite a;
    public static final ite b;

    static {
        ite iteVar = null;
        try {
            iteVar = (ite) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = iteVar;
        b = new Object();
    }
}
