package g7;

import java.io.Serializable;

public final class e8 {

    public String f6455a;

    public String f6456b;

    public String f6457c;
    public String d;

    public String f6458e;

    public Object f6459f;

    public Object f6460g;
    public Object h;

    public Integer f6461i;

    public Object f6462j;

    public Serializable f6463k;

    public h9.a0 a() {
        String strL = this.f6455a == null ? " sdkVersion" : "";
        if (this.f6456b == null) {
            strL = strL.concat(" gmpAppId");
        }
        if (this.f6461i == null) {
            strL = s3.c.l(strL, " platform");
        }
        if (this.f6457c == null) {
            strL = s3.c.l(strL, " installationUuid");
        }
        if (((String) this.f6463k) == null) {
            strL = s3.c.l(strL, " buildVersion");
        }
        if (((String) this.f6459f) == null) {
            strL = s3.c.l(strL, " displayVersion");
        }
        if (strL.isEmpty()) {
            return new h9.a0(this.f6455a, this.f6456b, this.f6461i.intValue(), this.f6457c, this.d, this.f6458e, (String) this.f6463k, (String) this.f6459f, (h9.d2) this.f6460g, (h9.j1) this.h, (h9.g1) this.f6462j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }
}
