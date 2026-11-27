package defpackage;

import java.util.Arrays;
public final class fc7 {
    public long a;
    public long b;
    public byte[] c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof fc7)) {
            return false;
        }
        fc7 fc7Var = (fc7) obj;
        if (this.a != fc7Var.a || this.b != fc7Var.b || !Arrays.equals(this.c, fc7Var.c)) {
            return false;
        }
        return true;
    }
}
