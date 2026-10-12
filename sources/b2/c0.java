package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class c0 {
    public static final String f3247i;
    public static final String f3248j;
    public static final String f3249k;
    public static final String f3250l;
    public static final String f3251m;
    public static final String f3252n;
    public static final String f3253o;
    public static final String f3254p;
    public final UUID f3255a;
    public final Uri f3256b;
    public final e9.k0 f3257c;
    public final boolean d;
    public final boolean f3258e;
    public final boolean f3259f;
    public final e9.i0 f3260g;
    public final byte[] h;

    static {
        String str = e2.d0.f8529a;
        f3247i = Integer.toString(0, 36);
        f3248j = Integer.toString(1, 36);
        f3249k = Integer.toString(2, 36);
        f3250l = Integer.toString(3, 36);
        f3251m = Integer.toString(4, 36);
        f3252n = Integer.toString(5, 36);
        f3253o = Integer.toString(6, 36);
        f3254p = Integer.toString(7, 36);
    }

    public c0(b0 b0Var) {
        boolean z10;
        byte[] bArr;
        if (b0Var.f3245f && b0Var.f3242b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        UUID uuid = b0Var.f3241a;
        uuid.getClass();
        this.f3255a = uuid;
        this.f3256b = b0Var.f3242b;
        this.f3257c = b0Var.f3243c;
        this.d = b0Var.d;
        this.f3259f = b0Var.f3245f;
        this.f3258e = b0Var.f3244e;
        this.f3260g = b0Var.f3246g;
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
        if (this.f3255a.equals(c0Var.f3255a) && Objects.equals(this.f3256b, c0Var.f3256b) && Objects.equals(this.f3257c, c0Var.f3257c) && this.d == c0Var.d && this.f3259f == c0Var.f3259f && this.f3258e == c0Var.f3258e && this.f3260g.equals(c0Var.f3260g) && Arrays.equals(this.h, c0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3255a.hashCode() * 31;
        Uri uri = this.f3256b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3257c.hashCode();
        int hashCode3 = this.f3260g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f3259f ? 1 : 0)) * 31) + (this.f3258e ? 1 : 0)) * 31)) * 31);
    }
}
