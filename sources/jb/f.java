package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f12954a;
    public static final a.C0000a f12955b;
    public static final b.a f12956c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f12954a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f12955b = a.f12947b;
            f12956c = b.f12949b;
            d = d.f12951b;
            return;
        }
        f12955b = null;
        f12956c = null;
        d = null;
    }
}
