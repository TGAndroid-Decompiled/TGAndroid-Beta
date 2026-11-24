package defpackage;

import java.util.Arrays;
public final class da {
    public static final da c = new da(new ba[0]);
    public static final ba d;
    public static final String e;
    public final int a;
    public final ba[] b;

    static {
        ba baVar = new ba(-1, new int[0], new br6[0], new long[0], new String[0], new ca[0]);
        int[] iArr = baVar.d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = baVar.e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        br6[] br6VarArr = (br6[]) Arrays.copyOf(baVar.c, 0);
        String[] strArr = (String[]) Arrays.copyOf(baVar.f, 0);
        ca[] caVarArr = baVar.g;
        d = new ba(0, copyOf, br6VarArr, copyOf2, strArr, (ca[]) Arrays.copyOf(caVarArr, Math.max(0, caVarArr.length)));
        String str = g8c.a;
        e = "1";
    }

    public da(ba[] baVarArr) {
        this.a = baVarArr.length;
        this.b = baVarArr;
    }

    public final ba a(int i) {
        if (i < 0) {
            return d;
        }
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && da.class == obj.getClass()) {
                da daVar = (da) obj;
                if (this.a == daVar.a && Arrays.equals(this.b, daVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((this.a * 29791) + 1) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            ba[] baVarArr = this.b;
            if (i < baVarArr.length) {
                sb.append("adGroup(timeUs=0, contentResumeOffsetUs=0, ads=[");
                baVarArr[i].getClass();
                baVarArr[i].getClass();
                for (int i2 = 0; i2 < baVarArr[i].d.length; i2++) {
                    sb.append("ad(state=");
                    int i3 = baVarArr[i].d[i2];
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
                                        sb.append('?');
                                    } else {
                                        sb.append('!');
                                    }
                                } else {
                                    sb.append('P');
                                }
                            } else {
                                sb.append('S');
                            }
                        } else {
                            sb.append('R');
                        }
                    } else {
                        sb.append('_');
                    }
                    sb.append(", durationUs=");
                    sb.append(baVarArr[i].e[i2]);
                    sb.append(')');
                    if (i2 < baVarArr[i].d.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i < baVarArr.length - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
