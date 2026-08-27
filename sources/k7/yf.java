package k7;

public abstract class yf {

    public static e7.s f15074a;

    public static synchronized wf a(sf sfVar) {
        try {
            if (f15074a == null) {
                f15074a = new e7.s(4);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (wf) f15074a.G(sfVar);
    }

    public static synchronized wf b() {
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
        return a(new sf());
    }
}
