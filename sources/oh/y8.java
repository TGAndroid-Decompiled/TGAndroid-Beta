package oh;

import android.content.Context;
import java.util.ArrayList;
public final class y8 extends u {
    public final i9 N0;

    public y8(i9 i9Var, int i10, Context context, i9 i9Var2, b bVar) {
        super(context);
        boolean z4;
        this.N0 = i9Var;
        this.f17697x0 = new ArrayList();
        this.A0 = true;
        this.J0 = new m2.b(this, 4);
        this.L0 = -1;
        this.f17695v0 = i10;
        this.E0 = new c4(context);
        this.K0 = i9Var2;
        o7 o7Var = new o7(this, context, i9Var2, bVar);
        this.f17696w0 = o7Var;
        setAdapter(o7Var);
        mh.m5 m5Var = new mh.m5(this, 12);
        if (this.f13451j0 != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f13451j0 = m5Var;
        setChildrenDrawingOrderEnabled(true);
        this.f13453l0 = 1;
        this.f13452k0 = 2;
        if (z4) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new p7(this, i9Var2));
        setOverScrollMode(2);
    }
}
