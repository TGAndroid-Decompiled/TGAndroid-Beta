package a0;

import w7.t7;
public final class l {
    public int[] f26a;
    public int f27b;

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            int i10 = lVar.f27b;
            int i11 = this.f27b;
            if (i10 == i11) {
                int[] iArr = this.f26a;
                int[] iArr2 = lVar.f26a;
                ud.e a2 = t7.a(0, i11);
                int i12 = a2.f43712a;
                int i13 = a2.f43713b;
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
        int[] iArr = this.f26a;
        int i10 = this.f27b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12] * 31;
        }
        return i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f26a;
        int i10 = this.f27b;
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
