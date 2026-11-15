package e2;

import a8.ja;
import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class d0 {
    public static final String f10036i;
    public static final String f10037j;
    public static final String f10038k;
    public static final String f10039l;
    public static final String f10040m;
    public static final String f10041n;
    public static final String f10042o;
    public static final String f10043p;
    public final UUID f10044a;
    public final Uri f10045b;
    public final h9.l0 f10046c;
    public final boolean d;
    public final boolean f10047e;
    public final boolean f10048f;
    public final h9.i0 f10049g;
    public final byte[] h;

    static {
        String str = h2.l0.f13471a;
        f10036i = Integer.toString(0, 36);
        f10037j = Integer.toString(1, 36);
        f10038k = Integer.toString(2, 36);
        f10039l = Integer.toString(3, 36);
        f10040m = Integer.toString(4, 36);
        f10041n = Integer.toString(5, 36);
        f10042o = Integer.toString(6, 36);
        f10043p = Integer.toString(7, 36);
    }

    public d0(c0 c0Var) {
        boolean z10;
        byte[] bArr;
        if (c0Var.f10034f && c0Var.f10031b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ja.p(z10);
        UUID uuid = c0Var.f10030a;
        uuid.getClass();
        this.f10044a = uuid;
        this.f10045b = c0Var.f10031b;
        this.f10046c = c0Var.f10032c;
        this.d = c0Var.d;
        this.f10048f = c0Var.f10034f;
        this.f10047e = c0Var.f10033e;
        this.f10049g = c0Var.f10035g;
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
        if (this.f10044a.equals(d0Var.f10044a) && Objects.equals(this.f10045b, d0Var.f10045b) && Objects.equals(this.f10046c, d0Var.f10046c) && this.d == d0Var.d && this.f10048f == d0Var.f10048f && this.f10047e == d0Var.f10047e && this.f10049g.equals(d0Var.f10049g) && Arrays.equals(this.h, d0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10044a.hashCode() * 31;
        Uri uri = this.f10045b;
        if (uri != null) {
            i7 = uri.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f10046c.hashCode();
        int hashCode3 = this.f10049g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i7) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f10048f ? 1 : 0)) * 31) + (this.f10047e ? 1 : 0)) * 31)) * 31);
    }
}
