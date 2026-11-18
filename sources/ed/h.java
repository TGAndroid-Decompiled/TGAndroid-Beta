package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;
public abstract class h {
    public i f10895a;
    public p f10896b;
    public String f10897c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10895a;
        iVar.f10908g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10895a.f10908g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10895a;
        iVar.f10908g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10895a;
        iVar.f10908g = this.d;
        iVar.c(i.f10899k);
        this.d = this.f10895a.f10908g;
    }

    public final s f(String str) {
        this.f10895a.getClass();
        return new s(str);
    }
}
