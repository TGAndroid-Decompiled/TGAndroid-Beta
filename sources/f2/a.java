package f2;

import e2.x;
public final class a {
    public String f6727a;

    public a(String str) {
        this.f6727a = str;
    }

    public static a a(x xVar) {
        String str;
        String str2;
        xVar.O(2);
        int A = xVar.A();
        int i10 = A >> 1;
        int A2 = ((xVar.A() >> 3) & 31) | ((A & 1) << 5);
        if (i10 != 4 && i10 != 5 && i10 != 7 && i10 != 8) {
            if (i10 == 9) {
                str = "dvav";
            } else if (i10 == 10) {
                str = "dav1";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder t10 = a1.g.t(str);
        String str3 = ".";
        if (i10 >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        t10.append(str2);
        t10.append(i10);
        if (A2 < 10) {
            str3 = ".0";
        }
        t10.append(str3);
        t10.append(A2);
        return new a(t10.toString());
    }
}
