package k9;

import java.util.List;
import vh.w2;
public final class g0 {
    public String f10115a;
    public String f10116b;
    public String f10117c;
    public Long d;
    public Long e;
    public Boolean f10118f;
    public l1 f10119g;
    public c2 h;
    public b2 f10120i;
    public m1 f10121j;
    public List f10122k;
    public Integer f10123l;

    public final h0 a() {
        String str;
        if (this.f10115a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f10116b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = w2.k(str, " startedAt");
        }
        if (this.f10118f == null) {
            str = w2.k(str, " crashed");
        }
        if (this.f10119g == null) {
            str = w2.k(str, " app");
        }
        if (this.f10123l == null) {
            str = w2.k(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f10115a, this.f10116b, this.f10117c, this.d.longValue(), this.e, this.f10118f.booleanValue(), this.f10119g, this.h, this.f10120i, this.f10121j, this.f10122k, this.f10123l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
