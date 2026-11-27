package defpackage;

import android.content.Context;
public final class i8b extends h66 {
    public final k8b u0;

    public i8b(k8b k8bVar, Context context, float f) {
        super(context, f);
        this.u0 = k8bVar;
    }

    @Override
    public final void invalidate() {
        this.u0.d.invalidate();
        super.invalidate();
    }
}
