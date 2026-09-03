package dg;

import android.content.Context;
public final class w3 extends g1 {
    public final y3 f4848q0;

    public w3(y3 y3Var, Context context, float f10) {
        super(context, f10);
        this.f4848q0 = y3Var;
    }

    @Override
    public final void invalidate() {
        this.f4848q0.d.invalidate();
        super.invalidate();
    }
}
