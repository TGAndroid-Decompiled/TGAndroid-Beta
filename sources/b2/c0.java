package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class c0 {
    public static final String f2937i;
    public static final String f2938j;
    public static final String f2939k;
    public static final String f2940l;
    public static final String f2941m;
    public static final String f2942n;
    public static final String f2943o;
    public static final String f2944p;
    public final UUID f2945a;
    public final Uri f2946b;
    public final e9.k0 f2947c;
    public final boolean d;
    public final boolean e;
    public final boolean f2948f;
    public final e9.i0 f2949g;
    public final byte[] h;

    static {
        String str = e2.d0.f7872a;
        f2937i = Integer.toString(0, 36);
        f2938j = Integer.toString(1, 36);
        f2939k = Integer.toString(2, 36);
        f2940l = Integer.toString(3, 36);
        f2941m = Integer.toString(4, 36);
        f2942n = Integer.toString(5, 36);
        f2943o = Integer.toString(6, 36);
        f2944p = Integer.toString(7, 36);
    }

    public c0(b0 b0Var) {
        boolean z10;
        byte[] bArr;
        if (b0Var.f2935f && b0Var.f2933b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        UUID uuid = b0Var.f2932a;
        uuid.getClass();
        this.f2945a = uuid;
        this.f2946b = b0Var.f2933b;
        this.f2947c = b0Var.f2934c;
        this.d = b0Var.d;
        this.f2948f = b0Var.f2935f;
        this.e = b0Var.e;
        this.f2949g = b0Var.f2936g;
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
        if (this.f2945a.equals(c0Var.f2945a) && Objects.equals(this.f2946b, c0Var.f2946b) && Objects.equals(this.f2947c, c0Var.f2947c) && this.d == c0Var.d && this.f2948f == c0Var.f2948f && this.e == c0Var.e && this.f2949g.equals(c0Var.f2949g) && Arrays.equals(this.h, c0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2945a.hashCode() * 31;
        Uri uri = this.f2946b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f2947c.hashCode();
        int hashCode3 = this.f2949g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f2948f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
