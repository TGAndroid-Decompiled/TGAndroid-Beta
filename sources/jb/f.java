package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f13592a;
    public static final a.C0000a f13593b;
    public static final b.a f13594c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f13592a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f13593b = a.f13585b;
            f13594c = b.f13587b;
            d = d.f13589b;
            return;
        }
        f13593b = null;
        f13594c = null;
        d = null;
    }
}
