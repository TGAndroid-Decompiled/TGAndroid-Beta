package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f12951a;
    public static final a.C0000a f12952b;
    public static final b.a f12953c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f12951a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f12952b = a.f12944b;
            f12953c = b.f12946b;
            d = d.f12948b;
            return;
        }
        f12952b = null;
        f12953c = null;
        d = null;
    }
}
