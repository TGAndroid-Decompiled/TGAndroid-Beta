package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class l0 {
    public static final l0 d = new l0(new a8.h0(8, false));
    public static final String e;
    public static final String f3264f;
    public static final String f3265g;
    public final Uri f3266a;
    public final String f3267b;
    public final Bundle f3268c;

    static {
        String str = e2.n0.f9691a;
        e = Integer.toString(0, 36);
        f3264f = Integer.toString(1, 36);
        f3265g = Integer.toString(2, 36);
    }

    public l0(a8.h0 h0Var) {
        this.f3266a = (Uri) h0Var.f511b;
        this.f3267b = (String) h0Var.f512c;
        this.f3268c = (Bundle) h0Var.d;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (Objects.equals(this.f3266a, l0Var.f3266a) && Objects.equals(this.f3267b, l0Var.f3267b)) {
            if (this.f3268c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (l0Var.f3268c == null) {
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
        Uri uri = this.f3266a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f3267b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        if (this.f3268c != null) {
            i10 = 1;
        }
        return i12 + i10;
    }
}
