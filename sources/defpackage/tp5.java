package defpackage;

import java.util.regex.Pattern;
public abstract class tp5 {
    public el6 a;
    public ui6 b;
    public String c;
    public int d;

    public final String a(Pattern pattern) {
        el6 el6Var = this.a;
        el6Var.g = this.d;
        String c = el6Var.c(pattern);
        this.d = this.a.g;
        return c;
    }

    public ui6 b() {
        String a = a(sb0.e);
        if (a != null) {
            String m = ts2.m(1, 1, a);
            bm5 bm5Var = new bm5("mailto:".concat(m), null, (byte) 1);
            bm5Var.b(new vib(m));
            return bm5Var;
        }
        String a2 = a(sb0.f);
        if (a2 == null) {
            return null;
        }
        String m2 = ts2.m(1, 1, a2);
        bm5 bm5Var2 = new bm5(m2, null, (byte) 1);
        bm5Var2.b(new vib(m2));
        return bm5Var2;
    }

    public char c() {
        return '<';
    }

    public final void d() {
        el6 el6Var = this.a;
        el6Var.g = this.d;
        el6Var.c(el6.k);
        this.d = this.a.g;
    }

    public final vib e(String str) {
        this.a.getClass();
        return new vib(str);
    }
}
