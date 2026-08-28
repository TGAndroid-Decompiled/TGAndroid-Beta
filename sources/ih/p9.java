package ih;

import android.content.Context;
import android.view.View;
public final class p9 extends yf.r0 {
    public final q9 M;

    public p9(q9 q9Var, Context context, float f10) {
        super(context, f10);
        this.M = q9Var;
    }

    @Override
    public final void invalidate() {
        View view = this.M.f12017c;
        if (view != null) {
            view.invalidate();
        }
    }
}
