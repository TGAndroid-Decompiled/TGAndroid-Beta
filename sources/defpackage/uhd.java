package defpackage;
public abstract class uhd {
    public static final khd a = new Object();
    public static final khd b;

    static {
        khd khdVar = null;
        try {
            khdVar = (khd) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = khdVar;
    }
}
