package j7;

import java.io.Serializable;
public final class f8 {
    public String f8996a;
    public String f8997b;
    public String f8998c;
    public String d;
    public String e;
    public Object f8999f;
    public Object f9000g;
    public Object h;
    public Integer f9001i;
    public Object f9002j;
    public Serializable f9003k;

    public k9.a0 a() {
        String str;
        if (this.f8996a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f8997b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f9001i == null) {
            str = vh.v2.k(str, " platform");
        }
        if (this.f8998c == null) {
            str = vh.v2.k(str, " installationUuid");
        }
        if (((String) this.f9003k) == null) {
            str = vh.v2.k(str, " buildVersion");
        }
        if (((String) this.f8999f) == null) {
            str = vh.v2.k(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new k9.a0(this.f8996a, this.f8997b, this.f9001i.intValue(), this.f8998c, this.d, this.e, (String) this.f9003k, (String) this.f8999f, (k9.d2) this.f9000g, (k9.j1) this.h, (k9.g1) this.f9002j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
