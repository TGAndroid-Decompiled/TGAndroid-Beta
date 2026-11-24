package defpackage;

import java.util.Arrays;
public final class ra0 extends u74 {
    public final byte[] a;
    public final byte[] b;

    public ra0(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u74) {
            u74 u74Var = (u74) obj;
            boolean z = u74Var instanceof ra0;
            if (Arrays.equals(this.a, ((ra0) u74Var).a)) {
                if (Arrays.equals(this.b, ((ra0) u74Var).b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
