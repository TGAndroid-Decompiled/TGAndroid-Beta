package di;

import android.content.Context;
public final class h9 extends x {
    public final p9 f9116a;

    public h9(Context context, p9 p9Var) {
        super(context);
        this.f9116a = p9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        h4 h4Var = this.f9116a.F0;
        if (h4Var != null) {
            h4Var.b();
        }
    }
}
