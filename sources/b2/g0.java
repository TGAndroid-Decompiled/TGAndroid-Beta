package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class g0 {
    public static final g0 d = new g0(new aa.a(4));
    public static final String e;
    public static final String f2998f;
    public static final String f2999g;
    public final Uri f3000a;
    public final String f3001b;
    public final Bundle f3002c;

    static {
        String str = e2.d0.f7885a;
        e = Integer.toString(0, 36);
        f2998f = Integer.toString(1, 36);
        f2999g = Integer.toString(2, 36);
    }

    public g0(aa.a aVar) {
        this.f3000a = (Uri) aVar.f360c;
        this.f3001b = (String) aVar.f359b;
        this.f3002c = (Bundle) aVar.d;
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
        if (Objects.equals(this.f3000a, g0Var.f3000a) && Objects.equals(this.f3001b, g0Var.f3001b)) {
            if (this.f3002c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.f3002c == null) {
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
        Uri uri = this.f3000a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f3001b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        if (this.f3002c != null) {
            i10 = 1;
        }
        return i12 + i10;
    }
}
