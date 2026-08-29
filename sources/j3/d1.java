package j3;

import android.net.Uri;
public final class d1 implements g {
    public static final d1 f10413c = new d1(new androidx.biometric.e(20, false));
    public static final String d;
    public static final String f10414e;
    public static final String f10415f;
    public static final d0 h;
    public final Uri f10416a;
    public final String f10417b;

    static {
        int i10 = f5.d0.f6579a;
        d = Integer.toString(0, 36);
        f10414e = Integer.toString(1, 36);
        f10415f = Integer.toString(2, 36);
        h = new d0(6);
    }

    public d1(androidx.biometric.e eVar) {
        this.f10416a = (Uri) eVar.f1030b;
        this.f10417b = (String) eVar.f1031c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (f5.d0.a(this.f10416a, d1Var.f10416a) && f5.d0.a(this.f10417b, d1Var.f10417b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Uri uri = this.f10416a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.f10417b;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }
}
