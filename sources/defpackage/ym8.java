package defpackage;

import java.util.Arrays;
public final class ym8 extends wl5 {
    public final String b;
    public final byte[] c;

    public ym8(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ym8.class == obj.getClass()) {
                ym8 ym8Var = (ym8) obj;
                if (this.b.equals(ym8Var.b) && Arrays.equals(this.c, ym8Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + bs2.j(527, 31, this.b);
    }

    @Override
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
