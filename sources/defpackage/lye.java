package defpackage;
public abstract class lye {
    public static final zxe a;
    public static final zxe b;

    static {
        zxe zxeVar = null;
        try {
            zxeVar = (zxe) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = zxeVar;
        b = new Object();
    }
}
