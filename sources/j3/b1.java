package j3;

import android.net.Uri;
public class b1 implements g {
    public static final q0 B;
    public static final String f8429n;
    public static final String f8430r;
    public static final String f8431s;
    public static final String v;
    public static final String f8432w;
    public static final String f8433x;
    public static final String f8434y;
    public final Uri f8435a;
    public final String f8436b;
    public final String f8437c;
    public final int d;
    public final int e;
    public final String f8438f;
    public final String h;

    static {
        int i10 = h5.d0.f6937a;
        f8429n = Integer.toString(0, 36);
        f8430r = Integer.toString(1, 36);
        f8431s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f8432w = Integer.toString(4, 36);
        f8433x = Integer.toString(5, 36);
        f8434y = Integer.toString(6, 36);
        B = new q0(7);
    }

    public b1(c9.a aVar) {
        this.f8435a = (Uri) aVar.d;
        this.f8436b = (String) aVar.f2143a;
        this.f8437c = (String) aVar.e;
        this.d = aVar.f2144b;
        this.e = aVar.f2145c;
        this.f8438f = (String) aVar.f2146f;
        this.h = (String) aVar.f2147g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (this.f8435a.equals(b1Var.f8435a) && h5.d0.a(this.f8436b, b1Var.f8436b) && h5.d0.a(this.f8437c, b1Var.f8437c) && this.d == b1Var.d && this.e == b1Var.e && h5.d0.a(this.f8438f, b1Var.f8438f) && h5.d0.a(this.h, b1Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f8435a.hashCode() * 31;
        int i10 = 0;
        String str = this.f8436b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f8437c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f8438f;
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
