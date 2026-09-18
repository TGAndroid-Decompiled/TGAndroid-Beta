package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class g0 {
    public static final g0 d = new g0(new aa.a(4));
    public static final String e;
    public static final String f3001f;
    public static final String f3002g;
    public final Uri f3003a;
    public final String f3004b;
    public final Bundle f3005c;

    static {
        String str = e2.d0.f7887a;
        e = Integer.toString(0, 36);
        f3001f = Integer.toString(1, 36);
        f3002g = Integer.toString(2, 36);
    }

    public g0(aa.a aVar) {
        this.f3003a = (Uri) aVar.f360c;
        this.f3004b = (String) aVar.f359b;
        this.f3005c = (Bundle) aVar.d;
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
        if (Objects.equals(this.f3003a, g0Var.f3003a) && Objects.equals(this.f3004b, g0Var.f3004b)) {
            if (this.f3005c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.f3005c == null) {
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
        Uri uri = this.f3003a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f3004b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        if (this.f3005c != null) {
            i10 = 1;
        }
        return i12 + i10;
    }
}
