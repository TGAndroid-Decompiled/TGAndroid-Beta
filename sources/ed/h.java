package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;
public abstract class h {
    public i f10890a;
    public p f10891b;
    public String f10892c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10890a;
        iVar.f10903g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10890a.f10903g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10890a;
        iVar.f10903g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10890a;
        iVar.f10903g = this.d;
        iVar.c(i.f10894k);
        this.d = this.f10890a.f10903g;
    }

    public final s f(String str) {
        this.f10890a.getClass();
        return new s(str);
    }
}
