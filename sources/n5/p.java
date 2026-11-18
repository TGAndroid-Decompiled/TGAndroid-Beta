package n5;

import java.util.Arrays;
public final class p extends b0 {
    public final byte[] f21394a;
    public final byte[] f21395b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f21394a = bArr;
        this.f21395b = bArr2;
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
                bArr = pVar.f21394a;
            } else {
                bArr = pVar.f21394a;
            }
            if (Arrays.equals(this.f21394a, bArr)) {
                p pVar2 = (p) b0Var;
                if (z10) {
                    bArr2 = pVar2.f21395b;
                } else {
                    bArr2 = pVar2.f21395b;
                }
                if (Arrays.equals(this.f21395b, bArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f21394a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21395b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f21394a) + ", encryptedBlob=" + Arrays.toString(this.f21395b) + "}";
    }
}
