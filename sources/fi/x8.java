package fi;

import android.content.Context;
public final class x8 extends x {
    public final f9 f12758a;

    public x8(Context context, f9 f9Var) {
        super(context);
        this.f12758a = f9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        y3 y3Var = this.f12758a.G0;
        if (y3Var != null) {
            y3Var.b();
        }
    }
}
