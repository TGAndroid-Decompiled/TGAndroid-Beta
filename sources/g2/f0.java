package g2;

import d2.k1;
import java.util.HashMap;
public final class f0 {
    public Object f11833a;
    public Object f11834b;
    public Object f11835c;
    public Object d;
    public Object f11836e = new k1();
    public Object f11837f;
    public Object f11838g;
    public Object h;
    public Object f11839i;
    public Object f11840j;

    public f0(k2.i0 i0Var, k2.c0 c0Var, h0 h0Var, int i3, int i10, int i11, int i12) {
        this.f11833a = i0Var;
        this.f11835c = c0Var;
        this.d = h0Var;
        this.f11837f = h0Var.a(i0Var.f16574t, new o(this, 1));
        this.f11838g = new b0(this, i3);
        this.h = new c0(this, i10);
        this.f11839i = new d0(this, i11);
        this.f11840j = new e0(this, i12);
        a0 a0Var = new a0(this, 0);
        this.f11834b = a0Var;
        i0Var.f16561m.a(a0Var);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f11837f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public n5.h b() {
        String str;
        if (((String) this.f11833a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((n5.l) this.f11835c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = t4.c.q(str, " eventMillis");
        }
        if (((Long) this.f11836e) == null) {
            str = t4.c.q(str, " uptimeMillis");
        }
        if (((HashMap) this.f11837f) == null) {
            str = t4.c.q(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new n5.h((String) this.f11833a, (Integer) this.f11834b, (n5.l) this.f11835c, ((Long) this.d).longValue(), ((Long) this.f11836e).longValue(), (HashMap) this.f11837f, (Integer) this.f11838g, (String) this.h, (byte[]) this.f11839i, (byte[]) this.f11840j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
