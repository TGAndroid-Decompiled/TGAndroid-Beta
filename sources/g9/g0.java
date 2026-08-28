package g9;

import java.util.List;
public final class g0 {
    public String f7523a;
    public String f7524b;
    public String f7525c;
    public Long d;
    public Long f7526e;
    public Boolean f7527f;
    public l1 f7528g;
    public c2 h;
    public b2 f7529i;
    public m1 f7530j;
    public List f7531k;
    public Integer f7532l;

    public final h0 a() {
        String str;
        if (this.f7523a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f7524b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = ta.b.j(str, " startedAt");
        }
        if (this.f7527f == null) {
            str = ta.b.j(str, " crashed");
        }
        if (this.f7528g == null) {
            str = ta.b.j(str, " app");
        }
        if (this.f7532l == null) {
            str = ta.b.j(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f7523a, this.f7524b, this.f7525c, this.d.longValue(), this.f7526e, this.f7527f.booleanValue(), this.f7528g, this.h, this.f7529i, this.f7530j, this.f7531k, this.f7532l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
