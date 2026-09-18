package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f8153a;
    public p f8154b;
    public String f8155c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f8153a;
        iVar.f8165g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f8153a.f8165g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f8153a;
        iVar.f8165g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f8153a;
        iVar.f8165g = this.d;
        iVar.c(i.f8157k);
        this.d = this.f8153a.f8165g;
    }

    public final s f(String str) {
        this.f8153a.getClass();
        return new s(str);
    }
}
