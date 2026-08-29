package m4;

import android.net.Uri;
import f5.d0;
import j3.g;
import java.util.Arrays;
public final class b implements g {
    public static final String A;
    public static final String B;
    public static final a C;
    public static final String f16837r;
    public static final String f16838s;
    public static final String v;
    public static final String f16839w;
    public static final String f16840x;
    public static final String f16841y;
    public final long f16842a;
    public final int f16843b;
    public final int f16844c;
    public final Uri[] d;
    public final int[] f16845e;
    public final long[] f16846f;
    public final long h;
    public final boolean f16847n;

    static {
        int i10 = d0.f6579a;
        f16837r = Integer.toString(0, 36);
        f16838s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f16839w = Integer.toString(3, 36);
        f16840x = Integer.toString(4, 36);
        f16841y = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = new a(0);
    }

    public b(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        boolean z11;
        if (iArr.length == uriArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        f5.a.f(z11);
        this.f16842a = j10;
        this.f16843b = i10;
        this.f16844c = i11;
        this.f16845e = iArr;
        this.d = uriArr;
        this.f16846f = jArr;
        this.h = j11;
        this.f16847n = z10;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f16845e;
            if (i12 >= iArr.length || this.f16847n || (i11 = iArr[i12]) == 0 || i11 == 1) {
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f16842a == bVar.f16842a && this.f16843b == bVar.f16843b && this.f16844c == bVar.f16844c && Arrays.equals(this.d, bVar.d) && Arrays.equals(this.f16845e, bVar.f16845e) && Arrays.equals(this.f16846f, bVar.f16846f) && this.h == bVar.h && this.f16847n == bVar.f16847n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f16842a;
        int hashCode = Arrays.hashCode(this.f16845e);
        int hashCode2 = Arrays.hashCode(this.f16846f);
        long j11 = this.h;
        return ((((hashCode2 + ((hashCode + (((((((this.f16843b * 31) + this.f16844c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f16847n ? 1 : 0);
    }
}
