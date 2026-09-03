package nh;

import android.content.Context;
public final class a9 extends w {
    public final i9 f15075a;

    public a9(Context context, i9 i9Var) {
        super(context);
        this.f15075a = i9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        c4 c4Var = this.f15075a.D0;
        if (c4Var != null) {
            c4Var.a();
        }
    }
}
