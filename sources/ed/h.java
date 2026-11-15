package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;
public abstract class h {
    public i f10580a;
    public p f10581b;
    public String f10582c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10580a;
        iVar.f10593g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10580a.f10593g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10580a;
        iVar.f10593g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10580a;
        iVar.f10593g = this.d;
        iVar.c(i.f10584k);
        this.d = this.f10580a.f10593g;
    }

    public final s f(String str) {
        this.f10580a.getClass();
        return new s(str);
    }
}
