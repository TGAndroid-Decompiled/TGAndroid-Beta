package h2;

import e2.i1;
import java.util.HashMap;
public final class e0 {
    public Object f13776a;
    public Object f13777b;
    public Object f13778c;
    public Object d;
    public Object f13779e = new i1();
    public Object f13780f;
    public Object f13781g;
    public Object h;
    public Object f13782i;
    public Object f13783j;

    public e0(l2.f0 f0Var, l2.z zVar, g0 g0Var, int i7, int i10, int i11, int i12) {
        this.f13776a = f0Var;
        this.f13778c = zVar;
        this.d = g0Var;
        this.f13780f = g0Var.a(f0Var.f19377t, new n(this, 1));
        this.f13781g = new a0(this, i7);
        this.h = new b0(this, i10);
        this.f13782i = new c0(this, i11);
        this.f13783j = new d0(this, i12);
        z zVar2 = new z(this, 0);
        this.f13777b = zVar2;
        f0Var.f19364m.a(zVar2);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f13780f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public o5.h b() {
        String str;
        if (((String) this.f13776a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((o5.l) this.f13778c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = p5.c.v(str, " eventMillis");
        }
        if (((Long) this.f13779e) == null) {
            str = p5.c.v(str, " uptimeMillis");
        }
        if (((HashMap) this.f13780f) == null) {
            str = p5.c.v(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new o5.h((String) this.f13776a, (Integer) this.f13777b, (o5.l) this.f13778c, ((Long) this.d).longValue(), ((Long) this.f13779e).longValue(), (HashMap) this.f13780f, (Integer) this.f13781g, (String) this.h, (byte[]) this.f13782i, (byte[]) this.f13783j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
