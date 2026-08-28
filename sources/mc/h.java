package mc;

import ie.p;
import ie.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f17619a;
    public p f17620b;
    public String f17621c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f17619a;
        iVar.f17632g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f17619a.f17632g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f17619a;
        iVar.f17632g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f17619a;
        iVar.f17632g = this.d;
        iVar.c(i.f17623k);
        this.d = this.f17619a.f17632g;
    }

    public final s f(String str) {
        this.f17619a.getClass();
        return new s(str);
    }
}
