package defpackage;

import java.util.LinkedHashMap;
public final class m01 {
    public final long a;
    public int b;
    public k01 c;
    public k01 d;
    public int e;
    public long f;
    public boolean g;
    public byte[] h;
    public int i;
    public int j;
    public final LinkedHashMap k = new LinkedHashMap();
    public long l;

    public m01(long j) {
        this.a = j;
    }

    public final boolean a() {
        if (this.h != null) {
            for (u01 u01Var : this.k.values()) {
                if (u01Var.i == null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
