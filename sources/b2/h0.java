package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import v7.t6;
public final class h0 {
    public static final String f2048i;
    public static final String f2049j;
    public static final String f2050k;
    public static final String f2051l;
    public static final String f2052m;
    public static final String f2053n;
    public static final String f2054o;
    public static final String f2055p;
    public final UUID f2056a;
    public final Uri f2057b;
    public final e9.q0 f2058c;
    public final boolean d;
    public final boolean e;
    public final boolean f2059f;
    public final e9.n0 f2060g;
    public final byte[] h;

    static {
        String str = e2.l0.f6165a;
        f2048i = Integer.toString(0, 36);
        f2049j = Integer.toString(1, 36);
        f2050k = Integer.toString(2, 36);
        f2051l = Integer.toString(3, 36);
        f2052m = Integer.toString(4, 36);
        f2053n = Integer.toString(5, 36);
        f2054o = Integer.toString(6, 36);
        f2055p = Integer.toString(7, 36);
    }

    public h0(g0 g0Var) {
        boolean z10;
        byte[] bArr;
        if (g0Var.f2044f && g0Var.f2042b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        t6.p(z10);
        UUID uuid = g0Var.f2041a;
        uuid.getClass();
        this.f2056a = uuid;
        this.f2057b = g0Var.f2042b;
        this.f2058c = g0Var.f2043c;
        this.d = g0Var.d;
        this.f2059f = g0Var.f2044f;
        this.e = g0Var.e;
        this.f2060g = g0Var.f2045g;
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
        if (this.f2056a.equals(h0Var.f2056a) && Objects.equals(this.f2057b, h0Var.f2057b) && Objects.equals(this.f2058c, h0Var.f2058c) && this.d == h0Var.d && this.f2059f == h0Var.f2059f && this.e == h0Var.e && this.f2060g.equals(h0Var.f2060g) && Arrays.equals(this.h, h0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2056a.hashCode() * 31;
        Uri uri = this.f2057b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f2058c.hashCode();
        int hashCode3 = this.f2060g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f2059f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
