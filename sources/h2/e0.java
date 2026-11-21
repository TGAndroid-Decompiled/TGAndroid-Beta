package h2;

import e2.i1;
import java.util.HashMap;
public final class e0 {
    public Object f13773a;
    public Object f13774b;
    public Object f13775c;
    public Object d;
    public Object f13776e = new i1();
    public Object f13777f;
    public Object f13778g;
    public Object h;
    public Object f13779i;
    public Object f13780j;

    public e0(l2.f0 f0Var, l2.z zVar, g0 g0Var, int i7, int i10, int i11, int i12) {
        this.f13773a = f0Var;
        this.f13775c = zVar;
        this.d = g0Var;
        this.f13777f = g0Var.a(f0Var.f19374t, new n(this, 1));
        this.f13778g = new a0(this, i7);
        this.h = new b0(this, i10);
        this.f13779i = new c0(this, i11);
        this.f13780j = new d0(this, i12);
        z zVar2 = new z(this, 0);
        this.f13774b = zVar2;
        f0Var.f19361m.a(zVar2);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f13777f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public o5.h b() {
        String str;
        if (((String) this.f13773a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((o5.l) this.f13775c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = p5.c.v(str, " eventMillis");
        }
        if (((Long) this.f13776e) == null) {
            str = p5.c.v(str, " uptimeMillis");
        }
        if (((HashMap) this.f13777f) == null) {
            str = p5.c.v(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new o5.h((String) this.f13773a, (Integer) this.f13774b, (o5.l) this.f13775c, ((Long) this.d).longValue(), ((Long) this.f13776e).longValue(), (HashMap) this.f13777f, (Integer) this.f13778g, (String) this.h, (byte[]) this.f13779i, (byte[]) this.f13780j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
