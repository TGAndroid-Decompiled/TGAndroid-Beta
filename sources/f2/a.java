package f2;

import e2.x;
public final class a implements hb.n {
    public final String f10055a;

    public a(String str) {
        this.f10055a = str;
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
        StringBuilder u10 = a1.g.u(str);
        String str3 = ".";
        if (i10 >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        u10.append(str2);
        u10.append(i10);
        if (A2 < 10) {
            str3 = ".0";
        }
        u10.append(str3);
        u10.append(A2);
        return new a(u10.toString());
    }

    @Override
    public Object U1() {
        throw new RuntimeException(this.f10055a);
    }
}
