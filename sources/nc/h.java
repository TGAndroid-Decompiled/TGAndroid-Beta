package nc;

import java.util.regex.Pattern;
import je.p;
import je.s;

public abstract class h {

    public i f18455a;

    public p f18456b;

    public String f18457c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f18455a;
        iVar.f18468g = this.d;
        String strC = iVar.c(pattern);
        this.d = this.f18455a.f18468g;
        return strC;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f18455a;
        iVar.f18468g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f18455a;
        iVar.f18468g = this.d;
        iVar.c(i.f18459k);
        this.d = this.f18455a.f18468g;
    }

    public final s f(String str) {
        this.f18455a.getClass();
        return new s(str);
    }
}
