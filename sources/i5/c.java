package i5;
public final class c {
    public final int f7263a;
    public String f7264b;

    public static c a(h5.w wVar) {
        String str;
        wVar.G(2);
        int u10 = wVar.u();
        int i10 = u10 >> 1;
        int u11 = ((wVar.u() >> 3) & 31) | ((u10 & 1) << 5);
        if (i10 != 4 && i10 != 5 && i10 != 7) {
            if (i10 == 8) {
                str = "hev1";
            } else if (i10 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i10);
        if (u11 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(u11);
        return new c(sb.toString(), 0);
    }

    public String toString() {
        switch (this.f7263a) {
            case 3:
                return "<" + this.f7264b + '>';
            default:
                return super.toString();
        }
    }

    public c(String str, int i10) {
        this.f7263a = i10;
        this.f7264b = str;
    }
}
