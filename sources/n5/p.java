package n5;

import java.util.Arrays;
public final class p extends b0 {
    public final byte[] f21397a;
    public final byte[] f21398b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f21397a = bArr;
        this.f21398b = bArr2;
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
                bArr = pVar.f21397a;
            } else {
                bArr = pVar.f21397a;
            }
            if (Arrays.equals(this.f21397a, bArr)) {
                p pVar2 = (p) b0Var;
                if (z10) {
                    bArr2 = pVar2.f21398b;
                } else {
                    bArr2 = pVar2.f21398b;
                }
                if (Arrays.equals(this.f21398b, bArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f21397a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21398b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f21397a) + ", encryptedBlob=" + Arrays.toString(this.f21398b) + "}";
    }
}
