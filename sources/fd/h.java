package fd;

import cf.p;
import cf.s;
import java.util.regex.Pattern;
public abstract class h {
    public i f9864a;
    public p f9865b;
    public String f9866c;
    public int d;

    public final String a(Pattern pattern) {
        i iVar = this.f9864a;
        iVar.f9877g = this.d;
        String c10 = iVar.c(pattern);
        this.d = this.f9864a.f9877g;
        return c10;
    }

    public abstract p b();

    public final char c() {
        i iVar = this.f9864a;
        iVar.f9877g = this.d;
        return iVar.d();
    }

    public abstract char d();

    public final void e() {
        i iVar = this.f9864a;
        iVar.f9877g = this.d;
        iVar.c(i.f9868k);
        this.d = this.f9864a.f9877g;
    }

    public final s f(String str) {
        this.f9864a.getClass();
        return new s(str);
    }
}
