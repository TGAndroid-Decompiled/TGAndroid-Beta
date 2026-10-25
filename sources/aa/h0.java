package aa;

import java.util.List;
import org.telegram.ui.Components.b10;
public final class h0 {
    public String f1093a;
    public String f1094b;
    public String f1095c;
    public Long d;
    public Long e;
    public Boolean f1096f;
    public n1 f1097g;
    public e2 h;
    public d2 f1098i;
    public o1 f1099j;
    public List f1100k;
    public Integer f1101l;

    public final i0 a() {
        String str;
        if (this.f1093a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f1094b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = b10.u(str, " startedAt");
        }
        if (this.f1096f == null) {
            str = b10.u(str, " crashed");
        }
        if (this.f1097g == null) {
            str = b10.u(str, " app");
        }
        if (this.f1101l == null) {
            str = b10.u(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new i0(this.f1093a, this.f1094b, this.f1095c, this.d.longValue(), this.e, this.f1096f.booleanValue(), this.f1097g, this.h, this.f1098i, this.f1099j, this.f1100k, this.f1101l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
