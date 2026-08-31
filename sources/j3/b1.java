package j3;

import android.net.Uri;
public class b1 implements g {
    public static final q0 B;
    public static final String f8987n;
    public static final String f8988r;
    public static final String f8989s;
    public static final String v;
    public static final String f8990w;
    public static final String f8991x;
    public static final String f8992y;
    public final Uri f8993a;
    public final String f8994b;
    public final String f8995c;
    public final int d;
    public final int f8996e;
    public final String f8997f;
    public final String h;

    static {
        int i10 = h5.d0.f7237a;
        f8987n = Integer.toString(0, 36);
        f8988r = Integer.toString(1, 36);
        f8989s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f8990w = Integer.toString(4, 36);
        f8991x = Integer.toString(5, 36);
        f8992y = Integer.toString(6, 36);
        B = new q0(7);
    }

    public b1(c9.a aVar) {
        this.f8993a = (Uri) aVar.d;
        this.f8994b = (String) aVar.f2330a;
        this.f8995c = (String) aVar.f2333e;
        this.d = aVar.f2331b;
        this.f8996e = aVar.f2332c;
        this.f8997f = (String) aVar.f2334f;
        this.h = (String) aVar.f2335g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (this.f8993a.equals(b1Var.f8993a) && h5.d0.a(this.f8994b, b1Var.f8994b) && h5.d0.a(this.f8995c, b1Var.f8995c) && this.d == b1Var.d && this.f8996e == b1Var.f8996e && h5.d0.a(this.f8997f, b1Var.f8997f) && h5.d0.a(this.h, b1Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f8993a.hashCode() * 31;
        int i10 = 0;
        String str = this.f8994b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f8995c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.f8996e) * 31;
        String str3 = this.f8997f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
