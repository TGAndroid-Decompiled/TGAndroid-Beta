package b2;

import java.util.Arrays;
public final class b {
    public static final b f3160c = new b(new a[0]);
    public static final a d;
    public static final String f3161e;
    public final int f3162a;
    public final a[] f3163b;

    static {
        a aVar = new a(-1, -1, new int[0], new k0[0], new long[0], new String[0]);
        int[] iArr = aVar.f3142e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f3143f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        d = new a(0, aVar.f3140b, copyOf, (k0[]) Arrays.copyOf(aVar.d, 0), copyOf2, (String[]) Arrays.copyOf(aVar.f3144g, 0));
        String str = e2.d0.f8537a;
        f3161e = Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public b(a[] aVarArr) {
        this.f3162a = aVarArr.length;
        this.f3163b = aVarArr;
    }

    public final a a(int i10) {
        if (i10 < 0) {
            return d;
        }
        return this.f3163b[i10];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f3162a == bVar.f3162a && Arrays.equals(this.f3163b, bVar.f3163b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3163b) + (((((this.f3162a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f3163b;
            if (i10 < aVarArr.length) {
                sb2.append("adGroup(timeUs=0, ads=[");
                aVarArr[i10].getClass();
                for (int i11 = 0; i11 < aVarArr[i10].f3142e.length; i11++) {
                    sb2.append("ad(state=");
                    int i12 = aVarArr[i10].f3142e[i11];
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    if (i12 != 4) {
                                        sb2.append('?');
                                    } else {
                                        sb2.append('!');
                                    }
                                } else {
                                    sb2.append('P');
                                }
                            } else {
                                sb2.append('S');
                            }
                        } else {
                            sb2.append('R');
                        }
                    } else {
                        sb2.append('_');
                    }
                    sb2.append(", durationUs=");
                    sb2.append(aVarArr[i10].f3143f[i11]);
                    sb2.append(')');
                    if (i11 < aVarArr[i10].f3142e.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append("])");
                if (i10 < aVarArr.length - 1) {
                    sb2.append(", ");
                }
                i10++;
            } else {
                sb2.append("])");
                return sb2.toString();
            }
        }
    }
}
