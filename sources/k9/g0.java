package k9;

import java.util.List;
import vh.v2;
public final class g0 {
    public String f10135a;
    public String f10136b;
    public String f10137c;
    public Long d;
    public Long e;
    public Boolean f10138f;
    public l1 f10139g;
    public c2 h;
    public b2 f10140i;
    public m1 f10141j;
    public List f10142k;
    public Integer f10143l;

    public final h0 a() {
        String str;
        if (this.f10135a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f10136b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = v2.k(str, " startedAt");
        }
        if (this.f10138f == null) {
            str = v2.k(str, " crashed");
        }
        if (this.f10139g == null) {
            str = v2.k(str, " app");
        }
        if (this.f10143l == null) {
            str = v2.k(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f10135a, this.f10136b, this.f10137c, this.d.longValue(), this.e, this.f10138f.booleanValue(), this.f10139g, this.h, this.f10140i, this.f10141j, this.f10142k, this.f10143l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
