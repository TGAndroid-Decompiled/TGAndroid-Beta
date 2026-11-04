package d2;

import java.util.Arrays;
public final class c {
    public static final c f8039c = new c(new a[0]);
    public static final a d;
    public static final String f8040e;
    public final int f8041a;
    public final a[] f8042b;

    static {
        a aVar = new a(-1, -1, new int[0], new n0[0], new long[0], new String[0], new b[0]);
        int[] iArr = aVar.f8019e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f8020f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        n0[] n0VarArr = (n0[]) Arrays.copyOf(aVar.d, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.f8021g, 0);
        b[] bVarArr = aVar.h;
        d = new a(0, aVar.f8017b, copyOf, n0VarArr, copyOf2, strArr, (b[]) Arrays.copyOf(bVarArr, Math.max(0, bVarArr.length)));
        String str = g2.n0.f11873a;
        f8040e = Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public c(a[] aVarArr) {
        this.f8041a = aVarArr.length;
        this.f8042b = aVarArr;
    }

    public final a a(int i3) {
        if (i3 < 0) {
            return d;
        }
        return this.f8042b[i3];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f8041a == cVar.f8041a && Arrays.equals(this.f8042b, cVar.f8042b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8042b) + (((((this.f8041a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.f8042b;
            if (i3 < aVarArr.length) {
                sb2.append("adGroup(timeUs=0, ads=[");
                aVarArr[i3].getClass();
                for (int i10 = 0; i10 < aVarArr[i3].f8019e.length; i10++) {
                    sb2.append("ad(state=");
                    int i11 = aVarArr[i3].f8019e[i10];
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 != 4) {
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
                    sb2.append(aVarArr[i3].f8020f[i10]);
                    sb2.append(')');
                    if (i10 < aVarArr[i3].f8019e.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append("])");
                if (i3 < aVarArr.length - 1) {
                    sb2.append(", ");
                }
                i3++;
            } else {
                sb2.append("])");
                return sb2.toString();
            }
        }
    }
}
