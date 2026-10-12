package jb;

import java.sql.Date;
import java.sql.Timestamp;
import jb.a;
import jb.b;
public abstract class f {
    public static final boolean f14100a;
    public static final a.C0000a f14101b;
    public static final b.a f14102c;
    public static final c d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f14100a = z10;
        if (z10) {
            new e(Date.class, 0);
            new e(Timestamp.class, 1);
            f14101b = a.f14093b;
            f14102c = b.f14095b;
            d = d.f14097b;
            return;
        }
        f14101b = null;
        f14102c = null;
        d = null;
    }
}
