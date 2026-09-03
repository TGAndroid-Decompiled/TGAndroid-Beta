package nh;

import android.content.Context;
import java.util.ArrayList;
public final class y8 extends v {
    public final i9 N0;

    public y8(i9 i9Var, int i10, Context context, i9 i9Var2, b bVar) {
        super(context);
        boolean z4;
        this.N0 = i9Var;
        this.f15829x0 = new ArrayList();
        this.A0 = true;
        this.J0 = new m2.b(this, 3);
        this.L0 = -1;
        this.f15827v0 = i10;
        this.E0 = new a4(context);
        this.K0 = i9Var2;
        o7 o7Var = new o7(this, context, i9Var2, bVar);
        this.f15828w0 = o7Var;
        setAdapter(o7Var);
        lh.m5 m5Var = new lh.m5(this, 11);
        if (this.f13724j0 != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f13724j0 = m5Var;
        setChildrenDrawingOrderEnabled(true);
        this.f13726l0 = 1;
        this.f13725k0 = 2;
        if (z4) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new p7(this, i9Var2));
        setOverScrollMode(2);
    }
}
