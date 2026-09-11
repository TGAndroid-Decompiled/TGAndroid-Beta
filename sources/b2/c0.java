package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class c0 {
    public static final String f1976i;
    public static final String f1977j;
    public static final String f1978k;
    public static final String f1979l;
    public static final String f1980m;
    public static final String f1981n;
    public static final String f1982o;
    public static final String f1983p;
    public final UUID f1984a;
    public final Uri f1985b;
    public final e9.k0 f1986c;
    public final boolean d;
    public final boolean f1987e;
    public final boolean f1988f;
    public final e9.i0 f1989g;
    public final byte[] h;

    static {
        String str = e2.d0.f8737a;
        f1976i = Integer.toString(0, 36);
        f1977j = Integer.toString(1, 36);
        f1978k = Integer.toString(2, 36);
        f1979l = Integer.toString(3, 36);
        f1980m = Integer.toString(4, 36);
        f1981n = Integer.toString(5, 36);
        f1982o = Integer.toString(6, 36);
        f1983p = Integer.toString(7, 36);
    }

    public c0(b0 b0Var) {
        boolean z10;
        byte[] bArr;
        if (b0Var.f1974f && b0Var.f1971b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        UUID uuid = b0Var.f1970a;
        uuid.getClass();
        this.f1984a = uuid;
        this.f1985b = b0Var.f1971b;
        this.f1986c = b0Var.f1972c;
        this.d = b0Var.d;
        this.f1988f = b0Var.f1974f;
        this.f1987e = b0Var.f1973e;
        this.f1989g = b0Var.f1975g;
        byte[] bArr2 = b0Var.h;
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
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f1984a.equals(c0Var.f1984a) && Objects.equals(this.f1985b, c0Var.f1985b) && Objects.equals(this.f1986c, c0Var.f1986c) && this.d == c0Var.d && this.f1988f == c0Var.f1988f && this.f1987e == c0Var.f1987e && this.f1989g.equals(c0Var.f1989g) && Arrays.equals(this.h, c0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f1984a.hashCode() * 31;
        Uri uri = this.f1985b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f1986c.hashCode();
        int hashCode3 = this.f1989g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f1988f ? 1 : 0)) * 31) + (this.f1987e ? 1 : 0)) * 31)) * 31);
    }
}
