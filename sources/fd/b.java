package fd;

import cf.p;
import cf.s;
import java.util.regex.Pattern;
public final class b extends h {
    public static final Pattern f9857e = i.f9870m;

    @Override
    public final p b() {
        this.d++;
        if (c() == '\n') {
            cf.g gVar = new cf.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f9866c.length()) {
            String str = this.f9866c;
            int i10 = this.d;
            if (f9857e.matcher(str.substring(i10, i10 + 1)).matches()) {
                String str2 = this.f9866c;
                int i11 = this.d;
                this.f9864a.getClass();
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
