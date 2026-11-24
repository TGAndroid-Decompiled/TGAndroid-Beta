package defpackage;

import java.util.regex.Pattern;
public final class yd0 extends tn5 {
    public static final Pattern e = bj6.m;

    @Override
    public final tg6 b() {
        int i = this.d + 1;
        this.d = i;
        bj6 bj6Var = this.a;
        bj6Var.g = i;
        if (bj6Var.d() == '\n') {
            u14 u14Var = new u14((byte) 1);
            this.d++;
            return u14Var;
        }
        if (this.d < this.c.length()) {
            String str = this.c;
            int i2 = this.d;
            if (e.matcher(str.substring(i2, i2 + 1)).matches()) {
                String str2 = this.c;
                int i3 = this.d;
                this.a.getClass();
                ugb ugbVar = new ugb(str2.substring(i3, i3 + 1));
                this.d++;
                return ugbVar;
            }
        }
        return e("\\");
    }

    @Override
    public final char c() {
        return '\\';
    }
}
