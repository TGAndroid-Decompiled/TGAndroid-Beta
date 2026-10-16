package kb;

import java.sql.Date;
import java.sql.Timestamp;
import kb.a;
import kb.b;
public abstract class f {
    public static final boolean f14204a;
    public static final a.C0000a f14205b;
    public static final b.a f14206c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f14204a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f14205b = a.f14197b;
            f14206c = b.f14199b;
            d = d.f14201b;
            return;
        }
        f14205b = null;
        f14206c = null;
        d = null;
    }
}
