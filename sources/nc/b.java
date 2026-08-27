package nc;

import java.util.regex.Pattern;
import je.p;
import je.s;

public final class b extends h {

    public static final Pattern f18448e = i.f18461m;

    @Override
    public final p b() {
        this.d++;
        if (c() == '\n') {
            je.g gVar = new je.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f18457c.length()) {
            String str = this.f18457c;
            int i10 = this.d;
            if (f18448e.matcher(str.substring(i10, i10 + 1)).matches()) {
                String str2 = this.f18457c;
                int i11 = this.d;
                this.f18455a.getClass();
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
