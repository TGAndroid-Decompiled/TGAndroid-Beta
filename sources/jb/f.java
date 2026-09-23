package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f12939a;
    public static final a.C0000a f12940b;
    public static final b.a f12941c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f12939a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f12940b = a.f12932b;
            f12941c = b.f12934b;
            d = d.f12936b;
            return;
        }
        f12940b = null;
        f12941c = null;
        d = null;
    }
}
