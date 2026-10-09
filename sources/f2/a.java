package f2;

import e2.v;
public final class a implements fb.n {
    public String f9558a;

    public a(String str) {
        this.f9558a = str;
    }

    public static a a(v vVar) {
        String str;
        String str2;
        vVar.K(2);
        int x10 = vVar.x();
        int i10 = x10 >> 1;
        int x11 = ((vVar.x() >> 3) & 31) | ((x10 & 1) << 5);
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
        StringBuilder v = a1.g.v(str);
        String str3 = ".";
        if (i10 >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        v.append(str2);
        v.append(i10);
        if (x11 < 10) {
            str3 = ".0";
        }
        v.append(str3);
        v.append(x11);
        return new a(v.toString());
    }

    @Override
    public Object v2() {
        throw new RuntimeException(this.f9558a);
    }
}
