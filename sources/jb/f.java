package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f14103a;
    public static final a.C0000a f14104b;
    public static final b.a f14105c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f14103a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f14104b = a.f14096b;
            f14105c = b.f14098b;
            d = d.f14100b;
            return;
        }
        f14104b = null;
        f14105c = null;
        d = null;
    }
}
