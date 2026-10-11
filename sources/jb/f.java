package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f14102a;
    public static final a.C0000a f14103b;
    public static final b.a f14104c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f14102a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f14103b = a.f14095b;
            f14104c = b.f14097b;
            d = d.f14099b;
            return;
        }
        f14103b = null;
        f14104c = null;
        d = null;
    }
}
