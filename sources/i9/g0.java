package i9;

import java.util.List;
public final class g0 {
    public String f8658a;
    public String f8659b;
    public String f8660c;
    public Long d;
    public Long f8661e;
    public Boolean f8662f;
    public l1 f8663g;
    public c2 h;
    public b2 f8664i;
    public m1 f8665j;
    public List f8666k;
    public Integer f8667l;

    public final h0 a() {
        String str;
        if (this.f8658a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f8659b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = u3.c.k(str, " startedAt");
        }
        if (this.f8662f == null) {
            str = u3.c.k(str, " crashed");
        }
        if (this.f8663g == null) {
            str = u3.c.k(str, " app");
        }
        if (this.f8667l == null) {
            str = u3.c.k(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f8658a, this.f8659b, this.f8660c, this.d.longValue(), this.f8661e, this.f8662f.booleanValue(), this.f8663g, this.h, this.f8664i, this.f8665j, this.f8666k, this.f8667l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
