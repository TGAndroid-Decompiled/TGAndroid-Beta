package f7;

import java.io.Serializable;
public final class f8 {
    public String f5661a;
    public String f5662b;
    public String f5663c;
    public String d;
    public String f5664e;
    public Object f5665f;
    public Object f5666g;
    public Object h;
    public Integer f5667i;
    public Object f5668j;
    public Serializable f5669k;

    public g9.a0 a() {
        String str;
        if (this.f5661a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f5662b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f5667i == null) {
            str = ta.b.j(str, " platform");
        }
        if (this.f5663c == null) {
            str = ta.b.j(str, " installationUuid");
        }
        if (((String) this.f5669k) == null) {
            str = ta.b.j(str, " buildVersion");
        }
        if (((String) this.f5665f) == null) {
            str = ta.b.j(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new g9.a0(this.f5661a, this.f5662b, this.f5667i.intValue(), this.f5663c, this.d, this.f5664e, (String) this.f5669k, (String) this.f5665f, (g9.d2) this.f5666g, (g9.j1) this.h, (g9.g1) this.f5668j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
