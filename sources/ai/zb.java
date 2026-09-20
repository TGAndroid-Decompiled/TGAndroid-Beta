package ai;

import android.content.Context;
import java.util.ArrayList;
public final class zb extends j0 {
    public final jc Q0;

    public zb(jc jcVar, int i10, Context context, jc jcVar2, d dVar) {
        super(context);
        boolean z10;
        this.Q0 = jcVar;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new q4(this, 1);
        this.O0 = -1;
        this.f1309y0 = i10;
        this.H0 = new c6(context);
        this.N0 = jcVar2;
        ka kaVar = new ka(this, context, jcVar2, dVar);
        this.f1310z0 = kaVar;
        setAdapter(kaVar);
        a1.c cVar = new a1.c(this, 8);
        if (this.m0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.m0 = cVar;
        setChildrenDrawingOrderEnabled(true);
        this.f48443o0 = 1;
        this.f48442n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new la(this, jcVar2));
        setOverScrollMode(2);
    }
}
