package defpackage;
public abstract class vsd {
    public static final osd a;
    public static final osd b;

    static {
        osd osdVar = null;
        try {
            osdVar = (osd) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = osdVar;
        b = new Object();
    }
}
