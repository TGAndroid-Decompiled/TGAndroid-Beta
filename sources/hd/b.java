package hd;

import ef.p;
import ef.s;
import java.util.regex.Pattern;
public final class b extends h {
    public static final Pattern e = i.f12779m;

    @Override
    public final p b() {
        this.d++;
        if (c() == '\n') {
            ef.g gVar = new ef.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f12775c.length()) {
            String str = this.f12775c;
            int i10 = this.d;
            if (e.matcher(str.substring(i10, i10 + 1)).matches()) {
                String str2 = this.f12775c;
                int i11 = this.d;
                this.f12773a.getClass();
                s sVar = new s(str2.substring(i11, i11 + 1));
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
