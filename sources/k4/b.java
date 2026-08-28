package k4;

import android.net.Uri;
import d5.f0;
import h3.g;
import i3.i;
import java.util.Arrays;
public final class b implements g {
    public static final b f14627f = new b(new a[0], 0, -9223372036854775807L, 0);
    public static final a h;
    public static final String f14628n;
    public static final String f14629r;
    public static final String f14630s;
    public static final String v;
    public static final i f14631w;
    public final int f14632a;
    public final long f14633b;
    public final long f14634c;
    public final int d;
    public final a[] f14635e;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = aVar.f14624e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f14625f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        h = new a(aVar.f14621a, 0, aVar.f14623c, copyOf, (Uri[]) Arrays.copyOf(aVar.d, 0), copyOf2, aVar.h, aVar.f14626n);
        int i9 = f0.f4349a;
        f14628n = Integer.toString(1, 36);
        f14629r = Integer.toString(2, 36);
        f14630s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f14631w = new i(11);
    }

    public b(a[] aVarArr, long j10, long j11, int i9) {
        this.f14633b = j10;
        this.f14634c = j11;
        this.f14632a = aVarArr.length + i9;
        this.f14635e = aVarArr;
        this.d = i9;
    }

    public final a a(int i9) {
        int i10 = this.d;
        if (i9 < i10) {
            return h;
        }
        return this.f14635e[i9 - i10];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                int i9 = f0.f4349a;
                if (this.f14632a == bVar.f14632a && this.f14633b == bVar.f14633b && this.f14634c == bVar.f14634c && this.d == bVar.d && Arrays.equals(this.f14635e, bVar.f14635e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.f14632a * 961) + ((int) this.f14633b)) * 31) + ((int) this.f14634c)) * 31) + this.d) * 31) + Arrays.hashCode(this.f14635e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb2.append(this.f14633b);
        sb2.append(", adGroups=[");
        int i9 = 0;
        while (true) {
            a[] aVarArr = this.f14635e;
            if (i9 < aVarArr.length) {
                sb2.append("adGroup(timeUs=");
                sb2.append(aVarArr[i9].f14621a);
                sb2.append(", ads=[");
                for (int i10 = 0; i10 < aVarArr[i9].f14624e.length; i10++) {
                    sb2.append("ad(state=");
                    int i11 = aVarArr[i9].f14624e[i10];
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
                    sb2.append(aVarArr[i9].f14625f[i10]);
                    sb2.append(')');
                    if (i10 < aVarArr[i9].f14624e.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append("])");
                if (i9 < aVarArr.length - 1) {
                    sb2.append(", ");
                }
                i9++;
            } else {
                sb2.append("])");
                return sb2.toString();
            }
        }
    }
}
