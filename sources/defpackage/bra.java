package defpackage;

import android.content.Context;
import android.view.View;
public final class bra extends l9c {
    public final gra Q;

    public bra(gra graVar, d79 d79Var, Context context, int i, hj8 hj8Var, vnb vnbVar) {
        super(d79Var, context, i, 0, true, hj8Var, vnbVar);
        this.Q = graVar;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        super.t(f89Var, i);
        View view = f89Var.a;
        if (!(view instanceof era)) {
            return;
        }
        era eraVar = (era) view;
        cra craVar = eraVar.w;
        boolean b1 = this.Q.b1(craVar);
        eraVar.c.f(b1, false);
        eraVar.r.a(b1, false);
        eraVar.setOnClickListener(new jy8(this, craVar, (byte) 15));
    }
}
