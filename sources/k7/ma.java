package k7;
public abstract class ma {
    public static h7.r f10670a;

    public static synchronized ka a(ha haVar) {
        ka kaVar;
        synchronized (ma.class) {
            try {
                if (f10670a == null) {
                    f10670a = new h7.r(2);
                }
                kaVar = (ka) f10670a.F(haVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kaVar;
    }
}
