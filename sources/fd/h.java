package fd;

import cf.p;
import cf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f9863a;
    public p f9864b;
    public String f9865c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f9863a;
        iVar.f9876g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f9863a.f9876g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f9863a;
        iVar.f9876g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f9863a;
        iVar.f9876g = this.d;
        iVar.c(i.f9867k);
        this.d = this.f9863a.f9876g;
    }

    public final s f(String str) {
        this.f9863a.getClass();
        return new s(str);
    }
}
