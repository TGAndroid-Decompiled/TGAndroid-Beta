package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class c0 {
    public static final String f2943i;
    public static final String f2944j;
    public static final String f2945k;
    public static final String f2946l;
    public static final String f2947m;
    public static final String f2948n;
    public static final String f2949o;
    public static final String f2950p;
    public final UUID f2951a;
    public final Uri f2952b;
    public final e9.k0 f2953c;
    public final boolean d;
    public final boolean e;
    public final boolean f2954f;
    public final e9.i0 f2955g;
    public final byte[] h;

    static {
        String str = e2.d0.f7888a;
        f2943i = Integer.toString(0, 36);
        f2944j = Integer.toString(1, 36);
        f2945k = Integer.toString(2, 36);
        f2946l = Integer.toString(3, 36);
        f2947m = Integer.toString(4, 36);
        f2948n = Integer.toString(5, 36);
        f2949o = Integer.toString(6, 36);
        f2950p = Integer.toString(7, 36);
    }

    public c0(b0 b0Var) {
        boolean z10;
        byte[] bArr;
        if (b0Var.f2941f && b0Var.f2939b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        UUID uuid = b0Var.f2938a;
        uuid.getClass();
        this.f2951a = uuid;
        this.f2952b = b0Var.f2939b;
        this.f2953c = b0Var.f2940c;
        this.d = b0Var.d;
        this.f2954f = b0Var.f2941f;
        this.e = b0Var.e;
        this.f2955g = b0Var.f2942g;
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
        if (this.f2951a.equals(c0Var.f2951a) && Objects.equals(this.f2952b, c0Var.f2952b) && Objects.equals(this.f2953c, c0Var.f2953c) && this.d == c0Var.d && this.f2954f == c0Var.f2954f && this.e == c0Var.e && this.f2955g.equals(c0Var.f2955g) && Arrays.equals(this.h, c0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2951a.hashCode() * 31;
        Uri uri = this.f2952b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f2953c.hashCode();
        int hashCode3 = this.f2955g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f2954f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
