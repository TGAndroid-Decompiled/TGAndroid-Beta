package kb;

import java.sql.Date;
import java.sql.Timestamp;
import kb.a;
import kb.b;
public abstract class f {
    public static final boolean f15004a;
    public static final a.C0000a f15005b;
    public static final b.a f15006c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f15004a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f15005b = a.f14997b;
            f15006c = b.f14999b;
            d = d.f15001b;
            return;
        }
        f15005b = null;
        f15006c = null;
        d = null;
    }
}
