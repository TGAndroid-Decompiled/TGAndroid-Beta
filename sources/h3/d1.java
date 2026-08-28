package h3;

import android.net.Uri;
import fh.y5;
public final class d1 implements g {
    public static final d1 f9375c = new d1(new a5.m(20, false));
    public static final String d;
    public static final String f9376e;
    public static final String f9377f;
    public static final y5 h;
    public final Uri f9378a;
    public final String f9379b;

    static {
        int i9 = d5.f0.f4349a;
        d = Integer.toString(0, 36);
        f9376e = Integer.toString(1, 36);
        f9377f = Integer.toString(2, 36);
        h = new y5(19);
    }

    public d1(a5.m mVar) {
        this.f9378a = (Uri) mVar.f98b;
        this.f9379b = (String) mVar.f99c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (d5.f0.a(this.f9378a, d1Var.f9378a) && d5.f0.a(this.f9379b, d1Var.f9379b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Uri uri = this.f9378a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.f9379b;
        if (str != null) {
            i9 = str.hashCode();
        }
        return i10 + i9;
    }
}
