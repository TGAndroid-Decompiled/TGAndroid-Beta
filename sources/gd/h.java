package gd;

import df.p;
import df.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f11013a;
    public p f11014b;
    public String f11015c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f11013a;
        iVar.f11025g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f11013a.f11025g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f11013a;
        iVar.f11025g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f11013a;
        iVar.f11025g = this.d;
        iVar.c(i.f11017k);
        this.d = this.f11013a.f11025g;
    }

    public final s f(String str) {
        this.f11013a.getClass();
        return new s(str);
    }
}
