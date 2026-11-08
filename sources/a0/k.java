package a0;

import c8.uc;
public final class k {
    public int[] f27a;
    public int f28b;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            int i7 = kVar.f28b;
            int i10 = this.f28b;
            if (i7 == i10) {
                int[] iArr = this.f27a;
                int[] iArr2 = kVar.f27a;
                ud.e a10 = uc.a(0, i10);
                int i11 = a10.f56518a;
                int i12 = a10.f56519b;
                if (i11 <= i12) {
                    while (iArr[i11] == iArr2[i11]) {
                        if (i11 != i12) {
                            i11++;
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
        int[] iArr = this.f27a;
        int i7 = this.f28b;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 += iArr[i11] * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f27a;
        int i7 = this.f28b;
        int i10 = 0;
        while (true) {
            if (i10 < i7) {
                int i11 = iArr[i10];
                if (i10 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append(i11);
                i10++;
            } else {
                sb2.append((CharSequence) "]");
                break;
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
