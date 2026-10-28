package hd;

import ef.p;
import ef.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f12772a;
    public p f12773b;
    public String f12774c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f12772a;
        iVar.f12784g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f12772a.f12784g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f12772a;
        iVar.f12784g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f12772a;
        iVar.f12784g = this.d;
        iVar.c(i.f12776k);
        this.d = this.f12772a.f12784g;
    }

    public final s f(String str) {
        this.f12772a.getClass();
        return new s(str);
    }
}
