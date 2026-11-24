package defpackage;

import android.content.Context;
public final class k4b extends d46 {
    public final m4b u0;

    public k4b(m4b m4bVar, Context context, float f) {
        super(context, f);
        this.u0 = m4bVar;
    }

    @Override
    public final void invalidate() {
        this.u0.d.invalidate();
        super.invalidate();
    }
}
