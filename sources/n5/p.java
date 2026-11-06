package n5;

import java.util.Arrays;
public final class p extends b0 {
    public final byte[] f20461a;
    public final byte[] f20462b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f20461a = bArr;
        this.f20462b = bArr2;
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
                bArr = pVar.f20461a;
            } else {
                bArr = pVar.f20461a;
            }
            if (Arrays.equals(this.f20461a, bArr)) {
                p pVar2 = (p) b0Var;
                if (z9) {
                    bArr2 = pVar2.f20462b;
                } else {
                    bArr2 = pVar2.f20462b;
                }
                if (Arrays.equals(this.f20462b, bArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f20461a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20462b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f20461a) + ", encryptedBlob=" + Arrays.toString(this.f20462b) + "}";
    }
}
