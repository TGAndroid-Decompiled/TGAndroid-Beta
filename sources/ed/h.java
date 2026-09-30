package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f8148a;
    public p f8149b;
    public String f8150c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f8148a;
        iVar.f8160g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f8148a.f8160g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f8148a;
        iVar.f8160g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f8148a;
        iVar.f8160g = this.d;
        iVar.c(i.f8152k);
        this.d = this.f8148a.f8160g;
    }

    public final s f(String str) {
        this.f8148a.getClass();
        return new s(str);
    }
}
