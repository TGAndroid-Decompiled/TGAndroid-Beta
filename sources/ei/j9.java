package ei;

import android.content.Context;
public final class j9 extends y {
    public final r9 f10557a;

    public j9(Context context, r9 r9Var) {
        super(context);
        this.f10557a = r9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        i4 i4Var = this.f10557a.H0;
        if (i4Var != null) {
            i4Var.b();
        }
    }
}
