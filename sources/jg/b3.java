package jg;

import android.content.Context;
public final class b3 extends t0 {
    public final d3 f9901t0;

    public b3(d3 d3Var, Context context, float f7) {
        super(context, f7);
        this.f9901t0 = d3Var;
    }

    @Override
    public final void invalidate() {
        this.f9901t0.d.invalidate();
        super.invalidate();
    }
}
