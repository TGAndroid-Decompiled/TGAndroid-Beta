package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;
public final class b extends h {
    public static final Pattern f10881e = i.f10894m;

    @Override
    public final p b() {
        this.d++;
        if (c() == '\n') {
            kf.g gVar = new kf.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f10890c.length()) {
            String str = this.f10890c;
            int i7 = this.d;
            if (f10881e.matcher(str.substring(i7, i7 + 1)).matches()) {
                String str2 = this.f10890c;
                int i10 = this.d;
                this.f10888a.getClass();
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
