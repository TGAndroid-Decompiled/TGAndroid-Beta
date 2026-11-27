package defpackage;

import java.util.regex.Pattern;
public abstract class wp5 {
    public gl6 a;
    public yi6 b;
    public String c;
    public int d;

    public final String a(Pattern pattern) {
        gl6 gl6Var = this.a;
        gl6Var.g = this.d;
        String c = gl6Var.c(pattern);
        this.d = this.a.g;
        return c;
    }

    public yi6 b() {
        String a = a(ua0.e);
        if (a != null) {
            String n = bs2.n(1, 1, a);
            em5 em5Var = new em5("mailto:".concat(n), null, (byte) 1);
            em5Var.b(new qkb(n));
            return em5Var;
        }
        String a2 = a(ua0.f);
        if (a2 == null) {
            return null;
        }
        String n2 = bs2.n(1, 1, a2);
        em5 em5Var2 = new em5(n2, null, (byte) 1);
        em5Var2.b(new qkb(n2));
        return em5Var2;
    }

    public char c() {
        return '<';
    }

    public final void d() {
        gl6 gl6Var = this.a;
        gl6Var.g = this.d;
        gl6Var.c(gl6.k);
        this.d = this.a.g;
    }

    public final qkb e(String str) {
        this.a.getClass();
        return new qkb(str);
    }
}
