package i7;

public abstract class ma {

    public static e7.s f10739a;

    public static synchronized ka a(ga gaVar) {
        try {
            if (f10739a == null) {
                f10739a = new e7.s(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ka) f10739a.G(gaVar);
    }

    public static synchronized ka b() {
        byte b10 = (byte) (((byte) 1) | 2);
        try {
            if (b10 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a(new ga());
    }
}
