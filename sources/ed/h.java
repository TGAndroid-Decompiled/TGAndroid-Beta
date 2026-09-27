package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f8138a;
    public p f8139b;
    public String f8140c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f8138a;
        iVar.f8150g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f8138a.f8150g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f8138a;
        iVar.f8150g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f8138a;
        iVar.f8150g = this.d;
        iVar.c(i.f8142k);
        this.d = this.f8138a.f8150g;
    }

    public final s f(String str) {
        this.f8138a.getClass();
        return new s(str);
    }
}
