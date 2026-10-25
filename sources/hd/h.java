package hd;

import ef.p;
import ef.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f12773a;
    public p f12774b;
    public String f12775c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f12773a;
        iVar.f12785g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f12773a.f12785g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f12773a;
        iVar.f12785g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f12773a;
        iVar.f12785g = this.d;
        iVar.c(i.f12777k);
        this.d = this.f12773a.f12785g;
    }

    public final s f(String str) {
        this.f12773a.getClass();
        return new s(str);
    }
}
