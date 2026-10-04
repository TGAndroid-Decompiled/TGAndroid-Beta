package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f14066a;
    public static final a.C0000a f14067b;
    public static final b.a f14068c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f14066a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f14067b = a.f14059b;
            f14068c = b.f14061b;
            d = d.f14063b;
            return;
        }
        f14067b = null;
        f14068c = null;
        d = null;
    }
}
