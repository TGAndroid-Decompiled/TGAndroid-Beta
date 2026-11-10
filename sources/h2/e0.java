package h2;

import e2.i1;
import java.util.HashMap;
public final class e0 {
    public Object f14074a;
    public Object f14075b;
    public Object f14076c;
    public Object d;
    public Object f14077e = new i1();
    public Object f14078f;
    public Object f14079g;
    public Object h;
    public Object f14080i;
    public Object f14081j;

    public e0(l2.i0 i0Var, l2.c0 c0Var, g0 g0Var, int i7, int i10, int i11, int i12) {
        this.f14074a = i0Var;
        this.f14076c = c0Var;
        this.d = g0Var;
        this.f14078f = g0Var.a(i0Var.f17887t, new n(this, 1));
        this.f14079g = new a0(this, i7);
        this.h = new b0(this, i10);
        this.f14080i = new c0(this, i11);
        this.f14081j = new d0(this, i12);
        z zVar = new z(this, 0);
        this.f14075b = zVar;
        i0Var.f17874m.a(zVar);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f14078f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public o5.h b() {
        String str;
        if (((String) this.f14074a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((o5.l) this.f14076c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = rf.b.r(str, " eventMillis");
        }
        if (((Long) this.f14077e) == null) {
            str = rf.b.r(str, " uptimeMillis");
        }
        if (((HashMap) this.f14078f) == null) {
            str = rf.b.r(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new o5.h((String) this.f14074a, (Integer) this.f14075b, (o5.l) this.f14076c, ((Long) this.d).longValue(), ((Long) this.f14077e).longValue(), (HashMap) this.f14078f, (Integer) this.f14079g, (String) this.h, (byte[]) this.f14080i, (byte[]) this.f14081j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
