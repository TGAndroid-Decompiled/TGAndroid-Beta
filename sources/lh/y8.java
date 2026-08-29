package lh;

import android.content.Context;
import java.util.ArrayList;
public final class y8 extends u {
    public final i9 M0;

    public y8(i9 i9Var, int i10, Context context, i9 i9Var2, b bVar) {
        super(context);
        boolean z10;
        this.M0 = i9Var;
        this.f16182w0 = new ArrayList();
        this.f16185z0 = true;
        this.I0 = new m7(this, 0);
        this.K0 = -1;
        this.f16180u0 = i10;
        this.D0 = new a4(context);
        this.J0 = i9Var2;
        o7 o7Var = new o7(this, context, i9Var2, bVar);
        this.f16181v0 = o7Var;
        setAdapter(o7Var);
        l4.s0 s0Var = new l4.s0(this, 7);
        if (this.f16796i0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f16796i0 = s0Var;
        setChildrenDrawingOrderEnabled(true);
        this.f16798k0 = 1;
        this.f16797j0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new p7(this, i9Var2));
        setOverScrollMode(2);
    }
}
