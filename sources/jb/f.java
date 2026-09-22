package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f12949a;
    public static final a.C0000a f12950b;
    public static final b.a f12951c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f12949a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f12950b = a.f12942b;
            f12951c = b.f12944b;
            d = d.f12946b;
            return;
        }
        f12950b = null;
        f12951c = null;
        d = null;
    }
}
