package defpackage;
public abstract class qs {
    public static final int a;

    static {
        Object sa9Var;
        int i;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            property.getClass();
            sa9Var = m9b.b(property);
        } catch (Throwable th) {
            sa9Var = new sa9(th);
        }
        if (sa9Var instanceof sa9) {
            sa9Var = null;
        }
        Integer num = (Integer) sa9Var;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        a = i;
    }
}
