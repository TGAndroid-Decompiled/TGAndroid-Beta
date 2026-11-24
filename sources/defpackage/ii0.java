package defpackage;

import java.util.Arrays;
public final class ii0 extends uj5 {
    public final byte[] b;

    public ii0(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ii0.class == obj.getClass()) {
                ii0 ii0Var = (ii0) obj;
                if (this.a.equals(ii0Var.a) && Arrays.equals(this.b, ii0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + ir2.j(527, 31, this.a);
    }
}
