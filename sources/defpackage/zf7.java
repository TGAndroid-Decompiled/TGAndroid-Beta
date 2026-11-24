package defpackage;
public final class zf7 {
    public final ig7 a;
    public final int b;
    public final int c;
    public final int d;
    public final in3 e;

    public zf7(in3 in3Var, ig7 ig7Var, int i, int i2, int i3) {
        this.e = in3Var;
        this.a = ig7Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        ig7 ig7Var = this.a;
        ig7 ig7Var2 = ig7.BYTE;
        int i = this.d;
        if (ig7Var == ig7Var2) {
            yh4 yh4Var = (yh4) this.e.c;
            int i2 = this.b;
            return ((String) yh4Var.b).substring(i2, i + i2).getBytes(((pt3) yh4Var.c).a[this.c].charset()).length;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ig7 ig7Var = this.a;
        sb.append(ig7Var);
        sb.append('(');
        yh4 yh4Var = (yh4) this.e.c;
        if (ig7Var == ig7.ECI) {
            sb.append(((pt3) yh4Var.c).a[this.c].charset().displayName());
        } else {
            int i = this.d;
            int i2 = this.b;
            String substring = ((String) yh4Var.b).substring(i2, i + i2);
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < substring.length(); i3++) {
                if (substring.charAt(i3) >= ' ' && substring.charAt(i3) <= '~') {
                    sb2.append(substring.charAt(i3));
                } else {
                    sb2.append('.');
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
