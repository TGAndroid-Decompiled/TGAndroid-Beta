package defpackage;

import java.util.HashMap;
public final class o90 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e = new xnb();
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public o90(y54 y54Var, t54 t54Var, adb adbVar, int i, int i2, int i3, int i4) {
        this.a = y54Var;
        this.c = t54Var;
        this.d = adbVar;
        this.f = adbVar.a(y54Var.t, new zn3(this, (byte) 2));
        this.g = new w9b(this, i);
        this.h = new x9b(this, i2);
        this.i = new y9b(this, i3);
        this.j = new z9b(this, i4);
        b30 b30Var = new b30(this, (byte) 3);
        this.b = b30Var;
        y54Var.m.a(b30Var);
    }

    public final void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.h;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            sc8.j("Property \"autoMetadata\" has not been set");
        }
    }

    public final p90 b() {
        String str;
        if (((String) this.a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((o24) this.e) == null) {
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
            return new p90((String) this.a, (Integer) this.c, (o24) this.e, ((Long) this.f).longValue(), ((Long) this.g).longValue(), (HashMap) this.h, (Integer) this.d, (String) this.b, (byte[]) this.i, (byte[]) this.j);
        }
        sc8.j("Missing required properties:".concat(str));
        return null;
    }
}
