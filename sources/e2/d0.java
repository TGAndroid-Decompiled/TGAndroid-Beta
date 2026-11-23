package e2;

import a8.ma;
import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class d0 {
    public static final String f10344i;
    public static final String f10345j;
    public static final String f10346k;
    public static final String f10347l;
    public static final String f10348m;
    public static final String f10349n;
    public static final String f10350o;
    public static final String f10351p;
    public final UUID f10352a;
    public final Uri f10353b;
    public final h9.l0 f10354c;
    public final boolean d;
    public final boolean f10355e;
    public final boolean f10356f;
    public final h9.i0 f10357g;
    public final byte[] h;

    static {
        String str = h2.l0.f13778a;
        f10344i = Integer.toString(0, 36);
        f10345j = Integer.toString(1, 36);
        f10346k = Integer.toString(2, 36);
        f10347l = Integer.toString(3, 36);
        f10348m = Integer.toString(4, 36);
        f10349n = Integer.toString(5, 36);
        f10350o = Integer.toString(6, 36);
        f10351p = Integer.toString(7, 36);
    }

    public d0(c0 c0Var) {
        boolean z10;
        byte[] bArr;
        if (c0Var.f10342f && c0Var.f10339b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ma.p(z10);
        UUID uuid = c0Var.f10338a;
        uuid.getClass();
        this.f10352a = uuid;
        this.f10353b = c0Var.f10339b;
        this.f10354c = c0Var.f10340c;
        this.d = c0Var.d;
        this.f10356f = c0Var.f10342f;
        this.f10355e = c0Var.f10341e;
        this.f10357g = c0Var.f10343g;
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
        if (this.f10352a.equals(d0Var.f10352a) && Objects.equals(this.f10353b, d0Var.f10353b) && Objects.equals(this.f10354c, d0Var.f10354c) && this.d == d0Var.d && this.f10356f == d0Var.f10356f && this.f10355e == d0Var.f10355e && this.f10357g.equals(d0Var.f10357g) && Arrays.equals(this.h, d0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10352a.hashCode() * 31;
        Uri uri = this.f10353b;
        if (uri != null) {
            i7 = uri.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f10354c.hashCode();
        int hashCode3 = this.f10357g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i7) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f10356f ? 1 : 0)) * 31) + (this.f10355e ? 1 : 0)) * 31)) * 31);
    }
}
