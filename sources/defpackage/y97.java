package defpackage;

import java.util.Arrays;
public final class y97 {
    public long a;
    public long b;
    public byte[] c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof y97)) {
            return false;
        }
        y97 y97Var = (y97) obj;
        if (this.a != y97Var.a || this.b != y97Var.b || !Arrays.equals(this.c, y97Var.c)) {
            return false;
        }
        return true;
    }
}
