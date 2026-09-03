package j3;

import android.net.Uri;
public class b1 implements g {
    public static final q0 B;
    public static final String f8411n;
    public static final String f8412r;
    public static final String f8413s;
    public static final String v;
    public static final String f8414w;
    public static final String f8415x;
    public static final String f8416y;
    public final Uri f8417a;
    public final String f8418b;
    public final String f8419c;
    public final int d;
    public final int e;
    public final String f8420f;
    public final String h;

    static {
        int i10 = h5.d0.f6924a;
        f8411n = Integer.toString(0, 36);
        f8412r = Integer.toString(1, 36);
        f8413s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        f8414w = Integer.toString(4, 36);
        f8415x = Integer.toString(5, 36);
        f8416y = Integer.toString(6, 36);
        B = new q0(7);
    }

    public b1(c9.a aVar) {
        this.f8417a = (Uri) aVar.d;
        this.f8418b = (String) aVar.f2166a;
        this.f8419c = (String) aVar.e;
        this.d = aVar.f2167b;
        this.e = aVar.f2168c;
        this.f8420f = (String) aVar.f2169f;
        this.h = (String) aVar.f2170g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (this.f8417a.equals(b1Var.f8417a) && h5.d0.a(this.f8418b, b1Var.f8418b) && h5.d0.a(this.f8419c, b1Var.f8419c) && this.d == b1Var.d && this.e == b1Var.e && h5.d0.a(this.f8420f, b1Var.f8420f) && h5.d0.a(this.h, b1Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f8417a.hashCode() * 31;
        int i10 = 0;
        String str = this.f8418b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f8419c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f8420f;
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
