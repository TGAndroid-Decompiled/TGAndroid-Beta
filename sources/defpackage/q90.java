package defpackage;

import java.util.HashMap;
public final class q90 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e = new xrb();
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public q90(s64 s64Var, n64 n64Var, vgb vgbVar, int i, int i2, int i3, int i4) {
        this.a = s64Var;
        this.c = n64Var;
        this.d = vgbVar;
        this.f = vgbVar.a(s64Var.t, new qo3(this, (byte) 2));
        this.g = new udb(this, i);
        this.h = new vdb(this, i2);
        this.i = new wdb(this, i3);
        this.j = new xdb(this, i4);
        c30 c30Var = new c30(this, (byte) 3);
        this.b = c30Var;
        s64Var.m.a(c30Var);
    }

    public final void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.h;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            grb.i("Property \"autoMetadata\" has not been set");
        }
    }

    public final r90 b() {
        String str;
        if (((String) this.a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((j34) this.e) == null) {
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
            return new r90((String) this.a, (Integer) this.c, (j34) this.e, ((Long) this.f).longValue(), ((Long) this.g).longValue(), (HashMap) this.h, (Integer) this.d, (String) this.b, (byte[]) this.i, (byte[]) this.j);
        }
        grb.i("Missing required properties:".concat(str));
        return null;
    }
}
