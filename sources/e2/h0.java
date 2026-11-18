package e2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class h0 {
    public static final h0 d = new h0(new android.support.v4.media.session.a0(21, false));
    public static final String f10423e;
    public static final String f10424f;
    public static final String f10425g;
    public final Uri f10426a;
    public final String f10427b;
    public final Bundle f10428c;

    static {
        String str = h2.l0.f13786a;
        f10423e = Integer.toString(0, 36);
        f10424f = Integer.toString(1, 36);
        f10425g = Integer.toString(2, 36);
    }

    public h0(android.support.v4.media.session.a0 a0Var) {
        this.f10426a = (Uri) a0Var.f1704b;
        this.f10427b = (String) a0Var.f1705c;
        this.f10428c = (Bundle) a0Var.d;
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
        if (Objects.equals(this.f10426a, h0Var.f10426a) && Objects.equals(this.f10427b, h0Var.f10427b)) {
            if (this.f10428c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (h0Var.f10428c == null) {
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
        Uri uri = this.f10426a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.f10427b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        if (this.f10428c != null) {
            i7 = 1;
        }
        return i11 + i7;
    }
}
