package gd;

import df.p;
import df.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f10997a;
    public p f10998b;
    public String f10999c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f10997a;
        iVar.f11009g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f10997a.f11009g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f10997a;
        iVar.f11009g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f10997a;
        iVar.f11009g = this.d;
        iVar.c(i.f11001k);
        this.d = this.f10997a.f11009g;
    }

    public final s f(String str) {
        this.f10997a.getClass();
        return new s(str);
    }
}
