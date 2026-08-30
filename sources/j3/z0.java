package j3;

import android.net.Uri;
public final class z0 implements g {
    public static final z0 f8896c = new z0(new androidx.biometric.e(19, false));
    public static final String d;
    public static final String e;
    public static final String f8897f;
    public static final q0 h;
    public final Uri f8898a;
    public final String f8899b;

    static {
        int i10 = h5.d0.f6937a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f8897f = Integer.toString(2, 36);
        h = new q0(6);
    }

    public z0(androidx.biometric.e eVar) {
        this.f8898a = (Uri) eVar.f478b;
        this.f8899b = (String) eVar.f479c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (h5.d0.a(this.f8898a, z0Var.f8898a) && h5.d0.a(this.f8899b, z0Var.f8899b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Uri uri = this.f8898a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f8899b;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }
}
