package ci;

import android.content.Context;
public final class r9 extends y {
    public final z9 f5893a;

    public r9(Context context, z9 z9Var) {
        super(context);
        this.f5893a = z9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        o4 o4Var = this.f5893a.G0;
        if (o4Var != null) {
            o4Var.b();
        }
    }
}
