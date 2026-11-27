package defpackage;

import java.util.Arrays;
public final class ji0 extends wl5 {
    public final byte[] b;

    public ji0(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ji0.class == obj.getClass()) {
                ji0 ji0Var = (ji0) obj;
                if (this.a.equals(ji0Var.a) && Arrays.equals(this.b, ji0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + bs2.j(527, 31, this.a);
    }
}
