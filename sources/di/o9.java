package di;

import android.content.Context;
import java.util.ArrayList;
public final class o9 extends x {
    public final y9 Q0;

    public o9(y9 y9Var, int i10, Context context, y9 y9Var2, b bVar) {
        super(context);
        boolean z10;
        this.Q0 = y9Var;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new a5.d(this, 20);
        this.O0 = -1;
        this.f8565y0 = i10;
        this.H0 = new n4(context);
        this.N0 = y9Var2;
        c8 c8Var = new c8(this, context, y9Var2, bVar);
        this.f8566z0 = c8Var;
        setAdapter(c8Var);
        a1.c cVar = new a1.c(this, 27);
        if (this.m0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.m0 = cVar;
        setChildrenDrawingOrderEnabled(true);
        this.f319o0 = 1;
        this.f318n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new d8(this, y9Var2));
        setOverScrollMode(2);
    }
}
