package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f12947a;
    public static final a.C0000a f12948b;
    public static final b.a f12949c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f12947a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f12948b = a.f12940b;
            f12949c = b.f12942b;
            d = d.f12944b;
            return;
        }
        f12948b = null;
        f12949c = null;
        d = null;
    }
}
