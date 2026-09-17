package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f9069a;
    public p f9070b;
    public String f9071c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f9069a;
        iVar.f9082g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f9069a.f9082g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f9069a;
        iVar.f9082g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f9069a;
        iVar.f9082g = this.d;
        iVar.c(i.f9073k);
        this.d = this.f9069a.f9082g;
    }

    public final s f(String str) {
        this.f9069a.getClass();
        return new s(str);
    }
}
