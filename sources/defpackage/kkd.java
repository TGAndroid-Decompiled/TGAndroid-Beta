package defpackage;
public abstract class kkd {
    public static final akd a = new Object();
    public static final akd b;

    static {
        akd akdVar = null;
        try {
            akdVar = (akd) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = akdVar;
    }
}
