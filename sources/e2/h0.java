package e2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class h0 {
    public static final h0 d = new h0(new android.support.v4.media.session.a0(20, false));
    public static final String f10269e;
    public static final String f10270f;
    public static final String f10271g;
    public final Uri f10272a;
    public final String f10273b;
    public final Bundle f10274c;

    static {
        String str = h2.m0.f14112a;
        f10269e = Integer.toString(0, 36);
        f10270f = Integer.toString(1, 36);
        f10271g = Integer.toString(2, 36);
    }

    public h0(android.support.v4.media.session.a0 a0Var) {
        this.f10272a = (Uri) a0Var.f1763b;
        this.f10273b = (String) a0Var.f1764c;
        this.f10274c = (Bundle) a0Var.d;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (Objects.equals(this.f10272a, h0Var.f10272a) && Objects.equals(this.f10273b, h0Var.f10273b)) {
            if (this.f10274c == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (h0Var.f10274c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 == z10) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i7 = 0;
        Uri uri = this.f10272a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.f10273b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        if (this.f10274c != null) {
            i7 = 1;
        }
        return i11 + i7;
    }
}
