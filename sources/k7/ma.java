package k7;
public abstract class ma {
    public static h7.r f9941a;

    public static synchronized ka a(ha haVar) {
        ka kaVar;
        synchronized (ma.class) {
            try {
                if (f9941a == null) {
                    f9941a = new h7.r(2);
                }
                kaVar = (ka) f9941a.F(haVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kaVar;
    }
}
