package defpackage;

import java.util.HashMap;
public final class oa0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e = new ypb();
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public oa0(h74 h74Var, c74 c74Var, bfb bfbVar, int i, int i2, int i3, int i4) {
        this.a = h74Var;
        this.c = c74Var;
        this.d = bfbVar;
        this.f = bfbVar.a(h74Var.t, new jp3(this, (byte) 2));
        this.g = new ybb(this, i);
        this.h = new zbb(this, i2);
        this.i = new acb(this, i3);
        this.j = new bcb(this, i4);
        b40 b40Var = new b40(this, (byte) 3);
        this.b = b40Var;
        h74Var.m.a(b40Var);
    }

    public final void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.h;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            dq9.m("Property \"autoMetadata\" has not been set");
        }
    }

    public final pa0 b() {
        String str;
        if (((String) this.a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((z34) this.e) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.g) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.h) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new pa0((String) this.a, (Integer) this.c, (z34) this.e, ((Long) this.f).longValue(), ((Long) this.g).longValue(), (HashMap) this.h, (Integer) this.d, (String) this.b, (byte[]) this.i, (byte[]) this.j);
        }
        dq9.m("Missing required properties:".concat(str));
        return null;
    }
}
