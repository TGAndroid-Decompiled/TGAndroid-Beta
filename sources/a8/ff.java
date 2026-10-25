package a8;

import java.io.Serializable;
import org.telegram.ui.Components.b10;
public final class ff {
    public String f455a;
    public String f456b;
    public Integer f457c;
    public String d;
    public String e;
    public String f458f;
    public Serializable f459g;
    public Object h;
    public Object f460i;
    public Object f461j;
    public Object f462k;

    public aa.a0 a() {
        String str;
        if (this.f455a == null) {
            str = " sdkVersion";
        } else {
            str = "";
        }
        if (this.f456b == null) {
            str = str.concat(" gmpAppId");
        }
        if (this.f457c == null) {
            str = b10.u(str, " platform");
        }
        if (this.d == null) {
            str = b10.u(str, " installationUuid");
        }
        if (((String) this.f459g) == null) {
            str = b10.u(str, " buildVersion");
        }
        if (((String) this.h) == null) {
            str = b10.u(str, " displayVersion");
        }
        if (str.isEmpty()) {
            return new aa.a0(this.f455a, this.f456b, this.f457c.intValue(), this.d, this.e, this.f458f, (String) this.f459g, (String) this.h, (aa.f2) this.f460i, (aa.l1) this.f461j, (aa.i1) this.f462k);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
