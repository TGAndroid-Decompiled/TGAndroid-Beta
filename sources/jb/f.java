package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f14065a;
    public static final a.C0000a f14066b;
    public static final b.a f14067c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f14065a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f14066b = a.f14058b;
            f14067c = b.f14060b;
            d = d.f14062b;
            return;
        }
        f14066b = null;
        f14067c = null;
        d = null;
    }
}
