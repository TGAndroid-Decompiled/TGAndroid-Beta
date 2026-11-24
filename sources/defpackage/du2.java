package defpackage;
public final class du2 {
    public final byte a;
    public String b;

    public du2(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public static du2 a(yw7 yw7Var) {
        String str;
        String str2;
        yw7Var.O(2);
        int A = yw7Var.A();
        int i = A >> 1;
        int A2 = ((A & 1) << 5) | ((yw7Var.A() >> 3) & 31);
        if (i != 4 && i != 5 && i != 7 && i != 8) {
            if (i == 9) {
                str = "dvav";
            } else if (i == 10) {
                str = "dav1";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder(str);
        String str3 = ".";
        if (i >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        sb.append(str2);
        sb.append(i);
        if (A2 < 10) {
            str3 = ".0";
        }
        sb.append(str3);
        sb.append(A2);
        return new du2(sb.toString(), (byte) 1);
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }
}
