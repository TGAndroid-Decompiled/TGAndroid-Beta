package lh;

import android.content.Context;
public final class a9 extends v {
    public final i9 f15358a;

    public a9(Context context, i9 i9Var) {
        super(context);
        this.f15358a = i9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        c4 c4Var = this.f15358a.C0;
        if (c4Var != null) {
            c4Var.a();
        }
    }
}
