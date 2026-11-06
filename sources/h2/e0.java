package h2;

import e2.i1;
import java.util.HashMap;
public final class e0 {
    public Object f14072a;
    public Object f14073b;
    public Object f14074c;
    public Object d;
    public Object f14075e = new i1();
    public Object f14076f;
    public Object f14077g;
    public Object h;
    public Object f14078i;
    public Object f14079j;

    public e0(l2.i0 i0Var, l2.c0 c0Var, g0 g0Var, int i7, int i10, int i11, int i12) {
        this.f14072a = i0Var;
        this.f14074c = c0Var;
        this.d = g0Var;
        this.f14076f = g0Var.a(i0Var.f17883t, new n(this, 1));
        this.f14077g = new a0(this, i7);
        this.h = new b0(this, i10);
        this.f14078i = new c0(this, i11);
        this.f14079j = new d0(this, i12);
        z zVar = new z(this, 0);
        this.f14073b = zVar;
        i0Var.f17870m.a(zVar);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f14076f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public o5.h b() {
        String str;
        if (((String) this.f14072a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((o5.l) this.f14074c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = rf.b.q(str, " eventMillis");
        }
        if (((Long) this.f14075e) == null) {
            str = rf.b.q(str, " uptimeMillis");
        }
        if (((HashMap) this.f14076f) == null) {
            str = rf.b.q(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new o5.h((String) this.f14072a, (Integer) this.f14073b, (o5.l) this.f14074c, ((Long) this.d).longValue(), ((Long) this.f14075e).longValue(), (HashMap) this.f14076f, (Integer) this.f14077g, (String) this.h, (byte[]) this.f14078i, (byte[]) this.f14079j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
