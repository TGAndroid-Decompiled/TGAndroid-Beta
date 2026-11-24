package defpackage;
public abstract class qgf {
    public static final pgf a = new Object();
    public static final pgf b;

    static {
        pgf pgfVar = null;
        try {
            pgfVar = (pgf) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = pgfVar;
    }
}
