package j7;

import java.io.Serializable;
public final class g8 {
    public String f8985a;
    public String f8986b;
    public String f8987c;
    public String d;
    public String e;
    public Object f8988f;
    public Object f8989g;
    public Object h;
    public Integer f8990i;
    public Object f8991j;
    public Serializable f8992k;

    public k9.a0 a() {
        String str;
        if (this.f8985a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f8986b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f8990i == null) {
            str = vh.w2.k(str, " platform");
        }
        if (this.f8987c == null) {
            str = vh.w2.k(str, " installationUuid");
        }
        if (((String) this.f8992k) == null) {
            str = vh.w2.k(str, " buildVersion");
        }
        if (((String) this.f8988f) == null) {
            str = vh.w2.k(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new k9.a0(this.f8985a, this.f8986b, this.f8990i.intValue(), this.f8987c, this.d, this.e, (String) this.f8992k, (String) this.f8988f, (k9.d2) this.f8989g, (k9.j1) this.h, (k9.g1) this.f8991j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
