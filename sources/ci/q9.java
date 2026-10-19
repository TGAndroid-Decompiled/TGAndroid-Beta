package ci;

import android.content.Context;
import java.util.ArrayList;
public final class q9 extends x {
    public final aa Q0;

    public q9(aa aaVar, int i10, Context context, aa aaVar2, b bVar) {
        super(context);
        boolean z10;
        this.Q0 = aaVar;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new androidx.activity.i(this, 10);
        this.O0 = -1;
        this.f5515y0 = i10;
        this.H0 = new n4(context);
        this.N0 = aaVar2;
        f8 f8Var = new f8(this, context, aaVar2, bVar);
        this.f5516z0 = f8Var;
        setAdapter(f8Var);
        a1.c cVar = new a1.c(this, 19);
        if (this.m0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.m0 = cVar;
        setChildrenDrawingOrderEnabled(true);
        this.f50696o0 = 1;
        this.f50695n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new g8(this, aaVar2));
        setOverScrollMode(2);
    }
}
