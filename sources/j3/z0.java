package j3;

import android.net.Uri;
public final class z0 implements g {
    public static final z0 f9495c = new z0(new androidx.biometric.e(19, false));
    public static final String d;
    public static final String f9496e;
    public static final String f9497f;
    public static final q0 h;
    public final Uri f9498a;
    public final String f9499b;

    static {
        int i10 = h5.d0.f7237a;
        d = Integer.toString(0, 36);
        f9496e = Integer.toString(1, 36);
        f9497f = Integer.toString(2, 36);
        h = new q0(6);
    }

    public z0(androidx.biometric.e eVar) {
        this.f9498a = (Uri) eVar.f527b;
        this.f9499b = (String) eVar.f528c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (h5.d0.a(this.f9498a, z0Var.f9498a) && h5.d0.a(this.f9499b, z0Var.f9499b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Uri uri = this.f9498a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f9499b;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }
}
