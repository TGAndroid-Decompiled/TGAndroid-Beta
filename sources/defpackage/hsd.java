package defpackage;
public abstract class hsd {
    public static final bsd a;
    public static final bsd b;

    static {
        bsd bsdVar = null;
        try {
            bsdVar = (bsd) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = bsdVar;
        b = new Object();
    }
}
