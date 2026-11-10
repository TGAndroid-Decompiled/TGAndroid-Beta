package di;

import android.content.Context;
public final class i9 extends x {
    public final q9 f9151a;

    public i9(Context context, q9 q9Var) {
        super(context);
        this.f9151a = q9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        i4 i4Var = this.f9151a.F0;
        if (i4Var != null) {
            i4Var.b();
        }
    }
}
