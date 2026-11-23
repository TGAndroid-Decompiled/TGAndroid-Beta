package h2;

import e2.i1;
import java.util.HashMap;
public final class e0 {
    public Object f13739a;
    public Object f13740b;
    public Object f13741c;
    public Object d;
    public Object f13742e = new i1();
    public Object f13743f;
    public Object f13744g;
    public Object h;
    public Object f13745i;
    public Object f13746j;

    public e0(l2.g0 g0Var, l2.a0 a0Var, g0 g0Var2, int i7, int i10, int i11, int i12) {
        this.f13739a = g0Var;
        this.f13741c = a0Var;
        this.d = g0Var2;
        this.f13743f = g0Var2.a(g0Var.f19447t, new n(this, 1));
        this.f13744g = new a0(this, i7);
        this.h = new b0(this, i10);
        this.f13745i = new c0(this, i11);
        this.f13746j = new d0(this, i12);
        z zVar = new z(this, 0);
        this.f13740b = zVar;
        g0Var.f19434m.a(zVar);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f13743f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public o5.h b() {
        String str;
        if (((String) this.f13739a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((o5.m) this.f13741c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = p5.c.v(str, " eventMillis");
        }
        if (((Long) this.f13742e) == null) {
            str = p5.c.v(str, " uptimeMillis");
        }
        if (((HashMap) this.f13743f) == null) {
            str = p5.c.v(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new o5.h((String) this.f13739a, (Integer) this.f13740b, (o5.m) this.f13741c, ((Long) this.d).longValue(), ((Long) this.f13742e).longValue(), (HashMap) this.f13743f, (Integer) this.f13744g, (String) this.h, (byte[]) this.f13745i, (byte[]) this.f13746j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
