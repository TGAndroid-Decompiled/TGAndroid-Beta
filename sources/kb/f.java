package kb;

import java.sql.Date;
import java.sql.Timestamp;
import kb.a;
import kb.b;
public abstract class f {
    public static final boolean f15005a;
    public static final a.C0000a f15006b;
    public static final b.a f15007c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f15005a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f15006b = a.f14998b;
            f15007c = b.f15000b;
            d = d.f15002b;
            return;
        }
        f15006b = null;
        f15007c = null;
        d = null;
    }
}
