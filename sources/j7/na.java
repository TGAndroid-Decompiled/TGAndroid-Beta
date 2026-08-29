package j7;
public abstract class na {
    public static f7.s f11125a;

    public static synchronized la a(ha haVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f11125a == null) {
                    f11125a = new f7.s(3);
                }
                laVar = (la) f11125a.G(haVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }

    public static synchronized la b() {
        la a2;
        synchronized (na.class) {
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
