package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class g0 {
    public static final g0 d = new g0(new aa.a(4));
    public static final String f3313e;
    public static final String f3314f;
    public static final String f3315g;
    public final Uri f3316a;
    public final String f3317b;
    public final Bundle f3318c;

    static {
        String str = e2.d0.f8529a;
        f3313e = Integer.toString(0, 36);
        f3314f = Integer.toString(1, 36);
        f3315g = Integer.toString(2, 36);
    }

    public g0(aa.a aVar) {
        this.f3316a = (Uri) aVar.f387c;
        this.f3317b = (String) aVar.f386b;
        this.f3318c = (Bundle) aVar.d;
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
        if (Objects.equals(this.f3316a, g0Var.f3316a) && Objects.equals(this.f3317b, g0Var.f3317b)) {
            if (this.f3318c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.f3318c == null) {
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
        Uri uri = this.f3316a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f3317b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        if (this.f3318c != null) {
            i10 = 1;
        }
        return i12 + i10;
    }
}
