package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class c0 {
    public static final String f2003i;
    public static final String f2004j;
    public static final String f2005k;
    public static final String f2006l;
    public static final String f2007m;
    public static final String f2008n;
    public static final String f2009o;
    public static final String f2010p;
    public final UUID f2011a;
    public final Uri f2012b;
    public final e9.k0 f2013c;
    public final boolean d;
    public final boolean f2014e;
    public final boolean f2015f;
    public final e9.i0 f2016g;
    public final byte[] h;

    static {
        String str = e2.d0.f8765a;
        f2003i = Integer.toString(0, 36);
        f2004j = Integer.toString(1, 36);
        f2005k = Integer.toString(2, 36);
        f2006l = Integer.toString(3, 36);
        f2007m = Integer.toString(4, 36);
        f2008n = Integer.toString(5, 36);
        f2009o = Integer.toString(6, 36);
        f2010p = Integer.toString(7, 36);
    }

    public c0(b0 b0Var) {
        boolean z10;
        byte[] bArr;
        if (b0Var.f2001f && b0Var.f1998b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        UUID uuid = b0Var.f1997a;
        uuid.getClass();
        this.f2011a = uuid;
        this.f2012b = b0Var.f1998b;
        this.f2013c = b0Var.f1999c;
        this.d = b0Var.d;
        this.f2015f = b0Var.f2001f;
        this.f2014e = b0Var.f2000e;
        this.f2016g = b0Var.f2002g;
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
        if (this.f2011a.equals(c0Var.f2011a) && Objects.equals(this.f2012b, c0Var.f2012b) && Objects.equals(this.f2013c, c0Var.f2013c) && this.d == c0Var.d && this.f2015f == c0Var.f2015f && this.f2014e == c0Var.f2014e && this.f2016g.equals(c0Var.f2016g) && Arrays.equals(this.h, c0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2011a.hashCode() * 31;
        Uri uri = this.f2012b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f2013c.hashCode();
        int hashCode3 = this.f2016g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f2015f ? 1 : 0)) * 31) + (this.f2014e ? 1 : 0)) * 31)) * 31);
    }
}
