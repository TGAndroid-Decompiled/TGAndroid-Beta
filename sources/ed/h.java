package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f8151a;
    public p f8152b;
    public String f8153c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f8151a;
        iVar.f8163g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f8151a.f8163g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f8151a;
        iVar.f8163g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f8151a;
        iVar.f8163g = this.d;
        iVar.c(i.f8155k);
        this.d = this.f8151a.f8163g;
    }

    public final s f(String str) {
        this.f8151a.getClass();
        return new s(str);
    }
}
