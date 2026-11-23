package e2;

import a8.ma;
import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class d0 {
    public static final String f10346i;
    public static final String f10347j;
    public static final String f10348k;
    public static final String f10349l;
    public static final String f10350m;
    public static final String f10351n;
    public static final String f10352o;
    public static final String f10353p;
    public final UUID f10354a;
    public final Uri f10355b;
    public final h9.l0 f10356c;
    public final boolean d;
    public final boolean f10357e;
    public final boolean f10358f;
    public final h9.i0 f10359g;
    public final byte[] h;

    static {
        String str = h2.l0.f13778a;
        f10346i = Integer.toString(0, 36);
        f10347j = Integer.toString(1, 36);
        f10348k = Integer.toString(2, 36);
        f10349l = Integer.toString(3, 36);
        f10350m = Integer.toString(4, 36);
        f10351n = Integer.toString(5, 36);
        f10352o = Integer.toString(6, 36);
        f10353p = Integer.toString(7, 36);
    }

    public d0(c0 c0Var) {
        boolean z10;
        byte[] bArr;
        if (c0Var.f10344f && c0Var.f10341b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ma.p(z10);
        UUID uuid = c0Var.f10340a;
        uuid.getClass();
        this.f10354a = uuid;
        this.f10355b = c0Var.f10341b;
        this.f10356c = c0Var.f10342c;
        this.d = c0Var.d;
        this.f10358f = c0Var.f10344f;
        this.f10357e = c0Var.f10343e;
        this.f10359g = c0Var.f10345g;
        byte[] bArr2 = c0Var.h;
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
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f10354a.equals(d0Var.f10354a) && Objects.equals(this.f10355b, d0Var.f10355b) && Objects.equals(this.f10356c, d0Var.f10356c) && this.d == d0Var.d && this.f10358f == d0Var.f10358f && this.f10357e == d0Var.f10357e && this.f10359g.equals(d0Var.f10359g) && Arrays.equals(this.h, d0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10354a.hashCode() * 31;
        Uri uri = this.f10355b;
        if (uri != null) {
            i7 = uri.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f10356c.hashCode();
        int hashCode3 = this.f10359g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i7) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f10358f ? 1 : 0)) * 31) + (this.f10357e ? 1 : 0)) * 31)) * 31);
    }
}
