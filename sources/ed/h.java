package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;
public abstract class h {
    public i f10927a;
    public p f10928b;
    public String f10929c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10927a;
        iVar.f10940g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10927a.f10940g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10927a;
        iVar.f10940g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10927a;
        iVar.f10940g = this.d;
        iVar.c(i.f10931k);
        this.d = this.f10927a.f10940g;
    }

    public final s f(String str) {
        this.f10927a.getClass();
        return new s(str);
    }
}
