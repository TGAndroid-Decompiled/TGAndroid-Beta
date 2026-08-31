package k9;

import java.util.List;
public final class g0 {
    public String f10878a;
    public String f10879b;
    public String f10880c;
    public Long d;
    public Long f10881e;
    public Boolean f10882f;
    public l1 f10883g;
    public c2 h;
    public b2 f10884i;
    public m1 f10885j;
    public List f10886k;
    public Integer f10887l;

    public final h0 a() {
        String str;
        if (this.f10878a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f10879b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = w.c.e(str, " startedAt");
        }
        if (this.f10882f == null) {
            str = w.c.e(str, " crashed");
        }
        if (this.f10883g == null) {
            str = w.c.e(str, " app");
        }
        if (this.f10887l == null) {
            str = w.c.e(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f10878a, this.f10879b, this.f10880c, this.d.longValue(), this.f10881e, this.f10882f.booleanValue(), this.f10883g, this.h, this.f10884i, this.f10885j, this.f10886k, this.f10887l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
