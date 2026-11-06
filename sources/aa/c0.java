package aa;
public final class c0 {
    public String f787a;

    public static c0 a(h2.x xVar) {
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
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str);
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
        String sb2 = m10.toString();
        ?? obj = new Object();
        obj.f787a = sb2;
        return obj;
    }
}
