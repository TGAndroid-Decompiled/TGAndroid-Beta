package defpackage;

import java.util.Arrays;
public final class ea {
    public static final ea c = new ea(new ca[0]);
    public static final ca d;
    public static final String e;
    public final int a;
    public final ca[] b;

    static {
        ca caVar = new ca(-1, new int[0], new ft6[0], new long[0], new String[0], new da[0]);
        int[] iArr = caVar.d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = caVar.e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        ft6[] ft6VarArr = (ft6[]) Arrays.copyOf(caVar.c, 0);
        String[] strArr = (String[]) Arrays.copyOf(caVar.f, 0);
        da[] daVarArr = caVar.g;
        d = new ca(0, copyOf, ft6VarArr, copyOf2, strArr, (da[]) Arrays.copyOf(daVarArr, Math.max(0, daVarArr.length)));
        String str = gcc.a;
        e = "1";
    }

    public ea(ca[] caVarArr) {
        this.a = caVarArr.length;
        this.b = caVarArr;
    }

    public final ca a(int i) {
        if (i < 0) {
            return d;
        }
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ea.class == obj.getClass()) {
                ea eaVar = (ea) obj;
                if (this.a == eaVar.a && Arrays.equals(this.b, eaVar.b)) {
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
            ca[] caVarArr = this.b;
            if (i < caVarArr.length) {
                sb.append("adGroup(timeUs=0, contentResumeOffsetUs=0, ads=[");
                caVarArr[i].getClass();
                caVarArr[i].getClass();
                for (int i2 = 0; i2 < caVarArr[i].d.length; i2++) {
                    sb.append("ad(state=");
                    int i3 = caVarArr[i].d[i2];
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
                    sb.append(caVarArr[i].e[i2]);
                    sb.append(')');
                    if (i2 < caVarArr[i].d.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i < caVarArr.length - 1) {
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
