package bd;

import gf.p;
import gf.s;
import java.util.regex.Pattern;
public abstract class h {
    public j f3229a;
    public p f3230b;
    public String f3231c;
    public int d;

    public final String a(Pattern pattern) {
        j jVar = this.f3229a;
        jVar.f3245g = this.d;
        String c2 = jVar.c(pattern);
        this.d = this.f3229a.f3245g;
        return c2;
    }

    public abstract p b();

    public final char c() {
        j jVar = this.f3229a;
        jVar.f3245g = this.d;
        return jVar.d();
    }

    public abstract char d();

    public final void e() {
        j jVar = this.f3229a;
        jVar.f3245g = this.d;
        jVar.c(j.f3236k);
        this.d = this.f3229a.f3245g;
    }

    public final s f(String str) {
        this.f3229a.getClass();
        return new s(str);
    }
}
