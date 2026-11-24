package defpackage;

import java.util.Arrays;
public final class ol8 extends tl5 {
    public final String b;
    public final byte[] c;

    public ol8(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ol8.class == obj.getClass()) {
                ol8 ol8Var = (ol8) obj;
                if (this.b.equals(ol8Var.b) && Arrays.equals(this.c, ol8Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ts2.j(527, 31, this.b);
    }

    @Override
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
