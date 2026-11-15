package h2;

import e2.i1;
import java.util.HashMap;
public final class e0 {
    public Object f13432a;
    public Object f13433b;
    public Object f13434c;
    public Object d;
    public Object f13435e = new i1();
    public Object f13436f;
    public Object f13437g;
    public Object h;
    public Object f13438i;
    public Object f13439j;

    public e0(l2.f0 f0Var, l2.z zVar, g0 g0Var, int i7, int i10, int i11, int i12) {
        this.f13432a = f0Var;
        this.f13434c = zVar;
        this.d = g0Var;
        this.f13436f = g0Var.a(f0Var.f18982t, new n(this, 1));
        this.f13437g = new a0(this, i7);
        this.h = new b0(this, i10);
        this.f13438i = new c0(this, i11);
        this.f13439j = new d0(this, i12);
        z zVar2 = new z(this, 0);
        this.f13433b = zVar2;
        f0Var.f18969m.a(zVar2);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f13436f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public o5.h b() {
        String str;
        if (((String) this.f13432a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((o5.m) this.f13434c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = r.b.v(str, " eventMillis");
        }
        if (((Long) this.f13435e) == null) {
            str = r.b.v(str, " uptimeMillis");
        }
        if (((HashMap) this.f13436f) == null) {
            str = r.b.v(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new o5.h((String) this.f13432a, (Integer) this.f13433b, (o5.m) this.f13434c, ((Long) this.d).longValue(), ((Long) this.f13435e).longValue(), (HashMap) this.f13436f, (Integer) this.f13437g, (String) this.h, (byte[]) this.f13438i, (byte[]) this.f13439j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
