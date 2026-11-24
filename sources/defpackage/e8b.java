package defpackage;

import android.content.Context;
public final class e8b extends sg5 {
    public final m8b a;

    public e8b(m8b m8bVar, Context context) {
        super(context);
        this.a = m8bVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        c30 c30Var = this.a.G0;
        if (c30Var != null) {
            c30Var.m();
        }
    }
}
