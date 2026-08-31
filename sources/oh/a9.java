package oh;

import android.content.Context;
public final class a9 extends v {
    public final i9 f16865a;

    public a9(Context context, i9 i9Var) {
        super(context);
        this.f16865a = i9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        e4 e4Var = this.f16865a.D0;
        if (e4Var != null) {
            e4Var.a();
        }
    }
}
