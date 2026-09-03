package k7;
public abstract class ma {
    public static h7.r f9921a;

    public static synchronized ka a(ha haVar) {
        ka kaVar;
        synchronized (ma.class) {
            try {
                if (f9921a == null) {
                    f9921a = new h7.r(2);
                }
                kaVar = (ka) f9921a.F(haVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kaVar;
    }
}
