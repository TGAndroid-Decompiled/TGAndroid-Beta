package defpackage;

import java.util.LinkedHashMap;
public final class fz0 {
    public final long a;
    public int b;
    public dz0 c;
    public dz0 d;
    public int e;
    public long f;
    public boolean g;
    public byte[] h;
    public int i;
    public int j;
    public final LinkedHashMap k = new LinkedHashMap();
    public long l;

    public fz0(long j) {
        this.a = j;
    }

    public final boolean a() {
        if (this.h != null) {
            for (nz0 nz0Var : this.k.values()) {
                if (nz0Var.i == null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
