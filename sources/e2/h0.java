package e2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class h0 {
    public static final h0 d = new h0(new android.support.v4.media.session.a0(20, false));
    public static final String f10274e;
    public static final String f10275f;
    public static final String f10276g;
    public final Uri f10277a;
    public final String f10278b;
    public final Bundle f10279c;

    static {
        String str = h2.m0.f14114a;
        f10274e = Integer.toString(0, 36);
        f10275f = Integer.toString(1, 36);
        f10276g = Integer.toString(2, 36);
    }

    public h0(android.support.v4.media.session.a0 a0Var) {
        this.f10277a = (Uri) a0Var.f1763b;
        this.f10278b = (String) a0Var.f1764c;
        this.f10279c = (Bundle) a0Var.d;
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
        if (Objects.equals(this.f10277a, h0Var.f10277a) && Objects.equals(this.f10278b, h0Var.f10278b)) {
            if (this.f10279c == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (h0Var.f10279c == null) {
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
        Uri uri = this.f10277a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.f10278b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        if (this.f10279c != null) {
            i7 = 1;
        }
        return i11 + i7;
    }
}
