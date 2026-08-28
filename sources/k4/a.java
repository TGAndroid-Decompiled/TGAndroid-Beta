package k4;

import android.net.Uri;
import d5.f0;
import h3.g;
import i3.i;
import java.util.Arrays;
public final class a implements g {
    public static final String A;
    public static final String B;
    public static final i C;
    public static final String f14616r;
    public static final String f14617s;
    public static final String v;
    public static final String f14618w;
    public static final String f14619x;
    public static final String f14620y;
    public final long f14621a;
    public final int f14622b;
    public final int f14623c;
    public final Uri[] d;
    public final int[] f14624e;
    public final long[] f14625f;
    public final long h;
    public final boolean f14626n;

    static {
        int i9 = f0.f4349a;
        f14616r = Integer.toString(0, 36);
        f14617s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f14618w = Integer.toString(3, 36);
        f14619x = Integer.toString(4, 36);
        f14620y = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = new i(12);
    }

    public a(long j10, int i9, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        boolean z11;
        if (iArr.length == uriArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        d5.a.f(z11);
        this.f14621a = j10;
        this.f14622b = i9;
        this.f14623c = i10;
        this.f14624e = iArr;
        this.d = uriArr;
        this.f14625f = jArr;
        this.h = j11;
        this.f14626n = z10;
    }

    public final int a(int i9) {
        int i10;
        int i11 = i9 + 1;
        while (true) {
            int[] iArr = this.f14624e;
            if (i11 >= iArr.length || this.f14626n || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f14621a == aVar.f14621a && this.f14622b == aVar.f14622b && this.f14623c == aVar.f14623c && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f14624e, aVar.f14624e) && Arrays.equals(this.f14625f, aVar.f14625f) && this.h == aVar.h && this.f14626n == aVar.f14626n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f14621a;
        int hashCode = Arrays.hashCode(this.f14624e);
        int hashCode2 = Arrays.hashCode(this.f14625f);
        long j11 = this.h;
        return ((((hashCode2 + ((hashCode + (((((((this.f14622b * 31) + this.f14623c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f14626n ? 1 : 0);
    }
}
