package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f8841a;
    public p f8842b;
    public String f8843c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f8841a;
        iVar.f8854g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f8841a.f8854g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f8841a;
        iVar.f8854g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f8841a;
        iVar.f8854g = this.d;
        iVar.c(i.f8845k);
        this.d = this.f8841a.f8854g;
    }

    public final s f(String str) {
        this.f8841a.getClass();
        return new s(str);
    }
}
