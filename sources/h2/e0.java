package h2;

import e2.i1;
import java.util.HashMap;
public final class e0 {
    public Object f13747a;
    public Object f13748b;
    public Object f13749c;
    public Object d;
    public Object f13750e = new i1();
    public Object f13751f;
    public Object f13752g;
    public Object h;
    public Object f13753i;
    public Object f13754j;

    public e0(l2.f0 f0Var, l2.z zVar, g0 g0Var, int i7, int i10, int i11, int i12) {
        this.f13747a = f0Var;
        this.f13749c = zVar;
        this.d = g0Var;
        this.f13751f = g0Var.a(f0Var.f19349t, new n(this, 1));
        this.f13752g = new a0(this, i7);
        this.h = new b0(this, i10);
        this.f13753i = new c0(this, i11);
        this.f13754j = new d0(this, i12);
        z zVar2 = new z(this, 0);
        this.f13748b = zVar2;
        f0Var.f19336m.a(zVar2);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f13751f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public o5.h b() {
        String str;
        if (((String) this.f13747a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((o5.l) this.f13749c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = p5.c.v(str, " eventMillis");
        }
        if (((Long) this.f13750e) == null) {
            str = p5.c.v(str, " uptimeMillis");
        }
        if (((HashMap) this.f13751f) == null) {
            str = p5.c.v(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new o5.h((String) this.f13747a, (Integer) this.f13748b, (o5.l) this.f13749c, ((Long) this.d).longValue(), ((Long) this.f13750e).longValue(), (HashMap) this.f13751f, (Integer) this.f13752g, (String) this.h, (byte[]) this.f13753i, (byte[]) this.f13754j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
