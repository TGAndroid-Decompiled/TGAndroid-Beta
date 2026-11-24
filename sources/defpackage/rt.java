package defpackage;
public abstract class rt {
    public static final int a;

    static {
        Object sc9Var;
        int i;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            property.getClass();
            sc9Var = obb.b(property);
        } catch (Throwable th) {
            sc9Var = new sc9(th);
        }
        if (sc9Var instanceof sc9) {
            sc9Var = null;
        }
        Integer num = (Integer) sc9Var;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        a = i;
    }
}
