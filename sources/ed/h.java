package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f9041a;
    public p f9042b;
    public String f9043c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f9041a;
        iVar.f9054g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f9041a.f9054g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f9041a;
        iVar.f9054g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f9041a;
        iVar.f9054g = this.d;
        iVar.c(i.f9045k);
        this.d = this.f9041a.f9054g;
    }

    public final s f(String str) {
        this.f9041a.getClass();
        return new s(str);
    }
}
