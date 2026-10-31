package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class l0 {
    public static final l0 d = new l0(new android.support.v4.media.session.a0(4));
    public static final String e;
    public static final String f2098f;
    public static final String f2099g;
    public final Uri f2100a;
    public final String f2101b;
    public final Bundle f2102c;

    static {
        String str = e2.l0.f6165a;
        e = Integer.toString(0, 36);
        f2098f = Integer.toString(1, 36);
        f2099g = Integer.toString(2, 36);
    }

    public l0(android.support.v4.media.session.a0 a0Var) {
        this.f2100a = (Uri) a0Var.f875b;
        this.f2101b = (String) a0Var.f876c;
        this.f2102c = (Bundle) a0Var.d;
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
        if (Objects.equals(this.f2100a, l0Var.f2100a) && Objects.equals(this.f2101b, l0Var.f2101b)) {
            if (this.f2102c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (l0Var.f2102c == null) {
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
        Uri uri = this.f2100a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f2101b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        if (this.f2102c != null) {
            i10 = 1;
        }
        return i12 + i10;
    }
}
