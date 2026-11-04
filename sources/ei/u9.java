package ei;

import android.content.Context;
import android.view.View;
public final class u9 extends ug.l0 {
    public final v9 R;

    public u9(v9 v9Var, Context context, float f10) {
        super(context, f10);
        this.R = v9Var;
    }

    @Override
    public final void invalidate() {
        View view = this.R.f11142c;
        if (view != null) {
            view.invalidate();
        }
    }
}
