package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import v7.u6;
public final class h0 {
    public static final String f2146i;
    public static final String f2147j;
    public static final String f2148k;
    public static final String f2149l;
    public static final String f2150m;
    public static final String f2151n;
    public static final String f2152o;
    public static final String f2153p;
    public final UUID f2154a;
    public final Uri f2155b;
    public final e9.q0 f2156c;
    public final boolean d;
    public final boolean e;
    public final boolean f2157f;
    public final e9.n0 f2158g;
    public final byte[] h;

    static {
        String str = e2.m0.f8372a;
        f2146i = Integer.toString(0, 36);
        f2147j = Integer.toString(1, 36);
        f2148k = Integer.toString(2, 36);
        f2149l = Integer.toString(3, 36);
        f2150m = Integer.toString(4, 36);
        f2151n = Integer.toString(5, 36);
        f2152o = Integer.toString(6, 36);
        f2153p = Integer.toString(7, 36);
    }

    public h0(g0 g0Var) {
        boolean z10;
        byte[] bArr;
        if (g0Var.f2143f && g0Var.f2141b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        UUID uuid = g0Var.f2140a;
        uuid.getClass();
        this.f2154a = uuid;
        this.f2155b = g0Var.f2141b;
        this.f2156c = g0Var.f2142c;
        this.d = g0Var.d;
        this.f2157f = g0Var.f2143f;
        this.e = g0Var.e;
        this.f2158g = g0Var.f2144g;
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
        if (this.f2154a.equals(h0Var.f2154a) && Objects.equals(this.f2155b, h0Var.f2155b) && Objects.equals(this.f2156c, h0Var.f2156c) && this.d == h0Var.d && this.f2157f == h0Var.f2157f && this.e == h0Var.e && this.f2158g.equals(h0Var.f2158g) && Arrays.equals(this.h, h0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2154a.hashCode() * 31;
        Uri uri = this.f2155b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f2156c.hashCode();
        int hashCode3 = this.f2158g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f2157f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
