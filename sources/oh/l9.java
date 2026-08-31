package oh;

import android.content.Context;
import android.view.View;
public final class l9 extends eg.j1 {
    public final m9 N;

    public l9(m9 m9Var, Context context, float f10) {
        super(context, f10);
        this.N = m9Var;
    }

    @Override
    public final void invalidate() {
        View view = this.N.f17473c;
        if (view != null) {
            view.invalidate();
        }
    }
}
