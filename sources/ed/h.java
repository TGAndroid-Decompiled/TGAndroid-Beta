package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;
public abstract class h {
    public i f10744a;
    public p f10745b;
    public String f10746c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10744a;
        iVar.f10757g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10744a.f10757g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10744a;
        iVar.f10757g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10744a;
        iVar.f10757g = this.d;
        iVar.c(i.f10748k);
        this.d = this.f10744a.f10757g;
    }

    public final s f(String str) {
        this.f10744a.getClass();
        return new s(str);
    }
}
