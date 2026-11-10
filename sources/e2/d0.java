package e2;

import a8.ia;
import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class d0 {
    public static final String f10205i;
    public static final String f10206j;
    public static final String f10207k;
    public static final String f10208l;
    public static final String f10209m;
    public static final String f10210n;
    public static final String f10211o;
    public static final String f10212p;
    public final UUID f10213a;
    public final Uri f10214b;
    public final h9.l0 f10215c;
    public final boolean d;
    public final boolean f10216e;
    public final boolean f10217f;
    public final h9.i0 f10218g;
    public final byte[] h;

    static {
        String str = h2.m0.f14114a;
        f10205i = Integer.toString(0, 36);
        f10206j = Integer.toString(1, 36);
        f10207k = Integer.toString(2, 36);
        f10208l = Integer.toString(3, 36);
        f10209m = Integer.toString(4, 36);
        f10210n = Integer.toString(5, 36);
        f10211o = Integer.toString(6, 36);
        f10212p = Integer.toString(7, 36);
    }

    public d0(c0 c0Var) {
        boolean z9;
        byte[] bArr;
        if (c0Var.f10203f && c0Var.f10200b == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.p(z9);
        UUID uuid = c0Var.f10199a;
        uuid.getClass();
        this.f10213a = uuid;
        this.f10214b = c0Var.f10200b;
        this.f10215c = c0Var.f10201c;
        this.d = c0Var.d;
        this.f10217f = c0Var.f10203f;
        this.f10216e = c0Var.f10202e;
        this.f10218g = c0Var.f10204g;
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
        if (this.f10213a.equals(d0Var.f10213a) && Objects.equals(this.f10214b, d0Var.f10214b) && Objects.equals(this.f10215c, d0Var.f10215c) && this.d == d0Var.d && this.f10217f == d0Var.f10217f && this.f10216e == d0Var.f10216e && this.f10218g.equals(d0Var.f10218g) && Arrays.equals(this.h, d0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10213a.hashCode() * 31;
        Uri uri = this.f10214b;
        if (uri != null) {
            i7 = uri.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f10215c.hashCode();
        int hashCode3 = this.f10218g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i7) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f10217f ? 1 : 0)) * 31) + (this.f10216e ? 1 : 0)) * 31)) * 31);
    }
}
