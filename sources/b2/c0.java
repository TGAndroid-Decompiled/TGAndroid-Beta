package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class c0 {
    public static final String f3249i;
    public static final String f3250j;
    public static final String f3251k;
    public static final String f3252l;
    public static final String f3253m;
    public static final String f3254n;
    public static final String f3255o;
    public static final String f3256p;
    public final UUID f3257a;
    public final Uri f3258b;
    public final e9.k0 f3259c;
    public final boolean d;
    public final boolean f3260e;
    public final boolean f3261f;
    public final e9.i0 f3262g;
    public final byte[] h;

    static {
        String str = e2.d0.f8532a;
        f3249i = Integer.toString(0, 36);
        f3250j = Integer.toString(1, 36);
        f3251k = Integer.toString(2, 36);
        f3252l = Integer.toString(3, 36);
        f3253m = Integer.toString(4, 36);
        f3254n = Integer.toString(5, 36);
        f3255o = Integer.toString(6, 36);
        f3256p = Integer.toString(7, 36);
    }

    public c0(b0 b0Var) {
        boolean z10;
        byte[] bArr;
        if (b0Var.f3247f && b0Var.f3244b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        UUID uuid = b0Var.f3243a;
        uuid.getClass();
        this.f3257a = uuid;
        this.f3258b = b0Var.f3244b;
        this.f3259c = b0Var.f3245c;
        this.d = b0Var.d;
        this.f3261f = b0Var.f3247f;
        this.f3260e = b0Var.f3246e;
        this.f3262g = b0Var.f3248g;
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
        if (this.f3257a.equals(c0Var.f3257a) && Objects.equals(this.f3258b, c0Var.f3258b) && Objects.equals(this.f3259c, c0Var.f3259c) && this.d == c0Var.d && this.f3261f == c0Var.f3261f && this.f3260e == c0Var.f3260e && this.f3262g.equals(c0Var.f3262g) && Arrays.equals(this.h, c0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3257a.hashCode() * 31;
        Uri uri = this.f3258b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3259c.hashCode();
        int hashCode3 = this.f3262g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f3261f ? 1 : 0)) * 31) + (this.f3260e ? 1 : 0)) * 31)) * 31);
    }
}
