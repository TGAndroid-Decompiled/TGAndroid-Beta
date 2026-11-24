package defpackage;
public abstract class xve {
    public static final lve a;
    public static final lve b;

    static {
        lve lveVar = null;
        try {
            lveVar = (lve) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = lveVar;
        b = new Object();
    }
}
