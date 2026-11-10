package n5;

import java.util.Arrays;
public final class p extends b0 {
    public final byte[] f20469a;
    public final byte[] f20470b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f20469a = bArr;
        this.f20470b = bArr2;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            boolean z9 = b0Var instanceof p;
            p pVar = (p) b0Var;
            if (z9) {
                bArr = pVar.f20469a;
            } else {
                bArr = pVar.f20469a;
            }
            if (Arrays.equals(this.f20469a, bArr)) {
                p pVar2 = (p) b0Var;
                if (z9) {
                    bArr2 = pVar2.f20470b;
                } else {
                    bArr2 = pVar2.f20470b;
                }
                if (Arrays.equals(this.f20470b, bArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f20469a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20470b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f20469a) + ", encryptedBlob=" + Arrays.toString(this.f20470b) + "}";
    }
}
