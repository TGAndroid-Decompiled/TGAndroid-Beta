package gd;

import df.p;
import df.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f10994a;
    public p f10995b;
    public String f10996c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10994a;
        iVar.f11006g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10994a.f11006g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10994a;
        iVar.f11006g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10994a;
        iVar.f11006g = this.d;
        iVar.c(i.f10998k);
        this.d = this.f10994a.f11006g;
    }

    public final s f(String str) {
        this.f10994a.getClass();
        return new s(str);
    }
}
