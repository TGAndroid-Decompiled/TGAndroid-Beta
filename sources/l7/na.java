package l7;
public abstract class na {
    public static h7.r f11683a;

    public static synchronized la a(ha haVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f11683a == null) {
                    f11683a = new h7.r(3);
                }
                laVar = (la) f11683a.F(haVar);
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
                StringBuilder sb = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        }
        return a2;
    }
}
