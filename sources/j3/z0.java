package j3;

import android.net.Uri;
public final class z0 implements g {
    public static final z0 f8878c = new z0(new af.d(19, false));
    public static final String d;
    public static final String e;
    public static final String f8879f;
    public static final q0 h;
    public final Uri f8880a;
    public final String f8881b;

    static {
        int i10 = h5.d0.f6924a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f8879f = Integer.toString(2, 36);
        h = new q0(6);
    }

    public z0(af.d dVar) {
        this.f8880a = (Uri) dVar.f159b;
        this.f8881b = (String) dVar.f160c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (h5.d0.a(this.f8880a, z0Var.f8880a) && h5.d0.a(this.f8881b, z0Var.f8881b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Uri uri = this.f8880a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f8881b;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }
}
