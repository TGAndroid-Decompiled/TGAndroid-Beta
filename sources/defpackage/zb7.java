package defpackage;

import java.util.Arrays;
public final class zb7 {
    public long a;
    public long b;
    public byte[] c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zb7)) {
            return false;
        }
        zb7 zb7Var = (zb7) obj;
        if (this.a != zb7Var.a || this.b != zb7Var.b || !Arrays.equals(this.c, zb7Var.c)) {
            return false;
        }
        return true;
    }
}
