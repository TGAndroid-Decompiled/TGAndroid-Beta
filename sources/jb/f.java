package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f12950a;
    public static final a.C0000a f12951b;
    public static final b.a f12952c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f12950a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f12951b = a.f12943b;
            f12952c = b.f12945b;
            d = d.f12947b;
            return;
        }
        f12951b = null;
        f12952c = null;
        d = null;
    }
}
