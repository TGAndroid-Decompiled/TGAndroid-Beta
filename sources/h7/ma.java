package h7;
public abstract class ma {
    public static d7.s f10030a;

    public static synchronized ka a(ga gaVar) {
        ka kaVar;
        synchronized (ma.class) {
            try {
                if (f10030a == null) {
                    f10030a = new d7.s(3);
                }
                kaVar = (ka) f10030a.G(gaVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaVar;
    }

    public static synchronized ka b() {
        ka a2;
        synchronized (ma.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = a(new Object());
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        return a2;
    }
}
