package defpackage;

import java.util.Arrays;
public final class t90 extends f74 {
    public final byte[] a;
    public final byte[] b;

    public t90(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f74) {
            f74 f74Var = (f74) obj;
            boolean z = f74Var instanceof t90;
            if (Arrays.equals(this.a, ((t90) f74Var).a)) {
                if (Arrays.equals(this.b, ((t90) f74Var).b)) {
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
