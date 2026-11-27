package defpackage;
public abstract class rs {
    public static final int a;

    static {
        Object ge9Var;
        int i;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            property.getClass();
            ge9Var = kdb.b(property);
        } catch (Throwable th) {
            ge9Var = new ge9(th);
        }
        if (ge9Var instanceof ge9) {
            ge9Var = null;
        }
        Integer num = (Integer) ge9Var;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        a = i;
    }
}
