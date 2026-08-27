package h3;

import android.net.Uri;

public final class d1 implements g {

    public static final d1 f7806c = new d1(new a5.n(18, false));
    public static final String d;

    public static final String f7807e;

    public static final String f7808f;
    public static final f9.z h;

    public final Uri f7809a;

    public final String f7810b;

    static {
        int i10 = d5.g0.f4795a;
        d = Integer.toString(0, 36);
        f7807e = Integer.toString(1, 36);
        f7808f = Integer.toString(2, 36);
        h = new f9.z(23);
    }

    public d1(a5.n nVar) {
        this.f7809a = (Uri) nVar.f100b;
        this.f7810b = (String) nVar.f101c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return d5.g0.a(this.f7809a, d1Var.f7809a) && d5.g0.a(this.f7810b, d1Var.f7810b);
    }

    public final int hashCode() {
        Uri uri = this.f7809a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f7810b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
