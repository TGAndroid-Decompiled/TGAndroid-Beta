package gd;

import df.p;
import df.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f10091a;
    public p f10092b;
    public String f10093c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10091a;
        iVar.f10103g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10091a.f10103g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10091a;
        iVar.f10103g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10091a;
        iVar.f10103g = this.d;
        iVar.c(i.f10095k);
        this.d = this.f10091a.f10103g;
    }

    public final s f(String str) {
        this.f10091a.getClass();
        return new s(str);
    }
}
