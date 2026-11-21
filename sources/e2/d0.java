package e2;

import a8.la;
import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class d0 {
    public static final String f10380i;
    public static final String f10381j;
    public static final String f10382k;
    public static final String f10383l;
    public static final String f10384m;
    public static final String f10385n;
    public static final String f10386o;
    public static final String f10387p;
    public final UUID f10388a;
    public final Uri f10389b;
    public final h9.l0 f10390c;
    public final boolean d;
    public final boolean f10391e;
    public final boolean f10392f;
    public final h9.i0 f10393g;
    public final byte[] h;

    static {
        String str = h2.l0.f13812a;
        f10380i = Integer.toString(0, 36);
        f10381j = Integer.toString(1, 36);
        f10382k = Integer.toString(2, 36);
        f10383l = Integer.toString(3, 36);
        f10384m = Integer.toString(4, 36);
        f10385n = Integer.toString(5, 36);
        f10386o = Integer.toString(6, 36);
        f10387p = Integer.toString(7, 36);
    }

    public d0(c0 c0Var) {
        boolean z10;
        byte[] bArr;
        if (c0Var.f10378f && c0Var.f10375b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.p(z10);
        UUID uuid = c0Var.f10374a;
        uuid.getClass();
        this.f10388a = uuid;
        this.f10389b = c0Var.f10375b;
        this.f10390c = c0Var.f10376c;
        this.d = c0Var.d;
        this.f10392f = c0Var.f10378f;
        this.f10391e = c0Var.f10377e;
        this.f10393g = c0Var.f10379g;
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
        if (this.f10388a.equals(d0Var.f10388a) && Objects.equals(this.f10389b, d0Var.f10389b) && Objects.equals(this.f10390c, d0Var.f10390c) && this.d == d0Var.d && this.f10392f == d0Var.f10392f && this.f10391e == d0Var.f10391e && this.f10393g.equals(d0Var.f10393g) && Arrays.equals(this.h, d0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10388a.hashCode() * 31;
        Uri uri = this.f10389b;
        if (uri != null) {
            i7 = uri.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f10390c.hashCode();
        int hashCode3 = this.f10393g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i7) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f10392f ? 1 : 0)) * 31) + (this.f10391e ? 1 : 0)) * 31)) * 31);
    }
}
