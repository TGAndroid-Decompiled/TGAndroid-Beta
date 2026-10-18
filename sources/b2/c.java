package b2;

import java.util.Arrays;
public final class c {
    public static final c f3705c = new c(new a[0]);
    public static final a d;
    public static final String e;
    public final int f3706a;
    public final a[] f3707b;

    static {
        a aVar = new a(-1, -1, new int[0], new o0[0], new long[0], new String[0], new b[0]);
        int[] iArr = aVar.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f3688f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        o0[] o0VarArr = (o0[]) Arrays.copyOf(aVar.d, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.f3689g, 0);
        b[] bVarArr = aVar.h;
        d = new a(0, aVar.f3686b, copyOf, o0VarArr, copyOf2, strArr, (b[]) Arrays.copyOf(bVarArr, Math.max(0, bVarArr.length)));
        String str = e2.m0.f8253a;
        e = Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public c(a[] aVarArr) {
        this.f3706a = aVarArr.length;
        this.f3707b = aVarArr;
    }

    public final a a(int i10) {
        if (i10 < 0) {
            return d;
        }
        return this.f3707b[i10];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f3706a == cVar.f3706a && Arrays.equals(this.f3707b, cVar.f3707b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3707b) + (((((this.f3706a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f3707b;
            if (i10 < aVarArr.length) {
                sb2.append("adGroup(timeUs=0, ads=[");
                aVarArr[i10].getClass();
                for (int i11 = 0; i11 < aVarArr[i10].e.length; i11++) {
                    sb2.append("ad(state=");
                    int i12 = aVarArr[i10].e[i11];
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
                    sb2.append(aVarArr[i10].f3688f[i11]);
                    sb2.append(')');
                    if (i11 < aVarArr[i10].e.length - 1) {
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
