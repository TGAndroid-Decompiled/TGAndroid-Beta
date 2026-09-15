package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f8149a;
    public p f8150b;
    public String f8151c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f8149a;
        iVar.f8161g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f8149a.f8161g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f8149a;
        iVar.f8161g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f8149a;
        iVar.f8161g = this.d;
        iVar.c(i.f8153k);
        this.d = this.f8149a.f8161g;
    }

    public final s f(String str) {
        this.f8149a.getClass();
        return new s(str);
    }
}
