package defpackage;
public final class gg7 {
    public final pg7 a;
    public final int b;
    public final int c;
    public final int d;
    public final pm3 e;

    public gg7(pm3 pm3Var, pg7 pg7Var, int i, int i2, int i3) {
        this.e = pm3Var;
        this.a = pg7Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        pg7 pg7Var = this.a;
        pg7 pg7Var2 = pg7.BYTE;
        int i = this.d;
        if (pg7Var == pg7Var2) {
            vh4 vh4Var = (vh4) this.e.c;
            int i2 = this.b;
            return ((String) vh4Var.b).substring(i2, i + i2).getBytes(((xs3) vh4Var.c).a[this.c].charset()).length;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        pg7 pg7Var = this.a;
        sb.append(pg7Var);
        sb.append('(');
        vh4 vh4Var = (vh4) this.e.c;
        if (pg7Var == pg7.ECI) {
            sb.append(((xs3) vh4Var.c).a[this.c].charset().displayName());
        } else {
            int i = this.d;
            int i2 = this.b;
            String substring = ((String) vh4Var.b).substring(i2, i + i2);
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
