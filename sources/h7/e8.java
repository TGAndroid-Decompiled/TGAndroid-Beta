package h7;

public abstract class e8 {
    public static final Exception a(x0.a aVar, String str, Exception exc) throws z0.a {
        if (exc instanceof y0.a) {
            return new y0.a(aVar, str);
        }
        if (exc instanceof y0.b) {
            return new y0.b(aVar, str);
        }
        throw new z0.a();
    }
}
