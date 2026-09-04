package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class g0 {
    public static final g0 d = new g0(new aa.a(4));
    public static final String f2042e;
    public static final String f2043f;
    public static final String f2044g;
    public final Uri f2045a;
    public final String f2046b;
    public final Bundle f2047c;

    static {
        String str = e2.d0.f8737a;
        f2042e = Integer.toString(0, 36);
        f2043f = Integer.toString(1, 36);
        f2044g = Integer.toString(2, 36);
    }

    public g0(aa.a aVar) {
        this.f2045a = (Uri) aVar.f372c;
        this.f2046b = (String) aVar.f371b;
        this.f2047c = (Bundle) aVar.d;
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
        if (Objects.equals(this.f2045a, g0Var.f2045a) && Objects.equals(this.f2046b, g0Var.f2046b)) {
            if (this.f2047c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.f2047c == null) {
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
        Uri uri = this.f2045a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f2046b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        if (this.f2047c != null) {
            i10 = 1;
        }
        return i12 + i10;
    }
}
