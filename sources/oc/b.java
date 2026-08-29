package oc;

import java.util.regex.Pattern;
import le.p;
import le.s;
public final class b extends h {
    public static final Pattern f19472e = j.f19488m;

    @Override
    public final p b() {
        this.d++;
        if (c() == '\n') {
            le.g gVar = new le.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f19481c.length()) {
            String str = this.f19481c;
            int i10 = this.d;
            if (f19472e.matcher(str.substring(i10, i10 + 1)).matches()) {
                String str2 = this.f19481c;
                int i11 = this.d;
                this.f19479a.getClass();
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
