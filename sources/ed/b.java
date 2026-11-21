package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;
public final class b extends h {
    public static final Pattern f10917e = i.f10930m;

    @Override
    public final p b() {
        this.d++;
        if (c() == '\n') {
            kf.g gVar = new kf.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f10926c.length()) {
            String str = this.f10926c;
            int i7 = this.d;
            if (f10917e.matcher(str.substring(i7, i7 + 1)).matches()) {
                String str2 = this.f10926c;
                int i10 = this.d;
                this.f10924a.getClass();
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
