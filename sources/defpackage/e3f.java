package defpackage;
public abstract class e3f {
    public static final o8a a(o8a o8aVar, sjf sjfVar) {
        o8aVar.getClass();
        sjfVar.getClass();
        if (ur5.a(o8aVar.e(), q8a.b)) {
            nyd.a(o8aVar);
            return o8aVar;
        } else if (o8aVar.isInline()) {
            return a(o8aVar.i(0), sjfVar);
        } else {
            return o8aVar;
        }
    }

    public static final k3d b(qw5 qw5Var, o8a o8aVar) {
        o8aVar.getClass();
        nye e = o8aVar.e();
        if (e instanceof vi8) {
            return k3d.f;
        }
        if (ur5.a(e, tdb.c)) {
            return k3d.d;
        }
        if (ur5.a(e, tdb.d)) {
            o8a a = a(o8aVar.i(0), qw5Var.b);
            nye e2 = a.e();
            if (!(e2 instanceof nm8) && !ur5.a(e2, q8a.c)) {
                String a2 = a.a();
                nye e3 = a.e();
                throw new IllegalArgumentException("Value of type '" + a2 + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + e3 + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
            }
            return k3d.e;
        }
        return k3d.c;
    }
}
