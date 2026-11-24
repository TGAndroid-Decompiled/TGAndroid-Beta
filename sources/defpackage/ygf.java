package defpackage;

import android.content.Context;
public final class ygf implements ngf {
    public final e26 a;
    public final hgf b;

    public ygf(Context context, hgf hgfVar) {
        this.b = hgfVar;
        p61 p61Var = p61.e;
        i3c.b(context);
        g3c c = i3c.a().c(p61Var);
        if (p61.d.contains(new d44("json"))) {
            new e26(new l0f(c, (byte) 6));
        }
        this.a = new e26(new l0f(c, (byte) 7));
    }

    @Override
    public final void a(ry ryVar) {
        na0 na0Var;
        this.b.getClass();
        h3c h3cVar = (h3c) this.a.get();
        if (ryVar.b) {
            na0Var = na0.a(ryVar.i());
        } else {
            na0Var = new na0(null, ryVar.i(), fl8.b, null);
        }
        h3cVar.a(na0Var, new rjb((byte) 9));
    }
}
