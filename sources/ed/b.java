package ed;

import bf.p;
import bf.s;
import java.util.regex.Pattern;
public final class b extends h {
    public static final Pattern f9062e = i.f9075m;

    @Override
    public final p b() {
        this.d++;
        if (c() == '\n') {
            bf.g gVar = new bf.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f9071c.length()) {
            String str = this.f9071c;
            int i10 = this.d;
            if (f9062e.matcher(str.substring(i10, i10 + 1)).matches()) {
                String str2 = this.f9071c;
                int i11 = this.d;
                this.f9069a.getClass();
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
