package mc;

import ie.p;
import ie.s;
import java.util.regex.Pattern;
public final class b extends h {
    public static final Pattern f17612e = i.f17625m;

    @Override
    public final p b() {
        this.d++;
        if (c() == '\n') {
            ie.g gVar = new ie.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f17621c.length()) {
            String str = this.f17621c;
            int i9 = this.d;
            if (f17612e.matcher(str.substring(i9, i9 + 1)).matches()) {
                String str2 = this.f17621c;
                int i10 = this.d;
                this.f17619a.getClass();
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
