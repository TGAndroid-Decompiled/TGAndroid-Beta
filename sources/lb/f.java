package lb;

import java.sql.Date;
import java.sql.Timestamp;
import lb.a;
import lb.b;
public abstract class f {
    public static final boolean f16964a;
    public static final a.C0000a f16965b;
    public static final b.a f16966c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f16964a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f16965b = a.f16957b;
            f16966c = b.f16959b;
            d = d.f16961b;
            return;
        }
        f16965b = null;
        f16966c = null;
        d = null;
    }
}
