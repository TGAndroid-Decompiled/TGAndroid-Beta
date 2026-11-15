package fi;

import android.content.Context;
public final class a9 extends x {
    public final i9 f11441a;

    public a9(Context context, i9 i9Var) {
        super(context);
        this.f11441a = i9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a4 a4Var = this.f11441a.G0;
        if (a4Var != null) {
            a4Var.b();
        }
    }
}
