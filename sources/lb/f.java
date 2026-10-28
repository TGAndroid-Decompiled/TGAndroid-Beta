package lb;

import java.sql.Date;
import java.sql.Timestamp;
import lb.a;
import lb.b;
public abstract class f {
    public static final boolean f16963a;
    public static final a.C0000a f16964b;
    public static final b.a f16965c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f16963a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f16964b = a.f16956b;
            f16965c = b.f16958b;
            d = d.f16960b;
            return;
        }
        f16964b = null;
        f16965c = null;
        d = null;
    }
}
