package di;

import android.content.Context;
import android.view.View;
public final class s9 extends tg.m0 {
    public final t9 Q;

    public s9(t9 t9Var, Context context, float f10) {
        super(context, f10);
        this.Q = t9Var;
    }

    @Override
    public final void invalidate() {
        View view = this.Q.f9807c;
        if (view != null) {
            view.invalidate();
        }
    }
}
