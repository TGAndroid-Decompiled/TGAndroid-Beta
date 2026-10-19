package kb;

import java.sql.Date;
import java.sql.Timestamp;
import kb.a;
import kb.b;
public abstract class f {
    public static final boolean f15007a;
    public static final a.C0000a f15008b;
    public static final b.a f15009c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f15007a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f15008b = a.f15000b;
            f15009c = b.f15002b;
            d = d.f15004b;
            return;
        }
        f15008b = null;
        f15009c = null;
        d = null;
    }
}
