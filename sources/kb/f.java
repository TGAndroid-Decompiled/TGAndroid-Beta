package kb;

import java.sql.Date;
import java.sql.Timestamp;
import kb.a;
import kb.b;
public abstract class f {
    public static final boolean f15006a;
    public static final a.C0000a f15007b;
    public static final b.a f15008c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f15006a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f15007b = a.f14999b;
            f15008c = b.f15001b;
            d = d.f15003b;
            return;
        }
        f15007b = null;
        f15008c = null;
        d = null;
    }
}
