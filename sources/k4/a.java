package k4;

import android.net.Uri;
import d5.g0;
import h3.g;
import ia.l;
import java.util.Arrays;

public final class a implements g {
    public static final String A;
    public static final String B;
    public static final l C;

    public static final String f14437r;

    public static final String f14438s;
    public static final String v;

    public static final String f14439w;

    public static final String f14440x;

    public static final String f14441y;

    public final long f14442a;

    public final int f14443b;

    public final int f14444c;
    public final Uri[] d;

    public final int[] f14445e;

    public final long[] f14446f;
    public final long h;

    public final boolean f14447n;

    static {
        int i10 = g0.f4795a;
        f14437r = Integer.toString(0, 36);
        f14438s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f14439w = Integer.toString(3, 36);
        f14440x = Integer.toString(4, 36);
        f14441y = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = new l(18);
    }

    public a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        d5.a.f(iArr.length == uriArr.length);
        this.f14442a = j10;
        this.f14443b = i10;
        this.f14444c = i11;
        this.f14445e = iArr;
        this.d = uriArr;
        this.f14446f = jArr;
        this.h = j11;
        this.f14447n = z10;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f14445e;
            if (i12 >= iArr.length || this.f14447n || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f14442a == aVar.f14442a && this.f14443b == aVar.f14443b && this.f14444c == aVar.f14444c && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f14445e, aVar.f14445e) && Arrays.equals(this.f14446f, aVar.f14446f) && this.h == aVar.h && this.f14447n == aVar.f14447n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.f14443b * 31) + this.f14444c) * 31;
        long j10 = this.f14442a;
        int iHashCode = (Arrays.hashCode(this.f14446f) + ((Arrays.hashCode(this.f14445e) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31;
        long j11 = this.h;
        return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f14447n ? 1 : 0);
    }
}
