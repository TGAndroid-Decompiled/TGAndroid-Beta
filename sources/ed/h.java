package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;
public abstract class h {
    public i f10888a;
    public p f10889b;
    public String f10890c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10888a;
        iVar.f10901g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10888a.f10901g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10888a;
        iVar.f10901g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10888a;
        iVar.f10901g = this.d;
        iVar.c(i.f10892k);
        this.d = this.f10888a.f10901g;
    }

    public final s f(String str) {
        this.f10888a.getClass();
        return new s(str);
    }
}
