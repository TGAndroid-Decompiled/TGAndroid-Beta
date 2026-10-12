package gd;

import df.p;
import df.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f10087a;
    public p f10088b;
    public String f10089c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10087a;
        iVar.f10099g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10087a.f10099g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10087a;
        iVar.f10099g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10087a;
        iVar.f10099g = this.d;
        iVar.c(i.f10091k);
        this.d = this.f10087a.f10099g;
    }

    public final s f(String str) {
        this.f10087a.getClass();
        return new s(str);
    }
}
