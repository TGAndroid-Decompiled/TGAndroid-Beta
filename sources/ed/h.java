package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f7454a;
    public p f7455b;
    public String f7456c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f7454a;
        iVar.f7466g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f7454a.f7466g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f7454a;
        iVar.f7466g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f7454a;
        iVar.f7466g = this.d;
        iVar.c(i.f7458k);
        this.d = this.f7454a.f7466g;
    }

    public final s f(String str) {
        this.f7454a.getClass();
        return new s(str);
    }
}
