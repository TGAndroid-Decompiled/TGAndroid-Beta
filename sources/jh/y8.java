package jh;

import android.content.Context;
import java.util.ArrayList;

public final class y8 extends u {
    public final i9 M0;

    public y8(i9 i9Var, int i10, Context context, i9 i9Var2, b bVar) {
        super(context);
        this.M0 = i9Var;
        this.f13867w0 = new ArrayList();
        this.f13870z0 = true;
        this.I0 = new a8.b(this, 25);
        this.K0 = -1;
        this.f13865u0 = i10;
        this.D0 = new b4(context);
        this.J0 = i9Var2;
        n7 n7Var = new n7(this, context, i9Var2, bVar);
        this.f13866v0 = n7Var;
        setAdapter(n7Var);
        h3.x xVar = new h3.x(this, 25);
        boolean z10 = this.f17574i0 == null;
        this.f17574i0 = xVar;
        setChildrenDrawingOrderEnabled(true);
        this.f17576k0 = 1;
        this.f17575j0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new o7(this, i9Var2));
        setOverScrollMode(2);
    }
}
