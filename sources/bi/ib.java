package bi;

import android.content.Context;
import java.util.ArrayList;
public final class ib extends c0 {
    public final sb Q0;

    public ib(sb sbVar, int i10, Context context, sb sbVar2, b bVar) {
        super(context);
        boolean z10;
        this.Q0 = sbVar;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new androidx.activity.i(this, 9);
        this.O0 = -1;
        this.f3990y0 = i10;
        this.H0 = new n5(context);
        this.N0 = sbVar2;
        u9 u9Var = new u9(this, context, sbVar2, bVar);
        this.f3991z0 = u9Var;
        setAdapter(u9Var);
        a1.c cVar = new a1.c(this, 9);
        if (this.m0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.m0 = cVar;
        setChildrenDrawingOrderEnabled(true);
        this.f49311o0 = 1;
        this.f49310n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new v9(this, sbVar2));
        setOverScrollMode(2);
    }
}
