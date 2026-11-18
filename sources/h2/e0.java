package h2;

import e2.i1;
import java.util.HashMap;
public final class e0 {
    public Object f13744a;
    public Object f13745b;
    public Object f13746c;
    public Object d;
    public Object f13747e = new i1();
    public Object f13748f;
    public Object f13749g;
    public Object h;
    public Object f13750i;
    public Object f13751j;

    public e0(l2.f0 f0Var, l2.z zVar, g0 g0Var, int i7, int i10, int i11, int i12) {
        this.f13744a = f0Var;
        this.f13746c = zVar;
        this.d = g0Var;
        this.f13748f = g0Var.a(f0Var.f19346t, new n(this, 1));
        this.f13749g = new a0(this, i7);
        this.h = new b0(this, i10);
        this.f13750i = new c0(this, i11);
        this.f13751j = new d0(this, i12);
        z zVar2 = new z(this, 0);
        this.f13745b = zVar2;
        f0Var.f19333m.a(zVar2);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f13748f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public o5.h b() {
        String str;
        if (((String) this.f13744a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((o5.l) this.f13746c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = p5.c.v(str, " eventMillis");
        }
        if (((Long) this.f13747e) == null) {
            str = p5.c.v(str, " uptimeMillis");
        }
        if (((HashMap) this.f13748f) == null) {
            str = p5.c.v(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new o5.h((String) this.f13744a, (Integer) this.f13745b, (o5.l) this.f13746c, ((Long) this.d).longValue(), ((Long) this.f13747e).longValue(), (HashMap) this.f13748f, (Integer) this.f13749g, (String) this.h, (byte[]) this.f13750i, (byte[]) this.f13751j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
