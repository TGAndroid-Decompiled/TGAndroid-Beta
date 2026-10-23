package kb;

import java.sql.Date;
import java.sql.Timestamp;
import kb.a;
import kb.b;
public abstract class f {
    public static final boolean f15051a;
    public static final a.C0000a f15052b;
    public static final b.a f15053c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f15051a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f15052b = a.f15044b;
            f15053c = b.f15046b;
            d = d.f15048b;
            return;
        }
        f15052b = null;
        f15053c = null;
        d = null;
    }
}
