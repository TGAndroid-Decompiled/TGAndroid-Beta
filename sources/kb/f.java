package kb;

import java.sql.Date;
import java.sql.Timestamp;
import kb.a;
import kb.b;
public abstract class f {
    public static final boolean f14202a;
    public static final a.C0000a f14203b;
    public static final b.a f14204c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f14202a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f14203b = a.f14195b;
            f14204c = b.f14197b;
            d = d.f14199b;
            return;
        }
        f14203b = null;
        f14204c = null;
        d = null;
    }
}
