package defpackage;

import java.util.Arrays;
public final class ij0 extends tl5 {
    public final byte[] b;

    public ij0(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ij0.class == obj.getClass()) {
                ij0 ij0Var = (ij0) obj;
                if (this.a.equals(ij0Var.a) && Arrays.equals(this.b, ij0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + ts2.j(527, 31, this.a);
    }
}
