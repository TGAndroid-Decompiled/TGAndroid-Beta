package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class c0 {
    public static final String f1636i;
    public static final String f1637j;
    public static final String f1638k;
    public static final String f1639l;
    public static final String f1640m;
    public static final String f1641n;
    public static final String f1642o;
    public static final String f1643p;
    public final UUID f1644a;
    public final Uri f1645b;
    public final e9.k0 f1646c;
    public final boolean d;
    public final boolean e;
    public final boolean f1647f;
    public final e9.i0 f1648g;
    public final byte[] h;

    static {
        String str = e2.d0.f7188a;
        f1636i = Integer.toString(0, 36);
        f1637j = Integer.toString(1, 36);
        f1638k = Integer.toString(2, 36);
        f1639l = Integer.toString(3, 36);
        f1640m = Integer.toString(4, 36);
        f1641n = Integer.toString(5, 36);
        f1642o = Integer.toString(6, 36);
        f1643p = Integer.toString(7, 36);
    }

    public c0(b0 b0Var) {
        boolean z10;
        byte[] bArr;
        if (b0Var.f1634f && b0Var.f1632b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        UUID uuid = b0Var.f1631a;
        uuid.getClass();
        this.f1644a = uuid;
        this.f1645b = b0Var.f1632b;
        this.f1646c = b0Var.f1633c;
        this.d = b0Var.d;
        this.f1647f = b0Var.f1634f;
        this.e = b0Var.e;
        this.f1648g = b0Var.f1635g;
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
        if (this.f1644a.equals(c0Var.f1644a) && Objects.equals(this.f1645b, c0Var.f1645b) && Objects.equals(this.f1646c, c0Var.f1646c) && this.d == c0Var.d && this.f1647f == c0Var.f1647f && this.e == c0Var.e && this.f1648g.equals(c0Var.f1648g) && Arrays.equals(this.h, c0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f1644a.hashCode() * 31;
        Uri uri = this.f1645b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f1646c.hashCode();
        int hashCode3 = this.f1648g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f1647f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
