package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;
public abstract class h {
    public i f10749a;
    public p f10750b;
    public String f10751c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10749a;
        iVar.f10762g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10749a.f10762g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10749a;
        iVar.f10762g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10749a;
        iVar.f10762g = this.d;
        iVar.c(i.f10753k);
        this.d = this.f10749a.f10762g;
    }

    public final s f(String str) {
        this.f10749a.getClass();
        return new s(str);
    }
}
