package defpackage;
public abstract class eqd {
    public static final ypd a;
    public static final ypd b;

    static {
        ypd ypdVar = null;
        try {
            ypdVar = (ypd) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = ypdVar;
        b = new Object();
    }
}
