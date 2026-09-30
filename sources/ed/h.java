package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f8136a;
    public p f8137b;
    public String f8138c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f8136a;
        iVar.f8148g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f8136a.f8148g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f8136a;
        iVar.f8148g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f8136a;
        iVar.f8148g = this.d;
        iVar.c(i.f8140k);
        this.d = this.f8136a.f8148g;
    }

    public final s f(String str) {
        this.f8136a.getClass();
        return new s(str);
    }
}
