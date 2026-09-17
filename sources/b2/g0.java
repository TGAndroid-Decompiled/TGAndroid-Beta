package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class g0 {
    public static final g0 d = new g0(new aa.a(4));
    public static final String f2069e;
    public static final String f2070f;
    public static final String f2071g;
    public final Uri f2072a;
    public final String f2073b;
    public final Bundle f2074c;

    static {
        String str = e2.d0.f8765a;
        f2069e = Integer.toString(0, 36);
        f2070f = Integer.toString(1, 36);
        f2071g = Integer.toString(2, 36);
    }

    public g0(aa.a aVar) {
        this.f2072a = (Uri) aVar.f384c;
        this.f2073b = (String) aVar.f383b;
        this.f2074c = (Bundle) aVar.d;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (Objects.equals(this.f2072a, g0Var.f2072a) && Objects.equals(this.f2073b, g0Var.f2073b)) {
            if (this.f2074c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.f2074c == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i10 = 0;
        Uri uri = this.f2072a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f2073b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        if (this.f2074c != null) {
            i10 = 1;
        }
        return i12 + i10;
    }
}
