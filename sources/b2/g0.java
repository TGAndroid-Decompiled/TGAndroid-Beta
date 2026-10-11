package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class g0 {
    public static final g0 d = new g0(new aa.a(4));
    public static final String f3315e;
    public static final String f3316f;
    public static final String f3317g;
    public final Uri f3318a;
    public final String f3319b;
    public final Bundle f3320c;

    static {
        String str = e2.d0.f8531a;
        f3315e = Integer.toString(0, 36);
        f3316f = Integer.toString(1, 36);
        f3317g = Integer.toString(2, 36);
    }

    public g0(aa.a aVar) {
        this.f3318a = (Uri) aVar.f385c;
        this.f3319b = (String) aVar.f384b;
        this.f3320c = (Bundle) aVar.d;
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
        if (Objects.equals(this.f3318a, g0Var.f3318a) && Objects.equals(this.f3319b, g0Var.f3319b)) {
            if (this.f3320c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.f3320c == null) {
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
        Uri uri = this.f3318a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f3319b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        if (this.f3320c != null) {
            i10 = 1;
        }
        return i12 + i10;
    }
}
