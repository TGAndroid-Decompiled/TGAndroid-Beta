package oc;

import java.util.regex.Pattern;
import le.p;
import le.s;
public abstract class h {
    public j f19479a;
    public p f19480b;
    public String f19481c;
    public int d;

    public final String a(Pattern pattern) {
        j jVar = this.f19479a;
        jVar.f19495g = this.d;
        String c3 = jVar.c(pattern);
        this.d = this.f19479a.f19495g;
        return c3;
    }

    public abstract p b();

    public final char c() {
        j jVar = this.f19479a;
        jVar.f19495g = this.d;
        return jVar.d();
    }

    public abstract char d();

    public final void e() {
        j jVar = this.f19479a;
        jVar.f19495g = this.d;
        jVar.c(j.f19486k);
        this.d = this.f19479a.f19495g;
    }

    public final s f(String str) {
        this.f19479a.getClass();
        return new s(str);
    }
}
