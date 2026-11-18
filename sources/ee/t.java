package ee;

import com.google.android.gms.internal.vision.e2;
import h2.x;
public final class t {
    public final int f10950a;
    public final String f10951b;

    public t(String str, int i7) {
        this.f10950a = i7;
        this.f10951b = str;
    }

    public static t a(x xVar) {
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
        return new t(m10.toString(), 1);
    }

    public String toString() {
        switch (this.f10950a) {
            case 0:
                return "<" + this.f10951b + '>';
            default:
                return super.toString();
        }
    }
}
