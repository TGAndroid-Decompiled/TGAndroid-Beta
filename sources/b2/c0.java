package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class c0 {
    public static final String f2940i;
    public static final String f2941j;
    public static final String f2942k;
    public static final String f2943l;
    public static final String f2944m;
    public static final String f2945n;
    public static final String f2946o;
    public static final String f2947p;
    public final UUID f2948a;
    public final Uri f2949b;
    public final e9.k0 f2950c;
    public final boolean d;
    public final boolean e;
    public final boolean f2951f;
    public final e9.i0 f2952g;
    public final byte[] h;

    static {
        String str = e2.d0.f7885a;
        f2940i = Integer.toString(0, 36);
        f2941j = Integer.toString(1, 36);
        f2942k = Integer.toString(2, 36);
        f2943l = Integer.toString(3, 36);
        f2944m = Integer.toString(4, 36);
        f2945n = Integer.toString(5, 36);
        f2946o = Integer.toString(6, 36);
        f2947p = Integer.toString(7, 36);
    }

    public c0(b0 b0Var) {
        boolean z10;
        byte[] bArr;
        if (b0Var.f2938f && b0Var.f2936b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        UUID uuid = b0Var.f2935a;
        uuid.getClass();
        this.f2948a = uuid;
        this.f2949b = b0Var.f2936b;
        this.f2950c = b0Var.f2937c;
        this.d = b0Var.d;
        this.f2951f = b0Var.f2938f;
        this.e = b0Var.e;
        this.f2952g = b0Var.f2939g;
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
        if (this.f2948a.equals(c0Var.f2948a) && Objects.equals(this.f2949b, c0Var.f2949b) && Objects.equals(this.f2950c, c0Var.f2950c) && this.d == c0Var.d && this.f2951f == c0Var.f2951f && this.e == c0Var.e && this.f2952g.equals(c0Var.f2952g) && Arrays.equals(this.h, c0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2948a.hashCode() * 31;
        Uri uri = this.f2949b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f2950c.hashCode();
        int hashCode3 = this.f2952g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f2951f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
