package defpackage;

import android.content.Context;
public final class k3f implements g2f {
    public final i26 a;
    public final y0f b;

    public k3f(Context context, y0f y0fVar) {
        this.b = y0fVar;
        q51 q51Var = q51.e;
        h5c.b(context);
        f5c c = h5c.a().c(q51Var);
        if (q51.d.contains(new n34("json"))) {
            new i26(new a3f(c, (byte) 0));
        }
        this.a = new i26(new a3f(c, (byte) 1));
    }

    @Override
    public final void a(rx rxVar) {
        p90 p90Var;
        this.b.getClass();
        g5c g5cVar = (g5c) this.a.get();
        if (rxVar.b) {
            p90Var = p90.a(rxVar.k());
        } else {
            p90Var = new p90(null, rxVar.k(), pm8.b, null);
        }
        g5cVar.a(p90Var, new grb((byte) 10));
    }
}
