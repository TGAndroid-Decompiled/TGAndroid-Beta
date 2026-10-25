package di;

import android.content.Context;
public final class q9 extends y {
    public final y9 f9070a;

    public q9(Context context, y9 y9Var) {
        super(context);
        this.f9070a = y9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        p4 p4Var = this.f9070a.G0;
        if (p4Var != null) {
            p4Var.b();
        }
    }
}
