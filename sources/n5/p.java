package n5;

import java.util.Arrays;
public final class p extends b0 {
    public final byte[] f20464a;
    public final byte[] f20465b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f20464a = bArr;
        this.f20465b = bArr2;
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
                bArr = pVar.f20464a;
            } else {
                bArr = pVar.f20464a;
            }
            if (Arrays.equals(this.f20464a, bArr)) {
                p pVar2 = (p) b0Var;
                if (z9) {
                    bArr2 = pVar2.f20465b;
                } else {
                    bArr2 = pVar2.f20465b;
                }
                if (Arrays.equals(this.f20465b, bArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f20464a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20465b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f20464a) + ", encryptedBlob=" + Arrays.toString(this.f20465b) + "}";
    }
}
