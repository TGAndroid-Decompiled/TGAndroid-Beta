package ci;

import android.content.Context;
import java.util.ArrayList;
public final class p9 extends x {
    public final z9 Q0;

    public p9(z9 z9Var, int i10, Context context, z9 z9Var2, b bVar) {
        super(context);
        boolean z10;
        this.Q0 = z9Var;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new androidx.activity.i(this, 10);
        this.O0 = -1;
        this.f5421y0 = i10;
        this.H0 = new m4(context);
        this.N0 = z9Var2;
        e8 e8Var = new e8(this, context, z9Var2, bVar);
        this.f5422z0 = e8Var;
        setAdapter(e8Var);
        a1.c cVar = new a1.c(this, 19);
        if (this.m0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.m0 = cVar;
        setChildrenDrawingOrderEnabled(true);
        this.f50694o0 = 1;
        this.f50693n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new f8(this, z9Var2));
        setOverScrollMode(2);
    }
}
