package b2;

import android.net.Uri;
import j$.util.Objects;
public class j0 {
    public static final String h;
    public static final String f1731i;
    public static final String f1732j;
    public static final String f1733k;
    public static final String f1734l;
    public static final String f1735m;
    public static final String f1736n;
    public final Uri f1737a;
    public final String f1738b;
    public final String f1739c;
    public final int d;
    public final int e;
    public final String f1740f;
    public final String f1741g;

    static {
        String str = e2.d0.f7188a;
        h = Integer.toString(0, 36);
        f1731i = Integer.toString(1, 36);
        f1732j = Integer.toString(2, 36);
        f1733k = Integer.toString(3, 36);
        f1734l = Integer.toString(4, 36);
        f1735m = Integer.toString(5, 36);
        f1736n = Integer.toString(6, 36);
    }

    public j0(i0 i0Var) {
        this.f1737a = (Uri) i0Var.f1715c;
        this.f1738b = (String) i0Var.d;
        this.f1739c = (String) i0Var.e;
        this.d = i0Var.f1713a;
        this.e = i0Var.f1714b;
        this.f1740f = (String) i0Var.f1716f;
        this.f1741g = (String) i0Var.f1717g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f1737a.equals(j0Var.f1737a) && Objects.equals(this.f1738b, j0Var.f1738b) && Objects.equals(this.f1739c, j0Var.f1739c) && this.d == j0Var.d && this.e == j0Var.e && Objects.equals(this.f1740f, j0Var.f1740f) && Objects.equals(this.f1741g, j0Var.f1741g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f1737a.hashCode() * 31;
        int i10 = 0;
        String str = this.f1738b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f1739c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f1740f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f1741g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
