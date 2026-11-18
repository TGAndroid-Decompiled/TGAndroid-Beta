package e2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class h0 {
    public static final h0 d = new h0(new android.support.v4.media.session.a0(21, false));
    public static final String f10420e;
    public static final String f10421f;
    public static final String f10422g;
    public final Uri f10423a;
    public final String f10424b;
    public final Bundle f10425c;

    static {
        String str = h2.l0.f13783a;
        f10420e = Integer.toString(0, 36);
        f10421f = Integer.toString(1, 36);
        f10422g = Integer.toString(2, 36);
    }

    public h0(android.support.v4.media.session.a0 a0Var) {
        this.f10423a = (Uri) a0Var.f1705b;
        this.f10424b = (String) a0Var.f1706c;
        this.f10425c = (Bundle) a0Var.d;
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
        if (Objects.equals(this.f10423a, h0Var.f10423a) && Objects.equals(this.f10424b, h0Var.f10424b)) {
            if (this.f10425c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (h0Var.f10425c == null) {
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
        Uri uri = this.f10423a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.f10424b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        if (this.f10425c != null) {
            i7 = 1;
        }
        return i11 + i7;
    }
}
