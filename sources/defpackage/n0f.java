package defpackage;
public abstract class n0f {
    public static final y6a a(y6a y6aVar, dhf dhfVar) {
        y6aVar.getClass();
        dhfVar.getClass();
        if (rr5.a(y6aVar.e(), a7a.b)) {
            awd.a(y6aVar);
            return y6aVar;
        } else if (y6aVar.isInline()) {
            return a(y6aVar.i(0), dhfVar);
        } else {
            return y6aVar;
        }
    }

    public static final v0d b(lw5 lw5Var, y6a y6aVar) {
        y6aVar.getClass();
        yve e = y6aVar.e();
        if (e instanceof jh8) {
            return v0d.f;
        }
        if (rr5.a(e, xbb.c)) {
            return v0d.d;
        }
        if (rr5.a(e, xbb.d)) {
            y6a a = a(y6aVar.i(0), lw5Var.b);
            yve e2 = a.e();
            if (!(e2 instanceof dl8) && !rr5.a(e2, a7a.c)) {
                String a2 = a.a();
                yve e3 = a.e();
                throw new IllegalArgumentException("Value of type '" + a2 + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + e3 + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
            }
            return v0d.e;
        }
        return v0d.c;
    }
}
