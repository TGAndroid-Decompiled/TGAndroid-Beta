package defpackage;

import java.util.Arrays;
public final class lj8 extends uj5 {
    public final String b;
    public final byte[] c;

    public lj8(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && lj8.class == obj.getClass()) {
                lj8 lj8Var = (lj8) obj;
                if (this.b.equals(lj8Var.b) && Arrays.equals(this.c, lj8Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ir2.j(527, 31, this.b);
    }

    @Override
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
