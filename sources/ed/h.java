package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;
public abstract class h {
    public i f10898a;
    public p f10899b;
    public String f10900c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10898a;
        iVar.f10911g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10898a.f10911g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10898a;
        iVar.f10911g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10898a;
        iVar.f10911g = this.d;
        iVar.c(i.f10902k);
        this.d = this.f10898a.f10911g;
    }

    public final s f(String str) {
        this.f10898a.getClass();
        return new s(str);
    }
}
