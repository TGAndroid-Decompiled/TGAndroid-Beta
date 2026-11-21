package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;
public abstract class h {
    public i f10924a;
    public p f10925b;
    public String f10926c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10924a;
        iVar.f10937g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10924a.f10937g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10924a;
        iVar.f10937g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10924a;
        iVar.f10937g = this.d;
        iVar.c(i.f10928k);
        this.d = this.f10924a.f10937g;
    }

    public final s f(String str) {
        this.f10924a.getClass();
        return new s(str);
    }
}
