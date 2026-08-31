package i5;
public final class c {
    public String f7812a;

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
        String sb2 = sb.toString();
        ?? obj = new Object();
        obj.f7812a = sb2;
        return obj;
    }
}
