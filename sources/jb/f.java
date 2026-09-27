package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f12942a;
    public static final a.C0000a f12943b;
    public static final b.a f12944c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f12942a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f12943b = a.f12935b;
            f12944c = b.f12937b;
            d = d.f12939b;
            return;
        }
        f12943b = null;
        f12944c = null;
        d = null;
    }
}
