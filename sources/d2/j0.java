package d2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class j0 {
    public static final j0 d = new j0(new android.support.v4.media.session.a0(13, false));
    public static final String f8149e;
    public static final String f8150f;
    public static final String f8151g;
    public final Uri f8152a;
    public final String f8153b;
    public final Bundle f8154c;

    static {
        String str = g2.n0.f11873a;
        f8149e = Integer.toString(0, 36);
        f8150f = Integer.toString(1, 36);
        f8151g = Integer.toString(2, 36);
    }

    public j0(android.support.v4.media.session.a0 a0Var) {
        this.f8152a = (Uri) a0Var.f1186b;
        this.f8153b = (String) a0Var.f1187c;
        this.f8154c = (Bundle) a0Var.d;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (Objects.equals(this.f8152a, j0Var.f8152a) && Objects.equals(this.f8153b, j0Var.f8153b)) {
            if (this.f8154c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (j0Var.f8154c == null) {
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
        int i3 = 0;
        Uri uri = this.f8152a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.f8153b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        if (this.f8154c != null) {
            i3 = 1;
        }
        return i11 + i3;
    }
}
