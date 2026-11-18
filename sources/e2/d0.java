package e2;

import a8.la;
import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class d0 {
    public static final String f10351i;
    public static final String f10352j;
    public static final String f10353k;
    public static final String f10354l;
    public static final String f10355m;
    public static final String f10356n;
    public static final String f10357o;
    public static final String f10358p;
    public final UUID f10359a;
    public final Uri f10360b;
    public final h9.l0 f10361c;
    public final boolean d;
    public final boolean f10362e;
    public final boolean f10363f;
    public final h9.i0 f10364g;
    public final byte[] h;

    static {
        String str = h2.l0.f13783a;
        f10351i = Integer.toString(0, 36);
        f10352j = Integer.toString(1, 36);
        f10353k = Integer.toString(2, 36);
        f10354l = Integer.toString(3, 36);
        f10355m = Integer.toString(4, 36);
        f10356n = Integer.toString(5, 36);
        f10357o = Integer.toString(6, 36);
        f10358p = Integer.toString(7, 36);
    }

    public d0(c0 c0Var) {
        boolean z10;
        byte[] bArr;
        if (c0Var.f10349f && c0Var.f10346b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.p(z10);
        UUID uuid = c0Var.f10345a;
        uuid.getClass();
        this.f10359a = uuid;
        this.f10360b = c0Var.f10346b;
        this.f10361c = c0Var.f10347c;
        this.d = c0Var.d;
        this.f10363f = c0Var.f10349f;
        this.f10362e = c0Var.f10348e;
        this.f10364g = c0Var.f10350g;
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
        if (this.f10359a.equals(d0Var.f10359a) && Objects.equals(this.f10360b, d0Var.f10360b) && Objects.equals(this.f10361c, d0Var.f10361c) && this.d == d0Var.d && this.f10363f == d0Var.f10363f && this.f10362e == d0Var.f10362e && this.f10364g.equals(d0Var.f10364g) && Arrays.equals(this.h, d0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10359a.hashCode() * 31;
        Uri uri = this.f10360b;
        if (uri != null) {
            i7 = uri.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f10361c.hashCode();
        int hashCode3 = this.f10364g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i7) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f10363f ? 1 : 0)) * 31) + (this.f10362e ? 1 : 0)) * 31)) * 31);
    }
}
