package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class k0 {
    public static final k0 d = new k0(new androidx.biometric.e(3));
    public static final String e;
    public static final String f3810f;
    public static final String f3811g;
    public final Uri f3812a;
    public final String f3813b;
    public final Bundle f3814c;

    static {
        String str = e2.m0.f8255a;
        e = Integer.toString(0, 36);
        f3810f = Integer.toString(1, 36);
        f3811g = Integer.toString(2, 36);
    }

    public k0(androidx.biometric.e eVar) {
        this.f3812a = (Uri) eVar.f2819b;
        this.f3813b = (String) eVar.f2820c;
        this.f3814c = (Bundle) eVar.d;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (Objects.equals(this.f3812a, k0Var.f3812a) && Objects.equals(this.f3813b, k0Var.f3813b)) {
            if (this.f3814c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (k0Var.f3814c == null) {
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
        Uri uri = this.f3812a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f3813b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        if (this.f3814c != null) {
            i10 = 1;
        }
        return i12 + i10;
    }
}
