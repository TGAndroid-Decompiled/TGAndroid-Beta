package gd;

import df.p;
import df.s;
import java.util.regex.Pattern;
public final class b extends h {
    public static final Pattern e = i.f11000m;

    @Override
    public final p b() {
        this.d++;
        if (c() == '\n') {
            df.g gVar = new df.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f10996c.length()) {
            String str = this.f10996c;
            int i10 = this.d;
            if (e.matcher(str.substring(i10, i10 + 1)).matches()) {
                String str2 = this.f10996c;
                int i11 = this.d;
                this.f10994a.getClass();
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
