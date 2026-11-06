package e2;

import a8.ia;
import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class d0 {
    public static final String f10200i;
    public static final String f10201j;
    public static final String f10202k;
    public static final String f10203l;
    public static final String f10204m;
    public static final String f10205n;
    public static final String f10206o;
    public static final String f10207p;
    public final UUID f10208a;
    public final Uri f10209b;
    public final h9.l0 f10210c;
    public final boolean d;
    public final boolean f10211e;
    public final boolean f10212f;
    public final h9.i0 f10213g;
    public final byte[] h;

    static {
        String str = h2.m0.f14112a;
        f10200i = Integer.toString(0, 36);
        f10201j = Integer.toString(1, 36);
        f10202k = Integer.toString(2, 36);
        f10203l = Integer.toString(3, 36);
        f10204m = Integer.toString(4, 36);
        f10205n = Integer.toString(5, 36);
        f10206o = Integer.toString(6, 36);
        f10207p = Integer.toString(7, 36);
    }

    public d0(c0 c0Var) {
        boolean z9;
        byte[] bArr;
        if (c0Var.f10198f && c0Var.f10195b == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.p(z9);
        UUID uuid = c0Var.f10194a;
        uuid.getClass();
        this.f10208a = uuid;
        this.f10209b = c0Var.f10195b;
        this.f10210c = c0Var.f10196c;
        this.d = c0Var.d;
        this.f10212f = c0Var.f10198f;
        this.f10211e = c0Var.f10197e;
        this.f10213g = c0Var.f10199g;
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
        if (this.f10208a.equals(d0Var.f10208a) && Objects.equals(this.f10209b, d0Var.f10209b) && Objects.equals(this.f10210c, d0Var.f10210c) && this.d == d0Var.d && this.f10212f == d0Var.f10212f && this.f10211e == d0Var.f10211e && this.f10213g.equals(d0Var.f10213g) && Arrays.equals(this.h, d0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10208a.hashCode() * 31;
        Uri uri = this.f10209b;
        if (uri != null) {
            i7 = uri.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f10210c.hashCode();
        int hashCode3 = this.f10213g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i7) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f10212f ? 1 : 0)) * 31) + (this.f10211e ? 1 : 0)) * 31)) * 31);
    }
}
