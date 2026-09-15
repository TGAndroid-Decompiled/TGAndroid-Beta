package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class c0 {
    public static final String f2938i;
    public static final String f2939j;
    public static final String f2940k;
    public static final String f2941l;
    public static final String f2942m;
    public static final String f2943n;
    public static final String f2944o;
    public static final String f2945p;
    public final UUID f2946a;
    public final Uri f2947b;
    public final e9.k0 f2948c;
    public final boolean d;
    public final boolean e;
    public final boolean f2949f;
    public final e9.i0 f2950g;
    public final byte[] h;

    static {
        String str = e2.d0.f7883a;
        f2938i = Integer.toString(0, 36);
        f2939j = Integer.toString(1, 36);
        f2940k = Integer.toString(2, 36);
        f2941l = Integer.toString(3, 36);
        f2942m = Integer.toString(4, 36);
        f2943n = Integer.toString(5, 36);
        f2944o = Integer.toString(6, 36);
        f2945p = Integer.toString(7, 36);
    }

    public c0(b0 b0Var) {
        boolean z10;
        byte[] bArr;
        if (b0Var.f2936f && b0Var.f2934b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        UUID uuid = b0Var.f2933a;
        uuid.getClass();
        this.f2946a = uuid;
        this.f2947b = b0Var.f2934b;
        this.f2948c = b0Var.f2935c;
        this.d = b0Var.d;
        this.f2949f = b0Var.f2936f;
        this.e = b0Var.e;
        this.f2950g = b0Var.f2937g;
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
        if (this.f2946a.equals(c0Var.f2946a) && Objects.equals(this.f2947b, c0Var.f2947b) && Objects.equals(this.f2948c, c0Var.f2948c) && this.d == c0Var.d && this.f2949f == c0Var.f2949f && this.e == c0Var.e && this.f2950g.equals(c0Var.f2950g) && Arrays.equals(this.h, c0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2946a.hashCode() * 31;
        Uri uri = this.f2947b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f2948c.hashCode();
        int hashCode3 = this.f2950g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f2949f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
