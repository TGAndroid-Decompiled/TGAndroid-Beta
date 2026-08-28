package ih;

import android.content.Context;
import java.util.ArrayList;
public final class c9 extends w {
    public final m9 M0;

    public c9(m9 m9Var, int i9, Context context, m9 m9Var2, b bVar) {
        super(context);
        boolean z10;
        this.M0 = m9Var;
        this.f12206w0 = new ArrayList();
        this.f12209z0 = true;
        this.I0 = new androidx.activity.i(this, 25);
        this.K0 = -1;
        this.f12204u0 = i9;
        this.D0 = new f4(context);
        this.J0 = m9Var2;
        r7 r7Var = new r7(this, context, m9Var2, bVar);
        this.f12205v0 = r7Var;
        setAdapter(r7Var);
        gh.i3 i3Var = new gh.i3(this, 24);
        if (this.f17198i0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f17198i0 = i3Var;
        setChildrenDrawingOrderEnabled(true);
        this.f17200k0 = 1;
        this.f17199j0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new s7(this, m9Var2));
        setOverScrollMode(2);
    }
}
