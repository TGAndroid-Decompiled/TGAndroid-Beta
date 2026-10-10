package ai;

import android.content.Context;
import java.util.ArrayList;
public final class ac extends j0 {
    public final kc Q0;

    public ac(kc kcVar, int i10, Context context, kc kcVar2, d dVar) {
        super(context);
        boolean z10;
        this.Q0 = kcVar;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new r4(this, 1);
        this.O0 = -1;
        this.f1543y0 = i10;
        this.H0 = new c6(context);
        this.N0 = kcVar2;
        la laVar = new la(this, context, kcVar2, dVar);
        this.f1544z0 = laVar;
        setAdapter(laVar);
        a1.c cVar = new a1.c(this, 8);
        if (this.m0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.m0 = cVar;
        setChildrenDrawingOrderEnabled(true);
        this.f53598o0 = 1;
        this.f53597n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new ma(this, kcVar2));
        setOverScrollMode(2);
    }
}
