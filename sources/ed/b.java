package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;
public final class b extends h {
    public static final Pattern f10891e = i.f10904m;

    @Override
    public final p b() {
        this.d++;
        if (c() == '\n') {
            kf.g gVar = new kf.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f10900c.length()) {
            String str = this.f10900c;
            int i7 = this.d;
            if (f10891e.matcher(str.substring(i7, i7 + 1)).matches()) {
                String str2 = this.f10900c;
                int i10 = this.d;
                this.f10898a.getClass();
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
