package kb;

import java.sql.Date;
import java.sql.Timestamp;
import kb.a;
import kb.b;
public abstract class f {
    public static final boolean f14999a;
    public static final a.C0000a f15000b;
    public static final b.a f15001c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f14999a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f15000b = a.f14992b;
            f15001c = b.f14994b;
            d = d.f14996b;
            return;
        }
        f15000b = null;
        f15001c = null;
        d = null;
    }
}
