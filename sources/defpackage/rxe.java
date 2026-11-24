package defpackage;
public abstract class rxe {
    public static final vxe a;
    public static final vxe b;

    static {
        vxe vxeVar = null;
        try {
            vxeVar = (vxe) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = vxeVar;
        b = new Object();
    }
}
