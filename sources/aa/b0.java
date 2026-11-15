package aa;

import com.google.android.gms.internal.vision.e2;
public final class b0 {
    public final int f782a;
    public String f783b;

    public static b0 a(h2.x xVar) {
        String str;
        String str2;
        xVar.O(2);
        int A = xVar.A();
        int i7 = A >> 1;
        int A2 = ((xVar.A() >> 3) & 31) | ((A & 1) << 5);
        if (i7 != 4 && i7 != 5 && i7 != 7 && i7 != 8) {
            if (i7 == 9) {
                str = "dvav";
            } else if (i7 == 10) {
                str = "dav1";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder m10 = e2.m(str);
        String str3 = ".";
        if (i7 >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        m10.append(str2);
        m10.append(i7);
        if (A2 < 10) {
            str3 = ".0";
        }
        m10.append(str3);
        m10.append(A2);
        return new b0(m10.toString(), 2);
    }

    public String toString() {
        switch (this.f782a) {
            case 1:
                return "<" + this.f783b + '>';
            default:
                return super.toString();
        }
    }

    public b0(String str, int i7) {
        this.f782a = i7;
        this.f783b = str;
    }
}
