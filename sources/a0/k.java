package a0;

import w7.g8;
public final class k {
    public int[] f23a;
    public int f24b;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            int i10 = kVar.f24b;
            int i11 = this.f24b;
            if (i10 == i11) {
                int[] iArr = this.f23a;
                int[] iArr2 = kVar.f23a;
                wd.e a2 = g8.a(0, i11);
                int i12 = a2.f49370a;
                int i13 = a2.f49371b;
                if (i12 <= i13) {
                    while (iArr[i12] == iArr2[i12]) {
                        if (i12 != i13) {
                            i12++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f23a;
        int i10 = this.f24b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12] * 31;
        }
        return i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f23a;
        int i10 = this.f24b;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                int i12 = iArr[i11];
                if (i11 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i11 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append(i12);
                i11++;
            } else {
                sb2.append((CharSequence) "]");
                break;
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
