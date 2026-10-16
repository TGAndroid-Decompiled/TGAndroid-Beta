package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class l0 {
    public static final l0 d = new l0(new androidx.biometric.e(3));
    public static final String e;
    public static final String f2201f;
    public static final String f2202g;
    public final Uri f2203a;
    public final String f2204b;
    public final Bundle f2205c;

    static {
        String str = e2.m0.f8375a;
        e = Integer.toString(0, 36);
        f2201f = Integer.toString(1, 36);
        f2202g = Integer.toString(2, 36);
    }

    public l0(androidx.biometric.e eVar) {
        this.f2203a = (Uri) eVar.f1200b;
        this.f2204b = (String) eVar.f1201c;
        this.f2205c = (Bundle) eVar.d;
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
        if (Objects.equals(this.f2203a, l0Var.f2203a) && Objects.equals(this.f2204b, l0Var.f2204b)) {
            if (this.f2205c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (l0Var.f2205c == null) {
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
        Uri uri = this.f2203a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f2204b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        if (this.f2205c != null) {
            i10 = 1;
        }
        return i12 + i10;
    }
}
