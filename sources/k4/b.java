package k4;

import android.net.Uri;
import d5.g0;
import h3.g;
import ia.l;
import java.util.Arrays;

public final class b implements g {

    public static final b f14448f = new b(new a[0], 0, -9223372036854775807L, 0);
    public static final a h;

    public static final String f14449n;

    public static final String f14450r;

    public static final String f14451s;
    public static final String v;

    public static final l f14452w;

    public final int f14453a;

    public final long f14454b;

    public final long f14455c;
    public final int d;

    public final a[] f14456e;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = aVar.f14445e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f14446f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        h = new a(aVar.f14442a, 0, aVar.f14444c, iArrCopyOf, (Uri[]) Arrays.copyOf(aVar.d, 0), jArrCopyOf, aVar.h, aVar.f14447n);
        int i10 = g0.f4795a;
        f14449n = Integer.toString(1, 36);
        f14450r = Integer.toString(2, 36);
        f14451s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f14452w = new l(17);
    }

    public b(a[] aVarArr, long j10, long j11, int i10) {
        this.f14454b = j10;
        this.f14455c = j11;
        this.f14453a = aVarArr.length + i10;
        this.f14456e = aVarArr;
        this.d = i10;
    }

    public final a a(int i10) {
        int i11 = this.d;
        return i10 < i11 ? h : this.f14456e[i10 - i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i10 = g0.f4795a;
        return this.f14453a == bVar.f14453a && this.f14454b == bVar.f14454b && this.f14455c == bVar.f14455c && this.d == bVar.d && Arrays.equals(this.f14456e, bVar.f14456e);
    }

    public final int hashCode() {
        return (((((((this.f14453a * 961) + ((int) this.f14454b)) * 31) + ((int) this.f14455c)) * 31) + this.d) * 31) + Arrays.hashCode(this.f14456e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb2.append(this.f14454b);
        sb2.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f14456e;
            if (i10 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(aVarArr[i10].f14442a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < aVarArr[i10].f14445e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = aVarArr[i10].f14445e[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(aVarArr[i10].f14446f[i11]);
                sb2.append(')');
                if (i11 < aVarArr[i10].f14445e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }
}
