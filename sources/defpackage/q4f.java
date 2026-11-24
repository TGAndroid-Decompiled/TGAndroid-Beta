package defpackage;

import android.content.Context;
public final class q4f implements x3f {
    public final e06 a;
    public final g3f b;

    public q4f(Context context, g3f g3fVar) {
        this.b = g3fVar;
        i51 i51Var = i51.e;
        i1c.b(context);
        g1c c = i1c.a().c(i51Var);
        if (i51.d.contains(new s24("json"))) {
            new e06(new jye(c, (byte) 4));
        }
        this.a = new e06(new jye(c, (byte) 5));
    }

    @Override
    public final void a(qx qxVar) {
        n90 n90Var;
        this.b.getClass();
        h1c h1cVar = (h1c) this.a.get();
        if (qxVar.b) {
            n90Var = n90.a(qxVar.i());
        } else {
            n90Var = new n90(null, qxVar.i(), cj8.b, null);
        }
        h1cVar.a(n90Var, new fyb((byte) 3));
    }
}
