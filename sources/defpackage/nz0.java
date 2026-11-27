package defpackage;

import java.util.LinkedHashMap;
public final class nz0 {
    public final long a;
    public int b;
    public lz0 c;
    public lz0 d;
    public int e;
    public long f;
    public boolean g;
    public byte[] h;
    public int i;
    public int j;
    public final LinkedHashMap k = new LinkedHashMap();
    public long l;

    public nz0(long j) {
        this.a = j;
    }

    public final boolean a() {
        if (this.h != null) {
            for (vz0 vz0Var : this.k.values()) {
                if (vz0Var.i == null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
