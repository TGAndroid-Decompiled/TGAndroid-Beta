package defpackage;
public abstract class pve {
    public static final tve a;
    public static final tve b;

    static {
        tve tveVar = null;
        try {
            tveVar = (tve) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = tveVar;
        b = new Object();
    }
}
