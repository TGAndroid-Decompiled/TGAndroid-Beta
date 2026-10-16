package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import v7.u6;
public final class h0 {
    public static final String f2150i;
    public static final String f2151j;
    public static final String f2152k;
    public static final String f2153l;
    public static final String f2154m;
    public static final String f2155n;
    public static final String f2156o;
    public static final String f2157p;
    public final UUID f2158a;
    public final Uri f2159b;
    public final e9.q0 f2160c;
    public final boolean d;
    public final boolean e;
    public final boolean f2161f;
    public final e9.n0 f2162g;
    public final byte[] h;

    static {
        String str = e2.m0.f8375a;
        f2150i = Integer.toString(0, 36);
        f2151j = Integer.toString(1, 36);
        f2152k = Integer.toString(2, 36);
        f2153l = Integer.toString(3, 36);
        f2154m = Integer.toString(4, 36);
        f2155n = Integer.toString(5, 36);
        f2156o = Integer.toString(6, 36);
        f2157p = Integer.toString(7, 36);
    }

    public h0(g0 g0Var) {
        boolean z10;
        byte[] bArr;
        if (g0Var.f2147f && g0Var.f2145b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        UUID uuid = g0Var.f2144a;
        uuid.getClass();
        this.f2158a = uuid;
        this.f2159b = g0Var.f2145b;
        this.f2160c = g0Var.f2146c;
        this.d = g0Var.d;
        this.f2161f = g0Var.f2147f;
        this.e = g0Var.e;
        this.f2162g = g0Var.f2148g;
        byte[] bArr2 = g0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.h = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f2158a.equals(h0Var.f2158a) && Objects.equals(this.f2159b, h0Var.f2159b) && Objects.equals(this.f2160c, h0Var.f2160c) && this.d == h0Var.d && this.f2161f == h0Var.f2161f && this.e == h0Var.e && this.f2162g.equals(h0Var.f2162g) && Arrays.equals(this.h, h0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2158a.hashCode() * 31;
        Uri uri = this.f2159b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f2160c.hashCode();
        int hashCode3 = this.f2162g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f2161f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
