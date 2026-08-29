package bg;

import android.content.Context;
public final class a4 extends i1 {
    public final c4 f2092p0;

    public a4(c4 c4Var, Context context, float f9) {
        super(context, f9);
        this.f2092p0 = c4Var;
    }

    @Override
    public final void invalidate() {
        this.f2092p0.d.invalidate();
        super.invalidate();
    }
}
