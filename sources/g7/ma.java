package g7;
public abstract class ma {
    public static d7.s f7315a;

    public static synchronized ka a(ha haVar) {
        ka kaVar;
        synchronized (ma.class) {
            try {
                if (f7315a == null) {
                    f7315a = new d7.s(2);
                }
                kaVar = (ka) f7315a.G(haVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaVar;
    }
}
