package eg;

import android.content.Context;
public final class u3 extends e1 {
    public final w3 f5509q0;

    public u3(w3 w3Var, Context context, float f10) {
        super(context, f10);
        this.f5509q0 = w3Var;
    }

    @Override
    public final void invalidate() {
        this.f5509q0.d.invalidate();
        super.invalidate();
    }
}
