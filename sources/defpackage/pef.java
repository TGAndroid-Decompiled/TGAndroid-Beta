package defpackage;
public abstract class pef {
    public static final oef a = new Object();
    public static final oef b;

    static {
        oef oefVar = null;
        try {
            oefVar = (oef) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = oefVar;
    }
}
