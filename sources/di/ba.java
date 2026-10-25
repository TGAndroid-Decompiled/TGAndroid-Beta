package di;

import android.content.Context;
import android.view.View;
public final class ba extends sg.t0 {
    public final ca Q;

    public ba(ca caVar, Context context, float f7) {
        super(context, f7);
        this.Q = caVar;
    }

    @Override
    public final void invalidate() {
        View view = this.Q.f8475c;
        if (view != null) {
            view.invalidate();
        }
    }
}
