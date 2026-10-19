package gd;

import df.p;
import df.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f10996a;
    public p f10997b;
    public String f10998c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10996a;
        iVar.f11008g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10996a.f11008g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10996a;
        iVar.f11008g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10996a;
        iVar.f11008g = this.d;
        iVar.c(i.f11000k);
        this.d = this.f10996a.f11008g;
    }

    public final s f(String str) {
        this.f10996a.getClass();
        return new s(str);
    }
}
