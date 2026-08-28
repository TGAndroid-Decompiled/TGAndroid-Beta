package e5;
public final class c {
    public final int f4876a;
    public String f4877b;

    public static c a(d5.y yVar) {
        String str;
        yVar.D(2);
        int r10 = yVar.r();
        int i9 = r10 >> 1;
        int r11 = ((yVar.r() >> 3) & 31) | ((r10 & 1) << 5);
        if (i9 != 4 && i9 != 5 && i9 != 7) {
            if (i9 == 8) {
                str = "hev1";
            } else if (i9 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(".0");
        sb2.append(i9);
        if (r11 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(r11);
        return new c(sb2.toString(), 0);
    }

    public String toString() {
        switch (this.f4876a) {
            case 2:
                return "<" + this.f4877b + '>';
            default:
                return super.toString();
        }
    }

    public c(String str, int i9) {
        this.f4876a = i9;
        this.f4877b = str;
    }
}
