package j7;

import java.io.Serializable;
public final class g8 {
    public String f9615a;
    public String f9616b;
    public String f9617c;
    public String d;
    public String f9618e;
    public Object f9619f;
    public Object f9620g;
    public Object h;
    public Integer f9621i;
    public Object f9622j;
    public Serializable f9623k;

    public k9.a0 a() {
        String str;
        if (this.f9615a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f9616b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f9621i == null) {
            str = w.c.e(str, " platform");
        }
        if (this.f9617c == null) {
            str = w.c.e(str, " installationUuid");
        }
        if (((String) this.f9623k) == null) {
            str = w.c.e(str, " buildVersion");
        }
        if (((String) this.f9619f) == null) {
            str = w.c.e(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new k9.a0(this.f9615a, this.f9616b, this.f9621i.intValue(), this.f9617c, this.d, this.f9618e, (String) this.f9623k, (String) this.f9619f, (k9.d2) this.f9620g, (k9.j1) this.h, (k9.g1) this.f9622j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
