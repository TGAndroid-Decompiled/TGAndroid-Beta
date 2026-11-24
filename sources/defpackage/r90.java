package defpackage;

import java.util.Arrays;
public final class r90 extends l64 {
    public final byte[] a;
    public final byte[] b;

    public r90(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l64) {
            l64 l64Var = (l64) obj;
            boolean z = l64Var instanceof r90;
            if (Arrays.equals(this.a, ((r90) l64Var).a)) {
                if (Arrays.equals(this.b, ((r90) l64Var).b)) {
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
