package i7;
public abstract class ma {
    public static f7.s f8456a;

    public static synchronized ka a(ha haVar) {
        ka kaVar;
        synchronized (ma.class) {
            try {
                if (f8456a == null) {
                    f8456a = new f7.s(2);
                }
                kaVar = (ka) f8456a.G(haVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kaVar;
    }
}
