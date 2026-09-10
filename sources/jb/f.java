package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f11841a;
    public static final a.C0000a f11842b;
    public static final b.a f11843c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f11841a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f11842b = a.f11834b;
            f11843c = b.f11836b;
            d = d.f11838b;
            return;
        }
        f11842b = null;
        f11843c = null;
        d = null;
    }
}
