package h7;

import java.io.Serializable;
public final class d8 {
    public String f7588a;
    public String f7589b;
    public String f7590c;
    public String d;
    public String f7591e;
    public Object f7592f;
    public Object f7593g;
    public Object h;
    public Integer f7594i;
    public Object f7595j;
    public Serializable f7596k;

    public i9.a0 a() {
        String str;
        if (this.f7588a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f7589b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f7594i == null) {
            str = u3.c.k(str, " platform");
        }
        if (this.f7590c == null) {
            str = u3.c.k(str, " installationUuid");
        }
        if (((String) this.f7596k) == null) {
            str = u3.c.k(str, " buildVersion");
        }
        if (((String) this.f7592f) == null) {
            str = u3.c.k(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new i9.a0(this.f7588a, this.f7589b, this.f7594i.intValue(), this.f7590c, this.d, this.f7591e, (String) this.f7596k, (String) this.f7592f, (i9.d2) this.f7593g, (i9.j1) this.h, (i9.g1) this.f7595j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
