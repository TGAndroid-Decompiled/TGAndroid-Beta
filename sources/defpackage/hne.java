package defpackage;
public abstract class hne {
    public static final yme a = new Object();
    public static final yme b;

    static {
        yme ymeVar = null;
        try {
            ymeVar = (yme) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = ymeVar;
    }
}
