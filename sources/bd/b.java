package bd;

import gf.p;
import gf.s;
import java.util.regex.Pattern;
public final class b extends h {
    public static final Pattern f3222e = j.f3238m;

    @Override
    public final p b() {
        this.d++;
        if (c() == '\n') {
            gf.g gVar = new gf.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f3231c.length()) {
            String str = this.f3231c;
            int i3 = this.d;
            if (f3222e.matcher(str.substring(i3, i3 + 1)).matches()) {
                String str2 = this.f3231c;
                int i10 = this.d;
                this.f3229a.getClass();
                s sVar = new s(str2.substring(i10, i10 + 1));
                this.d++;
                return sVar;
            }
        }
        return f("\\");
    }

    @Override
    public final char d() {
        return '\\';
    }
}
