package h9;

import java.util.List;

public final class g0 {

    public String f8694a;

    public String f8695b;

    public String f8696c;
    public Long d;

    public Long f8697e;

    public Boolean f8698f;

    public l1 f8699g;
    public c2 h;

    public b2 f8700i;

    public m1 f8701j;

    public List f8702k;

    public Integer f8703l;

    public final h0 a() {
        String strL = this.f8694a == null ? " generator" : "";
        if (this.f8695b == null) {
            strL = strL.concat(" identifier");
        }
        if (this.d == null) {
            strL = s3.c.l(strL, " startedAt");
        }
        if (this.f8698f == null) {
            strL = s3.c.l(strL, " crashed");
        }
        if (this.f8699g == null) {
            strL = s3.c.l(strL, " app");
        }
        if (this.f8703l == null) {
            strL = s3.c.l(strL, " generatorType");
        }
        if (strL.isEmpty()) {
            return new h0(this.f8694a, this.f8695b, this.f8696c, this.d.longValue(), this.f8697e, this.f8698f.booleanValue(), this.f8699g, this.h, this.f8700i, this.f8701j, this.f8702k, this.f8703l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }
}
