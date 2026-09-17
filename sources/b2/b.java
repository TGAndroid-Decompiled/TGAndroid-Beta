package b2;

import java.util.Arrays;
public final class b {
    public static final b f1966c = new b(new a[0]);
    public static final a d;
    public static final String f1967e;
    public final int f1968a;
    public final a[] f1969b;

    static {
        a aVar = new a(-1, -1, new int[0], new k0[0], new long[0], new String[0]);
        int[] iArr = aVar.f1948e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f1949f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        d = new a(0, aVar.f1946b, copyOf, (k0[]) Arrays.copyOf(aVar.d, 0), copyOf2, (String[]) Arrays.copyOf(aVar.f1950g, 0));
        String str = e2.d0.f8737a;
        f1967e = Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public b(a[] aVarArr) {
        this.f1968a = aVarArr.length;
        this.f1969b = aVarArr;
    }

    public final a a(int i10) {
        if (i10 < 0) {
            return d;
        }
        return this.f1969b[i10];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f1968a == bVar.f1968a && Arrays.equals(this.f1969b, bVar.f1969b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1969b) + (((((this.f1968a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f1969b;
            if (i10 < aVarArr.length) {
                sb2.append("adGroup(timeUs=0, ads=[");
                aVarArr[i10].getClass();
                for (int i11 = 0; i11 < aVarArr[i10].f1948e.length; i11++) {
                    sb2.append("ad(state=");
                    int i12 = aVarArr[i10].f1948e[i11];
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
                    sb2.append(aVarArr[i10].f1949f[i11]);
                    sb2.append(')');
                    if (i11 < aVarArr[i10].f1948e.length - 1) {
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
