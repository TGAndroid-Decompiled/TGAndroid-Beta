package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f8137a;
    public p f8138b;
    public String f8139c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f8137a;
        iVar.f8149g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f8137a.f8149g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f8137a;
        iVar.f8149g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f8137a;
        iVar.f8149g = this.d;
        iVar.c(i.f8141k);
        this.d = this.f8137a.f8149g;
    }

    public final s f(String str) {
        this.f8137a.getClass();
        return new s(str);
    }
}
