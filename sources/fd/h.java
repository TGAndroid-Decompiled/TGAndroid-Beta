package fd;

import cf.p;
import cf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f9862a;
    public p f9863b;
    public String f9864c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f9862a;
        iVar.f9875g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f9862a.f9875g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f9862a;
        iVar.f9875g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f9862a;
        iVar.f9875g = this.d;
        iVar.c(i.f9866k);
        this.d = this.f9862a.f9875g;
    }

    public final s f(String str) {
        this.f9862a.getClass();
        return new s(str);
    }
}
