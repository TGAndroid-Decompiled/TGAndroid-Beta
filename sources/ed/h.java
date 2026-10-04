package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f8842a;
    public p f8843b;
    public String f8844c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f8842a;
        iVar.f8855g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f8842a.f8855g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f8842a;
        iVar.f8855g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f8842a;
        iVar.f8855g = this.d;
        iVar.c(i.f8846k);
        this.d = this.f8842a.f8855g;
    }

    public final s f(String str) {
        this.f8842a.getClass();
        return new s(str);
    }
}
