package h7;

public abstract class ma {

    public static e7.s f8487a;

    public static synchronized ka a(ha haVar) {
        try {
            if (f8487a == null) {
                f8487a = new e7.s(2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ka) f8487a.G(haVar);
    }
}
