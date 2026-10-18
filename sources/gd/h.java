package gd;

import df.p;
import df.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f10995a;
    public p f10996b;
    public String f10997c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10995a;
        iVar.f11007g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10995a.f11007g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10995a;
        iVar.f11007g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10995a;
        iVar.f11007g = this.d;
        iVar.c(i.f10999k);
        this.d = this.f10995a.f11007g;
    }

    public final s f(String str) {
        this.f10995a.getClass();
        return new s(str);
    }
}
