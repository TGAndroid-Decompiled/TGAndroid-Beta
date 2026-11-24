package defpackage;

import android.content.Context;
public final class l6b extends d66 {
    public final n6b u0;

    public l6b(n6b n6bVar, Context context, float f) {
        super(context, f);
        this.u0 = n6bVar;
    }

    @Override
    public final void invalidate() {
        this.u0.d.invalidate();
        super.invalidate();
    }
}
