package m5;

import java.util.Arrays;
public final class p extends b0 {
    public final byte[] f19152a;
    public final byte[] f19153b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f19152a = bArr;
        this.f19153b = bArr2;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            boolean z10 = b0Var instanceof p;
            p pVar = (p) b0Var;
            if (z10) {
                bArr = pVar.f19152a;
            } else {
                bArr = pVar.f19152a;
            }
            if (Arrays.equals(this.f19152a, bArr)) {
                p pVar2 = (p) b0Var;
                if (z10) {
                    bArr2 = pVar2.f19153b;
                } else {
                    bArr2 = pVar2.f19153b;
                }
                if (Arrays.equals(this.f19153b, bArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f19152a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19153b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f19152a) + ", encryptedBlob=" + Arrays.toString(this.f19153b) + "}";
    }
}
