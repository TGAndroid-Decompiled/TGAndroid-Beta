package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f13618a;
    public static final a.C0000a f13619b;
    public static final b.a f13620c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f13618a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f13619b = a.f13611b;
            f13620c = b.f13613b;
            d = d.f13615b;
            return;
        }
        f13619b = null;
        f13620c = null;
        d = null;
    }
}
