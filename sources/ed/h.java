package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f8154a;
    public p f8155b;
    public String f8156c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f8154a;
        iVar.f8166g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f8154a.f8166g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f8154a;
        iVar.f8166g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f8154a;
        iVar.f8166g = this.d;
        iVar.c(i.f8158k);
        this.d = this.f8154a.f8166g;
    }

    public final s f(String str) {
        this.f8154a.getClass();
        return new s(str);
    }
}
