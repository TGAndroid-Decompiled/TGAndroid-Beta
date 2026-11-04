package ne;

import b8.ib;
import ud.k;
public abstract class a {
    public static final int f20344a;

    static {
        Object a10;
        int i3;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.j.d(property, "getProperty(...)");
            a10 = k.b(property);
        } catch (Throwable th2) {
            a10 = ib.a(th2);
        }
        if (a10 instanceof dd.f) {
            a10 = null;
        }
        Integer num = (Integer) a10;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = 2097152;
        }
        f20344a = i3;
    }
}
