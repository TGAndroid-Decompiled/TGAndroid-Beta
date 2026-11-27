package defpackage;

import android.content.Context;
import android.view.View;
public final class v0a extends cl8 {
    public final w0a N;

    public v0a(w0a w0aVar, Context context) {
        super(2, null, context);
        this.N = w0aVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        w0a w0aVar = this.N;
        if (w0aVar.getParent() instanceof View) {
            ((View) w0aVar.getParent()).invalidate();
        }
    }
}
