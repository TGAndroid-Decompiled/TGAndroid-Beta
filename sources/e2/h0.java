package e2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class h0 {
    public static final h0 d = new h0(new android.support.v4.media.session.a0(21, false));
    public static final String f10105e;
    public static final String f10106f;
    public static final String f10107g;
    public final Uri f10108a;
    public final String f10109b;
    public final Bundle f10110c;

    static {
        String str = h2.l0.f13471a;
        f10105e = Integer.toString(0, 36);
        f10106f = Integer.toString(1, 36);
        f10107g = Integer.toString(2, 36);
    }

    public h0(android.support.v4.media.session.a0 a0Var) {
        this.f10108a = (Uri) a0Var.f1713b;
        this.f10109b = (String) a0Var.f1714c;
        this.f10110c = (Bundle) a0Var.d;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (Objects.equals(this.f10108a, h0Var.f10108a) && Objects.equals(this.f10109b, h0Var.f10109b)) {
            if (this.f10110c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (h0Var.f10110c == null) {
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
        int i7 = 0;
        Uri uri = this.f10108a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.f10109b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        if (this.f10110c != null) {
            i7 = 1;
        }
        return i11 + i7;
    }
}
