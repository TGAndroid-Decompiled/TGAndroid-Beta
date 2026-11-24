package defpackage;
public abstract class lye {
    public static final w4a a(w4a w4aVar, cff cffVar) {
        w4aVar.getClass();
        cffVar.getClass();
        if (rp5.a(w4aVar.e(), y4a.b)) {
            xtd.a(w4aVar);
            return w4aVar;
        } else if (w4aVar.isInline()) {
            return a(w4aVar.i(0), cffVar);
        } else {
            return w4aVar;
        }
    }

    public static final uyc b(lu5 lu5Var, w4a w4aVar) {
        w4aVar.getClass();
        vte e = w4aVar.e();
        if (e instanceof hf8) {
            return uyc.f;
        }
        if (rp5.a(e, v9b.c)) {
            return uyc.d;
        }
        if (rp5.a(e, v9b.d)) {
            w4a a = a(w4aVar.i(0), lu5Var.b);
            vte e2 = a.e();
            if (!(e2 instanceof aj8) && !rp5.a(e2, y4a.c)) {
                String a2 = a.a();
                vte e3 = a.e();
                throw new IllegalArgumentException("Value of type '" + a2 + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + e3 + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
            }
            return uyc.e;
        }
        return uyc.c;
    }
}
