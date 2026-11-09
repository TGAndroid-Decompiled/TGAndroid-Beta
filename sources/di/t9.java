package di;

import android.content.Context;
import android.view.View;
public final class t9 extends tg.m0 {
    public final u9 Q;

    public t9(u9 u9Var, Context context, float f10) {
        super(context, f10);
        this.Q = u9Var;
    }

    @Override
    public final void invalidate() {
        View view = this.Q.f9849c;
        if (view != null) {
            view.invalidate();
        }
    }
}
